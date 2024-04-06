/**
 * Represents a compact disc (CD), extending the MusicMedia class.
 *
 * This class represents a compact disc with additional attributes such as
 * whether it has bonus tracks and whether it has a digipac packaging. It
 * inherits properties and behavior from the MusicMedia class and provides
 * methods to access and manipulate CD-specific information.
 *
 * @author Emma Lee, Sam Ordonez, Vandy Saxena, Chris Helmhold
 * @version 1.0
 */
public class CompactDisc extends MusicMedia
{
    private final boolean hasBonusTracks;
    private final boolean hasDigipac;

    /**
     * Constructs a CompactDisc object with the specified attributes.
     * @param songArtist The artist of the songs in the CD.
     * @param songTitle The title of the CD.
     * @param totalNumberOfSongs The total number of songs in the CD.
     * @param totalRuntimeMins The total runtime of the CD in minutes.
     * @param yearReleased The year the CD was released.
     * @param hasBonusTracks Indicates whether the CD has bonus tracks.
     * @param hasDigipac Indicates whether the CD has a digipac packaging.
     */
    public CompactDisc(final String  songArtist,
                       final String  songTitle,
                       final int     totalNumberOfSongs,
                       final int     totalRuntimeMins,
                       final int     yearReleased,
                       final boolean hasBonusTracks,
                       final boolean hasDigipac)
    {
        super(songArtist, songTitle, totalNumberOfSongs, totalRuntimeMins, yearReleased);
        this.hasBonusTracks = hasBonusTracks;
        this.hasDigipac = hasDigipac;
    }

    /**
     * Generates a string representation of the CompactDisc object.
     * @return A string representation of the CompactDisc object.
     */
    @Override
    public String toString()
    {
        return String.format("CompactDisc [bonusTracks=%b, digipac=%b, %s]", hasBonusTracks, hasDigipac, super.toString());
    }

    /**
     * Plays a section of the CD.
     * Overrides the playSection method from the MusicMedia class.
     */
    @Override
    public void playSection()
    {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the CD " + getSongTitle() + " by " + getSongArtist() + ".");
        System.out.println("This is a Compact Disc from the year " + getYearReleased() + ".");
    }
}