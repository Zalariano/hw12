public class App {
    public static void main(String[] args) {
        Author robert = new Author("Robert", "Kiyosaki");
        Author theodore = new Author("Theodore", "Dreiser");
        Book richDadPoorDad = new Book("Rich Dad Poor Dad", robert, 1997);
        Book financier = new Book("The Financier", theodore, 1912);

        System.out.println("Название: " + richDadPoorDad.getNazvanie());
        System.out.println("Автор: " + richDadPoorDad.getAuthor());
        System.out.println("Год выпуска: " + richDadPoorDad.godVypuska());
        System.out.println();

        System.out.println("Название: " + financier.getNazvanie());
        System.out.println("Автор: " + financier.getAuthor());
        System.out.println("Год выпуска: " + financier.godVypuska());
        financier.setGodVypuska(1915);
        System.out.println("Год выпуска: " + financier.godVypuska());
        System.out.println();

        System.out.println(robert.getName() + "  " + robert.getSurname());
        System.out.println(theodore.getName() + " " + theodore.getSurname());
        System.out.println(financier);


    }
}

