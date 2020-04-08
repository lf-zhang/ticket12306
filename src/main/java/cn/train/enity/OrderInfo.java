//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

import java.util.List;

public class OrderInfo {
    private Integer id;
    private Integer userid;
    private String createdate;
    private String paydate;
    private Float price;
    private Integer status;
    private Integer mark;
    private List<SoldTicket> tickets;
    @Override
    public String toString() {
        return "OrderInfo{id=" + this.id + ", userid=" + this.userid + ", createdate='" + this.createdate + '\'' + ", paydate='" + this.paydate + '\'' + ", price=" + this.price + ", status=" + this.status + ", mark=" + this.mark + ", tickets=" + this.tickets + '}';
    }

    public List<SoldTicket> getTickets() {
        return this.tickets;
    }

    public void setTickets(List<SoldTicket> tickets) {
        this.tickets = tickets;
    }

    public Integer getMark() {
        return this.mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

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

    public String getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getPaydate() {
        return this.paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate == null ? null : paydate.trim();
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public OrderInfo() {
    }

    public OrderInfo(final Integer id, final Integer userid, final String createdate, final String paydate, final Float price, final Integer status, final Integer mark, final List<SoldTicket> tickets) {
        this.id = id;
        this.userid = userid;
        this.createdate = createdate;
        this.paydate = paydate;
        this.price = price;
        this.status = status;
        this.mark = mark;
        this.tickets = tickets;
    }
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof OrderInfo)) {
            return false;
        } else {
            OrderInfo other = (OrderInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label107: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label107;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label107;
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

                Object this$createdate = this.getCreatedate();
                Object other$createdate = other.getCreatedate();
                if (this$createdate == null) {
                    if (other$createdate != null) {
                        return false;
                    }
                } else if (!this$createdate.equals(other$createdate)) {
                    return false;
                }

                label86: {
                    Object this$paydate = this.getPaydate();
                    Object other$paydate = other.getPaydate();
                    if (this$paydate == null) {
                        if (other$paydate == null) {
                            break label86;
                        }
                    } else if (this$paydate.equals(other$paydate)) {
                        break label86;
                    }

                    return false;
                }

                label79: {
                    Object this$price = this.getPrice();
                    Object other$price = other.getPrice();
                    if (this$price == null) {
                        if (other$price == null) {
                            break label79;
                        }
                    } else if (this$price.equals(other$price)) {
                        break label79;
                    }

                    return false;
                }

                label72: {
                    Object this$status = this.getStatus();
                    Object other$status = other.getStatus();
                    if (this$status == null) {
                        if (other$status == null) {
                            break label72;
                        }
                    } else if (this$status.equals(other$status)) {
                        break label72;
                    }

                    return false;
                }

                Object this$mark = this.getMark();
                Object other$mark = other.getMark();
                if (this$mark == null) {
                    if (other$mark != null) {
                        return false;
                    }
                } else if (!this$mark.equals(other$mark)) {
                    return false;
                }

                Object this$tickets = this.getTickets();
                Object other$tickets = other.getTickets();
                if (this$tickets == null) {
                    if (other$tickets != null) {
                        return false;
                    }
                } else if (!this$tickets.equals(other$tickets)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderInfo;
    }
@Override
    public int hashCode() {
        int PRIME = 0;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $userid = this.getUserid();
        result = result * 59 + ($userid == null ? 43 : $userid.hashCode());
        Object $createdate = this.getCreatedate();
        result = result * 59 + ($createdate == null ? 43 : $createdate.hashCode());
        Object $paydate = this.getPaydate();
        result = result * 59 + ($paydate == null ? 43 : $paydate.hashCode());
        Object $price = this.getPrice();
        result = result * 59 + ($price == null ? 43 : $price.hashCode());
        Object $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        Object $mark = this.getMark();
        result = result * 59 + ($mark == null ? 43 : $mark.hashCode());
        Object $tickets = this.getTickets();
        result = result * 59 + ($tickets == null ? 43 : $tickets.hashCode());
        return result;
    }
}
