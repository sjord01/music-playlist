/**
 * Represents a piece of music media in a library.
 *
 * @author Emma Lee, Sam Ordonez
 * @version 1.0
 */
public class MusicMedia
{
    private final String    songArtist;
    private final String    songTitle;
    private final int       totalNumberOfSongs;
    private final int       totalRuntimeMins;
    private final int       yearReleased;

    /**
     * Constructs a MusicMedia object with the provided details.
     *
     * @param songArtist        The artist of the song.
     * @param songTitle         The title of the song.
     * @param totalNumberOfSongs    The total number of songs in the album.
     * @param totalRuntimeMins     The total runtime of the album in minutes.
     * @param yearReleased      The year the album was released.
     * @throws IllegalArgumentException if any of the provided data is invalid.
     */
    public MusicMedia(final String  songArtist,
                      final String  songTitle,
                      final int     totalNumberOfSongs,
                      final int     totalRuntimeMins,
                      final int     yearReleased)
    {
        this.songArtist             = songArtist;
        this.songTitle              = songTitle;
        this.totalNumberOfSongs     = totalNumberOfSongs;
        this.totalRuntimeMins       = totalRuntimeMins;
        this.yearReleased           = yearReleased;

        validateMusicMediaInput();
    }

    /**
     * Validates the data of the MusicMedia object.
     * Throws an IllegalArgumentException if any data is invalid.
     */
    private void validateMusicMediaInput()
    {
        if(songArtist == null || songTitle == null || totalNumberOfSongs <= 0 || totalRuntimeMins <= 0 || yearReleased <= 0)
        {
            throw new IllegalArgumentException("Invalid data entered " + songArtist);
        }
    }


    /**
     * Returns the artist of the song.
     */
    public String getSongArtist()
    {
        return songArtist;
    }

    /**
     * Returns the title of the song.
     */
    public String getSongTitle()
    {
        return songTitle;
    }

    /**
     * Returns the total number of songs on the album.
     */
    public int getTotalNumberOfSongs()
    {
        return totalNumberOfSongs;
    }

    /**
     * Returns the total runtime of the album in minutes.
     */
    public int getTotalRuntimeMins()
    {
        return totalRuntimeMins;
    }

    /**
     * Returns the year the album was released.
     */
    public int getYearReleased()
    {
        return yearReleased;
    }

    /**
     * Returns a string representation of the MusicMedia object.
     * @return A string representation of the MusicMedia object.
     */
    @Override
    public String toString()
    {
        return String.format("toString()=Album [Artist=%s, title=%s, trackCount=%d, totalMinutes=%d]",
                getSongArtist(), getSongTitle(), getTotalNumberOfSongs(), getTotalRuntimeMins());
    }

    /**
     * Displays a message thanking the user for using the Music Library.
     */
    public void playSection()
    {
        System.out.println("Thank you for using our Music Library.");
    }
}