package domain;

public record ValidationError(
        int lineNo, String rawLine, String reason) {

}
