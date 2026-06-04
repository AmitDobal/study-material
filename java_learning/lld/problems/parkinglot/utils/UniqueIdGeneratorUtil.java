package java_learning.lld.problems.parkinglot.utils;

import java.util.UUID;

public class UniqueIdGeneratorUtil {

    public static UUID getUniqueId() {
        return UUID.randomUUID();
    }

    public static String getUniqueIdString() {
        return getUniqueId().toString();
    }
}
