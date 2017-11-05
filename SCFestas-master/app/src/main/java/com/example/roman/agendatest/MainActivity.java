package com.example.roman.agendatest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import static com.example.roman.agendatest.R.layout.activity_main;

public class MainActivity extends Activity {
    private SQLiteDatabase database;

    private static final String campos[] = {"nome", "cidade", "_id"};

    ListView listView;
    BaseDAO helper;

    /** Chamado quando a Activity é exeutada pela primeira vez. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        listView = (ListView) findViewById(R.id.listView1);

        //cria instância da classe BaseDAO, responsável pela criação do Banco de Dados
        helper = new BaseDAO(this);

        //executa rotinas internas para abrir/utilizar o banco de dados
        database = helper.getWritableDatabase();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent secondeActivite = new Intent(MainActivity.this, FestActivity.class);
                Festa festa = helper.getFesta(id);
                secondeActivite.putExtra("festa", festa);
                startActivity(secondeActivite);
            }

        });

        Cursor contatos = helper.getFestas();
        if (contatos.getCount() > 0){
            CursorAdapter dataSource = new SimpleCursorAdapter(this, R.layout.row, contatos,
                    campos, new int[]{R.id.Nome, R.id.Cidade});
            //relaciona o dataSource ao próprio listview
            listView.setAdapter(dataSource);
        }else{
            Toast.makeText(this, "Nenhum registro encontrado", Toast.LENGTH_SHORT).show();
        }
    }

/*    public void btnInserir_Click(View v){
        helper.ajouter(Festa.Oktoberfest);
        helper.ajouter(Festa.Fenarreco);
        helper.ajouter(Festa.OutraFesta);

        Toast.makeText(this, "Registros inseridos com sucesso", Toast.LENGTH_SHORT).show();
    }
*/
 /*   public void btnCarregar_Click(View v){


        //executa consulta geral de todos os registros cadastrados no banco de dados
        //Cursor contatos = database.query("festas", campos, null, null, null, null, null);
        Cursor contatos = helper.getFestas();
        if (contatos.getCount() > 0){
            //cria cursor que será exibido na tela, nele serão exibidos
            //todos os contatos cadastrados
            dataSource = new SimpleCursorAdapter(this, R.layout.row, contatos,
                    campos, new int[] { R.id.Nome, R.id.Cidade });

            //relaciona o dataSource ao próprio listview
            listView.setAdapter(dataSource);
        }else{
            Toast.makeText(this, "Nenhum registro encontrado", Toast.LENGTH_SHORT).show();
        }
    }
*/
    //método executado quando o usuário clica no botão voltar do aparelho
    @Override
    protected void onDestroy() {
        super.onDestroy();

        //deleta registros inseridos, simplesmente para limpar essa base que é de teste
  //      database.execSQL("DELETE FROM FESTAS");

        //deleta a base que é de teste para debug
        //database.execSQL("DROP FESTAS");

        //fecha a conexão com o Banco de dados
        database.close();
    }
}