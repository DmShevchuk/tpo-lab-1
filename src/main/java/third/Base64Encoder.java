package third;

import java.util.Base64;
import lombok.NonNull;

public class Base64Encoder {

    public static String encodeToBase64(@NonNull String input) {
        byte[] encodedBytes = Base64.getEncoder().encode(input.getBytes());
        return new String(encodedBytes);
    }

    public static String decodeFromBase64(@NonNull String base64String) {
        byte[] decodedBytes = Base64.getDecoder().decode(base64String);
        return new String(decodedBytes);
    }

}
