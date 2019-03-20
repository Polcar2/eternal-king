package game;

import org.fusesource.jansi.AnsiConsole;
import java.io.*;
import java.io.IOException;
import static org.fusesource.jansi.Ansi.*;

public class test {

    public static void main(String[] args) throws InterruptedException, IOException {
        AnsiConsole.systemInstall();
//        System.out.print(ansi().eraseScreen().bg(RED).a("Hello World дааа ").reset());
//        System.out.print(ansi().cursor(10,10)+"Мое имя Роман");

        System.out.print(ansi().eraseScreen());
        System.out.print(ansi().cursor(10,10).a("Надпись1"));
        System.out.print(ansi().cursor(11,10).a("Надпись2"));
        System.out.print(ansi().cursor(12,11).a("Надпись2 это").bold().a(" явление ").boldOff().a("сильное"));
        System.out.print(ansi().cursor(13,19).bold().a("█").boldOff());
        System.out.print(ansi().cursor(14,19).bold().a("█").boldOff());
        System.out.print(ansi().cursor(13,11).a("█████▌██").cursor(0,0));
        System.out.print(ansi().cursor(14,11).a("█████▌██").cursor(0,0)); Thread.sleep(100);
        System.out.print(ansi().cursor(13,11).a("██████▌█").cursor(0,0)); Thread.sleep(100);
        System.out.print(ansi().cursor(13,11).a("███████▌").cursor(0,0)); Thread.sleep(100);
        System.out.print(ansi().cursor(14,11).a("██████▌█").cursor(0,0)); Thread.sleep(100);
        System.out.print(ansi().cursor(14,11).a("███████▌").cursor(0,0)); Thread.sleep(100);
        AnsiConsole.systemUninstall();
    }

}
