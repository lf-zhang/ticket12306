//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

public class Search {
    private int cityid1;
    private int cityid2;
    private String day1;
    private String day2;
    private int trainid;
    @Override
    public String toString() {
        return "Search{cityid1=" + this.cityid1 + ", cityid2=" + this.cityid2 + ", day1='" + this.day1 + '\'' + ", day2='" + this.day2 + '\'' + ", trainid=" + this.trainid + '}';
    }

    public int getTrainid() {
        return this.trainid;
    }

    public void setTrainid(int trainid) {
        this.trainid = trainid;
    }

    public String getDay2() {
        return this.day2;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public int getCityid1() {
        return this.cityid1;
    }

    public void setCityid1(int cityid1) {
        this.cityid1 = cityid1;
    }

    public int getCityid2() {
        return this.cityid2;
    }

    public void setCityid2(int cityid2) {
        this.cityid2 = cityid2;
    }

    public String getDay1() {
        return this.day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public Search() {
    }

    public Search(final int cityid1, final int cityid2, final String day1, final String day2, final int trainid) {
        this.cityid1 = cityid1;
        this.cityid2 = cityid2;
        this.day1 = day1;
        this.day2 = day2;
        this.trainid = trainid;
    }
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Search)) {
            return false;
        } else {
            Search other = (Search)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCityid1() != other.getCityid1()) {
                return false;
            } else if (this.getCityid2() != other.getCityid2()) {
                return false;
            } else {
                label44: {
                    Object this$day1 = this.getDay1();
                    Object other$day1 = other.getDay1();
                    if (this$day1 == null) {
                        if (other$day1 == null) {
                            break label44;
                        }
                    } else if (this$day1.equals(other$day1)) {
                        break label44;
                    }

                    return false;
                }

                Object this$day2 = this.getDay2();
                Object other$day2 = other.getDay2();
                if (this$day2 == null) {
                    if (other$day2 != null) {
                        return false;
                    }
                } else if (!this$day2.equals(other$day2)) {
                    return false;
                }

                if (this.getTrainid() != other.getTrainid()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Search;
    }
    @Override
    public int hashCode() {
        int PRIME = 0;
        int result = 1;
         result = result * 59 + this.getCityid1();
        result = result * 59 + this.getCityid2();
        Object $day1 = this.getDay1();
        result = result * 59 + ($day1 == null ? 43 : $day1.hashCode());
        Object $day2 = this.getDay2();
        result = result * 59 + ($day2 == null ? 43 : $day2.hashCode());
        result = result * 59 + this.getTrainid();
        return result;
    }
}
