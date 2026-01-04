package domain;

import java.time.LocalDate;
import java.util.Map;

public record Summary(
        Map<String, Integer> minutesByStore,
        Map<String, Integer> minutesByStaff,
        Map<LocalDate, Integer> minutesByDate) {

}
