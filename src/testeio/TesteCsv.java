/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testeio;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Klaus Boeing
 */
public class TesteCsv {

    public static void main(String[] args) throws IOException {
        try(CSVWriter csvw = new CSVWriter(new FileWriter("c:\\meusprogramas\\teste.csv"))){
            csvw.writeNext("Klaus","234234234","Criciuma");
            csvw.writeNext("Maria","34534","Icara");
            csvw.writeNext("Joao","5676756","Turvo");
            csvw.writeNext("Joao","5676756","Turvo","SC");
        }
        
        try(CSVReader csvr = new CSVReader(new FileReader("c:\\meusprogramas\\teste.csv"))){
            String[] line = null;
            
            line = csvr.readNext();
            while(line != null){
                System.out.print(line[0]);
                System.out.print(" ");
                System.out.print(line[1]);
                System.out.print(" ");
                System.out.println(line[2]);
                line = csvr.readNext();
            }
        }
    }
    
}
