package singleton;

import model.User.UserModel;

public class SessionManager {
    private static SessionManager instance;
    private UserModel currentUser;

    private SessionManager() {}

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void login(UserModel user) {
        this.currentUser = user;
    }

    public UserModel getCurrentUser() {
        return currentUser;
    }
}
