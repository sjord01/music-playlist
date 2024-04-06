package musicplaylist;

/**
 * Represents a physical record, extending the musicplaylist.MusicMedia class.
 *
 * This class represents a physical record with additional attributes such as record size
 * in inches and revolutions per minute (rpm). It inherits properties and behavior from the
 * musicplaylist.MusicMedia class and provides methods to access and manipulate record-specific information.
 *
 * @author Emma Lee, Sam Ordonez, Vandy Saxena, Chris Helmhold
 * @version 1.0
 */
public class Record extends MusicMedia
{
    private final double recordSizeInches;
    private final double rpm;

    private static final int DISC_SIZE_SMALL = 7;
    private static final int DISC_SIZE_MEDIUM = 10;
    private static final int DISC_SIZE_LARGE = 12;
    private static final double RPM_1 = 33.3;
    private static final double RPM_2 = 45.0;
    private static final double RPM_3 = 78.0;

    /**
     * Constructs a musicplaylist.Record object with the specified attributes.
     * @param songArtist The artist of the song.
     * @param songTitle The title of the song.
     * @param totalNumberOfSongs The total number of songs on the record.
     * @param totalRuntimeMins The total runtime of the record in minutes.
     * @param yearReleased The year the record was released.
     * @param recordSizeInches The size of the record in inches.
     * @param rpm The revolutions per minute (rpm) of the record.
     */
    public Record(final String songArtist,
                  final String songTitle,
                  final int totalNumberOfSongs,
                  final int totalRuntimeMins,
                  final int yearReleased,
                  final double recordSizeInches,
                  final double rpm)
    {
        super(songArtist, songTitle, totalNumberOfSongs, totalRuntimeMins, yearReleased);

        this.recordSizeInches = recordSizeInches;
        this.rpm = rpm;

        validateRecord();
    }

    /**
     * Validates the record size and rpm values.
     * Throws an IllegalArgumentException if they are invalid.
     */
    private void validateRecord()
    {
        if(recordSizeInches != DISC_SIZE_SMALL && recordSizeInches != DISC_SIZE_MEDIUM && recordSizeInches != DISC_SIZE_LARGE)
        {
            throw new IllegalArgumentException("Invalid record size entered " + recordSizeInches);
        }
        if(rpm != RPM_1 && rpm != RPM_2 && rpm != RPM_3)
        {
            throw new IllegalArgumentException("Invalid rpm entered: " + rpm);
        }
    }

    /**
     * Retrieves the size of the record in inches.
     */
    public double getRecordSizeInches()
    {
        return recordSizeInches;
    }

    /**
     * Retrieves the revolutions per minute (rpm) of the record.
     */
    public double getRpm()
    {
        return rpm;
    }

    /**
     * Generates a string representation of the musicplaylist.Record object.
     * @return A string representation of the musicplaylist.Record object.
     */
    @Override
    public String toString()
    {
        return String.format("musicplaylist.Record [size=%.0f, rpm=%.1f, %s]", recordSizeInches, rpm, super.toString());
    }

    /**
     * Plays a section of the record.
     * Overrides the playSection method from the musicplaylist.MusicMedia class.
     */
    @Override
    public void playSection()
    {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the record " + getSongTitle() + " by " + getSongArtist() + ".");
        System.out.println("This is a " + (int)recordSizeInches + " inch record from " + getYearReleased() + ", playing at " + rpm + " rpm.");
    }
}
