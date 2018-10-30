package asserts;

@SuppressWarnings("unused")
public class Assert {
    public static void notNull(String messageNull, Object... objects) {
        if (objects == null) {
            throw new IllegalArgumentException(messageNull);
        }
        for (Object o : objects
        ) {
            if (o == null) throw new IllegalArgumentException(messageNull);
        }
    }

    public static void emptyString(String string, String messageNull, String messageEmpty) {
        if (string == null) {
            throw new IllegalArgumentException(messageNull);
        } else if (string.isEmpty()) {
            throw new IllegalArgumentException(messageEmpty);
        }
    }

    public static void validLongitude(double longitude, String messageLongitude) {
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException(messageLongitude);
        }
    }

    public static void validLatitude(double latitude, String messageLatitude) {
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException(messageLatitude);
        }
    }
}
