/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generadores;





import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;

public class GeneradorPdf{
    public static void main (String [ ] args){
        Document documento =new Document();
        try{
            PdfWriter.getInstance(documento,new FileOutputStream("PRUEBA.pdf"));
            documento.open();      
            Paragraph parrafo =new Paragraph("ojala funcione");
            documento.add(parrafo);
            documento.close();
            System.out.print("se creo con exito");
        }
        catch(DocumentException | FileNotFoundException e){
            
        }
    
    }
   
}


