/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Klaus Boeing
 */
public class TesteIO {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\meusprogramas\\entrada.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext("")) {
                System.out.println(scanner.next(""));
            }
        }
    }

}
