//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

public class MapCityInfo {
    private Integer id;
    private Integer cityid1;
    private CityInfo cityInfo1;
    private Integer cityid2;
    private CityInfo cityInfo2;
    private Integer distance;
    private Float price;

    public CityInfo getCityInfo1() {
        return this.cityInfo1;
    }

    public void setCityInfo1(CityInfo cityInfo1) {
        this.cityInfo1 = cityInfo1;
    }

    public CityInfo getCityInfo2() {
        return this.cityInfo2;
    }

    public void setCityInfo2(CityInfo cityInfo2) {
        this.cityInfo2 = cityInfo2;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityid1() {
        return this.cityid1;
    }

    public void setCityid1(Integer cityid1) {
        this.cityid1 = cityid1;
    }

    public Integer getCityid2() {
        return this.cityid2;
    }

    public void setCityid2(Integer cityid2) {
        this.cityid2 = cityid2;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public MapCityInfo() {
    }

    public MapCityInfo(final Integer id, final Integer cityid1, final CityInfo cityInfo1, final Integer cityid2, final CityInfo cityInfo2, final Integer distance, final Float price) {
        this.id = id;
        this.cityid1 = cityid1;
        this.cityInfo1 = cityInfo1;
        this.cityid2 = cityid2;
        this.cityInfo2 = cityInfo2;
        this.distance = distance;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MapCityInfo(id=" + this.getId() + ", cityid1=" + this.getCityid1() + ", cityInfo1=" + this.getCityInfo1() + ", cityid2=" + this.getCityid2() + ", cityInfo2=" + this.getCityInfo2() + ", distance=" + this.getDistance() + ", price=" + this.getPrice() + ")";
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof MapCityInfo)) {
            return false;
        } else {
            MapCityInfo other = (MapCityInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label95: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label95;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label95;
                    }

                    return false;
                }

                Object this$cityid1 = this.getCityid1();
                Object other$cityid1 = other.getCityid1();
                if (this$cityid1 == null) {
                    if (other$cityid1 != null) {
                        return false;
                    }
                } else if (!this$cityid1.equals(other$cityid1)) {
                    return false;
                }

                Object this$cityInfo1 = this.getCityInfo1();
                Object other$cityInfo1 = other.getCityInfo1();
                if (this$cityInfo1 == null) {
                    if (other$cityInfo1 != null) {
                        return false;
                    }
                } else if (!this$cityInfo1.equals(other$cityInfo1)) {
                    return false;
                }

                label74: {
                    Object this$cityid2 = this.getCityid2();
                    Object other$cityid2 = other.getCityid2();
                    if (this$cityid2 == null) {
                        if (other$cityid2 == null) {
                            break label74;
                        }
                    } else if (this$cityid2.equals(other$cityid2)) {
                        break label74;
                    }

                    return false;
                }

                label67: {
                    Object this$cityInfo2 = this.getCityInfo2();
                    Object other$cityInfo2 = other.getCityInfo2();
                    if (this$cityInfo2 == null) {
                        if (other$cityInfo2 == null) {
                            break label67;
                        }
                    } else if (this$cityInfo2.equals(other$cityInfo2)) {
                        break label67;
                    }

                    return false;
                }

                Object this$distance = this.getDistance();
                Object other$distance = other.getDistance();
                if (this$distance == null) {
                    if (other$distance != null) {
                        return false;
                    }
                } else if (!this$distance.equals(other$distance)) {
                    return false;
                }

                Object this$price = this.getPrice();
                Object other$price = other.getPrice();
                if (this$price == null) {
                    if (other$price != null) {
                        return false;
                    }
                } else if (!this$price.equals(other$price)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MapCityInfo;
    }
    @Override
    public int hashCode() {
        int PRIME = 0;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $cityid1 = this.getCityid1();
        result = result * 59 + ($cityid1 == null ? 43 : $cityid1.hashCode());
        Object $cityInfo1 = this.getCityInfo1();
        result = result * 59 + ($cityInfo1 == null ? 43 : $cityInfo1.hashCode());
        Object $cityid2 = this.getCityid2();
        result = result * 59 + ($cityid2 == null ? 43 : $cityid2.hashCode());
        Object $cityInfo2 = this.getCityInfo2();
        result = result * 59 + ($cityInfo2 == null ? 43 : $cityInfo2.hashCode());
        Object $distance = this.getDistance();
        result = result * 59 + ($distance == null ? 43 : $distance.hashCode());
        Object $price = this.getPrice();
        result = result * 59 + ($price == null ? 43 : $price.hashCode());
        return result;
    }
}
