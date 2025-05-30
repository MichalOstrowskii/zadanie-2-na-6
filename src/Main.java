import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String linia;
        String[] wartosci;
        try {
            Scanner dane = new Scanner(new File("C:\\Users\\user\\Documents\\zadanie-2-na-6\\src\\dane.txt"));
            while (dane.hasNextLine()) {
                try {
                    linia = dane.nextLine();
                    wartosci = linia.split(" ");
                    if (Integer.parseInt(wartosci[0]) == 1) {
                        if(wartosci.length>2  || wartosci.length<2)
                        {

                            System.err.println(new Dane("Za dużo lub za mało wartości dla pobranego typu figury!"));
                        }
                        else
                        {
                            if(Integer.parseInt(wartosci[1])>0)
                            {
                                Kwadrat kw = new Kwadrat(Integer.parseInt(wartosci[1]));
                                System.out.println("Kwadrat: "+"bok="+wartosci[1]+", pole: "+kw.pole());
                            }
                            else
                            {
                                System.err.println(new Dane("Długość boku w kwadracie ujemna lub zerowa!"));
                            }

                        }
                    } else if (Integer.parseInt(wartosci[0]) == 2) {

                        if(wartosci.length>3  || wartosci.length<3)
                        {
                            System.err.println(new Dane("Za dużo lub za mało wartości dla pobranego typu figury!"));
                        }
                        else
                        {
                            if(Integer.parseInt(wartosci[1])>0 && Integer.parseInt(wartosci[2])>0)
                            {
                                Prostopadloscian p = new Prostopadloscian(Integer.parseInt(wartosci[1]), Integer.parseInt(wartosci[2]));
                                System.out.println("Prostopadłościan: "+"bok="+wartosci[1]+", wysokość="+wartosci[2]+", pole: "+p.pole());
                            }
                            else
                            {
                                System.err.println(new Dane("Długość boku lub wysokości w prostopadłościanie ujemna lub zerowa!"));
                            }

                        }
                    } else {
                        System.err.println(new Dane("Błędny typ"));
                    }
                } catch (NumberFormatException e) {
                    System.err.println(new Dane("Oczekiwano liczby"));
                }
                //System.out.println(typ);

            }
        }
        catch (FileNotFoundException e)
        {
            System.err.println(new Dane("Plik nie został znaleziony"));
        }
    }
}