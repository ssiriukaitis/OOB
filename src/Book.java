public class Book {
    private String title;
    private int pages;
    private int releaseYear;

    public Book(){

    }
    public Book (String title, int pages, int releaseYear){
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }
    public Book (int releaseYear, int pages, String title){
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }
    // overloadinimas čia buvo - kai turime kelis metodus, kurie vadinasi taip pat, bet skiriasi jų kintamųjų kiekis
    // ir išdėstymo tvarka.!!!
    // konstruktorius yra funkcija, metodas.


    @Override
    public String toString() {
        return "Knyga{" +
                "Pavadinimas yra '" + title + '\'' +
                ", puslapių skaičius yra " + pages +
                ", knygos išleidimo metai yra " + releaseYear +
                '}';
    }

    public String gettitle(){
        return this.title;
    }

    public void settitle(String title){
        this.title = title;

    }

    public int getPages(){
        return this.pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }

}
