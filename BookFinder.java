public class BookFinder {

    static String bookFind(int shelf) {
        switch (shelf) {
            case 1:
                return "The Three Body Problem";
            case 2:
                return "The Dark Forest";
            case 3:
                return "Death's End";
            case 4:
                return "The Wandering Earth";
            default:
                return "Shelf not found";

        }
    }

    public static void main(String[] args) {
        String shelf1 = bookFind(1);
        System.out.println("Shelf one has the book " + shelf1);
        String shelf3 = bookFind(3);
        System.out.println("Shelf three has the book " + shelf3);

    }

}
