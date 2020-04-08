//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

public class SeatInfo {
    private Integer id;
    private Integer modelid;
    private Integer seatlevel;
    private String carnumber;
    private String rownumber;
    private String seatnumber;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModelid() {
        return this.modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public Integer getSeatlevel() {
        return this.seatlevel;
    }

    public void setSeatlevel(Integer seatlevel) {
        this.seatlevel = seatlevel;
    }

    public String getCarnumber() {
        return this.carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public String getRownumber() {
        return this.rownumber;
    }

    public void setRownumber(String rownumber) {
        this.rownumber = rownumber == null ? null : rownumber.trim();
    }

    public String getSeatnumber() {
        return this.seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber == null ? null : seatnumber.trim();
    }

    public SeatInfo() {
    }

    public SeatInfo(final Integer id, final Integer modelid, final Integer seatlevel, final String carnumber, final String rownumber, final String seatnumber) {
        this.id = id;
        this.modelid = modelid;
        this.seatlevel = seatlevel;
        this.carnumber = carnumber;
        this.rownumber = rownumber;
        this.seatnumber = seatnumber;
    }
    @Override
    public String toString() {
        return "SeatInfo(id=" + this.getId() + ", modelid=" + this.getModelid() + ", seatlevel=" + this.getSeatlevel() + ", carnumber=" + this.getCarnumber() + ", rownumber=" + this.getRownumber() + ", seatnumber=" + this.getSeatnumber() + ")";
    }
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SeatInfo)) {
            return false;
        } else {
            SeatInfo other = (SeatInfo)o;
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

                Object this$modelid = this.getModelid();
                Object other$modelid = other.getModelid();
                if (this$modelid == null) {
                    if (other$modelid != null) {
                        return false;
                    }
                } else if (!this$modelid.equals(other$modelid)) {
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

                label62: {
                    Object this$carnumber = this.getCarnumber();
                    Object other$carnumber = other.getCarnumber();
                    if (this$carnumber == null) {
                        if (other$carnumber == null) {
                            break label62;
                        }
                    } else if (this$carnumber.equals(other$carnumber)) {
                        break label62;
                    }

                    return false;
                }

                label55: {
                    Object this$rownumber = this.getRownumber();
                    Object other$rownumber = other.getRownumber();
                    if (this$rownumber == null) {
                        if (other$rownumber == null) {
                            break label55;
                        }
                    } else if (this$rownumber.equals(other$rownumber)) {
                        break label55;
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

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SeatInfo;
    }
@Override
    public int hashCode() {
        int PRIME = 0;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $modelid = this.getModelid();
        result = result * 59 + ($modelid == null ? 43 : $modelid.hashCode());
        Object $seatlevel = this.getSeatlevel();
        result = result * 59 + ($seatlevel == null ? 43 : $seatlevel.hashCode());
        Object $carnumber = this.getCarnumber();
        result = result * 59 + ($carnumber == null ? 43 : $carnumber.hashCode());
        Object $rownumber = this.getRownumber();
        result = result * 59 + ($rownumber == null ? 43 : $rownumber.hashCode());
        Object $seatnumber = this.getSeatnumber();
        result = result * 59 + ($seatnumber == null ? 43 : $seatnumber.hashCode());
        return result;
    }
}
