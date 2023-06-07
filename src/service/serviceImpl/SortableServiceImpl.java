package service.serviceImpl;

import models.Movie;
import service.Sortable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortableServiceImpl implements Sortable {
    @Override
    public void sortByMovieName(List<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getName().compareToIgnoreCase(m2.getName());
            }
        });
        System.out.println("Sorted by movie name : ");
        System.out.println();
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getYear() - m2.getYear();
            }
        });
        System.out.println("Sorted by movie years : ");
        System.out.println(movies);
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getDirector().getLastName().compareToIgnoreCase(m2.getDirector().getLastName());
            }
        });
        System.out.println("Sorted by director lastname : ");
        System.out.println(movies);
    }
}
