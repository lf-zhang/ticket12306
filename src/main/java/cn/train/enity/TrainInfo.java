//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

import java.util.List;

public class TrainInfo {
    private Integer id;
    private String day;
    private String number;
    private Integer stopnumber;
    private Integer firststation;
    private CityInfo cityInfo1;
    private Integer laststation;
    private CityInfo cityInfo2;
    private Integer status;
    private Integer changetime;
    private Integer modelid;
    private List<StopInfo> stoplist;
    @Override
    public String toString() {
        return "TrainInfo{id=" + this.id + ", day='" + this.day + '\'' + ", number='" + this.number + '\'' + ", stopnumber=" + this.stopnumber + ", firststation=" + this.firststation + ", laststation=" + this.laststation + ", status=" + this.status + ", changetime=" + this.changetime + ", modelid=" + this.modelid + ", stoplist=" + this.stoplist + '}';
    }

    public void setStoplist(List<StopInfo> stoplist) {
        this.stoplist = stoplist;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getStopnumber() {
        return this.stopnumber;
    }

    public void setStopnumber(Integer stopnumber) {
        this.stopnumber = stopnumber;
    }

    public Integer getFirststation() {
        return this.firststation;
    }

    public void setFirststation(Integer firststation) {
        this.firststation = firststation;
    }

    public Integer getLaststation() {
        return this.laststation;
    }

    public void setLaststation(Integer laststation) {
        this.laststation = laststation;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getChangetime() {
        return this.changetime;
    }

    public void setChangetime(Integer changetime) {
        this.changetime = changetime;
    }

    public Integer getModelid() {
        return this.modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

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

    public List<StopInfo> getStoplist() {
        return this.stoplist;
    }

    public TrainInfo() {
    }

    public TrainInfo(final Integer id, final String day, final String number, final Integer stopnumber, final Integer firststation, final CityInfo cityInfo1, final Integer laststation, final CityInfo cityInfo2, final Integer status, final Integer changetime, final Integer modelid, final List<StopInfo> stoplist) {
        this.id = id;
        this.day = day;
        this.number = number;
        this.stopnumber = stopnumber;
        this.firststation = firststation;
        this.cityInfo1 = cityInfo1;
        this.laststation = laststation;
        this.cityInfo2 = cityInfo2;
        this.status = status;
        this.changetime = changetime;
        this.modelid = modelid;
        this.stoplist = stoplist;
    }
   @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof TrainInfo)) {
            return false;
        } else {
            TrainInfo other = (TrainInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label155: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label155;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label155;
                    }

                    return false;
                }

                Object this$day = this.getDay();
                Object other$day = other.getDay();
                if (this$day == null) {
                    if (other$day != null) {
                        return false;
                    }
                } else if (!this$day.equals(other$day)) {
                    return false;
                }

                Object this$number = this.getNumber();
                Object other$number = other.getNumber();
                if (this$number == null) {
                    if (other$number != null) {
                        return false;
                    }
                } else if (!this$number.equals(other$number)) {
                    return false;
                }

                label134: {
                    Object this$stopnumber = this.getStopnumber();
                    Object other$stopnumber = other.getStopnumber();
                    if (this$stopnumber == null) {
                        if (other$stopnumber == null) {
                            break label134;
                        }
                    } else if (this$stopnumber.equals(other$stopnumber)) {
                        break label134;
                    }

                    return false;
                }

                label127: {
                    Object this$firststation = this.getFirststation();
                    Object other$firststation = other.getFirststation();
                    if (this$firststation == null) {
                        if (other$firststation == null) {
                            break label127;
                        }
                    } else if (this$firststation.equals(other$firststation)) {
                        break label127;
                    }

                    return false;
                }

                label120: {
                    Object this$cityInfo1 = this.getCityInfo1();
                    Object other$cityInfo1 = other.getCityInfo1();
                    if (this$cityInfo1 == null) {
                        if (other$cityInfo1 == null) {
                            break label120;
                        }
                    } else if (this$cityInfo1.equals(other$cityInfo1)) {
                        break label120;
                    }

                    return false;
                }

                Object this$laststation = this.getLaststation();
                Object other$laststation = other.getLaststation();
                if (this$laststation == null) {
                    if (other$laststation != null) {
                        return false;
                    }
                } else if (!this$laststation.equals(other$laststation)) {
                    return false;
                }

                label106: {
                    Object this$cityInfo2 = this.getCityInfo2();
                    Object other$cityInfo2 = other.getCityInfo2();
                    if (this$cityInfo2 == null) {
                        if (other$cityInfo2 == null) {
                            break label106;
                        }
                    } else if (this$cityInfo2.equals(other$cityInfo2)) {
                        break label106;
                    }

                    return false;
                }

                Object this$status = this.getStatus();
                Object other$status = other.getStatus();
                if (this$status == null) {
                    if (other$status != null) {
                        return false;
                    }
                } else if (!this$status.equals(other$status)) {
                    return false;
                }

                label92: {
                    Object this$changetime = this.getChangetime();
                    Object other$changetime = other.getChangetime();
                    if (this$changetime == null) {
                        if (other$changetime == null) {
                            break label92;
                        }
                    } else if (this$changetime.equals(other$changetime)) {
                        break label92;
                    }

                    return false;
                }

                Object this$modelid = this.getModelid();
                Object other$modelid = other.getModelid();
                if (this$modelid == null) {
                    if (other$modelid != null) {
                        return false;
                    }
                } else if (!this$modelid.equals(other$modelid)) {
                    return false;
                }

                Object this$stoplist = this.getStoplist();
                Object other$stoplist = other.getStoplist();
                if (this$stoplist == null) {
                    if (other$stoplist != null) {
                        return false;
                    }
                } else if (!this$stoplist.equals(other$stoplist)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TrainInfo;
    }
    @Override
    public int hashCode() {
        int PRIME = 0;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $day = this.getDay();
        result = result * 59 + ($day == null ? 43 : $day.hashCode());
        Object $number = this.getNumber();
        result = result * 59 + ($number == null ? 43 : $number.hashCode());
        Object $stopnumber = this.getStopnumber();
        result = result * 59 + ($stopnumber == null ? 43 : $stopnumber.hashCode());
        Object $firststation = this.getFirststation();
        result = result * 59 + ($firststation == null ? 43 : $firststation.hashCode());
        Object $cityInfo1 = this.getCityInfo1();
        result = result * 59 + ($cityInfo1 == null ? 43 : $cityInfo1.hashCode());
        Object $laststation = this.getLaststation();
        result = result * 59 + ($laststation == null ? 43 : $laststation.hashCode());
        Object $cityInfo2 = this.getCityInfo2();
        result = result * 59 + ($cityInfo2 == null ? 43 : $cityInfo2.hashCode());
        Object $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        Object $changetime = this.getChangetime();
        result = result * 59 + ($changetime == null ? 43 : $changetime.hashCode());
        Object $modelid = this.getModelid();
        result = result * 59 + ($modelid == null ? 43 : $modelid.hashCode());
        Object $stoplist = this.getStoplist();
        result = result * 59 + ($stoplist == null ? 43 : $stoplist.hashCode());
        return result;
    }
}
