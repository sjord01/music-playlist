import java.util.ArrayList;

/**
 * Represents a music library that holds various types of media.
 *
 * This class manages a collection of MusicMedia objects, providing methods to add media,
 * display the library content, and play sections of media based on the title.
 *
 * @author Emma Lee, Sam Ordonez, Vandy Saxena, Chris Helmhold
 * @version 1.0
 */
public class MusicLibrary
{
    private ArrayList<MusicMedia> musicLibrary;

    /**
     * Constructs an empty MusicLibrary.
     */
    public MusicLibrary()
    {
        this.musicLibrary = new ArrayList<>();
    }

    /**
     * Adds a piece of media to the library.
     * @param media The media to add.
     */
    public void addMedia(final MusicMedia media)
    {
        if(media != null)
        {
            musicLibrary.add(media);
        }
    }

    /**
     * Displays the content of the library.
     */
    public void displayLibrary()
    {
        for (final MusicMedia media : musicLibrary) {
            System.out.println(media.toString());
        }
    }

    /**
     * Plays the section of a media with the specified title.
     * @param title The title of the media to play.
     */
    public void playTitle(final String title)
    {
        if(title == null || title.isEmpty())
        {
            System.err.println("Invalid title provided.");
        }

        boolean found;

        found = false;
        for(final MusicMedia media : musicLibrary)
        {
            if(media.getSongTitle().equals(title))
            {
                media.playSection();
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("Title '" + title + "' not found in the library.");
        }
    }
}
