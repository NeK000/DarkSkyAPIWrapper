package util.tools;

@SuppressWarnings("unused")
public class HourlyExtend {

    public static String getExtend(boolean extendHourly) {
        if (extendHourly) return "extend=hourly";
        else return "";
    }
}
