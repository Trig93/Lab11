
public class Movie {
	private String title;
	private String category;

public Movie (String title, String category) {
	this.title = title;
	this.category = category;
}

public static Movie setMovie(int Index) {
	Movie = Movie.getMovie(Index);
}
@Override
public String toString() {
	return title + category;
}
	
public static Movie getMovie(int index)	    {
	        switch (index)
	        {
	            case 1:
	                return new Movie("Citizen Kane", "drama");
	            case 2:
	                return new Movie("Casablanca", "drama");
	            case 3:
	                return new MovieIO("The Godfather", "drama");
	            case 4:
	                return new MovieIO("Gone With The Wind", "drama");
	            case 5:
	                return new MovieIO("Lawrence Of Arabia", "drama");
	            case 6:
	                return new MovieIO("The Wizard Of Oz", "musical");
	            case 7:
	                return new MovieIO("The Graduate", "drama");
	            case 8:
	                return new MovieIO("On The Waterfront", "drama");
	            case 9:
	                return new MovieIO("Schindler's List", "drama");
	            case 10:
	                return new MovieIO("Singin' In The Rain", "musical");
	            case 11:
	                return new MovieIO("It's A Wonderful Life", "drama");
	            case 12:
	                return new MovieIO("Sunset Boulevard", "drama");
	            case 13:
	                return new MovieIO("The Bridge On The River Kwai", "drama");
	            case 14:
	                return new MovieIO("Some Like It Hot", "drama");
	            case 15:
	                return new MovieIO("Star Wars", "scifi");
	            case 16:
	                return new MovieIO("All About Eve", "drama");
	            case 17:
	                return new MovieIO("The African Queen", "drama");
	            case 18:
	                return new MovieIO("Psycho" , "horror");
	            case 19:
	                return new MovieIO("Chinatown", "drama");
	            case 20:
	                return new MovieIO("One Flew Over The Cuckoo's Nest", "drama");
	            case 21:
	                return new MovieIO("The Grapes Of Wrath", "drama");
	            case 22:
	                return new MovieIO("2001: A Space Odyssey", "scifi");
	            case 23:
	                return new MovieIO("The Maltese Falcon", "drama");
	            case 24:
	                return new MovieIO("Raging Bull", "drama");
	            case 25:
	                return new MovieIO("E.T. The extra-terrestrial", "scifi");
	            case 26:
	                return new MovieIO("Dr. Strangelove", "drama");
	            case 27:
	                return new MovieIO("Bonnie And Clyde", "drama");
	            case 28:
	                return new MovieIO("Apocalypse Now", "drama");
	            case 29:
	                return new MovieIO("Mr. Smith Goes to Washington", "drama");
	            case 30:
	                return new MovieIO("The Treasure Of The Sierra Madre", "drama");
	            case 31:
	                return new MovieIO("Annie Hall", "comedy");
	            case 32:
	                return new MovieIO("The Godfather Part II", "drama");
	            case 33:
	                return new MovieIO("High Noon", "drama");
	            case 34:
	                return new MovieIO("To Kill A Mockingbird", "drama");
	            case 35:
	                return new MovieIO("It Happened One Night", "drama");
	            case 36:
	                return new MovieIO("Midnight Cowboy", "drama");
	            case 37:
	                return new MovieIO("The Best Years Of Our Lives", "drama");
	            case 38:
	                return new MovieIO("Double Indemnity", "drama");
	            case 39:
	                return new MovieIO("Doctor Zhivago", "drama");
	            case 40:
	                return new MovieIO("North By Northwest", "drama");
	            case 41:
	                return new MovieIO("West Side Story", "musical");
	            case 42:
	                return new MovieIO("Rear Window", "drama");
	            case 43:
	                return new MovieIO("King Kong", "horror");
	            case 44:
	                return new MovieIO("The Birth Of A Nation", "drama");
	            case 45:
	                return new MovieIO("A Streetcar Named Desire", "drama");
	            case 46:
	                return new MovieIO("A Clockwork Orange", "scifi");
	            case 47:
	                return new MovieIO("Taxi Driver", "drama");
	            case 48:
	                return new MovieIO("Jaws", "horror");
	            case 49:
	                return new MovieIO("Snow White And The Seven Dwarfs", "animated");
	            case 50:
	                return new MovieIO("Butch Cassidy And The Sundance Kid", "drama");
	            case 51:
	                return new MovieIO("The Philadelphia Story", "drama");
	            case 52:
	                return new MovieIO("From Here To Eternity", "drama");
	            case 53:
	                return new MovieIO("Amadeus", "drama");
	            case 54:
	                return new MovieIO("All Quiet On The Western Front", "drama");
	            case 55:
	                return new MovieIO("The Sound Of Music", "musical");
	            case 56:
	                return new MovieIO("M*A*S*H", "comedy");
	            case 57:
	                return new MovieIO("The Third Man", "drama");
	            case 58:
	                return new MovieIO("Fantasia", "animated");
	            case 59:
	                return new MovieIO("Rebel Without A Cause", "drama");
	            case 60:
	                return new MovieIO("Raiders Of The Lost Ark", "drama");
	            case 61:
	                return new MovieIO("Vertigo", "drama");
	            case 62:
	                return new MovieIO("Tootsie", "comedy");
	            case 63:
	                return new MovieIO("Stagecoach", "drama");
	            case 64:
	                return new MovieIO("Close Encounters Of The Third Kind", "scifi");
	            case 65:
	                return new MovieIO("The Silence Of The Lambs", "horror");
	            case 66:
	                return new MovieIO("Network", "drama");
	            case 67:
	                return new MovieIO("The Manchurian Candidate", "drama");
	            case 68:
	                return new MovieIO("An American In Paris", "drama");
	            case 69:
	                return new MovieIO("Shane", "drama");
	            case 70:
	                return new MovieIO("The French Connection", "drama");
	            case 71:
	                return new MovieIO("Forrest Gump", "drama");
	            case 72:
	                return new MovieIO("Ben-Hur", "drama");
	            case 73:
	                return new MovieIO("Wuthering Heights", "drama");
	            case 74:
	                return new MovieIO("The Gold Rush", "drama");
	            case 75:
	                return new MovieIO("Dances With Wolves", "drama");
	            case 76:
	                return new MovieIO("City Lights", "drama");
	            case 77:
	                return new MovieIO("American Graffiti", "drama");
	            case 78:
	                return new MovieIO("Rocky", "drama");
	            case 79:
	                return new MovieIO("The Deer Hunter", "drama");
	            case 80:
	                return new MovieIO("The Wild Bunch", "drama");
	            case 81:
	                return new MovieIO("Modern Times", "drama");
	            case 82:
	                return new MovieIO("Giant", "drama");
	            case 83:
	                return new MovieIO("Platoon", "drama");
	            case 84:
	                return new MovieIO("Fargo", "drama");
	            case 85:
	                return new MovieIO("Duck Soup", "comedy");
	            case 86:
	                return new MovieIO("Mutiny On The Bounty", "drama");
	            case 87:
	                return new MovieIO("Frankenstein", "horror");
	            case 88:
	                return new MovieIO("Easy Rider", "drama");
	            case 89:
	                return new MovieIO("Patton", "drama");
	            case 90:
	                return new MovieIO("The Jazz Singer", "drama");
	            case 91:
	                return new MovieIO("My Fair Lady", "musical");
	            case 92:
	                return new MovieIO("A Place In The Sun", "drama");
	            case 93:
	                return new MovieIO("The Apartment", "drama");
	            case 94:
	                return new MovieIO("Goodfellas", "drama");
	            case 95:
	                return new MovieIO("Pulp Fiction", "drama");
	            case 96:
	                return new MovieIO("The Searchers", "drama");
	            case 97:
	                return new MovieIO("Bringing Up Baby", "drama");
	            case 98:
	                return new MovieIO("Unforgiven", "drama");
	            case 99:
	                return new MovieIO("Guess Who's Coming To Dinner", "drama");
	            case 100:
	                return new MovieIO("Yankee Doodle Dandy", "musical");
	            default:
	                return new MovieIO("NO SUCH MOVIE", "");
	        }
	    }

}
