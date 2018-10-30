package util.tools;

import util.enums.Exclude;

import java.util.List;

@SuppressWarnings("unused")
public class Excluded {

    public static String getExclude(List<Exclude> excludes) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("exclude=");
        for (Exclude a : excludes
        ) {
            stringBuilder.append(String.valueOf(a).toLowerCase()).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
