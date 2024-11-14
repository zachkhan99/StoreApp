public class User {
    private String username;
    private String password;
    private boolean loggedIn;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.loggedIn = false; // By default, the user is not logged in
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        // Check if the provided username and password match the user's credentials
        if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
            loggedIn = true; // Set the login status to true
            return true; // Login successful
        }
        return false; // Login failed
    }

    public String getPassword() {
        return password;
    }

    public void logout() {
        loggedIn = false; // Set the login status to false, effectively logging the user out
    }

    public boolean isLoggedIn() {
        return loggedIn; // Check if the user is currently logged in
    }

    // Getter for username
    public String getUsername() {
        return username;
    }
}
