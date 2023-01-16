package com.devcourse.drink.util;

import java.nio.ByteBuffer;
import java.util.UUID;

public class JdbcUtils {

    private JdbcUtils() {}

    public static UUID toUUID(byte[] bytes) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        return new UUID(byteBuffer.getLong(), byteBuffer.getLong());
    }
}
