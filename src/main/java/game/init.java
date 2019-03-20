package game;

import org.fusesource.jansi.AnsiConsole;
import java.io.*;
import java.io.IOException;
import static org.fusesource.jansi.Ansi.*;

public class init {

    public static void main(String[] args) {
        AnsiConsole.systemInstall();


        System.out.print(ansi().eraseScreen().cursor(0,0));


        AnsiConsole.systemUninstall();
    }
}
