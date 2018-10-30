package model.minute;

import java.util.List;
import java.util.Objects;

@SuppressWarnings("unused")
public class Minute {
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
        Minute minute = (Minute) o;
        return Objects.equals(summary, minute.summary) &&
                Objects.equals(icon, minute.icon) &&
                Objects.equals(data, minute.data);
    }

    @Override
    public String toString() {
        return "Minute{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", data=" + data +
                '}';
    }
}
