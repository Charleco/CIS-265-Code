package Charles265_10;

public class Song implements Comparable<Song>{
    private String artist;
    private String title;
    private String link;
    private String text;
    public Song()
    {

    }
    public Song(String artist,String title,String link,String text)
    {
        this.artist = artist;
        this.title = title;
        this.link = link;
        this.text = text;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    public int compareTo(Song song)
    {
        return this.title.compareTo(song.getTitle());
    }
    public String toString()
    {
        return artist+"\t"+title+"\t"+link+"\t"+text;
    }
}
