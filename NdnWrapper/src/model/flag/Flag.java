package model.flag;

import java.util.List;
import java.util.Objects;

@SuppressWarnings("unused")
public class Flag {
    private List<String> sources;
    private String nearest_station;
    private String units;

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public String getNearest_station() {
        return nearest_station;
    }

    public void setNearest_station(String nearest_station) {
        this.nearest_station = nearest_station;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flag flag = (Flag) o;
        return Objects.equals(sources, flag.sources) &&
                Objects.equals(nearest_station, flag.nearest_station) &&
                Objects.equals(units, flag.units);
    }

    @Override
    public String toString() {
        return "Flag{" +
                "sources=" + sources +
                ", nearest_station='" + nearest_station + '\'' +
                ", units='" + units + '\'' +
                '}';
    }
}
