package cn.train.enity;

import java.util.Objects;

public class MapCityInfo {
    private Integer id;

    private Integer cityid1;
    private CityInfo cityInfo1;

    private Integer cityid2;
    private CityInfo cityInfo2;

    private Integer distance;

    private Float price;

    public CityInfo getCityInfo1() {
        return cityInfo1;
    }

    public void setCityInfo1(CityInfo cityInfo1) {
        this.cityInfo1 = cityInfo1;
    }

    public CityInfo getCityInfo2() {
        return cityInfo2;
    }

    public void setCityInfo2(CityInfo cityInfo2) {
        this.cityInfo2 = cityInfo2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityid1() {
        return cityid1;
    }

    public void setCityid1(Integer cityid1) {
        this.cityid1 = cityid1;
    }

    public Integer getCityid2() {
        return cityid2;
    }

    public void setCityid2(Integer cityid2) {
        this.cityid2 = cityid2;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapCityInfo that = (MapCityInfo) o;
        return Objects.equals(cityid1, that.cityid1) &&
                Objects.equals(cityInfo1, that.cityInfo1) &&
                Objects.equals(cityid2, that.cityid2) &&
                Objects.equals(cityInfo2, that.cityInfo2) &&
                Objects.equals(distance, that.distance) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityid1, cityInfo1, cityid2, cityInfo2, distance, price);
    }
}