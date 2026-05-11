package co.edu.uco.ucoparking.application.usecase.rule.string;

import co.edu.uco.ucoparking.application.usecase.rule.Rule;

public final class NotNullStringRule implements Rule<String> {

    private final String userMessage;
    private final String technicalMessage;

    public NotNullStringRule(String userMessage, String technicalMessage) {
        this.userMessage = userMessage;
        this.technicalMessage = technicalMessage;
    }

    @Override
    public boolean isSatisfiedBy(String value) {
        return value != null;
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
