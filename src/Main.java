import models.Cast;
import models.Director;
import models.Movie;
import service.serviceImpl.FindableServiceImpl;
import service.serviceImpl.SortableServiceImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("Adi", "Askaraliev");
        Director director2 = new Director("Ruslan", "Akun");
        Director director3 = new Director("Danny", "Cannon");

        Cast cast6 = new Cast("Uson Usonov", "Ali");
        Cast cast = new Cast("Asan Asanov", "Alex Morgan");
        Cast cast3 = new Cast("Beka Alipov", "Adilet");
        Cast cast1 = new Cast("Bektemir Mamaiusupov", "Batyr");
        Cast cast2 = new Cast("Azamat Ulanov", "Azamat");
        Cast cast4 = new Cast("Kuno Becker", "Santiago Munez");
        Cast cast5 = new Cast("Alessandro Nivola", "Gavin Harris");
        List<Cast> castList = new LinkedList<>(List.of(cast1, cast));
        List<Cast> castList1 = new LinkedList<>(List.of(cast2));
        List<Cast> castList2 = new LinkedList<>(List.of(cast3, cast6));
        List<Cast> castList3 = new LinkedList<>(List.of(cast4, cast5));

        Movie movie1 = new Movie("Salam, New York", 2013, "Drama", director2, castList);
        Movie movie2 = new Movie("Finding Mother", 2017, "Drama", director2, castList1);
        Movie movie3 = new Movie("Man from village", 2021, "Autobiography", director, castList2);
        Movie movie4 = new Movie("Goal", 2005, "Motivation", director3, castList3);

        List<Movie> movieList = new LinkedList<>(List.of(movie1, movie2, movie3, movie4));


        FindableServiceImpl findableService = new FindableServiceImpl();
        SortableServiceImpl sortableService = new SortableServiceImpl();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            int san = scanner.nextInt();
            switch (san) {
                case 1:
                    System.out.println(findableService.getAllMovies(movieList));
                    break;
                case 2:
                    findableService.findMovieByFullNameOrPartName(movieList);
                    break;
                case 3:
                    findableService.findMovieByActorName(movieList);
                    break;
                case 4:
                    findableService.findMovieByYear(movieList);
                    break;
                case 5:
                    findableService.findMovieByDirector(movieList);
                    break;
                case 6:
                    findableService.findMovieByGenre(movieList);
                    break;
                case 7:
                    findableService.findMovieByRole(movieList);
                    break;
                case 8:
                    sortableService.sortByMovieName(movieList);
                    break;
                case 9:
                    sortableService.sortByYear(movieList);
                    break;
                case 10:
                    sortableService.sortByDirector(movieList);
                    break;
                default:
                    break;
            }
        }
    }
}