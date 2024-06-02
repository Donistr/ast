package task6.task1;

public class Test {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login = "login";
        String password = "password";
        String confirmPassword = "password";

        checkRegisterData(login, password, confirmPassword);
    }

    // я не особо понял зачем этот метод должен возвращать boolean, если надо выбрасывать исключения и из-за этого
    // он либо будет всегда возвращать true, либо бросать исключения, поэтому сделал его void
    private static void checkRegisterData(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20) {
            throw new WrongLoginException("login should be less than 20 symbols");
        }
        if (login.contains(" ")) {
            throw new WrongLoginException("login shouldn't contain spaces");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException("password should be less than 20 symbols");
        }
        if (password.contains(" ")) {
            throw new WrongPasswordException("password shouldn't contain spaces");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password and confirm password should be equal");
        }
        if (password.chars().noneMatch(Character::isDigit)) {
            throw new WrongPasswordException("password should contain at least one digit");
        }
    }
}
