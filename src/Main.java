import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int typ, bok;
        double wysokosc;
        try
        {
            //File plik = new File("dane.txt");
            Scanner dane = new Scanner(new File("C:\\Users\\user\\Documents\\zadanie 2\\src\\dane.txt"));
            while(dane.hasNextLine())
            {
                typ = Integer.parseInt(dane.next());
                if(typ==1)
                {
                    bok = Integer.parseInt(dane.next());
                    Kwadrat kw = new Kwadrat(bok);
                    System.out.println(kw.pole());
                } else if (typ==2) {
                    bok = Integer.parseInt(dane.next());
                    wysokosc = Integer.parseInt(dane.next());
                    Prostopadloscian p = new Prostopadloscian(bok, wysokosc);
                }
                else
                {
                    System.out.println("Błąd");
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Plik nie został znaleziony: " + e.getMessage());
        }



        Prostopadloscian a = new Prostopadloscian();
        System.out.println(a.pole());
    }
}