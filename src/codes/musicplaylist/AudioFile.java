package musicplaylist;

/**
 * Represents an audio file, extending the musicplaylist.MusicMedia class.
 *
 * This class represents an audio file with additional attributes such as file type. It
 * inherits properties and behavior from the musicplaylist.MusicMedia class and provides methods to
 * access and manipulate audio file-specific information.
 *
 * @author Emma Lee, Sam Ordonez, Vandy Saxena, Chris Helmhold
 * @version 1.0
 */
public class AudioFile extends MusicMedia
{
    private final String fileType;

    private static final String FILE_EXT_MP3 = "mp3";
    private static final String FILE_EXT_M4A = "m4a";
    private static final String FILE_EXT_WAV = "wav";

    /**
     * Constructs an musicplaylist.AudioFile object with the specified attributes.
     * @param songArtist The artist of the song.
     * @param songTitle The title of the song.
     * @param totalNumberOfSongs The total number of songs in the audio file.
     * @param totalRuntimeMins The total runtime of the audio file in minutes.
     * @param yearReleased The year the audio file was released.
     * @param fileType The type of the audio file.
     */
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

    /**
     * Validates the file type.
     * Throws an IllegalArgumentException if it's invalid.
     */
    private void validateFileType()
    {
        if(!fileType.equalsIgnoreCase(FILE_EXT_MP3)
                && !fileType.equalsIgnoreCase(FILE_EXT_M4A)
                && !fileType.equalsIgnoreCase(FILE_EXT_WAV))
        {
            throw new IllegalArgumentException("Invalid file type entered");
        }
    }

    /**
     * Generates a string representation of the musicplaylist.AudioFile object.
     * @return A string representation of the musicplaylist.AudioFile object.
     */
    @Override
    public String toString()
    {
        return String.format("musicplaylist.AudioFile [fileType=%s, %s]", fileType, super.toString());
    }

    /**
     * Plays a section of the audio file.
     * Overrides the playSection method from the musicplaylist.MusicMedia class.
     */
    @Override
    public void playSection()
    {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the Audio File " + getSongTitle() + " by " + getSongArtist() + ".");
        System.out.println("This file is in " + fileType + " format, from the year " + getYearReleased() + ".");
    }
}