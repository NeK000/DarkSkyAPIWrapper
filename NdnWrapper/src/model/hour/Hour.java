package model.hour;

import java.util.List;
import java.util.Objects;

@SuppressWarnings("unused")
public class Hour {
    private String summary;
    private String icon;
    private List<Data> data;

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

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hour hour = (Hour) o;
        return Objects.equals(summary, hour.summary) &&
                Objects.equals(icon, hour.icon) &&
                Objects.equals(data, hour.data);
    }

    @Override
    public String toString() {
        return "Hour{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", data=" + data +
                '}';
    }
}
