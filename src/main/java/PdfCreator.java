import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfCreator
{
    public static void main(String[] args)
    {
        ArrayList<Command> listOfCommands = new ArrayList<>();
        listOfCommands.add(new Command(Arrays.asList(".large"), "My PDF Document"));
        listOfCommands.add(new Command(Arrays.asList(".normal", ".paragraph"), "This is my"));
        listOfCommands.add(new Command(Arrays.asList(".italics"), "very first"));
        listOfCommands.add(new Command(Arrays.asList(".regular"), "pdf document, and the output is formatted really well. While this paragraph is not filled,\n" +
                "the following one has automatic filling set:"));

    }

}