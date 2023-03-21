package com.tyba.Tyba_automation.utils;

import net.serenitybdd.core.pages.PageObject;

import java.util.Random;

public class DataRandom extends PageObject {

    public static String NumeroCelular() {
        String NumCel = "";
        String celu1 = "";
        String celu2 = "";
        String celu3 = "";
        int cel1 = (int) (1 + (Math.random() * 299));
        int cel2 = (int) (1 + (Math.random() * 999));
        int cel3 = (int) (1 + (Math.random() * 999));
        if (cel1<100 && cel1>10){
            celu1 = ("0" + cel1);
        }else if (cel1<10){
            celu1 = ("00" + cel1);
        }else{
            celu1 = String.valueOf(cel1);
        }
        if (cel2<100 && cel2>10){
            celu2 = ("0" + cel2);
        }else if (cel2<10){
            celu2 = ("00" + cel2);
        }else{
            celu2 = String.valueOf(cel2);
        }
        if (cel3<100 && cel3>10){
            celu3 = ("0" + cel3);
        }else if (cel3<10){
            celu3 = ("00" + cel3);
        }else{
            celu3 = String.valueOf(cel3);
        }
        NumCel = ("3" + celu1 + celu2 + celu3);
        return NumCel;
    }

    public static String CorreoElectronico() {
        Random Caracter = new Random();
        char letra1 = (char) (Caracter.nextInt(26) + 'a');
        char letra2 = (char) (Caracter.nextInt(26) + 'a');
        char letra3 = (char) (Caracter.nextInt(26) + 'a');
        String Correo = ("prueba" + letra1 + letra2 + letra3 + "@gmail.com");
        return Correo;
    }

    public  static  String Nombre(){
        Random Caracter = new Random();
        char letra1 = (char) (Caracter.nextInt(26) + 'A');
        char letra2 = (char) (Caracter.nextInt(26) + 'A');
        char letra3 = (char) (Caracter.nextInt(26) + 'A');
        String Nom = ("ESNEYDE"+ letra1 + letra2 + letra3);
        return Nom;
    }

    public  static  String Apellido(){
        Random Caracter = new Random();
        char letra1 = (char) (Caracter.nextInt(26) + 'A');
        char letra2 = (char) (Caracter.nextInt(26) + 'A');
        char letra3 = (char) (Caracter.nextInt(26) + 'A');
        String Apel = ("GUTIERRE"+ letra3 + letra2 + letra1);
        return Apel;
    }

    public static String Usuario(){
        Random Caracter = new Random();
        char letra1 = (char) (Caracter.nextInt(26) + 'A');
        char letra2 = (char) (Caracter.nextInt(26) + 'A');
        char letra3 = (char) (Caracter.nextInt(26) + 'A');
        int cel1 = (int) (1 + (Math.random() * 99));
        String Usu = ("esney" + letra1 + letra2 + letra3 + cel1);
        return Usu;
    }

}
