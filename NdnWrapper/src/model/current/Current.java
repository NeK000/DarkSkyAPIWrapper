package model.current;

import java.util.Objects;

@SuppressWarnings({"SpellCheckingInspection", "unused"})
public class Current {

    private String time;
    private String summary;
    private String icon;
    private String nearestStormDistance;
    private String nearestStormBearing;
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
    private String clouldCover;
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

    public String getNearestStormDistance() {
        return nearestStormDistance;
    }

    public void setNearestStormDistance(String nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public String getNearestStormBearing() {
        return nearestStormBearing;
    }

    public void setNearestStormBearing(String nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
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

    public String getClouldCover() {
        return clouldCover;
    }

    public void setClouldCover(String clouldCover) {
        this.clouldCover = clouldCover;
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
        Current current = (Current) o;
        return Objects.equals(time, current.time) &&
                Objects.equals(summary, current.summary) &&
                Objects.equals(icon, current.icon) &&
                Objects.equals(nearestStormDistance, current.nearestStormDistance) &&
                Objects.equals(nearestStormBearing, current.nearestStormBearing) &&
                Objects.equals(precipIntensity, current.precipIntensity) &&
                Objects.equals(precipProbability, current.precipProbability) &&
                Objects.equals(temperature, current.temperature) &&
                Objects.equals(apparentTemperature, current.apparentTemperature) &&
                Objects.equals(dewPoint, current.dewPoint) &&
                Objects.equals(humidity, current.humidity) &&
                Objects.equals(pressure, current.pressure) &&
                Objects.equals(windSpeed, current.windSpeed) &&
                Objects.equals(windGust, current.windGust) &&
                Objects.equals(windBearing, current.windBearing) &&
                Objects.equals(clouldCover, current.clouldCover) &&
                Objects.equals(uvIndex, current.uvIndex) &&
                Objects.equals(visibility, current.visibility) &&
                Objects.equals(ozone, current.ozone);
    }

    @Override
    public String toString() {
        return "Current{" +
                "time='" + time + '\'' +
                ", summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", nearestStormDistance='" + nearestStormDistance + '\'' +
                ", nearestStormBearing='" + nearestStormBearing + '\'' +
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
                ", clouldCover='" + clouldCover + '\'' +
                ", uvIndex='" + uvIndex + '\'' +
                ", visibility='" + visibility + '\'' +
                ", ozone='" + ozone + '\'' +
                '}';
    }
}
