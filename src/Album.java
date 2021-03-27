import java.util.List;

public class Album {

    private String name;
    private List<Song> songs;

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Prints out song info for every song in an album
     */
    public void printTrackListings() {
        System.out.println(name.toUpperCase() + " track listing...");
        for (int i = 0; i < songs.size(); i += 1) {
            System.out.println((i + 1) + ". " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist());
        }
    }

}
