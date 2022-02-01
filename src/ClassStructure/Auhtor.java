package ClassStructure;

public class Auhtor {
    public String titel;
    public int yuar;

    public Auhtor(String titel, int yuar){
        this.titel = titel;
        this.yuar = yuar;

    }
    public String toString(){
        System.out.println("Автор книги: " + titel + " Год издания: " + yuar);
        return null;
    }
}
