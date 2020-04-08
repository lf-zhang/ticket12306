//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

public class UnsoldTicket {
    private Integer id;
    private Integer trainid;
    private TrainInfo trainInfo;
    private Integer fromstopid;
    private StopInfo fromstop;
    private StopInfo tostop;
    private Integer tostopid;
    private Float price;
    private String seatnumber;
    private String rownumber;
    private String carnumber;
    private Integer seatlevel;

    public TrainInfo getTrainInfo() {
        return this.trainInfo;
    }

    public void setTrainInfo(TrainInfo trainInfo) {
        this.trainInfo = trainInfo;
    }
    @Override
    public String toString() {
        return "UnsoldTicket{id=" + this.id + ", trainid=" + this.trainid + ", trainInfo=" + this.trainInfo + ", fromstopid=" + this.fromstopid + ", fromstop=" + this.fromstop + ", tostop=" + this.tostop + ", tostopid=" + this.tostopid + ", price=" + this.price + ", seatnumber='" + this.seatnumber + '\'' + ", rownumber='" + this.rownumber + '\'' + ", carnumber='" + this.carnumber + '\'' + ", seatlevel=" + this.seatlevel + '}';
    }

    public Integer getTrainid() {
        return this.trainid;
    }

    public void setTrainid(Integer trainid) {
        this.trainid = trainid;
    }

    public Integer getFromstopid() {
        return this.fromstopid;
    }

    public void setFromstopid(Integer fromstopid) {
        this.fromstopid = fromstopid;
    }

    public Integer getTostopid() {
        return this.tostopid;
    }

    public void setTostopid(Integer tostopid) {
        this.tostopid = tostopid;
    }

    public StopInfo getFromstop() {
        return this.fromstop;
    }

    public void setFromstop(StopInfo fromstop) {
        this.fromstop = fromstop;
    }

    public StopInfo getTostop() {
        return this.tostop;
    }

