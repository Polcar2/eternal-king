package game;

import org.fusesource.jansi.AnsiConsole;
import java.io.*;
import java.io.IOException;
import static org.fusesource.jansi.Ansi.*;

public class init {

    public static void main(String[] args) throws InterruptedException, IOException {
        AnsiConsole.systemInstall();


        main.clrscr();
        main.init();


        AnsiConsole.systemUninstall();
    }
}
