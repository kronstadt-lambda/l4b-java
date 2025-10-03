package basic.c08_exceptions;

public class TemperatureChecker extends Exception {
    public TemperatureChecker(String message) {
        super(message);
    }
    public TemperatureChecker(String message, Throwable cause) {
        super(message, cause);
    }
}
