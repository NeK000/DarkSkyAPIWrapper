package model;

import model.current.Current;
import model.day.Day;
import model.flag.Flag;
import model.hour.Hour;
import model.minute.Minute;

import java.util.Objects;

@SuppressWarnings("unused")
public class Forecast {

    private String latitude;
    private String longitude;
    private String timezone;
    private Current currently;
    private Minute minutely;
    private Hour hourly;
    private Day daily;
    private Flag flags;
    private String offset;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Current getCurrently() {
        return currently;
    }

    public void setCurrently(Current currently) {
        this.currently = currently;
    }

    public Minute getMinutely() {
        return minutely;
    }

    public void setMinutely(Minute minutely) {
        this.minutely = minutely;
    }

    public Hour getHourly() {
        return hourly;
    }

    public void setHourly(Hour hourly) {
        this.hourly = hourly;
    }

    public Day getDaily() {
        return daily;
    }

    public void setDaily(Day daily) {
        this.daily = daily;
    }

    public Flag getFlags() {
        return flags;
    }

    public void setFlags(Flag flags) {
        this.flags = flags;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Forecast forecast = (Forecast) o;
        return Objects.equals(latitude, forecast.latitude) &&
                Objects.equals(longitude, forecast.longitude) &&
                Objects.equals(timezone, forecast.timezone) &&
                Objects.equals(currently, forecast.currently) &&
                Objects.equals(minutely, forecast.minutely) &&
                Objects.equals(hourly, forecast.hourly) &&
                Objects.equals(daily, forecast.daily) &&
                Objects.equals(flags, forecast.flags) &&
                Objects.equals(offset, forecast.offset);
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", timezone='" + timezone + '\'' +
                ", currently=" + currently +
                ", minutely=" + minutely +
                ", hourly=" + hourly +
                ", daily=" + daily +
                ", flags=" + flags +
                ", offset='" + offset + '\'' +
                '}';
    }
}
