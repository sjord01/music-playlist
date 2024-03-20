public class Record extends MusicMedia
{
    private final double recordSizeInches;
    private final double rpm;

    private static final int DISC_SIZE_7_INCHES = 7;
    private static final int DISC_SIZE_10_INCHES = 10;
    private static final int DISC_SIZE_12_INCHES = 12;
    private static final double RPM_1 = 33.3;
    private static final double RPM_2 = 45.0;
    private static final double RPM_3 = 78.0;

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

    private void validateRecord()
    {
        if(recordSizeInches != DISC_SIZE_7_INCHES && recordSizeInches != DISC_SIZE_10_INCHES && recordSizeInches != DISC_SIZE_12_INCHES)
        {
            throw new IllegalArgumentException("Invalid record size entered " + recordSizeInches);
        }
        if(rpm != RPM_1 && rpm != RPM_2 && rpm != RPM_3)
        {
            throw new IllegalArgumentException("Invalid rpm entered: " + rpm);
        }
    }

    public double getRecordSizeInches()
    {
        return recordSizeInches;
    }

    public double getRpm()
    {
        return rpm;
    }

    @Override
    public String toString()
    {
        return String.format("Record [size=%.0f, rpm=%.1f, %s]", recordSizeInches, rpm, super.toString());
    }

    @Override
    public void playSection()
    {
        System.out.println("Thank you for using our Music Library.");
        System.out.println("You selected the record " + getSongTitle() + " by " + getSongArtist() + ".");
        System.out.println("This is a " + (int)recordSizeInches + " inch record from " + getYearReleased() + ", playing at " + rpm + " rpm.");
    }
}
