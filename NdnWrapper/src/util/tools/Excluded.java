package util.tools;

import util.enums.Exclude;

@SuppressWarnings("unused")
public class Excluded {

    public static String getExclude(Exclude... excludes) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("exclude=");
        for (Exclude a : excludes
        ) {
            stringBuilder.append(a).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }
}
