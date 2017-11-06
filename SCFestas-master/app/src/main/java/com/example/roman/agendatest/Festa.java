package com.example.roman.agendatest;

import com.google.android.gms.maps.model.LatLng;

import java.io.Serializable;

/**
 * Created by roman on 25/10/2017.
 */

public class Festa implements Serializable{
    private long id;
    private String nome;
    private String cidade;
    private String data_inicio;
    private String data_fin;
    private String horario;
    private String endereco;
    private String atracoes;
    private String valor_ingresso;
    private String latitude;
    private String longitude;
    private String url_video;

    public static Festa Oktoberfest = new Festa(1,
            "34a Oktoberfest",
            "Blumenau",
            "4",
            "22",
            "PREENCHER OS HORÁRIOS AINDA!",
            "Parque Vila Germânica (Rua Alberto Stein, 199 - Bairro da Velha)",
            "A maior festa alemã da América do Sul, a Oktoberfest Blumenau conta com diversas atrações artísticas, musicais e culturais, desfiles temáticos e grande variedade em chopes e gastronomia típica. Os desfiles oficiais da Oktoberfest, na Rua XV de Novembro, no Centro de Blumenau, são uma das principais atrações da festa.",
            "Horários de cobrança de ingresso\n\nTerça a sexta-feira: a partir das 18h.Sábados, domingos e feriado: a partir das 13h.\nVéspera de feriado: a partir das 18h.\n\nValores:\nAbertura (04/10), segundas-feiras (09 e 16/10) e encerramento (22/10): entrada gratuita.\nDomingos, terças, quartas (exceto véspera de feriado) e quintas-feiras (exceto feriado): R$ 12.\nSextas-feiras, véspera de feriado e feriado: R$ 30.\nSexta-feira, dia 13/10: R$ 40.\nSábados: R$ 40.\nCrianças até 12 anos: Não pagam entrada.",
            "-26.9158924",
            "-49.0852189",
            "1NWpoo4GEaA"
    );

    public static Festa Fenarreco = new Festa(2,
            "32ª Fenarreco - Festa Nacional do Marreco",
            "Brusque",
            "5",
            "15",
            "Dia 5 - 20h a 01h.\nDias 6, 7, 11, 13 e 14 - 11h30 a 04h.\nDias 8, 9, 12 - 11h a 00h.\n10 - 11h30 a 01h.\n15 - 11h a 20h.",
            "Pavilhão de Eventos Maria Celina Vidotto Imhof - Centro II (Rua Gentil Batistti Archer, 221)",
            "Festa tradicional que serve um buffet típico alemão, com marreco recheado, repolho roxo, linguiça de marreco, eisbein (Joelho de porco temperado e cozinho com especiarias), purê de batata, chucrute e spätzle na manteiga. Aém de bandas e músicas típicas ao vivo, apresentações culturais, competições de Chopp em Metro, Corrida de tamancos",
            "Dias 5, 8, 9, e 15 - Entrada Gratuita.\nDemais Dias: Entrada cobrada a partir das 17h:\nIdosos abaixo de 65 anos – R$ 10\nEstudantes com carteirinha – R$ 10\nTraje típico – R$ 10\nNormal: R$ 20\nOnline: a definir\nPassaporte vendido antecipadamente para todos os dias de festa: R$ 100",
            "-27.0970069",
            "-48.9058824",
            "EIH_bENwtTc"
    );

     public static Festa OutraFesta = new Festa(3,
            "Marejada 2017",
            "Itajaí",
            "5",
            "15",
             "Dias de Semana: 18h a 0h\nFim de Semana e Feriados: 11h a 0h",
            "Centreventos de Itajaí (Avenida ministro Victor Konder, 303)",
            "Entretenimento:\nÁrea Recreativa, Artesanato, Fish Garden, Intervenções Culturais, Parque de Diversões, Planetário.\n\nGastronomia:\nSardinha na brasa, Doces portugueses, Tasca portuguesa, Petiscos, Food Trucks.",
            "Entrada Gratuita",
            "-26.9098501",
            "-48.6534583",
            "MLOlJUYzrX8"
    );

    public Festa(long id, String nome, String cidade, String data_inicio, String data_fin, String horario, String endereco, String atracoes, String valor_ingresso, String latitude, String longitude, String url_video) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.data_inicio = data_inicio;
        this.data_fin = data_fin;
        this.horario = horario;
        this.endereco = endereco;
        this.atracoes = atracoes;
        this.valor_ingresso = valor_ingresso;
        this.latitude = latitude;
        this.longitude = longitude;
        this.url_video = url_video;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fin() {
        return data_fin;
    }

    public void setData_fin(String data_fin) {
        this.data_fin = data_fin;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getAtracoes() {
        return atracoes;
    }

    public void setAtracoes(String atracoes) {
        this.atracoes = atracoes;
    }

    public String getValor_ingresso() {
        return valor_ingresso;
    }

    public void setValor_ingresso(String valor_ingresso) {
        this.valor_ingresso = valor_ingresso;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getUrl_video() {
        return url_video;
    }

    public void setUrl_video(String url_video) {
        this.url_video = url_video;
    }
}