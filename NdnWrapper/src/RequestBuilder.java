import asserts.Assert;
import util.enums.Exclude;
import util.enums.Language;
import util.enums.Units;
import util.tools.Excluded;
import util.tools.HourlyExtend;
import util.tools.PickedLanguage;
import util.tools.PickedUnits;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class RequestBuilder {
    private final String apiKey;
    private final float latitude;
    private final float longitude;
    private final List<Exclude> exclude;
    private final boolean extendHourly;
    private final Language language;
    private final Units unit;
    private final Instant time;


    public RequestBuilder(Builder builder) {
        this.apiKey = builder.apiKey;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.exclude = builder.exclude;
        this.extendHourly = builder.extendHourly;
        this.language = builder.language;
        this.unit = builder.unit;
        this.time = builder.time;
    }


    @SuppressWarnings("unused")
    public static class Builder {

        //Required parameters
        private final String apiKey;
        private final float latitude;
        private final float longitude;
        //Optional parameters
        private List<Exclude> exclude = new ArrayList<>();
        private boolean extendHourly = false;
        private Language language = Language.English;
        private Units unit = Units.Auto;
        private Instant time = Instant.now();

        public Builder(String apiKey, float latitude, float longitude) {
            //noinspection PrimitiveArrayArgumentToVarargsMethod
            Assert.notNull("Params cannot be null", new float[]{latitude, longitude});
            Assert.emptyString(apiKey, "API key cannot be null", "API key cannot be empty");
            Assert.validLatitude(latitude, "Latitude is not in the valid range. Latitude should be from -90 to 90");
            Assert.validLongitude(longitude, "Longitude is not in the valid range. Longitude should be from -180 to 180");
            this.apiKey = apiKey;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public Builder excludes(Exclude... excludes) {
            //noinspection ConfusingArgumentToVarargsMethod
            Assert.notNull("Excludes cannot be null", excludes);
            exclude = Arrays.asList(excludes);
            return this;
        }

        public Builder extendHourly(boolean extend) {
            Assert.notNull("Extended hours cannot be null", extend);
            extendHourly = extend;
            return this;
        }

        public Builder language(Language language) {
            Assert.notNull("Language cannot be null", language);
            this.language = language;
            return this;
        }

        public Builder units(Units units) {
            Assert.notNull("Units cannot be null", units);
            unit = units;
            return this;
        }

        public Builder timeMachine(Instant time) {
            Assert.notNull("Time cannot be null", time);
            this.time = time;
            return this;
        }

        public String build() {
            return "https://api.darksky.net/forecast/" +
                    this.apiKey + "/" +
                    this.latitude + "," +
                    this.longitude + "," +
                    String.valueOf(this.time.getEpochSecond()) +
                    ((this.exclude.isEmpty()) ? "?" : "?" + Excluded.getExclude(this.exclude) + "&") +
                    ((HourlyExtend.getExtend(extendHourly).isEmpty()) ? "" : HourlyExtend.getExtend(extendHourly) + "&") +
                    PickedLanguage.getLanguage(this.language) + "&" +
                    PickedUnits.getUnit(this.unit);
        }


    }
}
