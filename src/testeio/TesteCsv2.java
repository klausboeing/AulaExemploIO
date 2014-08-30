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
public class TesteCsv2 {

    public static void main(String[] args) throws IOException {
        try(CSVWriter csvWriter = new CSVWriter(new FileWriter("c:\\meusprogramas\\testecsv.txt"))){
            csvWriter.writeNext("Klaus","Criciuma","SC");
            csvWriter.writeNext("Maria","Içara","SC");
            csvWriter.writeNext("Julia","Curitiba","PR");
        }
        
         try(CSVReader csvReader = new CSVReader(new FileReader("c:\\meusprogramas\\testecsv.txt"))){
            String[] line = null;
            while((line = csvReader.readNext()) != null){
                System.out.print(line[0]);
                System.out.print(" ");
                System.out.print(line[1]);
                System.out.print(" ");
                System.out.println(line[2]);
            }
        }
        
        
    }
    
}
