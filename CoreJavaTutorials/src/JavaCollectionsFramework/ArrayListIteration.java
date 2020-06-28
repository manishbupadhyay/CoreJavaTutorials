package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> tvSeries =  new ArrayList<String>();
		tvSeries.add("The Family Man");
		tvSeries.add("Mirzapur");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("Patallok");
		tvSeries.add("Selection Day");

		// 1. using Java 8 with for each loop and lamda expression
		System.out.println("------------- Print Using for each loop and lamda expression --------------");
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});

		System.out.println("------------- Print Using Iterator --------------");

		//2. Using Iterator
		Iterator<String> it = tvSeries.iterator();
		while(it.hasNext()) {
			String itShows = it.next();
			System.out.println(itShows);
		}

		//3. using iterator and java 8 forEachRemaining method
		System.out.println("------------- Print Using Iterator and java 8 forEachRemaining method --------------");
		it = tvSeries.iterator();
		it.forEachRemaining(shows -> {
			System.out.println(shows);
		});

		//4. using for each loop
		System.out.println("------------- Print Using for each loop --------------");
		for(String shows : tvSeries) {
			System.out.println(shows);
		}

		//5. using for loop with order/index
		System.out.println("------------- Print Using for loop with order/index --------------");
		for(int i=0; i<tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}

		//6. using a listIterator() to traverse in both the direction
		System.out.println("------------- Print Using a listIterator() to traverse in both the direction --------------");
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}
	}

}
