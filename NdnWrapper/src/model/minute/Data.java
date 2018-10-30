package model.minute;

import java.util.Objects;

@SuppressWarnings({"SpellCheckingInspection", "unused"})
public class Data {

    private String time;
    private String precipIntensity;
    private String precipProbability;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(time, data.time) &&
                Objects.equals(precipIntensity, data.precipIntensity) &&
                Objects.equals(precipProbability, data.precipProbability);
    }

    @Override
    public String toString() {
        return "Data{" +
                "time='" + time + '\'' +
                ", precipIntensity='" + precipIntensity + '\'' +
                ", precipProbability='" + precipProbability + '\'' +
                '}';
    }
}
