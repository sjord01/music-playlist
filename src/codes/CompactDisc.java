public class CompactDisc extends MusicMedia
{
    private final boolean hasBonusTracks;
    private final boolean hasDigipac;

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

    @Override
    public String toString()
    {
        return String.format("CompactDisc [bonusTracks=%b, digipac=%b, %s]", hasBonusTracks, hasDigipac, super.toString());
    }

    @Override
    public void playSection()
    {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the CD " + getSongTitle() + " by " + getSongArtist() + ".");
        System.out.println("This is a Compact Disc from the year " + getYearReleased() + ".");
    }
}