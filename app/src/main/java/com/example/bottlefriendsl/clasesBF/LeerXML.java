package com.example.bottlefriendsl.clasesBF;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public abstract class LeerXML {

    public static ArrayList<Producto> catalogoXML(InputStream archivo) throws Exception{

        ArrayList<Producto>articulos = new ArrayList<>();

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dConstructor = dbFactory.newDocumentBuilder();
        Document doc = dConstructor.parse(archivo);

        doc.getDocumentElement().normalize();

        NodeList nodos = doc.getElementsByTagName("producto");

        for(int i = 0;i < nodos.getLength(); i++) {

            Node n = nodos.item(i);

            if(n.getNodeType() == Node.ELEMENT_NODE){

                Element elemento = (Element) n;

                articulos.add(new Producto(elemento.getElementsByTagName("nombre").item(0).getTextContent(),
                        elemento.getElementsByTagName("capacidad").item(0).getTextContent(),
                        elemento.getElementsByTagName("tipo").item(0).getTextContent(),
                        elemento.getElementsByTagName("precio").item(0).getTextContent(),
                        elemento.getElementsByTagName("descripcion").item(0).getTextContent(),
                        elemento.getElementsByTagName("imagen").item(0).getTextContent()));
            }
        }
        return articulos;
    }
    public static ArrayList<Partner> partnersXML(InputStream archivo) throws Exception{

        ArrayList<Partner>socios = new ArrayList<>();

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dConstructor = dbFactory.newDocumentBuilder();
        Document doc = dConstructor.parse(archivo);

        doc.getDocumentElement().normalize();

        NodeList nodos = doc.getElementsByTagName("partners");

        for(int i = 0;i < nodos.getLength(); i++) {

            Node n = nodos.item(i);

            if(n.getNodeType() == Node.ELEMENT_NODE){

                Element elemento = (Element) n;

                socios.add(new Partner(elemento.getElementsByTagName("nombre").item(0).getTextContent(),
                        elemento.getElementsByTagName("apellido").item(0).getTextContent(),
                        elemento.getElementsByTagName("empresa").item(0).getTextContent(),
                        elemento.getElementsByTagName("email").item(0).getTextContent(),
                        elemento.getElementsByTagName("tfno").item(0).getTextContent(),
                        elemento.getElementsByTagName("imagen").item(0).getTextContent()));
            }
        }
        return socios;
    }
}

