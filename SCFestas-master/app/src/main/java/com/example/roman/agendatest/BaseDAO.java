package com.example.roman.agendatest;

/**
 * Created by roman on 30/10/2017.
 */

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//Classe responsável pela criação do Banco de Dados e tabelas
public class BaseDAO extends SQLiteOpenHelper {

    private SQLiteDatabase database;

    public static final String TBL_FESTAS = "festas";
    public static final String KEY = "_id";
    public static final String NOME = "nome";
    public static final String CIDADE = "cidade";
    public static final String DATA_INICIO = "data_inicio";
    public static final String DATA_FIN = "data_fin";
    public static final String HORARIO = "horario";
    public static final String ENDERECO = "endereco";
    public static final String ATRACOES = "atracoes";
    public static final String VALOR_INGRESSO = "valor_ingresso";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String URL_VIDEO = "url_video";

    private static final String DATABASE_NAME = "festas_sc1.db";
    private static final int DATABASE_VERSION = 1;

     public static final String CREATE_FESTAS =
            "CREATE TABLE " + TBL_FESTAS + " (" +
                    KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    NOME + " TEXT, " +
                    CIDADE + " TEXT, " +
                    DATA_INICIO + " TEXT, " +
                    DATA_FIN + " TEXT, " +
                    HORARIO + " TEXT, " +
                    ENDERECO + " TEXT, " +
                    ATRACOES + " TEXT, " +
                    VALOR_INGRESSO+ " TEXT, " +
                    LATITUDE+ " TEXT, " +
                    LONGITUDE+ " TEXT, " +
                    URL_VIDEO + " TEXT);";

    public BaseDAO(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        database = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        //Criação da tabela
        database.execSQL(CREATE_FESTAS);
        this.database = database;
        ajouter(Festa.Oktoberfest);
        ajouter(Festa.Fenarreco);
        ajouter(Festa.OutraFesta);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Caso seja necessário mudar a estrutura da tabela
        //deverá primeiro excluir a tabela e depois recriá-la
        db.execSQL("DROP TABLE IF EXISTS " + TBL_FESTAS);
        onCreate(db);
    }

    public void ajouter (Festa festa){
        database.execSQL("INSERT INTO festas (nome, cidade, data_inicio, data_fin, horario, endereco, atracoes, valor_ingresso, latitude, longitude, url_video) VALUES " +
                "('"+festa.getNome()+
                "', '"+festa.getCidade()+
                "', '"+festa.getData_inicio()+
                "', '"+festa.getData_fin()+
                "', '"+festa.getHorario()+
                "', '"+festa.getEndereco()+
                "', '"+festa.getAtracoes()+
                "', '"+festa.getValor_ingresso()+
                "', '"+festa.getLatitude()+
                "', '"+festa.getLongitude()+
                "', '"+festa.getUrl_video()+
                "')");
    }

    public Cursor getFestas(){
        String campos[] = {NOME, CIDADE, KEY};
        return database.query(TBL_FESTAS, campos, null, null, null, null, null);
    }

    public Festa getFesta(long id){
        Festa festa;
        String s_id = String.valueOf(id);
        String campos[] = {NOME, CIDADE, DATA_INICIO, DATA_FIN, HORARIO, ENDERECO, ATRACOES, VALOR_INGRESSO, LATITUDE, LONGITUDE, URL_VIDEO, KEY};
        Cursor findEntry = database.query(TBL_FESTAS, campos, "_id=?", new String[] {s_id}, null, null, null);
        findEntry.moveToFirst();
        String nome =findEntry.getString(findEntry.getColumnIndexOrThrow(NOME));
        String cidade=findEntry.getString(findEntry.getColumnIndexOrThrow(CIDADE));
        String data_inicio=findEntry.getString(findEntry.getColumnIndexOrThrow(DATA_INICIO));
        String data_fin=findEntry.getString(findEntry.getColumnIndexOrThrow(DATA_FIN));
        String horario=findEntry.getString(findEntry.getColumnIndexOrThrow(HORARIO));
        String endereco=findEntry.getString(findEntry.getColumnIndexOrThrow(ENDERECO));
        String atracoes=findEntry.getString(findEntry.getColumnIndexOrThrow(ATRACOES));
        String valor_ingresso=findEntry.getString(findEntry.getColumnIndexOrThrow(VALOR_INGRESSO));
        String latitude=findEntry.getString(findEntry.getColumnIndexOrThrow(LATITUDE));
        String longitude=findEntry.getString(findEntry.getColumnIndexOrThrow(LONGITUDE));
        String url_video=findEntry.getString(findEntry.getColumnIndexOrThrow(URL_VIDEO));
        festa = new Festa(id, nome, cidade, data_inicio, data_fin, horario, endereco, atracoes, valor_ingresso, latitude, longitude, url_video);
        return festa;
    }
}
