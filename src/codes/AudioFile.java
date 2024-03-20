public class AudioFile extends MusicMedia
{
    private final String fileType;

    private static final String FILE_EXT_MP3 = "mp3";
    private static final String FILE_EXT_M4A = "m4a";
    private static final String FILE_EXT_WAV = "wav";

    public AudioFile(final String   songArtist,
                     final String   songTitle,
                     final int      totalNumberOfSongs,
                     final int      totalRuntimeMins,
                     final int      yearReleased,
                     final String   fileType)
    {
        super(songArtist, songTitle, totalNumberOfSongs, totalRuntimeMins, yearReleased);

        this.fileType = fileType;

        validateFileType();
    }

    private void validateFileType()
    {
        if(!fileType.equalsIgnoreCase(FILE_EXT_MP3)
                && !fileType.equalsIgnoreCase(FILE_EXT_M4A)
                && !fileType.equalsIgnoreCase(FILE_EXT_WAV))
        {
            throw new IllegalArgumentException("Invalid file type entered");
        }
    }

    @Override
    public String toString()
    {
        return String.format("AudioFile [fileType=%s, %s]", fileType, super.toString());
    }

    @Override
    public void playSection()
    {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the Audio File " + getSongTitle() + " by " + getSongArtist() + ".");
        System.out.println("This file is in " + fileType + " format, from the year " + getYearReleased() + ".");
    }
}