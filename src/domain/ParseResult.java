package domain;

import java.util.List;

public record ParseResult(List<WorkLog> logs, List<ValidationError> errors) {

}
