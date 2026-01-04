package domain;

public enum Role {
    MANAGER,
    STAFF;

    public static Role from(String raw) {
        if (raw == null) {
            throw new IllegalArgumentException("role is null");
        }

        String role = raw.trim();

        if (role.length() == 0) {
            throw new IllegalArgumentException("role is empty");
        }

        String normalized = role.toLowerCase();

        if (normalized.equals("staff")) {
            return STAFF;
        } else if (normalized.equals("manager")) {
            return MANAGER;
        } else {
            throw new IllegalArgumentException("unknown role:" + raw);
        }
    }
}
