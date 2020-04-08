
package cn.train.enity;

public class CityInfo {
    private Integer id;
    private String name;
    private String saletime;
    private String address;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSaletime() {
        return this.saletime;
    }

    public void setSaletime(String saletime) {
        this.saletime = saletime == null ? null : saletime.trim();
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    @Override
    public String toString() {
        return "CityInfo{id=" + this.id + ", name='" + this.name + '\'' + ", saletime='" + this.saletime + '\'' + ", address='" + this.address + '\'' + '}';
    }

    public CityInfo() {
    }

    public CityInfo(final Integer id, final String name, final String saletime, final String address) {
        this.id = id;
        this.name = name;
        this.saletime = saletime;
        this.address = address;
    }
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CityInfo)) {
            return false;
        } else {
            CityInfo other = (CityInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label59;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label59;
                    }

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

                Object this$saletime = this.getSaletime();
                Object other$saletime = other.getSaletime();
                if (this$saletime == null) {
                    if (other$saletime != null) {
                        return false;
                    }
                } else if (!this$saletime.equals(other$saletime)) {
                    return false;
                }

                Object this$address = this.getAddress();
                Object other$address = other.getAddress();
                if (this$address == null) {
                    if (other$address != null) {
                        return false;
                    }
                } else if (!this$address.equals(other$address)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CityInfo;
    }
    @Override
    public int hashCode() {
        int PRIME = 0;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $saletime = this.getSaletime();
        result = result * 59 + ($saletime == null ? 43 : $saletime.hashCode());
        Object $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        return result;
    }
}
