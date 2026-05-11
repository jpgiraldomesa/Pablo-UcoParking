package co.edu.uco.ucoparking.application.usecase.rule;

public interface Rule<T> {

    boolean isSatisfiedBy(T value);

    String getUserMessage();

    String getTechnicalMessage();
}