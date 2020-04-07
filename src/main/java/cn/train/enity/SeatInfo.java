package cn.train.enity;

import java.util.Objects;

public class SeatInfo {
    private Integer id;

    private Integer modelid;

    private Integer seatlevel;

    private String carnumber;

    private String rownumber;

    private String seatnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public Integer getSeatlevel() {
        return seatlevel;
    }

    public void setSeatlevel(Integer seatlevel) {
        this.seatlevel = seatlevel;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public String getRownumber() {
        return rownumber;
    }

    public void setRownumber(String rownumber) {
        this.rownumber = rownumber == null ? null : rownumber.trim();
    }

    public String getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber == null ? null : seatnumber.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeatInfo seatInfo = (SeatInfo) o;
        return Objects.equals(modelid, seatInfo.modelid) &&
                Objects.equals(seatlevel, seatInfo.seatlevel) &&
                Objects.equals(carnumber, seatInfo.carnumber) &&
                Objects.equals(rownumber, seatInfo.rownumber) &&
                Objects.equals(seatnumber, seatInfo.seatnumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelid, seatlevel, carnumber, rownumber, seatnumber);
    }
}