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

    public static void setTo(int arg, int line, int col) {
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

        String ADV = "";
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

        mas = customevents.getEvent(2);

        ADV = mas[0];
        DESCR = mas[1];
        $SELECTION_1 = mas[2];
        $SELECTION_2 = mas[3];
        int width = 85, line = 6, col = 5;
        int k = widthString(line,col,width,mas[1]);
        drawLine(line-1,col-1,width+2);
        drawCol(line-1,col-2,k+1);
        drawLine(line+k,col-1,width+2);
        drawCol(line-1,col+width+1,k+1);

        drawCol(line-1,col+width+3,line+6);
        drawCol(line-1,col+width+22,line+6);
        drawLine(line+11, col+width+3,(col+width+22)-(col+width+3));
        drawLine(line-1, col+width+3,(col+width+22)-(col+width+3));
        setTo(50,8,col+width+7);
        setTo(50,11,col+width+7);
        setTo(50,14,col+width+7);

        if (ADV.equals("DEFAULT")) {
            drawCol(line-3, col, 2);
            drawCol(line-3, col+main.ADVISER.length()+3, 2);
            drawLine(line-3, col, main.ADVISER.length()+3);
            main.show(ansi().cursor(line-2,col+2).a(main.ADVISER).reset().cursor(0, 0));
        }
        else {
            drawCol(line-3, col, 2);
            drawCol(line-3, col+mas[0].length()+3, 2);
            drawLine(line-3, col, mas[0].length()+3);
            main.show(ansi().cursor(line-2,col+2).a(mas[0]).reset().cursor(0, 0));
        }
//        System.out.print(ansi().cursor(10,4).a(k));
        main.getch();
    }

    public static void drawLine(int line, int col, int width) {
        for (int i = col;i<=col+width;i++) {
            main.show(ansi().cursor(line,i).bgBright(BLACK).a(' ').reset().cursor(0, 0));
        }
    }
    public static void drawCol(int line, int col, int width) {
        for (int i = line;i<=line+width;i++) {
            main.show(ansi().cursor(i,col).bgBright(BLACK).a(' ').reset().cursor(0, 0));
        }
    }

    public static int widthString(int line, int cols, int width, String text) {

        String words[] = text.split(" ");
//        for (int i = 0;i<=words.length-1;i++) {
//            main.show(ansi().cursor(8+i, cols).a("["+i+"] \""+words[i]+"\"").cursor(0, 0));
//        }
        int k = 0, i = 0;
        String linep = "";
        while (i<=words.length-1) {
                    if (words[i].contains("$KING")) {
                        words[i] = words[i].replace("$KING", main.KING);
                    }
                    if (linep.length()+words[i].length()<=width) {
                        if (words[i].contains("/n")) {
//                            main.show(ansi().cursor(line+k, cols).a(linep+" t"+i).cursor(0, 0));
                            main.show(ansi().cursor(line+k, cols).a(linep).cursor(0, 0));
                            words[i] = words[i].replace("/n","");
                            k++;
                            linep = "";
                            i--;
                        } else {
                            linep += words[i] + " ";
                        }
                    } else {
//                        main.show(ansi().cursor(line+k, cols).a(linep+" k"+i).cursor(0, 0));
                        main.show(ansi().cursor(line+k, cols).a(linep).cursor(0, 0));
                        k++;
                        linep = "";
                        i--;
                    }

            if (i==words.length-1) {
//                main.show(ansi().cursor(line+k, cols).a(linep+" y"+i).cursor(0, 0));
                main.show(ansi().cursor(line+k, cols).a(linep).cursor(0, 0));
                k++;
            }
            i++;
        }

        return k;
    }



}
