public class Uzytkownik {
    private int wiek;
    private String imie;

    public Uzytkownik(int wiek, String imie) {
        this.wiek = wiek;
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if (wiek > 0){
            this.wiek = wiek;
        }else{
            throw new RuntimeException("wiek musi być wiekszy od zera");
        }

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public boolean czyMozeLegalnieKupicAlko(){
        if (wiek >=18) {
            return true;
        }else{
            return false;
        }
    }
}
