package co.edu.uco.ucoparking.crosscutting.exception;

public class UcoParkingException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final String userMessage;
    private final int httpStatus;

    protected UcoParkingException(String userMessage, String technicalMessage, int httpStatus) {
        super(technicalMessage);
        this.userMessage = userMessage;
        this.httpStatus = httpStatus;
    }

    public static UcoParkingException create(String userMessage, String technicalMessage) {
        return new UcoParkingException(userMessage, technicalMessage, 400);
    }

    public String getUserMessage() {
        return userMessage;
    }

    public int getHttpStatus() {
        return httpStatus;
    }
}