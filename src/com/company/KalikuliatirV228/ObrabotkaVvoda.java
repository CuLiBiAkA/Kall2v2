package com.company.KalikuliatirV228;

public class ObrabotkaVvoda {
    private String j;
    private String k;
    private int i = 0;
    private String text;
    private final String[] CHISLA = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private final String[] ZNAKI = {"+", "-", "/", "*"};
    private final String[] RIMSKIE = {"I", "V", "X", "IV", "II", "VI", "VII", "VIII", "IX", "III"};
    private final String[] SIMVOLI = {" ",};
    private int dlinnaMassiva;
    private String[] massiv2;


    private int dlinnaMassiva2;

    public ObrabotkaVvoda(String text) {
        this.text = text;
    }

    public void obrabotkaVvoda() throws OneException, TwoException, ThreeException, ForException, ObshiiException {
        char[] massiv = text.toCharArray();
        dlinnaMassiva = massiv.length;
        String[] massiv1 = new String[dlinnaMassiva];
        int lovushkaSimvolov = 0;
        int lovushkaZnakov = 0;
        int lovushkaRimskih = 0;
        int lovushkaChisel = 0;
        int lovushkanull = 0;
        //   System.out.println(String.valueOf(massiv) + " Преобразовали текст в массив Чар для обработки");

        for (i = 0; massiv.length > i; i++) {
            j = null;
            String a = String.valueOf(massiv[i]);
            for (int ich = 0; CHISLA.length > ich; ich++) {
                String g = String.valueOf(CHISLA[ich]);
                if (a.equals(g)) {
                    j = a;
                    lovushkaChisel++;


                }
            }
            for (int irim = 0; RIMSKIE.length > irim; irim++) {
                String b = String.valueOf(RIMSKIE[irim]);
                if (a.equals(b)) {
                    j = a;
                    lovushkaRimskih++;

                }
            }
            for (int iznak = 0; ZNAKI.length > iznak; iznak++) {
                String c = String.valueOf(ZNAKI[iznak]);
                if (a.equals(c) && i == 0) {
                    throw new ObshiiException();
                }
                if (a.equals(c)) {
                    j = a;
                    lovushkaZnakov++;

                }
            }
            for (int isim = 0; SIMVOLI.length > isim; isim++) {
                String d = String.valueOf(SIMVOLI[isim]);
                if (a.equals(d)) {
                    dlinnaMassiva = dlinnaMassiva - 1;
                    // j = a;
                    lovushkaSimvolov++;
                    lovushkanull--;

                }
            }
            if (a.equals(SIMVOLI[0]) && i == 0) {
                throw new ObshiiException();
            }

            if (j != null) {
                massiv1[i - lovushkaSimvolov - lovushkanull] = j;
                dlinnaMassiva2++;
            }
            if (j == null) {
                lovushkanull++;
            }

            if (dlinnaMassiva == i + 1 - lovushkaSimvolov) {
                k = String.join("", massiv1);
                //   System.out.println(k + " обработанный массив выведенный строкой");
            }


        }
        if (lovushkaZnakov != 1) {
            throw new ForException();
        }
        if (lovushkaSimvolov > 2) {
            throw new ObshiiException();
        }
        if (lovushkaRimskih != 0 && lovushkaChisel != 0) {
            throw new OneException();
        }
        if (lovushkaChisel < 2 && lovushkaRimskih < 2) {
            throw new TwoException();
        }

        if (lovushkaRimskih == 0 && lovushkaChisel == 0) {
            throw new ObshiiException();
        }
        if (dlinnaMassiva2 != (massiv.length - lovushkaSimvolov)) {
            throw new ObshiiException();
        }
        if (lovushkaChisel > 4 || lovushkaZnakov > 8) {
            throw new ObshiiException();
        }

    }

    public int getDlinnaMassiva2() {
     //   System.out.println(dlinnaMassiva2);
        return dlinnaMassiva2;

    }

    public String getK() {
      //  System.out.println(k.length());
        return k;
    }


}


