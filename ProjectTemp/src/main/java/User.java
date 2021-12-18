public class User {
    public String username;
    public String password;
    public Playlist[] playlists;
    public String token;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
