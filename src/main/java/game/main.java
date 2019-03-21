package game;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

import static org.fusesource.jansi.Ansi.*;

public class main {

    public static double SOCIETY = 0;
    public static double ARMY = 0;
    public static double RELIGION = 0;

    public static int STORY = 0;
    public static String KINGS[][] = new String[0][0];
    public static String KING = "";
    public static String ADVISER = "";


    public static void init() throws InterruptedException {

        graph.getInterface();

    }


    public static int rnd(int min, int max) {  // этот метод возращает случайное число в диапозоне
        max+=1;
        max -= min;
        return (int) (Math.random() * +max) + min;
    }

    public static boolean rndproc(double chance) { // этот метод возращает истину с шансом param%
        int random = rnd(0,100);
        if (random > chance) {
            return false;
        }
        else {
            return true;
        }
    }


    public static String inStr() {
        Scanner in = new Scanner(System.in, "cp866");
        return in.nextLine();

    }

    public static int inInt() {
        Scanner in = new Scanner(System.in, "cp866");
        return in.nextInt();

    }

    public static double inDouble() {
        Scanner in = new Scanner(System.in, "cp866");
        return in.nextDouble();

    }

    public static void showln(int arg) {
        System.out.println(arg);
    }
    public static void showln(String arg) {
        System.out.println(arg);
    }
    public static void showln(char arg) {
        System.out.println(arg);
    }
    public static void showln(double arg) {
        System.out.println(arg);
    }
    public static void showln(boolean arg) {
        System.out.println(arg);
    }
    public static void showln(Ansi arg) {
        System.out.println(arg);
    }
    public static void show(int arg) {
        System.out.print(arg);
    }
    public static void show(String arg) {
        System.out.print(arg);
    }
    public static void show(char arg) {
        System.out.print(arg);
    }
    public static void show(double arg) {
        System.out.print(arg);
    }
    public static void show(boolean arg) {
        System.out.print(arg);
    }
    public static void show(Ansi arg) {
        System.out.print(arg);
    }

    public static void pause(int arg) throws InterruptedException {
        Thread.sleep(arg);
    }

    public static int toInt(String arg) {
        return Integer.parseInt(arg);
    }
    public static int toInt(char arg) {
        return Character.getNumericValue(arg);
    }
    public static int toInt(double arg) {
        return (int) arg;
    }

    public static void var_dump(int[] arg) {
        System.out.println("[DEBUG] "+java.util.Arrays.toString(arg));
    }
    public static void var_dump(String[] arg) {
        System.out.println("[DEBUG] \""+java.util.Arrays.deepToString(arg)+"\"");
    }
    public static void var_dump(int arg) {
        System.out.println("[DEBUG] "+arg);
    }
    public static void var_dump(String arg) {
        System.out.println("[DEBUG] \""+arg+"\"");
    }
    public static void var_dump(char arg) {
        System.out.println("[DEBUG] \'"+arg+"\'");
    }
    public static void var_dump(double[] arg) {
        System.out.println("[DEBUG] "+java.util.Arrays.toString(arg));
    }
    public static void var_dump(double arg) {
        System.out.println("[DEBUG] "+arg);
    }

    public static void getch() {

        System.console().readLine();
    }

    public static void clrscr() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void cls() {
        System.out.print(ansi().eraseScreen().cursor(0,0));
    }

    public static int invertInt(int arg) {
        if (arg>0 || arg<0) {
            arg = -arg;
            return arg;
        } else {
            arg = arg;
            return arg;
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}
