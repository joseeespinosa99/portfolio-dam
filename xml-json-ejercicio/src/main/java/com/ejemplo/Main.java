package com.ejemplo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = Main.class.getClassLoader().getResourceAsStream("yo.xml");

            if (is == null) {
                System.out.println("No se encontró yo.xml en resources");
                return;
            }

            String xml = new String(is.readAllBytes(), StandardCharsets.UTF_8);

            XmlMapper xmlMapper = new XmlMapper();
            JsonNode node = xmlMapper.readTree(xml.getBytes(StandardCharsets.UTF_8));

            ObjectMapper jsonMapper = new ObjectMapper();
            String json = jsonMapper.writerWithDefaultPrettyPrinter()
                    .writeValueAsString(node);

            System.out.println("XML original:\n" + xml);
            System.out.println("\nJSON resultante:\n" + json);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}