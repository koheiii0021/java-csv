package domain;

import java.time.LocalDate;

public record WorkLog(
        LocalDate date,
        String staff,
        String store,
        int minutes,
        Role role) {

}
