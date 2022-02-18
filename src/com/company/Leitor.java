package com.company;

import java.io.*;

public class Leitor {

    public static String ler() {
        String linha = null;
        try {
            FileInputStream arquivo = new FileInputStream("C:\\escrverBuild\\build.txt");

            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader br = new BufferedReader(input);

            linha = br.readLine();

            br.close();
            arquivo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return linha;

    }

    public static void escrever(String build) {

        try {
            FileOutputStream arquivo = new FileOutputStream("C:\\escrverBuild\\build.txt");

            PrintWriter pr = new PrintWriter(arquivo);

            pr.println(build);

            pr.close();
            arquivo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}