package com.company;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 200; i++) {

            criarBuild();

        }

    }

    public static void criarBuild() {

        String numeroBuild = Leitor.ler();

        String build = numeroBuild.substring(0, 6);

        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("yyMMdd");
        String dataFormatada = formatar.format(data);

        if (build.equals(dataFormatada)) {

            int y = Integer.parseInt(numeroBuild);

            y++;
            System.out.println("Build do mesmo dia: " + y);

           build =Integer.toString(y);

        } else {
            int inicio = 0;

            String numero = String.format("%03d", inicio);

            build = dataFormatada.concat(numero);

            System.out.println("build atual: " + build);

        }
        Leitor.escrever(build);
    }

}




