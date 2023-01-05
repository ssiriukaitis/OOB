public class Book {
    public String title;
    public int pages;
    public int releaseYear;

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
        return "Book{" +
                "Pavadinimas yra '" + title + '\'' +
                ", puslapių skaičius yra " + pages +
                ", knygos išleidimo metai yra " + releaseYear +
                '}';
    }


}
