import com.atencia.soundsculptor.models.MyFavorite;
import com.atencia.soundsculptor.models.Podcast;
import com.atencia.soundsculptor.models.Song;

public class Main {
    public static void main(String[] args) {

        Song song = new Song();
        song.setTitle("One");
        song.setSinger("Metallica");

        Podcast podcast = new Podcast();
        podcast.setTitle("Cafe.Tech");
        podcast.setPresenter("Gabriela Aguiar");


        for (int i = 0; i < 1000000; i++) {
            podcast.likes();

        }

        for (int i = 0; i < 5000000; i++) {
            podcast.playback();
        }

        for (int i = 0; i < 3000000; i++) {
            song.likes();
        }

        for (int i = 0; i < 5000000; i++) {
            song.playback();

        }

        System.out.println("Total like for song " + song.getTitle() + " is " + song.getTotalLike() + ".");
        System.out.println("Total playback for song " + song.getTitle() + " is " + song.getTotalPlayback() + ".");

        System.out.println("Total like for podcast " + podcast.getTitle() + " is " + podcast.getTotalLike() + ".");
        System.out.println("Total playback for podcast " + podcast.getTitle() + " is " + podcast.getTotalPlayback() + ".");

        MyFavorite myFavorite = new MyFavorite();
        myFavorite.addFavorite(song);
        myFavorite.addFavorite(podcast);

    }
}