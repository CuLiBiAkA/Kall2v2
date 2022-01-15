package com.company.KalikuliatirV228;

import java.util.Scanner;

public class KalkuliatorV228 {


    public static void main(String[] args) throws ObshiiException,OneException, TwoException, ThreeException, ForException {
        while (true){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        ObrabotkaVvoda textVvedenii = new ObrabotkaVvoda(text);
        textVvedenii.obrabotkaVvoda();
        textVvedenii.getDlinnaMassiva2();
        Logika peredacha = new Logika();
        peredacha.logika(textVvedenii.getDlinnaMassiva2());
        peredacha.logika1(textVvedenii.getK());
        peredacha.konec();


    }
}}
