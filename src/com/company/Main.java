package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date data = new Date();
//        System.out.println(data);
        SimpleDateFormat formatar = new SimpleDateFormat("yyMMddH");
        String dataFormatada = formatar.format(data);

        int inicial =000;
        inicial ++;

        System.out.println(dataFormatada.concat(Integer.toString(inicial)));


    }
}
