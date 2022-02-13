public class Garnek {
   final int srednica;
   final int wyokosc;
    String kolor;

    public Garnek(int srednica,int wyokosc){
        this.srednica = srednica;
        this.wyokosc = wyokosc;
    }

    public Garnek(int srednica, int wysokosc, String kolor){
        this.srednica=srednica;
        this.wyokosc=wysokosc;
        this.kolor=kolor;
    }

    public String gotuj(){
        return "Gotowanie w trakcie";
    }

    public String gotuj(boolean czyDodalismySol){
        if (czyDodalismySol){
            return "Gotowanie z sola";
        }
        else{
            return "Gotowanie bez soli";
        }
    }

    public void gotujBezInformacji(){
        wlaczGarnek();
        gotowaniePrzezPolGodziny();
        wylaczGarnek();
    }

    public int zwrucTemperatureWrzeniaWody(){
        return 100;
    }

    private void wlaczGarnek(){
        System.out.println("Włączono garnek");
    }

    private void gotowaniePrzezPolGodziny(){
        System.out.println("gotowanie przez 30 min");
    }

    private void wylaczGarnek(){
        System.out.println("Wyłączanie garnka");
    }
}
