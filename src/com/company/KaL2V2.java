

 package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

    public class KaL2V2 {

        public static void main(String[] args) throws HueviiException, EbaniiException, SpatiHochuException, EbuxhiiException {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            if (text.length() < 3 || text.length() > 7) {
                throw new HueviiException();
            }
            EbuchieMassivi vvodnoi = new EbuchieMassivi(text);
            ChertovCHAr chertovCHAr = new ChertovCHAr();
            chertovCHAr.hz1(vvodnoi.getHuiny());
            Dlinna proverkfEblana = new Dlinna();
            proverkfEblana.hz2(chertovCHAr.hz1(vvodnoi.getHuiny()));
            if (proverkfEblana.ff12().equals(text) || proverkfEblana.ff13().equals(text)) {
                proverkfEblana.konec();
                return;
            }
        }
    }

    class EbuchieMassivi {

        private String huiny;

        public EbuchieMassivi() {
            //System.out.println("пусто");
        }

        public EbuchieMassivi(String text) {
            this.huiny = text;
            //   System.out.println(huiny);
        }

        public String getHuiny() {
            return huiny;
        }
    }

    class ChertovCHAr {

        private char[] tet;

        public ChertovCHAr() {
        }

        public char[] hz1(String t) {
            String[] noviiKostil2 = {"1", "0"};
            char[] perviiChar = t.toCharArray();

            // System.out.println("Преобразовал массив в чары " + t);

            //   System.out.println(Arrays.toString(perviiChar));

            return perviiChar;
        }


        public char[] getPerviiChar1() {
            return tet;
        }

        public ChertovCHAr(char[] tet) {
            this.tet = tet;
        }
    }

    class Dlinna {
        private String izCifirvRim;
        private String fffr;
        private String fff;
        private int konechnaya;
        private int konechnayaR;
        private int control;
        private String controll = null;
        private String chislo1;
        private String chislo12;
        private String znak = null;
        private String chislo2;
        private String chislo22;
        private String chisloR1;
        private String chisloR11;
        private String chisloR111;
        private String znakR = null;
        private String chisloR2;
        private String chisloR22;
        private String chisloR222;
        private final String[] RIMSKIEPEREBORI = {"I", "II", "III", "IV"
                , "V", "VI", "VII",
                "VIII", "IX", "X", "XI",
                "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV",
                "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
                "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLXI", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI"
                , "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXXII", "LXXIII", "LXXIV",
                "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI",
                "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        private final String[] CHISLA = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "0"};
        private final String[] CHISLACOSTILI = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "0", "+", "-", "/", "*", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        private final String[] ZNAKI = {"+", "-", "/", "*"};
        private final String[] RIMSKIE = {"I", "V", "X", "IV", "II", "VI", "VII", "VIII", "IX", "III"};
        private final String ELL = "L";
        private final String CEE = "C";
        private int dliaPeremennoi;

        public void hz2(char[] tet) throws SpatiHochuException, EbuxhiiException, EbaniiException {
            ChertovCHAr perviiChar1 = new ChertovCHAr();
            perviiChar1();

            int dlinaHuini = tet.length;
            //  System.out.println(tet.length);

            if (dlinaHuini < 3) {
                System.out.println("Ты еблан написал меньше 3х символов");
                return;
            } else {
                dliaPeremennoi = dlinaHuini;
            }
            if (dliaPeremennoi > 7) {
                System.out.println("Ты еблан написал больше необходимого");
                return;
            } else {
                proverochka(tet);
            }
        }

        private int perviiChar1(int length) {
            return 0;
        }

        private void perviiChar1() {
        }

        public void proverochka(char[] tet) throws SpatiHochuException, EbuxhiiException, EbaniiException {
            int lovushka = 0;
            int lovushka1 = 0;
            int lovushka2 = 0;
            int lovushka3 = 0;
            for (int crutiti1 = 0; tet.length > crutiti1; crutiti1++) {
                String a = String.valueOf(new char[]{tet[crutiti1]});
                // System.out.println(a);

                for (int crutiti2 = 0; CHISLA.length > crutiti2; crutiti2++) {
                    String b = String.valueOf(CHISLA[crutiti2]);
                    a = String.valueOf(new char[]{tet[crutiti1]});
                    if (a.equals(b)) {//System.out.println(b+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        esheHuetaKakaiato(a);
                        lovushka1++;

                    }
                }

                for (int crutiti3 = 0; ZNAKI.length > crutiti3; crutiti3++) {
                    String g = String.valueOf(ZNAKI[crutiti3]);
                    //  System.out.println(g);
                    if (a.equals(g)) {//System.out.println(g+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        esheHuetaKakaiato(a);
                        rimskieChiki(a);
                        lovushka++;
                        lovushka2++;
                    }
                }
                for (int cruriti4 = 0; RIMSKIE.length > cruriti4; cruriti4++) {
                    String r = String.valueOf(RIMSKIE[cruriti4]);
                    a = String.valueOf(new char[]{tet[crutiti1]});
                    if (a.equals(r)) {//System.out.println(r+ "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        esheHuetaKakaiato(a);
                        rimskieChiki(a);
                        lovushka3++;
                    }

                    //   System.out.println(r);
                }

            }
            if (lovushka > 1) {
                throw new SpatiHochuException();
            }
            if ((lovushka1 == 0 && lovushka2 == 0 && lovushka3 == 0)
                    || (lovushka1 != 0 && lovushka2 == 0 && lovushka3 != 0)
                    || (lovushka1 == 0 && lovushka2 == 0 && lovushka3 != 0)) {
                throw new EbuxhiiException();
            }
            if (lovushka1 != 0 && lovushka2 != 0 && lovushka3 != 0) {
                throw new EbaniiException();
            }
        }


        public void esheHuetaKakaiato(String a) {
            //   System.out.println(a + "Финалочка");

            for (int rool = 0; CHISLACOSTILI.length > rool; rool++)
                if (a.equals(CHISLACOSTILI[rool])) {
                    if (znak == null
                            && chislo1 == null
                            && (a.equals(CHISLA[0])
                            || a.equals(CHISLA[1])
                            || a.equals(CHISLA[2])
                            || a.equals(CHISLA[3])
                            || a.equals(CHISLA[4])
                            || a.equals(CHISLA[5])
                            || a.equals(CHISLA[6])
                            || a.equals(CHISLA[7])
                            || a.equals(CHISLA[8]))) {
                        chislo1 = CHISLACOSTILI[rool];
                        formulaINT(chislo1, chislo12, chislo2, chislo22, znak);
                        return;
                    }
                    if (znak == null
                            && chislo1 != null
                            && chislo1.equals(CHISLACOSTILI[0])
                            && chislo12 == null
                            && a.equals(CHISLACOSTILI[10])) {
                        chislo12 = CHISLACOSTILI[10];
                        formulaINT(chislo1, chislo12, chislo2, chislo22, znak);
                        return;
                    }
                    if (
                            chislo1 != null &&
                                    znak == null
                                    && (a.equals(ZNAKI[0])
                                    || a.equals(ZNAKI[1])
                                    || a.equals(ZNAKI[2])
                                    || a.equals(ZNAKI[3]))) {
                        znak = a;
                        formulaINT(chislo1, chislo12, chislo2, chislo22, znak);
                        return;
                    }
                    if (znak != null
                            && chislo2 == null
                            && (a.equals(CHISLA[0])
                            || a.equals(CHISLA[1])
                            || a.equals(CHISLA[2])
                            || a.equals(CHISLA[3])
                            || a.equals(CHISLA[4])
                            || a.equals(CHISLA[6])
                            || a.equals(CHISLA[7])
                            || a.equals(CHISLA[5])
                            || a.equals(CHISLA[8]))) {
                        chislo2 = CHISLACOSTILI[rool];
                        formulaINT(chislo1, chislo12, chislo2, chislo22, znak);
                        return;
                    }
                    if (chislo2 != null
                            && chislo2.equals(CHISLACOSTILI[0])
                            && a.equals(CHISLACOSTILI[10])) {
                        chislo22 = CHISLACOSTILI[10];
                        formulaINT(chislo1, chislo12, chislo2, chislo22, znak);
                        return;
                    }


                }

        }


        public void formulaINT(String chislo1, String chislo12, String chislo2, String chislo22, String znak) {


            if (chislo1 != null && chislo2 != null && znak != null) {


                //       control++;
                //  System.out.println(" КОНТРОЛЬ " + control);


                if (chislo12 == null && chislo22 == null) {
                    String formull = this.chislo1 + this.znak + this.chislo2;
                    zaebalsiaUge(formull);
                }
                if (chislo12 == null && chislo22 != null) {
                    String formull = this.chislo1 + this.znak + this.chislo2 + this.chislo22;
                    zaebalsiaUge(formull);
                }
                if (chislo12 != null && chislo22 == null) {
                    String formull = this.chislo1 + this.chislo12 + this.znak + this.chislo2;
                    zaebalsiaUge(formull);
                }
                if (chislo12 != null && chislo22 != null) {
                    String formull = this.chislo1 + this.chislo12 + this.znak + this.chislo2 + this.chislo22;
                    zaebalsiaUge(formull);
                }
            }

        }

        public void zaebalsiaUge(String formull) {
            fff = formull;
            // System.out.println(formull);
            int x = 0;
            int y = 0;
            if (chislo12 == null && chislo22 == null) {
                x = parseInt(chislo1);
                y = parseInt(chislo2);
            }
            if (chislo12 == null && chislo22 != null) {
                x = parseInt(chislo1);
                y = parseInt(chislo2);
                int y1 = parseInt(chislo22);
                y = 10;

            }
            if (chislo12 != null && chislo22 == null) {
                x = parseInt(chislo1);
                y = parseInt(chislo2);
                int x1 = parseInt(chislo12);
                x = 10;
            }
            if (chislo12 != null && chislo22 != null) {
                x = parseInt(chislo1);
                y = parseInt(chislo2);
                int x1 = parseInt(chislo12);
                int y1 = parseInt(chislo22);
                x = 10;
                y = 10;
            }
            if (znak.equals(ZNAKI[0]) && (x != 0 || y != 0)) {
                sum(x, y);

            }
            if (znak.equals(ZNAKI[1]) && (x != 0 || y != 0)) {
                minus(x, y);
            }
            if (znak.equals(ZNAKI[2]) && (x != 0 || y != 0)) {
                razdeliti(x, y);
            }
            if (znak.equals(ZNAKI[3]) && (x != 0 || y != 0)) {
                umnogiti(x, y);
            }
        }

        public void sum(int x, int y) {
            konechnaya = x + y;
            // System.out.println(x + y);
        }

        public void minus(int x, int y) {
            //  System.out.println(x - y);
            konechnaya = x - y;
        }

        public void umnogiti(int x, int y) {
            //   System.out.println(x * y);
            konechnaya = x * y;
        }

        public void razdeliti(int x, int y) {
            //   System.out.println(x / y);
            konechnaya = x / y;
        }

        public void konec() throws EbuxhiiException {
            if (znakR != null) {
                if (konechnayaR < 0) {
                    throw new EbuxhiiException();
                } else {
                    izCifirvRim = null;
                    for (int roll = 0; RIMSKIEPEREBORI.length > roll; roll++) {
                        if (roll + 1 == konechnayaR) {
                            izCifirvRim = RIMSKIEPEREBORI[roll];
                            System.out.println(String.valueOf(izCifirvRim) + " это результат");
                        }


                    }
                }
                if (znak != null) {
                    System.out.println(konechnaya + " это результат");
                }
            }
        }

        public String ff12() {
            if (fff != null) {
                // System.out.println(fff);
                return fff;
            }
            return "Пиздец";
        }///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public void rimskieChiki(String a) {
            for (int rool = 0; CHISLACOSTILI.length > rool; rool++)
                if (a.equals(CHISLACOSTILI[rool])) {
                    if (znakR == null
                            && chisloR1 == null
                            && (a.equals(RIMSKIE[0])
                            || a.equals(RIMSKIE[1])
                            || a.equals(RIMSKIE[2]))) {
                        chisloR1 = CHISLACOSTILI[rool];
                        formulaINTR(chisloR1, chisloR11, chisloR111, chisloR2, chisloR22, chisloR222, znakR);
                        return;
                    }
                    if (a.equals(CHISLACOSTILI[rool])) {
                        if (chisloR1 != null && ((!chisloR1.equals(RIMSKIE[2]) && !chisloR1.equals(RIMSKIE[1])) || a.equals(RIMSKIE[0])) && znakR == null && chisloR11 == null
                                && (a.equals(RIMSKIE[2]) || a.equals(RIMSKIE[0]) ||
                                a.equals(RIMSKIE[1]))) {
                            chisloR11 = CHISLACOSTILI[rool];
                            formulaINTR(chisloR1, chisloR11, chisloR111, chisloR2, chisloR22, chisloR222, znakR);
                            return;
                        }
                        if (a.equals(CHISLACOSTILI[rool])) {
                            if (znakR == null
                                    && chisloR11 != null
                                    && (!chisloR11.equals(RIMSKIE[1])
                                    && !chisloR11.equals(RIMSKIE[2]) || a.equals(RIMSKIE[0]))
                                    && chisloR111 == null

                                    && (a.equals(RIMSKIE[0]))) {
                                chisloR111 = CHISLACOSTILI[rool];
                                formulaINTR(chisloR1, chisloR11, chisloR111, chisloR2, chisloR22, chisloR222, znakR);
                                return;
                            }
                            if (znakR == null
                                    && (a.equals(ZNAKI[0])
                                    || a.equals(ZNAKI[1])
                                    || a.equals(ZNAKI[2])
                                    || a.equals(ZNAKI[3]))) {
                                znakR = a;
                                formulaINTR(chisloR1, chisloR11, chisloR111, chisloR2, chisloR22, chisloR222, znakR);
                                return;
                            }
                            if (znakR != null
                                    && chisloR2 == null
                                    && (a.equals(RIMSKIE[0])
                                    || a.equals(RIMSKIE[1])
                                    || a.equals(RIMSKIE[2]))) {
                                chisloR2 = CHISLACOSTILI[rool];
                                formulaINTR(chisloR1, chisloR11, chisloR111, chisloR2, chisloR22, chisloR222, znakR);
                                return;
                            }
                            if (a.equals(CHISLACOSTILI[rool])) {
                                if (chisloR2 != null
                                        && (!chisloR2.equals(RIMSKIE[1])
                                        && !chisloR2.equals(RIMSKIE[2]) || a.equals(RIMSKIE[0]))
                                        && znakR != null
                                        && chisloR22 == null
                                        && (a.equals(RIMSKIE[2]) || a.equals(RIMSKIE[0]) ||
                                        a.equals(RIMSKIE[1]))) {
                                    chisloR22 = CHISLACOSTILI[rool];
                                    formulaINTR(chisloR1, chisloR11, chisloR111, chisloR2, chisloR22, chisloR222, znakR);
                                    return;
                                }
                                if (a.equals(CHISLACOSTILI[rool])) {
                                    if (znakR != null
                                            && chisloR22 != null
                                            && (!chisloR22.equals(RIMSKIE[1])
                                            && !chisloR22.equals(RIMSKIE[2]) || a.equals(RIMSKIE[0]))
                                            && chisloR222 == null
                                            && (a.equals(RIMSKIE[0]))) {
                                        chisloR222 = CHISLACOSTILI[rool];
                                        formulaINTR(chisloR1, chisloR11, chisloR111, chisloR2, chisloR22, chisloR222, znakR);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
        }

        public void formulaINTR(String chisloR1, String chisloR11, String chisloR111, String chisloR2, String
                chisloR22, String chisloR222, String znakR) {


            //int controlR=0;
            //      System.out.println(controlR);
            //controlR++;


            if (chisloR1 != null && chisloR2 != null && znakR != null) {
                //   String formullr = chisloR1 + chisloR11 + chisloR111 + znakR + chisloR2 + chisloR22 + chisloR222;
                //  System.out.println(String.valueOf(formullr));

                if (chisloR11 == null && chisloR111 == null && chisloR22 == null && chisloR222 == null) {
                    String formullr = this.chisloR1 + this.znakR + this.chisloR2;
                    zaebalsiaUger(formullr);
                }
                if (chisloR11 != null && chisloR111 == null && chisloR22 == null && chisloR222 == null && !chisloR1.equals(RIMSKIE[2])) {
                    String formullr = this.chisloR1 + this.chisloR11 + this.znakR + this.chisloR2;
                    zaebalsiaUger(formullr);
                }
                if (chisloR11 != null && chisloR111 != null && chisloR22 == null && chisloR222 == null && !chisloR11.equals(RIMSKIE[1]) && !chisloR11.equals(RIMSKIE[2])) {
                    String formullr = this.chisloR1 + this.chisloR11 + this.chisloR111 + this.znakR + this.chisloR2;
                    zaebalsiaUger(formullr);
                }
                if (chisloR11 != null && chisloR111 != null && chisloR22 != null && chisloR222 == null && !chisloR11.equals(RIMSKIE[1]) && !chisloR11.equals(RIMSKIE[2]) && !chisloR2.equals(RIMSKIE[2])) {
                    String formullr = this.chisloR1 + this.chisloR11 + this.chisloR111 + this.znakR + this.chisloR2 + this.chisloR22;
                    zaebalsiaUger(formullr);
                }
                if (chisloR11 != null && chisloR111 != null && chisloR22 != null && chisloR222 != null && !chisloR2.equals(RIMSKIE[2]) && !chisloR1.equals(RIMSKIE[2]) && !chisloR11.equals(RIMSKIE[1]) && !chisloR11.equals(RIMSKIE[2]) && !chisloR22.equals(RIMSKIE[1]) && !chisloR22.equals(RIMSKIE[2])) {
                    String formullr = this.chisloR1 + this.chisloR11 + this.chisloR111 + this.znakR + this.chisloR2 + this.chisloR22 + this.chisloR222;
                    zaebalsiaUger(formullr);
                }
                if (chisloR11 == null && chisloR111 == null && chisloR22 != null && chisloR222 != null && !chisloR22.equals(RIMSKIE[1]) && !chisloR22.equals(RIMSKIE[2]) && !chisloR2.equals(RIMSKIE[2])) {
                    String formullr = this.chisloR1 + this.znakR + this.chisloR2 + this.chisloR22 + this.chisloR222;
                    zaebalsiaUger(formullr);
                }
                if (chisloR11 == null && chisloR111 == null && chisloR22 != null && chisloR222 == null && !chisloR2.equals(RIMSKIE[2])) {
                    String formullr = this.chisloR1 + this.znakR + this.chisloR2 + this.chisloR22;
                    zaebalsiaUger(formullr);
                }
                if (chisloR11 != null && chisloR111 == null && chisloR22 != null && chisloR222 == null && !chisloR2.equals(RIMSKIE[2]) && !chisloR1.equals(RIMSKIE[2])) {
                    String formullr = this.chisloR1 + this.chisloR11 + this.znakR + this.chisloR2 + this.chisloR22;
                    zaebalsiaUger(formullr);
                }
                if (chisloR11 != null && chisloR111 == null && chisloR22 != null && !chisloR2.equals(RIMSKIE[2]) && !chisloR1.equals(RIMSKIE[2]) && chisloR222 != null && !chisloR22.equals(RIMSKIE[1]) && !chisloR22.equals(RIMSKIE[2])) {
                    String formullr = this.chisloR1 + this.chisloR11 + this.znakR + this.chisloR2 + this.chisloR22 + this.chisloR222;
                    zaebalsiaUger(formullr);
                }


            }

        }

        public void zaebalsiaUger(String formullr) {
            //    System.out.println(String.valueOf(formullr));
            //    System.out.println(formullr);
            fffr = formullr;
            if (chisloR11 != null && chisloR111 == null && chisloR22 != null && chisloR222 != null) {
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
            }
            if (chisloR11 != null && chisloR111 == null && chisloR22 != null && chisloR222 == null) {
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
            }
            if (chisloR11 != null && chisloR111 != null && chisloR22 != null && chisloR222 != null) {
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
            if (chisloR11 != null && chisloR111 != null && chisloR22 != null && chisloR222 == null) {
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
            if (chisloR11 == null && chisloR111 == null && chisloR22 != null && chisloR222 == null) {
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
            if (chisloR11 == null && chisloR111 == null && chisloR22 != null && chisloR222 != null) {
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
            if (chisloR11 != null && chisloR111 != null && chisloR22 == null && chisloR222 == null) {
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
            if (chisloR11 != null && chisloR111 == null && chisloR22 == null && chisloR222 == null) {
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
            if (chisloR11 == null && chisloR111 == null && chisloR22 == null && chisloR222 == null) {
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
        }

        private void sumR(int xR, int yR) {
            konechnayaR = xR + yR;
            // System.out.println(konechnayaR);
        }

        public void minusR(int xR, int yR) {

            konechnayaR = xR - yR;

            if (konechnayaR < 0) {
                //System.out.println("Эксепшшшн");
            }
            //   System.out.println(konechnayaR);
        }

        public void umnogitiR(int xR, int yR) {

            konechnayaR = xR * yR;
            //   System.out.println(konechnayaR);
        }

        public void razdelitiR(int xR, int yR) {

            konechnayaR = xR / yR;
            // System.out.println(konechnayaR);

        }

        public String ff13() {
            if (fffr != null) {
               // System.out.println(fffr);
                return fffr;
            }
            return "Пиздец";
        }

        public void izChifrvRim() {
            izCifirvRim = null;
            for (int roll = 0; RIMSKIEPEREBORI.length > roll; roll++) {
                if (roll + 1 == konechnayaR) {
                    izCifirvRim = RIMSKIEPEREBORI[roll];
                }
            }
        }
    }


    class HueviiException extends Throwable {
        public HueviiException() {
            System.out.println(" строка не является математической операцией");
        }
    }

    class EbuxhiiException extends Throwable {
        public EbuxhiiException() {
            System.out.println("в римской системе нет отрицательных чисел");
        }
    }

    class EbaniiException extends Throwable {
        public EbaniiException() {
            System.out.println(". используются одновременно разные системы счисления");
        }
    }

    class SpatiHochuException extends Throwable {
        public SpatiHochuException() {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
    }

