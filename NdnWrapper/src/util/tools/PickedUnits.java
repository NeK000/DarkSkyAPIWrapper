package util.tools;

import util.enums.Units;

@SuppressWarnings("unused")
public class PickedUnits {
    public static String getUnit(Units unit) {
        String Default = "units=auto";
        switch (unit) {
            case Auto:
                return Default;
            case Ca:
                return "units=ca";
            case Uk2:
                return "units=uk2";
            case Us:
                return "units=us";
            case Si:
                return "units=si";
            default:
                return Default;

        }
    }
}
