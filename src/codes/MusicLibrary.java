import java.util.ArrayList;

public class MusicLibrary
{
    private ArrayList<MusicMedia> muscicLibrary;

    public MusicLibrary()
    {
        this.muscicLibrary = new ArrayList<>();
    }

    public void addMedia(final MusicMedia media)
    {
        if(media != null)
        {
            muscicLibrary.add(media);
        }
    }

    public void displayLibrary()
    {
        for (final MusicMedia media : muscicLibrary) {
            System.out.println(media.toString());
        }
    }

    public void playTitle(final String title)
    {
        if(title == null || title.isEmpty())
        {
            System.err.println("Invalid title provided.");
        }

        boolean found = false;
        for(final MusicMedia media : muscicLibrary)
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
