/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeio;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Klaus Boeing
 */
public class TesteIOEscrita {

    public static void main(String[] args) throws IOException {
        try (PrintWriter pw = new PrintWriter(new File("C:\\meusprogramas\\saida.txt"))) {
            pw.format("Data %s ", 1);
            pw.println();
            pw.format("Numero %s ", 2);
            pw.println();
            pw.format("Nome %s ", 3);
            pw.println();
        }

    }

}
