public class Main {
    public static void main(String[] args)
    {
        Uzytkownik janusz = new Uzytkownik(20, "Janusz");
        if (janusz.czyMozeLegalnieKupicAlko())
        {
            System.out.println("Moze kupic alkohol");
        }
        else
        {
            System.out.println("mie moze kupic alkoholu");
        }
    }
}
