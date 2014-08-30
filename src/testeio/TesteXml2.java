/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testeio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Klaus Boeing
 */
public class TesteXml2 {
    public static void main(String[] args) throws JAXBException, IOException {
        Pessoa pessoa = new Pessoa("Klaus",30,"34234234");
        
        JAXBContext context = JAXBContext.newInstance(Pessoa.class);
        
        FileWriter fileWriter = new FileWriter("c:\\meusprogramas\\pessoa.xml");
        
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        marshaller.marshal(pessoa, fileWriter);
        fileWriter.close();
        
        
        Unmarshaller unmarshaller = context.createUnmarshaller();
        
        FileReader reader = new FileReader("c:\\meusprogramas\\pessoa.xml");
        Pessoa pessoa2 = (Pessoa) unmarshaller.unmarshal(reader);
        reader.close();
        
        System.out.println(pessoa2.toString());
        
    }
}
