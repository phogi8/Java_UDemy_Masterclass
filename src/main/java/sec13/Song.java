package sec13;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
//        System.out.println(this);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
//        DecimalFormat myFormatter = new DecimalFormat("#####.#####");
//        String output = myFormatter.format(this.duration);
//        return String.format("%s: %s", this.title, myFormatter.format(this.duration));
        return String.format("%s: %s", this.title, Double.toString(this.duration));
    }
}
