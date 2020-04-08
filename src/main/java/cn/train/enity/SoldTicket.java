//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

public class SoldTicket {
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
    private Integer contactid;
    private Integer orderid;
    private ContactInfo contactInfo;
    @Override
    public String toString() {
        return "SoldTicket{id=" + this.id + ", trainid=" + this.trainid + ", trainInfo=" + this.trainInfo + ", fromstopid=" + this.fromstopid + ", fromstop=" + this.fromstop + ", tostop=" + this.tostop + ", tostopid=" + this.tostopid + ", price=" + this.price + ", seatnumber='" + this.seatnumber + '\'' + ", rownumber='" + this.rownumber + '\'' + ", carnumber='" + this.carnumber + '\'' + ", seatlevel=" + this.seatlevel + ", contactid=" + this.contactid + ", orderid=" + this.orderid + ", contactInfo=" + this.contactInfo + '}';
    }

    public TrainInfo getTrainInfo() {
        return this.trainInfo;
    }

    public void setTrainInfo(TrainInfo trainInfo) {
        this.trainInfo = trainInfo;
    }

    public ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
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

    public Integer getContactid() {
        return this.contactid;
    }

    public void setContactid(Integer contactid) {
        this.contactid = contactid;
    }

    public Integer getOrderid() {
        return this.orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public SoldTicket() {
    }

    public SoldTicket(final Integer id, final Integer trainid, final TrainInfo trainInfo, final Integer fromstopid, final StopInfo fromstop, final StopInfo tostop, final Integer tostopid, final Float price, final String seatnumber, final String rownumber, final String carnumber, final Integer seatlevel, final Integer contactid, final Integer orderid, final ContactInfo contactInfo) {
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
        this.contactid = contactid;
        this.orderid = orderid;
        this.contactInfo = contactInfo;
    }
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SoldTicket)) {
            return false;
        } else {
            SoldTicket other = (SoldTicket)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label191: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label191;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label191;
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

                label170: {
                    Object this$fromstopid = this.getFromstopid();
                    Object other$fromstopid = other.getFromstopid();
                    if (this$fromstopid == null) {
                        if (other$fromstopid == null) {
                            break label170;
                        }
                    } else if (this$fromstopid.equals(other$fromstopid)) {
                        break label170;
                    }

                    return false;
                }

                label163: {
                    Object this$fromstop = this.getFromstop();
                    Object other$fromstop = other.getFromstop();
                    if (this$fromstop == null) {
                        if (other$fromstop == null) {
                            break label163;
                        }
                    } else if (this$fromstop.equals(other$fromstop)) {
                        break label163;
                    }

                    return false;
                }

                Object this$tostop = this.getTostop();
                Object other$tostop = other.getTostop();
                if (this$tostop == null) {
                    if (other$tostop != null) {
                        return false;
                    }
                } else if (!this$tostop.equals(other$tostop)) {
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

                label142: {
                    Object this$price = this.getPrice();
                    Object other$price = other.getPrice();
                    if (this$price == null) {
                        if (other$price == null) {
                            break label142;
                        }
                    } else if (this$price.equals(other$price)) {
                        break label142;
                    }

                    return false;
                }

                label135: {
                    Object this$seatnumber = this.getSeatnumber();
                    Object other$seatnumber = other.getSeatnumber();
                    if (this$seatnumber == null) {
                        if (other$seatnumber == null) {
                            break label135;
                        }
                    } else if (this$seatnumber.equals(other$seatnumber)) {
                        break label135;
                    }

                    return false;
                }

                Object this$rownumber = this.getRownumber();
                Object other$rownumber = other.getRownumber();
                if (this$rownumber == null) {
                    if (other$rownumber != null) {
                        return false;
                    }
                } else if (!this$rownumber.equals(other$rownumber)) {
                    return false;
                }

                label121: {
                    Object this$carnumber = this.getCarnumber();
                    Object other$carnumber = other.getCarnumber();
                    if (this$carnumber == null) {
                        if (other$carnumber == null) {
                            break label121;
                        }
                    } else if (this$carnumber.equals(other$carnumber)) {
                        break label121;
                    }

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

                label107: {
                    Object this$contactid = this.getContactid();
                    Object other$contactid = other.getContactid();
                    if (this$contactid == null) {
                        if (other$contactid == null) {
                            break label107;
                        }
                    } else if (this$contactid.equals(other$contactid)) {
                        break label107;
                    }

                    return false;
                }

                Object this$orderid = this.getOrderid();
                Object other$orderid = other.getOrderid();
                if (this$orderid == null) {
                    if (other$orderid != null) {
                        return false;
                    }
                } else if (!this$orderid.equals(other$orderid)) {
                    return false;
                }

                Object this$contactInfo = this.getContactInfo();
                Object other$contactInfo = other.getContactInfo();
                if (this$contactInfo == null) {
                    if (other$contactInfo != null) {
                        return false;
                    }
                } else if (!this$contactInfo.equals(other$contactInfo)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SoldTicket;
    }
@Override
    public int hashCode() {
        int PRIME = 0;
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
        Object $contactid = this.getContactid();
        result = result * 59 + ($contactid == null ? 43 : $contactid.hashCode());
        Object $orderid = this.getOrderid();
        result = result * 59 + ($orderid == null ? 43 : $orderid.hashCode());
        Object $contactInfo = this.getContactInfo();
        result = result * 59 + ($contactInfo == null ? 43 : $contactInfo.hashCode());
        return result;
    }
}
