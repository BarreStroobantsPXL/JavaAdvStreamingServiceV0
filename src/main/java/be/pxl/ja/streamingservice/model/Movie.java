package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {
    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;
    private String title;
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Rating maturityRating;
    private Genre genre;


    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Rating getMaturityRating() {
        return maturityRating;
    }
    public void setMaturityRating(Rating maturityRating) {
        this.maturityRating = maturityRating;
    }
    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
        this.title = title;
        this.maturityRating = maturityRating;


        }
    public String getTitle () {
        return title;
        }
    public void setTitle(String title) {
        this.title = title;
        }
    public String getDirector () {
        return director;
        }
    public void setDirector(String director) {
        this.director = director;
        }
    public LocalDate getReleaseDate () {
        return releaseDate;
        }
    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        }
    public int getDuration () {
        return duration;
        }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean IsLongPlayingTime(){
        return duration >= LONG_PLAYING_TIME;
    }




    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    @Override
    public String toString () {
        return getTitle() + " " + getReleaseDate().getYear();
    }
}


