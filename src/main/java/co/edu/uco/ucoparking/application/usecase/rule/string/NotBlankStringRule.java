package co.edu.uco.ucoparking.application.usecase.rule.string;

import co.edu.uco.ucoparking.application.usecase.rule.Rule;

public final class NotBlankStringRule implements Rule<String> {

    private final String userMessage;
    private final String technicalMessage;

    public NotBlankStringRule(String userMessage, String technicalMessage) {
        this.userMessage = userMessage;
        this.technicalMessage = technicalMessage;
    }

    @Override
    public boolean isSatisfiedBy(String value) {
        return value != null && !value.isBlank();
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
