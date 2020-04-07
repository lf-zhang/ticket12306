package cn.train.enity;

import java.util.Objects;

public class CityInfo {
    private Integer id;

    private String name;

    private String saletime;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSaletime() {
        return saletime;
    }

    public void setSaletime(String saletime) {
        this.saletime = saletime == null ? null : saletime.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        return "CityInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", saletime='" + saletime + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityInfo cityInfo = (CityInfo) o;
        return Objects.equals(name, cityInfo.name) &&
                Objects.equals(saletime, cityInfo.saletime) &&
                Objects.equals(address, cityInfo.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, saletime, address);
    }
}