    public void setTostop(StopInfo tostop) {
        this.tostop = tostop;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSeatnumber() {
        return this.seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber == null ? null : seatnumber.trim();
    }

    public String getRownumber() {
        return this.rownumber;
    }

    public void setRownumber(String rownumber) {
        this.rownumber = rownumber == null ? null : rownumber.trim();
    }

    public String getCarnumber() {
        return this.carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public Integer getSeatlevel() {
        return this.seatlevel;
    }

    public void setSeatlevel(Integer seatlevel) {
        this.seatlevel = seatlevel;
    }

    public UnsoldTicket() {
    }

    public UnsoldTicket(final Integer id, final Integer trainid, final TrainInfo trainInfo, final Integer fromstopid, final StopInfo fromstop, final StopInfo tostop, final Integer tostopid, final Float price, final String seatnumber, final String rownumber, final String carnumber, final Integer seatlevel) {
        this.id = id;
        this.trainid = trainid;
        this.trainInfo = trainInfo;
        this.fromstopid = fromstopid;
        this.fromstop = fromstop;
        this.tostop = tostop;
        this.tostopid = tostopid;
        this.price = price;
        this.seatnumber = seatnumber;
        this.rownumber = rownumber;
        this.carnumber = carnumber;
        this.seatlevel = seatlevel;
    }
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof UnsoldTicket)) {
            return false;
        } else {
            UnsoldTicket other = (UnsoldTicket)o;
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

                Object this$trainid = this.getTrainid();
                Object other$trainid = other.getTrainid();
                if (this$trainid == null) {
                    if (other$trainid != null) {
                        return false;
                    }
                } else if (!this$trainid.equals(other$trainid)) {
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

                label134: {
                    Object this$fromstopid = this.getFromstopid();
                    Object other$fromstopid = other.getFromstopid();
                    if (this$fromstopid == null) {
                        if (other$fromstopid == null) {
                            break label134;
                        }
                    } else if (this$fromstopid.equals(other$fromstopid)) {
                        break label134;
                    }

                    return false;
                }

                label127: {
                    Object this$fromstop = this.getFromstop();
                    Object other$fromstop = other.getFromstop();
                    if (this$fromstop == null) {
                        if (other$fromstop == null) {
                            break label127;
                        }
                    } else if (this$fromstop.equals(other$fromstop)) {
                        break label127;
                    }

                    return false;
                }

                label120: {
                    Object this$tostop = this.getTostop();
                    Object other$tostop = other.getTostop();
                    if (this$tostop == null) {
                        if (other$tostop == null) {
                            break label120;
                        }
                    } else if (this$tostop.equals(other$tostop)) {
                        break label120;
                    }

                    return false;
                }

                Object this$tostopid = this.getTostopid();
                Object other$tostopid = other.getTostopid();
                if (this$tostopid == null) {
                    if (other$tostopid != null) {
                        return false;
                    }
                } else if (!this$tostopid.equals(other$tostopid)) {
                    return false;
                }

                label106: {
                    Object this$price = this.getPrice();
                    Object other$price = other.getPrice();
                    if (this$price == null) {
                        if (other$price == null) {
                            break label106;
                        }
                    } else if (this$price.equals(other$price)) {
                        break label106;
                    }

                    return false;
                }

                Object this$seatnumber = this.getSeatnumber();
                Object other$seatnumber = other.getSeatnumber();
                if (this$seatnumber == null) {
                    if (other$seatnumber != null) {
                        return false;
                    }
                } else if (!this$seatnumber.equals(other$seatnumber)) {
                    return false;
                }

                label92: {
                    Object this$rownumber = this.getRownumber();
                    Object other$rownumber = other.getRownumber();
                    if (this$rownumber == null) {
                        if (other$rownumber == null) {
                            break label92;
                        }
                    } else if (this$rownumber.equals(other$rownumber)) {
                        break label92;
                    }

                    return false;
                }

                Object this$carnumber = this.getCarnumber();
                Object other$carnumber = other.getCarnumber();
                if (this$carnumber == null) {
                    if (other$carnumber != null) {
                        return false;
                    }
                } else if (!this$carnumber.equals(other$carnumber)) {
                    return false;
                }

                Object this$seatlevel = this.getSeatlevel();
                Object other$seatlevel = other.getSeatlevel();
                if (this$seatlevel == null) {
                    if (other$seatlevel != null) {
                        return false;
                    }
                } else if (!this$seatlevel.equals(other$seatlevel)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UnsoldTicket;
    }
    @Override
    public int hashCode() {
        int PRIME = 1;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $trainid = this.getTrainid();
        result = result * 59 + ($trainid == null ? 43 : $trainid.hashCode());
        Object $trainInfo = this.getTrainInfo();
        result = result * 59 + ($trainInfo == null ? 43 : $trainInfo.hashCode());
        Object $fromstopid = this.getFromstopid();
        result = result * 59 + ($fromstopid == null ? 43 : $fromstopid.hashCode());
        Object $fromstop = this.getFromstop();
        result = result * 59 + ($fromstop == null ? 43 : $fromstop.hashCode());
        Object $tostop = this.getTostop();
        result = result * 59 + ($tostop == null ? 43 : $tostop.hashCode());
        Object $tostopid = this.getTostopid();
        result = result * 59 + ($tostopid == null ? 43 : $tostopid.hashCode());
        Object $price = this.getPrice();
        result = result * 59 + ($price == null ? 43 : $price.hashCode());
        Object $seatnumber = this.getSeatnumber();
        result = result * 59 + ($seatnumber == null ? 43 : $seatnumber.hashCode());
        Object $rownumber = this.getRownumber();
        result = result * 59 + ($rownumber == null ? 43 : $rownumber.hashCode());
        Object $carnumber = this.getCarnumber();
        result = result * 59 + ($carnumber == null ? 43 : $carnumber.hashCode());
        Object $seatlevel = this.getSeatlevel();
        result = result * 59 + ($seatlevel == null ? 43 : $seatlevel.hashCode());
        return result;
    }
}
