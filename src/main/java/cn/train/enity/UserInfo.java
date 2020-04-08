//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

public class UserInfo {
    private Integer id;
    private String username;
    private String name;
    private String password;
    private String idnumber;
    private String email;
    private String phone;
    private Integer traveltype;
    private Integer sex;
    private String discountnumber;
    private Integer status;

    @Override
    public String toString() {
        return "UserInfo{id=" + this.id + ", username='" + this.username + '\'' + ", name='" + this.name + '\'' + ", password='" + this.password + '\'' + ", idnumber='" + this.idnumber + '\'' + ", email='" + this.email + '\'' + ", phone='" + this.phone + '\'' + ", traveltype=" + this.traveltype + ", sex=" + this.sex + ", discountnumber='" + this.discountnumber + '\'' + ", status=" + this.status + '}';
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getIdnumber() {
        return this.idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getTraveltype() {
        return this.traveltype;
    }

    public void setTraveltype(Integer traveltype) {
        this.traveltype = traveltype;
    }

    public String getDiscountnumber() {
        return this.discountnumber;
    }

    public void setDiscountnumber(String discountnumber) {
        this.discountnumber = discountnumber == null ? null : discountnumber.trim();
    }

    public UserInfo() {
    }

    public UserInfo(final Integer id, final String username, final String name, final String password, final String idnumber, final String email, final String phone, final Integer traveltype, final Integer sex, final String discountnumber, final Integer status) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
        this.idnumber = idnumber;
        this.email = email;
        this.phone = phone;
        this.traveltype = traveltype;
        this.sex = sex;
        this.discountnumber = discountnumber;
        this.status = status;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof UserInfo)) {
            return false;
        } else {
            UserInfo other = (UserInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label143: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label143;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label143;
                    }

                    return false;
                }

                Object this$username = this.getUsername();
                Object other$username = other.getUsername();
                if (this$username == null) {
                    if (other$username != null) {
                        return false;
                    }
                } else if (!this$username.equals(other$username)) {
                    return false;
                }

                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                label122: {
                    Object this$password = this.getPassword();
                    Object other$password = other.getPassword();
                    if (this$password == null) {
                        if (other$password == null) {
                            break label122;
                        }
                    } else if (this$password.equals(other$password)) {
                        break label122;
                    }

                    return false;
                }

                label115: {
                    Object this$idnumber = this.getIdnumber();
                    Object other$idnumber = other.getIdnumber();
                    if (this$idnumber == null) {
                        if (other$idnumber == null) {
                            break label115;
                        }
                    } else if (this$idnumber.equals(other$idnumber)) {
                        break label115;
                    }

                    return false;
                }

                Object this$email = this.getEmail();
                Object other$email = other.getEmail();
                if (this$email == null) {
                    if (other$email != null) {
                        return false;
                    }
                } else if (!this$email.equals(other$email)) {
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

                label94: {
                    Object this$traveltype = this.getTraveltype();
                    Object other$traveltype = other.getTraveltype();
                    if (this$traveltype == null) {
                        if (other$traveltype == null) {
                            break label94;
                        }
                    } else if (this$traveltype.equals(other$traveltype)) {
                        break label94;
                    }

                    return false;
                }

                label87: {
                    Object this$sex = this.getSex();
                    Object other$sex = other.getSex();
                    if (this$sex == null) {
                        if (other$sex == null) {
                            break label87;
                        }
                    } else if (this$sex.equals(other$sex)) {
                        break label87;
                    }

                    return false;
                }

                Object this$discountnumber = this.getDiscountnumber();
                Object other$discountnumber = other.getDiscountnumber();
                if (this$discountnumber == null) {
                    if (other$discountnumber != null) {
                        return false;
                    }
                } else if (!this$discountnumber.equals(other$discountnumber)) {
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

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserInfo;
    }
    @Override
    public int hashCode() {
        int PRIME = 1;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        Object $idnumber = this.getIdnumber();
        result = result * 59 + ($idnumber == null ? 43 : $idnumber.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $phone = this.getPhone();
        result = result * 59 + ($phone == null ? 43 : $phone.hashCode());
        Object $traveltype = this.getTraveltype();
        result = result * 59 + ($traveltype == null ? 43 : $traveltype.hashCode());
        Object $sex = this.getSex();
        result = result * 59 + ($sex == null ? 43 : $sex.hashCode());
        Object $discountnumber = this.getDiscountnumber();
        result = result * 59 + ($discountnumber == null ? 43 : $discountnumber.hashCode());
        Object $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        return result;
    }
}
