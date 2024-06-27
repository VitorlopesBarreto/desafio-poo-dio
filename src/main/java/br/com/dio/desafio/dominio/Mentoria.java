package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo{
    String titulo;
    String descricao;
    LocalDate data;

    public double calcularxp(){
        return XP_PADRAO + 20d;
    }
    public Mentoria(){

    }

    public LocalDate getData() {
        return data;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    public void setData(LocalDate data) {
        this.data = data;


    }

}
