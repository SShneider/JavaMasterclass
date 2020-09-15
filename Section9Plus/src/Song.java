public class Song {
    private String title;
    private int durationSec;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationSec() {
        return durationSec;
    }

    public void setDurationSec(int durationSec) {
        this.durationSec = durationSec;
    }

    public Song(String title, int durationSec) {
        this.title = title;
        this.durationSec = durationSec;
    }
}
