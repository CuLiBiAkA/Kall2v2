package com.company.KalikuliatirV228;


import static java.lang.Integer.parseInt;

public class Logika {
    private String izCifirvRim;
    private String fffr;
    private String fff;
    private int konechnaya;
    private int konechnayaR;
    private String kostiliSChislami;
    private String chislo1= null;
    private String chislo12= null;
    private String znak = null;
    private String chislo2= null;
    private String chislo22= null;
    private String chisloR1= null;
    private String chisloR11= null;
    private String chisloR111= null;
    private String chisloR1111= null;
    private String znakR = null;
    private String chisloR2= null;
    private String chisloR22= null;
    private String chisloR222= null;
    private String chisloR2222= null;
    private final String[] CHISLA = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "0"};
    private final String[] ZNAKI = {"+", "-", "/", "*"};
    private final String[] RIMSKIE = {"I", "V", "X", "IV", "II", "VI", "VII", "VIII", "IX", "III"};
    private int dlina = 0;
    private int i;
    private String j = null;
    private Object formull;
    private final String[] RIMSKIEPEREBORI = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLXI", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    private int roolRR;


    public void logika(int dlinnamassiva2) {
      //  System.out.println(dlinnamassiva2 + " длинна обработанного массива");
        dlina = dlinnamassiva2;
    }

    public void logika1(String k) throws ObshiiException {
        String[] massiv2 = new String[dlina];
        fff=k;
    //    System.out.println(k + "строка в логике");
        char[] massiv = k.toCharArray();
        for (i = 0; massiv.length > i; i++) {
            j = String.valueOf(massiv[i]);
            if (i < dlina) {
                massiv2[i] = j;
            }
        }

    //   System.out.println(String.join("", massiv2) + " конечный вывод в логике готовый к счету");
        convertingNumbers(massiv2);
        rimskieChiki(massiv2);
    }

    public void convertingNumbers(String[] massiv2) throws ObshiiException {
        int lovushkaChisel = 0;
        for (int rool = 0; dlina > rool; rool++) {
            String a = String.valueOf(massiv2[rool]);
            for (int roolNumbers = 0; CHISLA.length > roolNumbers; roolNumbers++) {
                String b = String.valueOf(CHISLA[roolNumbers]);
                if (a.equals(b)) {
                    if (chislo1 == null && znak == null) {
                        chislo1 = a;
                    }
                    if (chislo1 != null && chislo1.equals(CHISLA[1]) && a.equals(CHISLA[0]) && znak == null) {
                        chislo12 = a;
                    }
                    if (znak != null && chislo2 == null) {
                        chislo2 = a;
                    }
                    if (chislo2 != null && chislo2.equals(CHISLA[1]) && a.equals(CHISLA[0])) {
                        chislo22 = a;
                    }
                    lovushkaChisel++;
                }
            }
            for (int roolZnaki = 0; ZNAKI.length > roolZnaki; roolZnaki++) {
                String c = String.valueOf(ZNAKI[roolZnaki]);
                if (a.equals(c) && lovushkaChisel != 0) {
                    znak = a;
                }
            }

        }
        sostavlenieFormulchisel();
    }

    public void sostavlenieFormulchisel() throws ObshiiException {

        if (chislo12 == null && chislo22 == null) {
            String formull = this.chislo1 + this.znak + this.chislo2;
            preobrazovanieVInt(formull);
        }
        if (chislo12 == null && chislo22 != null) {
            String formull = this.chislo1 + this.znak + this.chislo2 + this.chislo22;
            preobrazovanieVInt(formull);
        }
        if (chislo12 != null && chislo22 == null) {
            String formull = this.chislo1 + this.chislo12 + this.znak + this.chislo2;
            preobrazovanieVInt(formull);
        }
        if (chislo12 != null && chislo22 != null) {
            String formull = this.chislo1 + this.chislo12 + this.znak + this.chislo2 + this.chislo22;
            preobrazovanieVInt(formull);
        }
    }

    public void preobrazovanieVInt(String formull) throws ObshiiException {
        kostiliSChislami = formull;
   //    System.out.println(kostiliSChislami);
       if(chislo1!=null&&kostiliSChislami!=null&&kostiliSChislami.length()!=dlina){
          throw new ObshiiException();
      }
        int x = 0;
        int y = 0;
        if (chislo12 == null && chislo22 == null&&chislo1!=null&&chislo2!=null) {
            x = parseInt(chislo1);
            y = parseInt(chislo2);
            if (x==0&&y==0){
                throw new ObshiiException();
            }
        }
        if (chislo12 == null && chislo22 != null&&chislo1!=null&&chislo2!=null) {
            x = parseInt(chislo1);
            y = 10;

        }
        if (chislo12 != null && chislo22 == null&&chislo1!=null&&chislo2!=null) {
            y = parseInt(chislo2);
            x = 10;
            if (y==0){
                throw new ObshiiException();
            }
        }
        if (chislo12 != null && chislo22 != null&&chislo1!=null&&chislo2!=null) {
            x = 10;
            y = 10;
        }
        if (znak!=null&&znak.equals(ZNAKI[0]) && (x != 0 || y != 0)) {
            sum(x, y);

        }
        if (znak!=null&&znak.equals(ZNAKI[1]) && (x != 0 || y != 0)) {
            minus(x, y);

        }
        if (znak!=null&&znak.equals(ZNAKI[2]) && (x != 0 || y != 0)) {
            razdeliti(x, y);

        }
        if (znak!=null&&znak.equals(ZNAKI[3]) && (x != 0 || y != 0)) {
            umnogiti(x, y);

        }
    }

    public void sum(int x, int y) throws ObshiiException {
       if (x==0&&y==0){
           throw new ObshiiException();
       }
     else {   konechnaya = x + y;}
        // System.out.println(x + y);
    }

    public void minus(int x, int y) throws ObshiiException {
        if (x==0&&y==0){
            throw new ObshiiException();
        }
       else{ konechnaya = x - y;}
    }

    public void umnogiti(int x, int y) throws ObshiiException {
        if (x==0&&y==0){
            throw new ObshiiException();
        }  //   System.out.println(x * y);
      else {  konechnaya = x * y;}
    }

    public void razdeliti(int x, int y) throws ObshiiException {
        if (y==0){
            throw new ObshiiException();
        } //   System.out.println(x / y);
       else{ konechnaya = x / y;}

    }

    public void konec() throws ThreeException,ObshiiException {
        if (znakR != null) {
            if (konechnayaR == 0) {
                throw new ObshiiException();
            }
            if (konechnayaR < 0) {
                throw new ThreeException();
            }
            else {
                izCifirvRim = null;
                for (int roll = 0; RIMSKIEPEREBORI.length > roll; roll++) {
                    if (roll + 1 == konechnayaR) {
                        izCifirvRim = RIMSKIEPEREBORI[roll];
                        System.out.println(String.valueOf(izCifirvRim) + " это результат");


                    }
                }}}
                    if (znak != null) {

                        System.out.println(konechnaya + " это результат");}


                }




    public void rimskieChiki(String[] massiv2) throws ObshiiException {
        int lovushkaChiselR = 0;
        for (roolRR = 0; dlina > roolRR; roolRR++) {
            String a = String.valueOf(massiv2[roolRR]);
            for (int roolNumbers = 0; RIMSKIE.length > roolNumbers; roolNumbers++) {
                String b = String.valueOf(RIMSKIE[roolNumbers]);
                if (a.equals(b)) {
                    if (chisloR1== null && znakR == null) {
                        chisloR1 = a;
                        lovushkaChiselR++;
                        continue;
                    }
                    if ((chisloR11 == null) && (chisloR1 != null) && (znakR == null)) {
                           if (chisloR1.equals(RIMSKIE[0])||(chisloR1.equals(RIMSKIE[1])&&a.equals(RIMSKIE[0]))){
                        chisloR11 = a;
                        lovushkaChiselR++;
                        continue;
                    }}
                    if (chisloR111==null&&chisloR11 != null && znakR == null&&chisloR11.equals(RIMSKIE[0])&&a.equals(RIMSKIE[0])) {
                        chisloR111 = a;
                        lovushkaChiselR++;
                        continue;
                    }
                    if (chisloR1111==null&&chisloR111 != null && znakR == null&&chisloR111.equals(RIMSKIE[0])&&a.equals(RIMSKIE[0])&&chisloR1.equals(RIMSKIE[1])) {
                        chisloR1111 = a;
                        lovushkaChiselR++;
                        continue;
                    }
                    if (znakR != null && chisloR2 == null) {
                        chisloR2 = a;
                        lovushkaChiselR++;
                        continue;
                    }
                    if (chisloR22==null&&chisloR2 != null && znakR != null&&(chisloR2.equals(RIMSKIE[0])||a.equals(RIMSKIE[0])||(chisloR2.equals(RIMSKIE[1]))&&a.equals(RIMSKIE[0]))) {
                        chisloR22 = a;
                        lovushkaChiselR++;
                        continue;
                    }
                    if (chisloR222==null&&chisloR22 != null && znakR != null&&chisloR22.equals(RIMSKIE[0])&&a.equals(RIMSKIE[0])) {
                        chisloR222 = a;
                    lovushkaChiselR++;
                        continue;
                }
                    if (chisloR2222==null&&chisloR222 != null && znakR != null&&chisloR222.equals(RIMSKIE[0])&&a.equals(RIMSKIE[0])&&chisloR2.equals(RIMSKIE[1])) {
                        chisloR2222 = a;
                        lovushkaChiselR++;
                        continue;
                    }
            }
            for (int roolZnaki = 0; ZNAKI.length > roolZnaki; roolZnaki++) {
                String c = String.valueOf(ZNAKI[roolZnaki]);
                if (a.equals(c) && lovushkaChiselR != 0) {
                    znakR = a;
                    continue;
                }
            }

        }

    }sostavlenieFormulchiselR();}
    public void sostavlenieFormulchiselR() throws ObshiiException {
        if (chisloR1 != null && chisloR2 != null && znakR != null&&roolRR==dlina){
            fffr = (chisloR1+chisloR11+chisloR111+chisloR1111+ znakR+ chisloR2+chisloR22+chisloR222+chisloR2222);

          //  System.out.println(fffr);
        if (chisloR11 != null && chisloR111 == null && chisloR22 != null && chisloR222 != null&&chisloR1111 == null&&chisloR2222 == null) {
            String formulaDlini=chisloR1+chisloR11+znakR+chisloR2+chisloR22+chisloR222;
            if(formulaDlini.length()!=dlina){
                throw new ObshiiException();
            }
            int xR = 0;

            int yR = 0;

            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR1.equals(RIMSKIE[0])) {
                    xR = 1;
                }
                if (chisloR1.equals(RIMSKIE[1])) {
                    xR = 5;
                }
                if (chisloR1.equals(RIMSKIE[2])) {
                    xR = 10;
                }

            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR2.equals(RIMSKIE[0])) {
                    yR = 1;
                }
                if (chisloR2.equals(RIMSKIE[1])) {
                    yR = 5;
                }
                if (chisloR2.equals(RIMSKIE[2])) {
                    yR = 10;
                }


            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR22.equals(RIMSKIE[rool])) {
                    yR = yR + 1;
                }
                if (chisloR22.equals(RIMSKIE[1])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 4;
                    }
                }
                if (chisloR22.equals(RIMSKIE[2])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 9;
                    }
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR222.equals(RIMSKIE[rool])) {
                    if (chisloR22.equals(RIMSKIE[0])) {
                        yR = yR + 1;
                    }
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR11.equals(RIMSKIE[rool])) {
                    xR = xR + 1;
                }
                if (chisloR11.equals(RIMSKIE[1])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 4;
                    }
                }
                if (chisloR11.equals(RIMSKIE[2])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 9;
                    }
                }
            }
            if (znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                sumR(xR, yR);

            }
            if (znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                minusR(xR, yR);
            }
            if (znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                razdelitiR(xR, yR);
            }
            if (znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                umnogitiR(xR, yR);
            }
    //        if(fffr.length()!=dlina){
      //          throw new ObshiiException();
       //     }
        }//
        if (chisloR11 != null && chisloR111 == null && chisloR22 != null && chisloR222 == null&&chisloR1111 == null&&chisloR2222 == null) {
            String formulaDlini=chisloR1+chisloR11+znakR+chisloR2+chisloR22;
            if(formulaDlini.length()!=dlina){
                throw new ObshiiException();
            }
            int xR = 0;

            int yR = 0;

            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR1.equals(RIMSKIE[0])) {
                    xR = 1;
                }
                if (chisloR1.equals(RIMSKIE[1])) {
                    xR = 5;
                }
                if (chisloR1.equals(RIMSKIE[2])) {
                    xR = 10;
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR2.equals(RIMSKIE[0])) {
                    yR = 1;
                }
                if (chisloR2.equals(RIMSKIE[1])) {
                    yR = 5;
                }
                if (chisloR2.equals(RIMSKIE[2])) {
                    yR = 10;
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR22.equals(RIMSKIE[rool])) {
                    yR = yR + 1;
                }
                if (chisloR22.equals(RIMSKIE[1])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 4;
                    }
                }
                if (chisloR22.equals(RIMSKIE[2])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 9;
                    }
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR11.equals(RIMSKIE[rool])) {
                    xR = xR + 1;
                }
                if (chisloR11.equals(RIMSKIE[1])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 4;
                    }
                }
                if (chisloR11.equals(RIMSKIE[2])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 9;
                    }
                }
            }
            if (znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                sumR(xR, yR);

            }
            if (znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                minusR(xR, yR);
            }
            if (znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                razdelitiR(xR, yR);
            }
            if (znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                umnogitiR(xR, yR);
            }
        }//
        if (chisloR11 != null && chisloR111 != null && chisloR22 != null && chisloR222 != null&&chisloR1111 == null&&chisloR2222 == null) {
            String formulaDlini=chisloR1+chisloR11+chisloR111+znakR+chisloR2+chisloR22+chisloR222;
            if(formulaDlini.length()!=dlina){
                throw new ObshiiException();
            }
            int xR = 0;

            int yR = 0;

            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR1.equals(RIMSKIE[0])) {
                    xR = 1;
                }
                if (chisloR1.equals(RIMSKIE[1])) {
                    xR = 5;
                }
                if (chisloR1.equals(RIMSKIE[2])) {
                    xR = 10;
                }

            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR2.equals(RIMSKIE[0])) {
                    yR = 1;
                }
                if (chisloR2.equals(RIMSKIE[1])) {
                    yR = 5;
                }
                if (chisloR2.equals(RIMSKIE[2])) {
                    yR = 10;
                }


            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR22.equals(RIMSKIE[rool])) {
                    yR = yR + 1;
                }
                if (chisloR11.equals(RIMSKIE[1])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 4;
                    }
                }
                if (chisloR22.equals(RIMSKIE[2])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 9;
                    }
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR222.equals(RIMSKIE[rool])) {
                    if (chisloR22.equals(RIMSKIE[0])) {
                        yR = yR + 1;
                    }
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR11.equals(RIMSKIE[rool])) {
                    xR = xR + 1;
                }
                if (chisloR11.equals(RIMSKIE[1])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 4;
                    }
                }
                if (chisloR11.equals(RIMSKIE[2])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 9;
                    }
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR111.equals(RIMSKIE[rool])) {
                    if (chisloR11.equals(RIMSKIE[0])) {
                        xR = xR + 1;
                    }
                }
            }

            if (znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                sumR(xR, yR);

            }
            if (znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                minusR(xR, yR);
            }
            if (znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                razdelitiR(xR, yR);
            }
            if (znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                umnogitiR(xR, yR);
            }
        }//
        if (chisloR11 != null && chisloR111 != null && chisloR22 != null && chisloR222 == null&&chisloR1111 == null&&chisloR2222 == null) {
            String formulaDlini=chisloR1+chisloR11+chisloR111+znakR+chisloR2+chisloR22;
            if(formulaDlini.length()!=dlina){
                throw new ObshiiException();
            }
            int xR = 0;

            int yR = 0;

            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR1.equals(RIMSKIE[0])) {
                    xR = 1;
                }
                if (chisloR1.equals(RIMSKIE[1])) {
                    xR = 5;
                }
                if (chisloR1.equals(RIMSKIE[2])) {
                    xR = 10;
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR11.equals(RIMSKIE[rool])) {
                    xR = xR + 1;
                }
                if (chisloR11.equals(RIMSKIE[1])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 4;
                    }
                }
                if (chisloR11.equals(RIMSKIE[2])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 9;
                    }
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR111.equals(RIMSKIE[rool])) {
                    if (chisloR11.equals(RIMSKIE[0])) {
                        xR = xR + 1;
                    }
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR2.equals(RIMSKIE[0])) {
                    yR = 1;
                }
                if (chisloR2.equals(RIMSKIE[1])) {
                    yR = 5;
                }
                if (chisloR2.equals(RIMSKIE[2])) {
                    yR = 10;
                }

            }

            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR22.equals(RIMSKIE[rool])) {
                    yR = yR + 1;
                }
                if (chisloR22.equals(RIMSKIE[1])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 4;
                    }
                }
                if (chisloR22.equals(RIMSKIE[2])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 9;
                    }
                }
            }


            if (znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                sumR(xR, yR);

            }
            if (znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                minusR(xR, yR);
            }
            if (znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                razdelitiR(xR, yR);
            }
            if (znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                umnogitiR(xR, yR);
            }
        }//
        if (chisloR11 == null && chisloR111 == null && chisloR22 != null && chisloR222 == null&&chisloR1111 == null&&chisloR2222 == null) {
            String formulaDlini=chisloR1+znakR+chisloR2+chisloR22;
            if(formulaDlini.length()!=dlina){
                throw new ObshiiException();
            }
            int xR = 0;
            int xR1 = 0;
            int xR11 = 0;
            int yR = 0;
            int yR2 = 0;
            int yR22 = 0;
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR1.equals(RIMSKIE[0])) {
                    xR = 1;
                }
                if (chisloR1.equals(RIMSKIE[1])) {
                    xR = 5;
                }
                if (chisloR1.equals(RIMSKIE[2])) {
                    xR = 10;
                }

            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR2.equals(RIMSKIE[0])) {
                    yR = 1;
                }
                if (chisloR2.equals(RIMSKIE[1])) {
                    yR = 5;
                }
                if (chisloR2.equals(RIMSKIE[2])) {
                    yR = 10;
                }


            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR22.equals(RIMSKIE[rool])) {
                    yR = yR + 1;
                }
                if (chisloR22.equals(RIMSKIE[1])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 4;
                    }
                }
                if (chisloR22.equals(RIMSKIE[2])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 9;
                    }
                }
            }

            if (znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                sumR(xR, yR);

            }
            if (znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                minusR(xR, yR);
            }
            if (znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                razdelitiR(xR, yR);
            }
            if (znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                umnogitiR(xR, yR);
            }
        }//
        if (chisloR11 == null && chisloR111 == null && chisloR22 != null && chisloR222 != null&&chisloR1111 == null&&chisloR2222 == null) {
            String formulaDlini=chisloR1+znakR+chisloR2+chisloR22+chisloR222;
            if(formulaDlini.length()!=dlina){
                throw new ObshiiException();
            }
            int xR = 0;
            int xR1 = 0;
            int xR11 = 0;
            int yR = 0;
            int yR2 = 0;
            int yR22 = 0;
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR1.equals(RIMSKIE[0])) {
                    xR = 1;
                }
                if (chisloR1.equals(RIMSKIE[1])) {
                    xR = 5;
                }
                if (chisloR1.equals(RIMSKIE[2])) {
                    xR = 10;
                }

            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR2.equals(RIMSKIE[0])) {
                    yR = 1;
                }
                if (chisloR2.equals(RIMSKIE[1])) {
                    yR = 5;
                }
                if (chisloR2.equals(RIMSKIE[2])) {
                    yR = 10;
                }


            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR22.equals(RIMSKIE[rool])) {
                    yR = yR + 1;
                }
                if (chisloR22.equals(RIMSKIE[1])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 4;
                    }
                }
                if (chisloR22.equals(RIMSKIE[2])) {
                    if (chisloR2.equals(RIMSKIE[0])) {
                        yR = 9;
                    }
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR222.equals(RIMSKIE[rool])) {
                    if (chisloR22.equals(RIMSKIE[0])) {
                        yR = yR + 1;
                    }
                }
            }

            if (znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                sumR(xR, yR);

            }
            if (znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                minusR(xR, yR);
            }
            if (znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                razdelitiR(xR, yR);
            }
            if (znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                umnogitiR(xR, yR);
            }
        }//
        if (chisloR11 != null && chisloR111 != null && chisloR22 == null && chisloR222 == null&&chisloR1111 == null&&chisloR2222 == null) {
            String formulaDlini=chisloR1+chisloR11+chisloR111+znakR+chisloR2;
            if(formulaDlini.length()!=dlina){
                throw new ObshiiException();
            }
            int xR = 0;
            int yR = 0;
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR1!=null&&chisloR1.equals(RIMSKIE[0])) {
                    xR = 1;
                }
                if (chisloR1!=null&&chisloR1.equals(RIMSKIE[1])) {
                    xR = 5;
                }
                if (chisloR1!=null&&chisloR1.equals(RIMSKIE[2])) {
                    xR = 10;
                }

            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR2!=null&&chisloR2.equals(RIMSKIE[0])) {
                    yR = 1;
                }
                if (chisloR2!=null&&chisloR2.equals(RIMSKIE[1])) {
                    yR = 5;
                }
                if (chisloR2!=null&&chisloR2.equals(RIMSKIE[2])) {
                    yR = 10;
                }


            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR11!=null&&chisloR11.equals(RIMSKIE[rool])) {
                    xR = xR + 1;
                }
                if (chisloR11!=null&&chisloR11.equals(RIMSKIE[1])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 4;
                    }
                }
                if (chisloR11!=null&&chisloR11.equals(RIMSKIE[2])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 9;
                    }
                }
            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR111.equals(RIMSKIE[rool])) {
                    if (chisloR11.equals(RIMSKIE[0])) {
                        xR = xR + 1;
                    }
                }
            }

            if (znakR!=null&&znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                sumR(xR, yR);

            }
            if (znakR!=null&&znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                minusR(xR, yR);
            }
            if (znakR!=null&&znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                razdelitiR(xR, yR);
            }
            if (znakR!=null&&znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                umnogitiR(xR, yR);
            }
        }//
        if (chisloR11 != null && chisloR111 == null && chisloR22 == null && chisloR222 == null&&chisloR1111 == null&&chisloR2222 == null) {
            String formulaDlini=chisloR1+chisloR11+znakR+chisloR2;
            if(formulaDlini.length()!=dlina){
                throw new ObshiiException();
            }
            int xR = 0;
            int yR = 0;
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR1!=null&&chisloR1.equals(RIMSKIE[0])) {
                    xR = 1;
                }
                if (chisloR1!=null&&chisloR1.equals(RIMSKIE[1])) {
                    xR = 5;
                }
                if (chisloR1!=null&&chisloR1.equals(RIMSKIE[2])) {
                    xR = 10;
                }

            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR2!=null&&chisloR2.equals(RIMSKIE[0])) {
                    yR = 1;
                }
                if (chisloR2!=null&&chisloR2.equals(RIMSKIE[1])) {
                    yR = 5;
                }
                if (chisloR2!=null&&chisloR2.equals(RIMSKIE[2])) {
                    yR = 10;
                }


            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR11!=null&&chisloR11.equals(RIMSKIE[rool])) {
                    xR = xR + 1;
                }
                if (chisloR11!=null&&chisloR11.equals(RIMSKIE[1])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 4;
                    }
                }
                if (chisloR11!=null&&chisloR11.equals(RIMSKIE[2])) {
                    if (chisloR1.equals(RIMSKIE[0])) {
                        xR = 9;
                    }
                }
            }

            if (znakR!=null&&znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                sumR(xR, yR);

            }
            if (znakR!=null&&znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                minusR(xR, yR);
            }
            if (znakR!=null&&znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                razdelitiR(xR, yR);
            }
            if (znakR!=null&&znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                umnogitiR(xR, yR);
            }
        }//
        if (chisloR11 == null && chisloR111 == null && chisloR22 == null && chisloR222 == null&&chisloR1111 == null&&chisloR2222 == null) {
            String formulaDlini=chisloR1+znakR+chisloR2;
            if(formulaDlini.length()!=dlina){
                throw new ObshiiException();
            }
            int xR = 0;
            int yR = 0;
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR1!=null&&chisloR1.equals(RIMSKIE[0])) {
                    xR = 1;
                }
                if (chisloR1!=null&&chisloR1.equals(RIMSKIE[1])) {
                    xR = 5;
                }
                if (chisloR1!=null&&chisloR1.equals(RIMSKIE[2])) {
                    xR = 10;
                }

            }
            for (int rool = 0; RIMSKIE.length > rool; rool++) {
                if (chisloR2!=null&&chisloR2.equals(RIMSKIE[0])) {
                    yR = 1;
                }
                if (chisloR2!=null&&chisloR2.equals(RIMSKIE[1])) {
                    yR = 5;
                }
                if (chisloR2!=null&&chisloR2.equals(RIMSKIE[2])) {
                    yR = 10;
                }

            }

            if (znakR!=null&&znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                sumR(xR, yR);

            }
            if (znakR!=null&&znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                minusR(xR, yR);
            }
            if (znakR!=null&&znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                razdelitiR(xR, yR);
            }
            if (znakR!=null&&znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                umnogitiR(xR, yR);
            }
        }//

            if (chisloR11 != null && chisloR111 != null && chisloR22 == null && chisloR222 == null&&chisloR1111 != null&&chisloR2222 == null) {
                String formulaDlini=chisloR1+chisloR11+chisloR111+chisloR1111+znakR+chisloR2;
                if(formulaDlini.length()!=dlina){
                    throw new ObshiiException();
                }
                int xR = 8;
                int yR = 0;

                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR2!=null&&chisloR2.equals(RIMSKIE[0])) {
                        yR = 1;
                    }
                    if (chisloR2!=null&&chisloR2.equals(RIMSKIE[1])) {
                        yR = 5;
                    }
                    if (chisloR2!=null&&chisloR2.equals(RIMSKIE[2])) {
                        yR = 10;
                    }

                }

                if (znakR!=null&&znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                    sumR(xR, yR);

                }
                if (znakR!=null&&znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                    minusR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                    razdelitiR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                    umnogitiR(xR, yR);
                }
            }//
            if (chisloR11 == null && chisloR111 == null && chisloR22 != null && chisloR222 != null&&chisloR1111 == null&&chisloR2222 != null) {
                String formulaDlini=chisloR1+znakR+chisloR2+chisloR22+chisloR222+chisloR2222;;
                if(formulaDlini.length()!=dlina){
                    throw new ObshiiException();
                }
                int xR = 0;

                int yR = 8;

                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR1!=null&&chisloR1.equals(RIMSKIE[0])) {
                        xR = 1;
                    }
                    if (chisloR1!=null&&chisloR1.equals(RIMSKIE[1])) {
                        xR = 5;
                    }
                    if (chisloR1!=null&&chisloR1.equals(RIMSKIE[2])) {
                        xR = 10;
                    }

                }


                if (znakR!=null&&znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                    sumR(xR, yR);

                }
                if (znakR!=null&&znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                    minusR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                    razdelitiR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                    umnogitiR(xR, yR);
                }
            }//
            if (chisloR11 != null && chisloR111 != null && chisloR22 != null && chisloR222 != null&&chisloR1111 != null&&chisloR2222 != null) {
                String formulaDlini=chisloR1+chisloR11+chisloR111+chisloR1111+znakR+chisloR2+chisloR22+chisloR222+chisloR2222;
                if(formulaDlini.length()!=dlina){
                    throw new ObshiiException();
                }
                int xR = 8;
                int yR = 8;
                if (znakR!=null&&znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                    sumR(xR, yR);

                }
                if (znakR!=null&&znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                    minusR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                    razdelitiR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                    umnogitiR(xR, yR);
                }
            }//
            if (chisloR11 != null && chisloR111 == null && chisloR22 != null && chisloR222 != null&&chisloR1111 == null&&chisloR2222 != null) {
                String formulaDlini=chisloR1+chisloR11+znakR+chisloR2+chisloR22+chisloR222+chisloR2222;
                if(formulaDlini.length()!=dlina){
                    throw new ObshiiException();
                }
                int xR = 0;
                int yR = 8;
                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR1!=null&&chisloR1.equals(RIMSKIE[0])) {
                        xR = 1;
                    }
                    if (chisloR1!=null&&chisloR1.equals(RIMSKIE[1])) {
                        xR = 5;
                    }
                    if (chisloR1!=null&&chisloR1.equals(RIMSKIE[2])) {
                        xR = 10;
                    }

                }
                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR11!=null&&chisloR11.equals(RIMSKIE[rool])) {
                        xR = xR + 1;
                    }
                    if (chisloR11!=null&&chisloR11.equals(RIMSKIE[1])) {
                        if (chisloR1.equals(RIMSKIE[0])) {
                            xR = 4;
                        }
                    }
                    if (chisloR11!=null&&chisloR11.equals(RIMSKIE[2])) {
                        if (chisloR1.equals(RIMSKIE[0])) {
                            xR = 9;
                        }}}

                if (znakR!=null&&znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                    sumR(xR, yR);

                }
                if (znakR!=null&&znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                    minusR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                    razdelitiR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                    umnogitiR(xR, yR);
                }
            }//
            if (chisloR11 != null && chisloR111 != null && chisloR22 != null && chisloR222 == null&&chisloR1111 != null&&chisloR2222 == null) {
                String formulaDlini=chisloR1+chisloR11+chisloR111+chisloR1111+znakR+chisloR2+chisloR22;
                if(formulaDlini.length()!=dlina){
                    throw new ObshiiException();
                }
                int xR = 8;
                int yR = 0;
                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR2!=null&&chisloR2.equals(RIMSKIE[0])) {
                        yR = 1;
                    }
                    if (chisloR2!=null&&chisloR2.equals(RIMSKIE[1])) {
                        yR = 5;
                    }
                    if (chisloR2!=null&&chisloR2.equals(RIMSKIE[2])) {
                        yR = 10;
                    }

                }
                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR22.equals(RIMSKIE[rool])) {
                        yR = yR + 1;
                    }
                    if (chisloR22.equals(RIMSKIE[1])) {
                        if (chisloR2.equals(RIMSKIE[0])) {
                            yR = 4;
                        }
                    }
                    if (chisloR22.equals(RIMSKIE[2])) {
                        if (chisloR2.equals(RIMSKIE[0])) {
                            yR = 9;
                        }
                    }}
                if (znakR!=null&&znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                    sumR(xR, yR);

                }
                if (znakR!=null&&znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                    minusR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                    razdelitiR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                    umnogitiR(xR, yR);
                }
            }//
            if (chisloR11 != null && chisloR111 != null && chisloR22 != null && chisloR222 != null&&chisloR1111 != null&&chisloR2222 == null) {
                String formulaDlini=chisloR1+chisloR11+chisloR111+chisloR1111+znakR+chisloR2+chisloR22+chisloR222;
                if(formulaDlini.length()!=dlina){
                    throw new ObshiiException();
                }
                int xR = 8;
                int yR = 0;
                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR2!=null&&chisloR2.equals(RIMSKIE[0])) {
                        yR = 1;
                    }
                    if (chisloR2!=null&&chisloR2.equals(RIMSKIE[1])) {
                        yR = 5;
                    }
                    if (chisloR2!=null&&chisloR2.equals(RIMSKIE[2])) {
                        yR = 10;
                    }

                }
                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR22.equals(RIMSKIE[rool])) {
                        yR = yR + 1;
                    }
                    if (chisloR22.equals(RIMSKIE[1])) {
                        if (chisloR2.equals(RIMSKIE[0])) {
                            yR = 4;
                        }
                    }
                    if (chisloR22.equals(RIMSKIE[2])) {
                        if (chisloR2.equals(RIMSKIE[0])) {
                            yR = 9;
                        }
                    }
                }
                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR222.equals(RIMSKIE[rool])) {
                        if (chisloR22.equals(RIMSKIE[0])) {
                            yR = yR + 1;
                        }
                    }
                }

                if (znakR!=null&&znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                    sumR(xR, yR);

                }
                if (znakR!=null&&znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                    minusR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                    razdelitiR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                    umnogitiR(xR, yR);
                }
            }//
            if (chisloR11 != null && chisloR111 != null && chisloR22 != null && chisloR222 != null&&chisloR1111 == null&&chisloR2222 != null) {
                String formulaDlini=chisloR1+chisloR11+chisloR111+znakR+chisloR2+chisloR22+chisloR222+chisloR2222;
                if(formulaDlini.length()!=dlina){
                    throw new ObshiiException();
                }
                int xR = 0;
                int yR = 8;
                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR1!=null&&chisloR1.equals(RIMSKIE[0])) {
                        xR = 1;
                    }
                    if (chisloR1!=null&&chisloR1.equals(RIMSKIE[1])) {
                        xR = 5;
                    }
                    if (chisloR1!=null&&chisloR1.equals(RIMSKIE[2])) {
                        xR = 10;
                    }

                }
                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR11!=null&&chisloR11.equals(RIMSKIE[rool])) {
                        xR = xR + 1;
                    }
                    if (chisloR11!=null&&chisloR11.equals(RIMSKIE[1])) {
                        if (chisloR1.equals(RIMSKIE[0])) {
                            xR = 4;
                        }
                    }
                    if (chisloR11!=null&&chisloR11.equals(RIMSKIE[2])) {
                        if (chisloR1.equals(RIMSKIE[0])) {
                            xR = 9;
                        }
                    }
                }
                for (int rool = 0; RIMSKIE.length > rool; rool++) {
                    if (chisloR111.equals(RIMSKIE[rool])) {
                        if (chisloR11.equals(RIMSKIE[0])) {
                            xR = xR + 1;
                        }
                    }
                }


                if (znakR!=null&&znakR.equals(ZNAKI[0]) && (xR != 0 || yR != 0)) {
                    sumR(xR, yR);

                }
                if (znakR!=null&&znakR.equals(ZNAKI[1]) && (xR != 0 || yR != 0)) {
                    minusR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[2]) && (xR != 0 || yR != 0)) {
                    razdelitiR(xR, yR);
                }
                if (znakR!=null&&znakR.equals(ZNAKI[3]) && (xR != 0 || yR != 0)) {
                    umnogitiR(xR, yR);
                }
            }//
    }}

    private void sumR(int xR, int yR) {
        konechnayaR = xR + yR;
    }

    public void minusR(int xR, int yR) {

        konechnayaR = xR - yR;
    }

    public void umnogitiR(int xR, int yR) {

        konechnayaR = xR * yR;
    }

    public void razdelitiR(int xR, int yR) {

        konechnayaR = xR / yR;

    }

    public String ff13() {
        if (fffr != null) {
            return fffr;
        }
        return "Пиздец";
    }
    }