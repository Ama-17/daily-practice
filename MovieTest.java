package MovieDemo;

public class MovieTest {
    public static void main(String[] args) {
        Movie[] movies = new Movie[6];

        movies[0] = new Movie(1,"大话西游",20,"吴孟达");
        movies[1] = new Movie(2,"你好，世界",20,"北村匠海、松坂桃李");
        movies[2] = new Movie(3,"花束般的恋爱",20,"有村架纯、菅田将晖");
        movies[3] = new Movie(4,"流浪地球",20,"吴京");
        movies[4] = new Movie(5,"让子弹飞",20,"姜文");
        movies[5] = new Movie(6,"洛城机密",20,"凯文·史派西、罗素·克劳");

        MovieOperator mo = new MovieOperator(movies);
        mo.printMovies();
        mo.searchMovieById();

    }
}
