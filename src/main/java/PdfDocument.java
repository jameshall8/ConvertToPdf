import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfDocument {
    private Document document;
    PdfWriter writer;

    PdfDocument(String filename) {
        document = new Document();
    }

    Boolean setUpDocument(){
        try {
            writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
            document.open();
            Paragraph para = new Paragraph("Hello");
            para.add("hello again");
            document.add(para);
            document.close();
            writer.close();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
