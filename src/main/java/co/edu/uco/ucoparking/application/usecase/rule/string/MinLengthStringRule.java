package co.edu.uco.ucoparking.application.usecase.rule.string;

import co.edu.uco.ucoparking.application.usecase.rule.Rule;

public final class MinLengthStringRule implements Rule<String> {

    private final int minLength;
    private final String userMessage;
    private final String technicalMessage;

    public MinLengthStringRule(int minLength, String userMessage, String technicalMessage) {
        this.minLength = minLength;
        this.userMessage = userMessage;
        this.technicalMessage = technicalMessage;
    }

    @Override
    public boolean isSatisfiedBy(String value) {
        return value != null && value.length() >= minLength;
    }

    @Override
    public String getUserMessage() {
        return userMessage;
    }

    @Override
    public String getTechnicalMessage() {
        return technicalMessage;
    }
}
