import java.util.ArrayList;
import java.util.Scanner;

public class Lab11Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Movie> selection = new ArrayList<>();
		Movie movie1 = new Movie("Citizen Kane", "drama");
		selection.add(movie1);
		Movie movie2 = new Movie("Casablanca", "drama");
		selection.add(movie2);
		Movie movie3 = new Movie("The Godfather", "drama");
		selection.add(movie3);
		Movie movie4 = new Movie("The Wizard Of Oz", "musical");
		selection.add(movie4);
		Movie movie5 = new Movie("Singin' In The Rain", "musical");
		selection.add(movie5);
		Movie movie6 = new Movie("Star Wars", "scifi");
		selection.add(movie6);
		Movie movie7 = new Movie("2001: A Space Odyssey", "scifi");
		selection.add(movie7);
		Movie movie8 = new Movie("E.T. The extra-terrestrial", "scifi");
		selection.add(movie8);
		Movie movie9 = new Movie("Psycho" , "horror");
		selection.add(movie9);
		Movie movie10 = new Movie("King Kong", "horror");
		selection.add(movie10);
		System.out.println("Welcome to Trig's Tiny Theater!" + "\n");
		System.out.println("We currently carry 10 titles!" + "\n");
		System.out.println("Please select a genre:");
		String input = scnr.nextLine().toLowerCase();
		for (int i = 0; i < selection.size(); i++) {
			if (input.equals("drama")) {
			 System.out.println(selection.indexOf("drama"));
			 
			}
			
			
		
		
		}
	}
}	

