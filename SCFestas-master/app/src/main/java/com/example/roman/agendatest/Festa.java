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
            "Blumeneau",
            "4",
            "22",
            "",
            "Parque Vila Germânica",
            "A maior festa alemã da América do Sul, a Oktoberfest Blumenau conta com diversas atrações artísticas, musicais e culturais, desfiles temáticos e grande variedade em chopes e gastronomia típica. Os desfiles oficiais da Oktoberfest, na Rua XV de Novembro, no Centro de Blumenau, são uma das principais atrações da festa.",
            "40",
            "-26.9158924",
            "-49.0852189",
            "2y5foZiMo5k"
    );

    public static Festa Fenarreco = new Festa(2,
            "32a Fenarreco",
            "Brusque",
            "5",
            "15",
            "",
            "Pavilhão de Eventos Maria Celina Vidotto Imhof, na Rua Gentil Batistti Archer, 221 - centro II",
            "Festa tradicional que serve um buffet típico alemão, com marreco recheado, repolho roxo, linguiça de marreco, eisbein (Joelho de porco temperado e cozinho com especiarias), purê de batata, chucrute e spätzle na manteiga. Aém de bandas e músicas típicas ao vivo, apresentações culturais, competições de Chopp em Metro, Corrida de tamancos",
            "0",
            "-27.0970069",
            "-48.9058824",
            "EIH_bENwtTc"
    );

     public static Festa OutraFesta = new Festa(3,
            "Nome da Festa",
            "Cidade da Festa",
            "Dia inicial",
            "Dia Final",
            "",
            "Endereço da Festa",
            "Descrição e atrações da festa",
            "Valor da Festa",
            "-27.0969508",
            "-48.9081496",
            "EIH_bENwtTc"
    );

//    public Festa(long id, String nome, String cidade, String data_inicio, String data_fin, String horario, String endereco, String atracoes, String valor_ingresso) {
//        this.id = id;
//        this.nome = nome;
//        this.cidade = cidade;
//        this.data_inicio = data_inicio;
//        this.data_fin = data_fin;
//        this.horario = horario;
//        this.endereco = endereco;
//        this.atracoes = atracoes;
//        this.valor_ingresso = valor_ingresso;
//    }

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