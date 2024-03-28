package classesobjectsencapsulation;



class Movie {
	private String movieName;

	private String movieDirector;

	private String cast;

	private String typeOfMovie;

	private int releaseYear;

	public Movie(String movieName, String movieDirector, String cast, String typeOfMovie, int releaseYear) {
		super();
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.cast = cast;
		this.typeOfMovie = typeOfMovie;
		this.releaseYear = releaseYear;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getTypeOfMovie() {
		return typeOfMovie;
	}

	public void setTypeOfMovie(String typeOfMovie) {
		this.typeOfMovie = typeOfMovie;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public void display() {
		System.out.println("MovieName:" + movieName + "\n" + "MovieDirector:" + movieDirector + "\ncast:" + cast
				+ "\nTypeOfMovie:" + typeOfMovie + "\nReleaseYear" + releaseYear);
	}

}

public class Question4 {

	public static void main(String[] args) {
		Movie movie = new Movie("Fast and Furious", "Justin Lin", "Vin diesel,MichelleRodriquez,Jordana,John cena",
				"Action/Crime", 2021);

		movie.display();
	}
}