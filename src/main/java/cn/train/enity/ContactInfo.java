//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

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
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdnumber() {
        return this.idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getTraveltype() {
        return this.traveltype;
    }

    public void setTraveltype(Integer traveltype) {
        this.traveltype = traveltype;
    }

    public String getDiscountcard() {
        return this.discountcard;
    }

    public void setDiscountcard(String discountcard) {
        this.discountcard = discountcard == null ? null : discountcard.trim();
    }

    @Override
    public String toString() {
        return "ContactInfo{id=" + this.id + ", userid=" + this.userid + ", name='" + this.name + '\'' + ", idnumber='" + this.idnumber + '\'' + ", sex=" + this.sex + ", phone='" + this.phone + '\'' + ", email='" + this.email + '\'' + ", traveltype=" + this.traveltype + ", discountcard='" + this.discountcard + '\'' + '}';
    }

    public ContactInfo() {
    }

    public ContactInfo(final Integer id, final Integer userid, final String name, final String idnumber, final Integer sex, final String phone, final String email, final Integer traveltype, final String discountcard) {
        this.id = id;
        this.userid = userid;
        this.name = name;
        this.idnumber = idnumber;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.traveltype = traveltype;
        this.discountcard = discountcard;
    }
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ContactInfo)) {
            return false;
        } else {
            ContactInfo other = (ContactInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label119: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label119;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label119;
                    }

                    return false;
                }

                Object this$userid = this.getUserid();
                Object other$userid = other.getUserid();
                if (this$userid == null) {
                    if (other$userid != null) {
                        return false;
                    }
                } else if (!this$userid.equals(other$userid)) {
                    return false;
                }

                label105: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label105;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label105;
                    }

                    return false;
                }

                Object this$idnumber = this.getIdnumber();
                Object other$idnumber = other.getIdnumber();
                if (this$idnumber == null) {
                    if (other$idnumber != null) {
                        return false;
                    }
                } else if (!this$idnumber.equals(other$idnumber)) {
                    return false;
                }

                label91: {
                    Object this$sex = this.getSex();
                    Object other$sex = other.getSex();
                    if (this$sex == null) {
                        if (other$sex == null) {
                            break label91;
                        }
                    } else if (this$sex.equals(other$sex)) {
                        break label91;
                    }

                    return false;
                }

                Object this$phone = this.getPhone();
                Object other$phone = other.getPhone();
                if (this$phone == null) {
                    if (other$phone != null) {
                        return false;
                    }
                } else if (!this$phone.equals(other$phone)) {
                    return false;
                }

                label77: {
                    Object this$email = this.getEmail();
                    Object other$email = other.getEmail();
                    if (this$email == null) {
                        if (other$email == null) {
                            break label77;
                        }
                    } else if (this$email.equals(other$email)) {
                        break label77;
                    }

                    return false;
                }

                label70: {
                    Object this$traveltype = this.getTraveltype();
                    Object other$traveltype = other.getTraveltype();
                    if (this$traveltype == null) {
                        if (other$traveltype == null) {
                            break label70;
                        }
                    } else if (this$traveltype.equals(other$traveltype)) {
                        break label70;
                    }

                    return false;
                }

                Object this$discountcard = this.getDiscountcard();
                Object other$discountcard = other.getDiscountcard();
                if (this$discountcard == null) {
                    if (other$discountcard != null) {
                        return false;
                    }
                } else if (!this$discountcard.equals(other$discountcard)) {
                    return false;
                }

                return true;
            }
        }
    }
    protected boolean canEqual(final Object other) {
        return other instanceof ContactInfo;
    }
    @Override
    public int hashCode() {
        int PRIME = 0;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $userid = this.getUserid();
        result = result * 59 + ($userid == null ? 43 : $userid.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $idnumber = this.getIdnumber();
        result = result * 59 + ($idnumber == null ? 43 : $idnumber.hashCode());
        Object $sex = this.getSex();
        result = result * 59 + ($sex == null ? 43 : $sex.hashCode());
        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $traveltype = this.getTraveltype();
        result = result * 59 + ($traveltype == null ? 43 : $traveltype.hashCode());
        Object $discountcard = this.getDiscountcard();
        result = result * 59 + ($discountcard == null ? 43 : $discountcard.hashCode());
        return result;
    }
}
