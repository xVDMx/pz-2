package practice.post.practice2;

/**
 * Модель предметной области
 * @author Ihor Savchenko
 * @version 1.0
 */
public class User {

    private final int id;
    private final String login;
    private final String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
