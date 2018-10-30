package model.hour;

import java.util.Objects;

@SuppressWarnings({"unused", "SpellCheckingInspection"})
public class Data {
    private String time;
    private String summary;
    private String icon;
    private String precipIntensity;
    private String precipProbability;
    private String temperature;
    private String apparentTemperature;
    private String dewPoint;
    private String humidity;
    private String pressure;
    private String windSpeed;
    private String windGust;
    private String windBearing;
    private String cloudCover;
    private String uvIndex;
    private String visibility;
    private String ozone;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(String precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public String getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(String precipProbability) {
        this.precipProbability = precipProbability;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(String apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public String getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(String dewPoint) {
        this.dewPoint = dewPoint;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindGust() {
        return windGust;
    }

    public void setWindGust(String windGust) {
        this.windGust = windGust;
    }

    public String getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(String windBearing) {
        this.windBearing = windBearing;
    }

    public String getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
    }

    public String getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getOzone() {
        return ozone;
    }

    public void setOzone(String ozone) {
        this.ozone = ozone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(time, data.time) &&
                Objects.equals(summary, data.summary) &&
                Objects.equals(icon, data.icon) &&
                Objects.equals(precipIntensity, data.precipIntensity) &&
                Objects.equals(precipProbability, data.precipProbability) &&
                Objects.equals(temperature, data.temperature) &&
                Objects.equals(apparentTemperature, data.apparentTemperature) &&
                Objects.equals(dewPoint, data.dewPoint) &&
                Objects.equals(humidity, data.humidity) &&
                Objects.equals(pressure, data.pressure) &&
                Objects.equals(windSpeed, data.windSpeed) &&
                Objects.equals(windGust, data.windGust) &&
                Objects.equals(windBearing, data.windBearing) &&
                Objects.equals(cloudCover, data.cloudCover) &&
                Objects.equals(uvIndex, data.uvIndex) &&
                Objects.equals(visibility, data.visibility) &&
                Objects.equals(ozone, data.ozone);
    }

    @Override
    public String toString() {
        return "Data{" +
                "time='" + time + '\'' +
                ", summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", precipIntensity='" + precipIntensity + '\'' +
                ", precipProbability='" + precipProbability + '\'' +
                ", temperature='" + temperature + '\'' +
                ", apparentTemperature='" + apparentTemperature + '\'' +
                ", dewPoint='" + dewPoint + '\'' +
                ", humidity='" + humidity + '\'' +
                ", pressure='" + pressure + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", windGust='" + windGust + '\'' +
                ", windBearing='" + windBearing + '\'' +
                ", cloudCover='" + cloudCover + '\'' +
                ", uvIndex='" + uvIndex + '\'' +
                ", visibility='" + visibility + '\'' +
                ", ozone='" + ozone + '\'' +
                '}';
    }
}
