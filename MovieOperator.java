package MovieDemo;

public class MovieOperator {

    private Movie[] movies;
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }
    public void printMovies() {
        System.out.println("----------电影的全部信息----------");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
        }
    }

    public void searchMovieById() {
    }
}
