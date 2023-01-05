import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Book knyga = new Book();
        System.out.println(knyga);

        knyga.settitle("Kapitonas plaukia");
        knyga.setPages(77);
        knyga.setReleaseYear(2005);

        System.out.println(knyga.gettitle() + " " + knyga.getPages() + " " + knyga.getReleaseYear());

        Book knyga2 = new Book ("Antra knyga", 250, 2007);
        Book knyga3 = new Book ("Trečia knyga", 112, 2021);
        Book knyga4 = new Book ("Ketvirta knyga", 23, 1985);

        ArrayList<Book> biblioteka = new ArrayList<>();
        biblioteka.add(knyga);
        biblioteka.add(knyga2);
        biblioteka.add(knyga3);
        biblioteka.add(knyga4);
        for (int i = 0; i < biblioteka.size() ; i++) {
            System.out.println(biblioteka.get(i));

        }

       // System.out.println(knyga2);

//        Pagalbinė.intSq(5);
//        knyga2.gettitle();

    }
}