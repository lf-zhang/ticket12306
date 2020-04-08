//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

public class MapStopInfo {
    private Integer id;
    private Integer cityid;
    private CityInfo cityInfo;
    private String arrive;
    private Integer parktime;
    private String lefts;
    private Integer number;
    private Integer trainid;
    private MapTrainInfo trainInfo;
    private String ticketgate;

    public String getLefts() {
        return this.lefts;
    }

    public void setLefts(String lefts) {
        this.lefts = lefts;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityid() {
        return this.cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getArrive() {
        return this.arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive == null ? null : arrive.trim();
    }

    public Integer getParktime() {
        return this.parktime;
    }

    public void setParktime(Integer parktime) {
        this.parktime = parktime;
    }

    public void setlefts(String lefts) {
        this.lefts = lefts == null ? null : lefts.trim();
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getTrainid() {
        return this.trainid;
    }

    public void setTrainid(Integer trainid) {
        this.trainid = trainid;
    }

    public String getTicketgate() {
        return this.ticketgate;
    }

    public void setTicketgate(String ticketgate) {
        this.ticketgate = ticketgate == null ? null : ticketgate.trim();
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public MapTrainInfo getTrainInfo() {
        return this.trainInfo;
    }

    public void setTrainInfo(MapTrainInfo trainInfo) {
        this.trainInfo = trainInfo;
    }

    public CityInfo getCityInfo() {
        return this.cityInfo;
    }

    public MapStopInfo() {
    }

    public MapStopInfo(final Integer id, final Integer cityid, final CityInfo cityInfo, final String arrive, final Integer parktime, final String lefts, final Integer number, final Integer trainid, final MapTrainInfo trainInfo, final String ticketgate) {
        this.id = id;
        this.cityid = cityid;
        this.cityInfo = cityInfo;
        this.arrive = arrive;
        this.parktime = parktime;
        this.lefts = lefts;
        this.number = number;
        this.trainid = trainid;
        this.trainInfo = trainInfo;
        this.ticketgate = ticketgate;
    }
    @Override
    public String toString() {
        return "MapStopInfo(id=" + this.getId() + ", cityid=" + this.getCityid() + ", cityInfo=" + this.getCityInfo() + ", arrive=" + this.getArrive() + ", parktime=" + this.getParktime() + ", lefts=" + this.getLefts() + ", number=" + this.getNumber() + ", trainid=" + this.getTrainid() + ", trainInfo=" + this.getTrainInfo() + ", ticketgate=" + this.getTicketgate() + ")";
    }
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof MapStopInfo)) {
            return false;
        } else {
            MapStopInfo other = (MapStopInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id != null) {
                        return false;
                    }
                } else if (!this$id.equals(other$id)) {
                    return false;
                }

                Object this$cityid = this.getCityid();
                Object other$cityid = other.getCityid();
                if (this$cityid == null) {
                    if (other$cityid != null) {
                        return false;
                    }
                } else if (!this$cityid.equals(other$cityid)) {
                    return false;
                }

                Object this$cityInfo = this.getCityInfo();
                Object other$cityInfo = other.getCityInfo();
                if (this$cityInfo == null) {
                    if (other$cityInfo != null) {
                        return false;
                    }
                } else if (!this$cityInfo.equals(other$cityInfo)) {
                    return false;
                }

                label110: {
                    Object this$arrive = this.getArrive();
                    Object other$arrive = other.getArrive();
                    if (this$arrive == null) {
                        if (other$arrive == null) {
                            break label110;
                        }
                    } else if (this$arrive.equals(other$arrive)) {
                        break label110;
                    }

                    return false;
                }

                label103: {
                    Object this$parktime = this.getParktime();
                    Object other$parktime = other.getParktime();
                    if (this$parktime == null) {
                        if (other$parktime == null) {
                            break label103;
                        }
                    } else if (this$parktime.equals(other$parktime)) {
                        break label103;
                    }

                    return false;
                }

                Object this$lefts = this.getLefts();
                Object other$lefts = other.getLefts();
                if (this$lefts == null) {
                    if (other$lefts != null) {
                        return false;
                    }
                } else if (!this$lefts.equals(other$lefts)) {
                    return false;
                }

                label89: {
                    Object this$number = this.getNumber();
                    Object other$number = other.getNumber();
                    if (this$number == null) {
                        if (other$number == null) {
                            break label89;
                        }
                    } else if (this$number.equals(other$number)) {
                        break label89;
                    }

                    return false;
                }

                label82: {
                    Object this$trainid = this.getTrainid();
                    Object other$trainid = other.getTrainid();
                    if (this$trainid == null) {
                        if (other$trainid == null) {
                            break label82;
                        }
                    } else if (this$trainid.equals(other$trainid)) {
                        break label82;
                    }

                    return false;
                }

                Object this$trainInfo = this.getTrainInfo();
                Object other$trainInfo = other.getTrainInfo();
                if (this$trainInfo == null) {
                    if (other$trainInfo != null) {
                        return false;
                    }
                } else if (!this$trainInfo.equals(other$trainInfo)) {
                    return false;
                }

                Object this$ticketgate = this.getTicketgate();
                Object other$ticketgate = other.getTicketgate();
                if (this$ticketgate == null) {
                    if (other$ticketgate != null) {
                        return false;
                    }
                } else if (!this$ticketgate.equals(other$ticketgate)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MapStopInfo;
    }
   @Override
    public int hashCode() {
        int PRIME = 0;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $cityid = this.getCityid();
        result = result * 59 + ($cityid == null ? 43 : $cityid.hashCode());
        Object $cityInfo = this.getCityInfo();
        result = result * 59 + ($cityInfo == null ? 43 : $cityInfo.hashCode());
        Object $arrive = this.getArrive();
        result = result * 59 + ($arrive == null ? 43 : $arrive.hashCode());
        Object $parktime = this.getParktime();
        result = result * 59 + ($parktime == null ? 43 : $parktime.hashCode());
        Object $lefts = this.getLefts();
        result = result * 59 + ($lefts == null ? 43 : $lefts.hashCode());
        Object $number = this.getNumber();
        result = result * 59 + ($number == null ? 43 : $number.hashCode());
        Object $trainid = this.getTrainid();
        result = result * 59 + ($trainid == null ? 43 : $trainid.hashCode());
        Object $trainInfo = this.getTrainInfo();
        result = result * 59 + ($trainInfo == null ? 43 : $trainInfo.hashCode());
        Object $ticketgate = this.getTicketgate();
        result = result * 59 + ($ticketgate == null ? 43 : $ticketgate.hashCode());
        return result;
    }
}
