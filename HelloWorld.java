public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        Movie one = new Movie();
        //one.title = "Gone with the Stock";
        one.setTitle("Gone with the Stock");

        //one.genre = "Tragic";
        one.setGenre("Tragic");

        //one.rating = -2;
        one.setRating(-2);

        one.playIt();
        System.out.println(one.getTitle());
    }
}
class Movie {

    private String title;
    private String genre;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    void playIt() {
        System.out.println("Playing the " +title);
    }
}



