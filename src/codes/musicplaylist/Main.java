package musicplaylist;

/**
 * musicplaylist.Main class to demonstrate the functionality of the musicplaylist.MusicLibrary.
 *
 * This class contains the main method to demonstrate the functionality of the musicplaylist.MusicLibrary
 * class. It creates instances of musicplaylist.Record, musicplaylist.CompactDisc, and musicplaylist.AudioFile, adds them to a musicplaylist.MusicLibrary
 * instance, and then displays the library content. It also tests the playTitle method of the
 * musicplaylist.MusicLibrary class.
 *
 * @author Emma Lee, Sam Ordonez, Vandy Saxena, Chris H.
 * @version 1.0
 */
public class Main
{
    public static void main(final String[] args)
    {
        final Record      record;
        final CompactDisc compactDisc;
        final AudioFile   audioFile;

        record = new Record("The Beatles", "Hey Jude", 1, 7, 1968, 7.0, 45.0);
        compactDisc = new CompactDisc("Neil Young & Crazy Horse", "Everybody Knows This Is Nowhere", 4, 40, 1969, false, false);
        audioFile = new AudioFile("Donnie Iris and the Cruisers", "Ah Leah!", 1, 4, 1980, "wav");

        // Create musicplaylist.MusicLibrary instance
        MusicLibrary library = new MusicLibrary();

        // Add instances to the library
        library.addMedia(record);
        library.addMedia(compactDisc);
        library.addMedia(audioFile);

        // Display the library
        System.out.println("----------");
        library.displayLibrary();

        // Test playTitle method
        System.out.println("----------");
        library.playTitle("Hey Jude");
        System.out.println("----------");
        library.playTitle("Everybody Knows This Is Nowhere");
        System.out.println("----------");
        library.playTitle("Ah Leah!");
        System.out.println("----------");
        library.playTitle("Stairway to Heaven");
    }
}
