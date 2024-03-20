/**
 * Main class to demonstrate the functionality of the MusicLibrary.
 *
 * @author Emma Lee, Sam Ordonez
 * @version 1.0
 */
public class Main
{
    public static void main(final String[] args)
    {
        Record record = new Record("The Beatles", "Hey Jude", 1, 7, 1968, 7.0, 45.0);
        CompactDisc compactDisc = new CompactDisc("Neil Young & Crazy Horse", "Everybody Knows This Is Nowhere", 4, 40, 1969, false, false);
        AudioFile audioFile = new AudioFile("Donnie Iris and the Cruisers", "Ah Leah!", 1, 4, 1980, "wav");

        // Create MusicLibrary instance
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
