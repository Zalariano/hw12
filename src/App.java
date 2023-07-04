public class App {
    public static void main(String[] args) {
        Author robert = new Author("Robert", "Kiyosaki");
        Author theodore = new Author("Theodore", "Dreiser");
        Book RichDadPoorDad = new Book("Rich Dad Poor Dad", robert, 1997);
        Book Financier = new Book("The Financier", theodore, 1912);

        System.out.println("Название: " + RichDadPoorDad.getNazvanie());
        System.out.println("Автор: " + RichDadPoorDad.getAuthor());
        System.out.println("Год выпуска: " + RichDadPoorDad.godVypuska());
        System.out.println();

        System.out.println("Название: " + Financier.getNazvanie());
        System.out.println("Автор: " + Financier.getAuthor());
        System.out.println("Год выпуска: " + Financier.godVypuska());
        Financier.setGodVypuska(1915);
        System.out.println("Год выпуска: " + Financier.godVypuska());
        System.out.println();

        System.out.println(robert.getName() + " " + robert.getSurname());
        System.out.println(theodore.getName() + " " + theodore.getSurname());


    }
}

