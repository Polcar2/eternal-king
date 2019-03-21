package game;

import game.events.customevents;
import org.fusesource.jansi.Ansi;
import game.events.customevents.*;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class graph {

    public static void animateTo(int ot, int to, int line, int col) throws InterruptedException {
        char f = ' ';
        int k = 1;
        if (ot==100) { ot=99; }
        for (int i = 0;i<=100;i++) {
            if (i==100/10*k) {
                main.show(ansi().cursor(line, col+k).bgBright(BLACK).a(f).reset().cursor(0, 0));
                k++;
            }
            if (k==ot/10+1) {
                main.show(ansi().cursor(line, col+k).bgBright(WHITE).a(f).reset().cursor(0, 0));
                k++;
            }

        }
        k = ot / 10+1;
        if (ot<to) {
            for (int i = ot; i <= to; i++) {
                if (i == 100 / 10 * k) {
                    main.pause(100);
                    main.show(ansi().cursor(line, col + k).bgBright(BLACK).a(f).reset().cursor(0, 0));
                    if (k < 10) {
                        k++;
                    }
                    main.show(ansi().cursor(line, col + k).bgBright(WHITE).a(f).reset().cursor(0, 0));
                }
            }
        } else if (ot>to) {
            int ki = to / 10+1;
            for (int i=to; i<=ot; i++) {
               if (i == 100 / 10 * ki) {
                   main.pause(100);
                   main.show(ansi().cursor(line, col + k).bgBright(BLACK).a(f).reset().cursor(0, 0));
                   if (k>0) {
                       k--;
                   }
                   main.show(ansi().cursor(line, col + k).bgBright(WHITE).a(f).reset().cursor(0, 0));
                   ki++;
               }
           }
        }
    }

    public static void setTo(int arg, int line, int col) throws InterruptedException {
        char f = ' ';
        int k = 1;
        if (arg==100) { arg=99; }
        for (int i = 0;i<=100;i++) {
            if (i==100/10*k) {
                main.show(ansi().cursor(line, col+k).bgBright(BLACK).a(f).reset().cursor(0, 0));
                k++;
            }
            if (k==arg/10+1) {
                main.show(ansi().cursor(line, col+k).bgBright(WHITE).a(f).reset().cursor(0, 0));
                k++;
            }
        }
    }

    public static void getInterface() {

        String mas[] = new String[11];

        String DESCR = "";
        String $SELECTION_1 = "";
        String $SELECTION_2 = "";
        String $PARAM_1 = "";
        String $PARAM_2 = "";
        int $EFFECT_1 = 0;
        int $EFFECT_2 = 0;
        String UNIQUE_KEY = "";
        int SELECTOR_ACTIVE = 0;
        int ORDER = 1;

        mas = customevents.getEvent(0);

        DESCR = mas[1];
        $SELECTION_1 = mas[2];
        $SELECTION_2 = mas[3];

        for (int i = 9;i<=20;i++) { main.show(ansi().cursor(3,i).bgBright(BLACK).a(' ').reset().cursor(0, 0)); }
        for (int i = 4;i<=6;i++) { main.show(ansi().cursor(i,3).bgBright(BLACK).a(' ').reset().cursor(0, 0)); }

//        System.out.print(ansi().cursor(4,10).a(mas[1]));
        widthString(4,10,25,mas[1]);



    }

    public static void widthString(int x, int y, int width, String text) {
        String s = "";
        String line = "";
        int k = y, i = 0, j = 0;
        while (true) {
                s+=String.valueOf(text.charAt(i));
                if (text.charAt(i)==' ') {
                    if (line.length()+s.length()<width) {
                        line += s; s="";
                        j+=line.length(); main.show(ansi().cursor(15,j).a(line).cursor(0, 0));
                    } else {
                        main.show(ansi().cursor(x,k).a(line).cursor(0, 0));
                        line = ""; line+=s; s=""; k++;
                    }
                }
                i++;
                if (i==text.length()){
                    break;
                }
        }
    }



}
