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
public class TesteXml {

    public static void main(String[] args) throws JAXBException, IOException {
        Pessoa pessoa = new Pessoa("Klaus", 30, "24342384932");

        JAXBContext context = JAXBContext.newInstance(Pessoa.class);
        Marshaller m = context.createMarshaller();

        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        try (FileWriter pessoaXml = new FileWriter("c:\\meusprogramas\\pessoa.xml")) {
            m.marshal(pessoa, pessoaXml);
        }

        Unmarshaller u = context.createUnmarshaller();
        try (FileReader pessoaXmlReader = new FileReader("c:\\meusprogramas\\pessoa.xml")) {
            Pessoa pessoaUnm = (Pessoa) u.unmarshal(pessoaXmlReader);
            System.out.println(pessoaUnm);
        }
    }
}
