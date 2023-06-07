package service.serviceImpl;

import models.Cast;
import models.Movie;
import service.Findable;

import java.util.List;
import java.util.Scanner;

public class FindableServiceImpl implements Findable {


    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
        System.out.println("---------===---------");
        System.out.println("Enter movie name : ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();


        for (Movie m : movies) {
            String movieName = m.getName();
            if (movieName.toLowerCase().contains(word.toLowerCase())) {
                System.out.println(m);
            }
        }
    }


    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("---------===---------");
        System.out.println("Enter actor name : ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (Movie m : movies) {
            for (Cast actor : m.getCast()) {
                String actorName = actor.getActorFullName();
                if (actorName.toLowerCase().contains(word.toLowerCase())) {
                    System.out.println(m);
                }
            }
        }
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("---------===---------");
        System.out.println("Enter movie year : ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        for (Movie m : movies) {
            if (m.getYear() == year){
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("---------===---------");
        System.out.println("Enter director name : ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (Movie m : movies) {
            String directorName = m.getDirector().getLastName();
            if (directorName.toLowerCase().contains(word.toLowerCase())){
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByGenre(List<Movie> movies) {
        System.out.println("---------===---------");
        System.out.println("Enter movie genre : ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();


        for (Movie m : movies) {
            String movieGenre = m.getGenre();
            if (movieGenre.toLowerCase().contains(word.toLowerCase())){
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("---------===---------");
        System.out.println("Enter actor role : ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (Movie m : movies) {
            for (Cast actor : m.getCast()) {
                String actorRole = actor.getRole();
                if (actorRole.toLowerCase().contains(word.toLowerCase())) {
                    System.out.println(m);
                }
            }
        }
    }
}
