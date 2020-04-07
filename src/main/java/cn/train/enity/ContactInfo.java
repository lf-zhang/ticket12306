package cn.train.enity;

import java.util.Objects;

public class ContactInfo {
    private Integer id;

    private Integer userid;

    private String name;

    private String idnumber;

    private Integer sex;

    private String phone;

    private String email;

    private Integer traveltype;

    private String discountcard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getTraveltype() {
        return traveltype;
    }

    public void setTraveltype(Integer traveltype) {
        this.traveltype = traveltype;
    }

    public String getDiscountcard() {
        return discountcard;
    }

    public void setDiscountcard(String discountcard) {
        this.discountcard = discountcard == null ? null : discountcard.trim();
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "id=" + id +
                ", userid=" + userid +
                ", name='" + name + '\'' +
                ", idnumber='" + idnumber + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", traveltype=" + traveltype +
                ", discountcard='" + discountcard + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactInfo that = (ContactInfo) o;
        return Objects.equals(userid, that.userid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(idnumber, that.idnumber) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(email, that.email) &&
                Objects.equals(traveltype, that.traveltype) &&
                Objects.equals(discountcard, that.discountcard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, name, idnumber, sex, phone, email, traveltype, discountcard);
    }
}