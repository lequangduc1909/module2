package entity;

public class Song {
    private int id;
    private String title;
    private String artist;
    private String gerne;
    private double duration;
    private double rating;

    public Song(int id, String title,String artist, String gerne, double duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.gerne = gerne;
        this.duration = duration;
        this.rating = 0;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        if (id<=0){
            throw new IllegalArgumentException("ID không hợp lệ");
        }
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        if (title == null || title.trim().isBlank()){
            throw new IllegalArgumentException("Tên bài hát không hợp lệ");
        }
        this.title = title.trim();
    }

    public String getArtist(){
        return artist;
    }

    public void setArtist(String artist){
        if (artist == null || artist.trim().isBlank()){
            throw new IllegalArgumentException("Tên nghệ sĩ không hợp lệ");
        }
        this.artist=artist;
    }

    public String getGerne() {
        return gerne;
    }

    public void setGerne(String gerne) {
        if (gerne == null|| gerne.trim().isBlank()){
            throw new IllegalArgumentException("Thể loại ko hợp lệ");
        }
        this.gerne = gerne;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if (duration <= 0){
            throw new IllegalArgumentException("Thời lượng phải >0");
        }
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void rateSong(double rating) {
        if (rating <0 || rating >5){
            throw new IllegalArgumentException("Rating phải từ 0 đến 5");
        }
        this.rating = rating;
    }

    @Override
    public String toString() {

        String ratingText;
        if(rating == 0){
            ratingText = "Chưa đánh giá";
        } else {
            ratingText = rating +"/5";
        }

        return "ID: " + id + " | " +
                "Tên bài hát: " + title + " | "+
                "Nghệ sĩ: " + artist + " | "+
                "Thể loại: "+ gerne + " | "+
                "Thời lượng: "+ duration + " | "+
                "Rating: " + ratingText;

    }
}
