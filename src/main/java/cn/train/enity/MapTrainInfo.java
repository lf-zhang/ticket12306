//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package cn.train.enity;

public class MapTrainInfo {
    private Integer id;
    private String number;
    private Integer modelid;
    private TrainModel trainModel;
    private Integer firststation;
    private CityInfo firstcity;
    private CityInfo lastcity;
    private Integer laststation;
    private Integer stopnumber;
    @Override
    public String toString() {
        return "MapTrainInfo{id=" + this.id + ", number='" + this.number + '\'' + ", modelid=" + this.modelid + ", trainModel=" + this.trainModel + ", firststation=" + this.firststation + ", firstcity=" + this.firstcity + ", lastcity=" + this.lastcity + ", laststation=" + this.laststation + ", stopnumber=" + this.stopnumber + '}';
    }

    public TrainModel getTrainModel() {
        return this.trainModel;
    }

    public void setTrainModel(TrainModel trainModel) {
        this.trainModel = trainModel;
    }

    public CityInfo getFirstcity() {
        return this.firstcity;
    }

    public void setFirstcity(CityInfo firstcity) {
        this.firstcity = firstcity;
    }

    public CityInfo getLastcity() {
        return this.lastcity;
    }

    public void setLastcity(CityInfo lastcity) {
        this.lastcity = lastcity;
    }

    public Integer getModelid() {
        return this.modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public Integer getFirststation() {
        return this.firststation;
    }

    public void setFirststation(Integer firststation) {
        this.firststation = firststation;
    }

    public Integer getLaststation() {
        return this.laststation;
    }

    public void setLaststation(Integer laststation) {
        this.laststation = laststation;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getStopnumber() {
        return this.stopnumber;
    }

    public void setStopnumber(Integer stopnumber) {
        this.stopnumber = stopnumber;
    }

    public MapTrainInfo() {
    }

    public MapTrainInfo(final Integer id, final String number, final Integer modelid, final TrainModel trainModel, final Integer firststation, final CityInfo firstcity, final CityInfo lastcity, final Integer laststation, final Integer stopnumber) {
        this.id = id;
        this.number = number;
        this.modelid = modelid;
        this.trainModel = trainModel;
        this.firststation = firststation;
        this.firstcity = firstcity;
        this.lastcity = lastcity;
        this.laststation = laststation;
        this.stopnumber = stopnumber;
    }
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof MapTrainInfo)) {
            return false;
        } else {
            MapTrainInfo other = (MapTrainInfo)o;
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

                Object this$number = this.getNumber();
                Object other$number = other.getNumber();
                if (this$number == null) {
                    if (other$number != null) {
                        return false;
                    }
                } else if (!this$number.equals(other$number)) {
                    return false;
                }

                label105: {
                    Object this$modelid = this.getModelid();
                    Object other$modelid = other.getModelid();
                    if (this$modelid == null) {
                        if (other$modelid == null) {
                            break label105;
                        }
                    } else if (this$modelid.equals(other$modelid)) {
                        break label105;
                    }

                    return false;
                }

                Object this$trainModel = this.getTrainModel();
                Object other$trainModel = other.getTrainModel();
                if (this$trainModel == null) {
                    if (other$trainModel != null) {
                        return false;
                    }
                } else if (!this$trainModel.equals(other$trainModel)) {
                    return false;
                }

                label91: {
                    Object this$firststation = this.getFirststation();
                    Object other$firststation = other.getFirststation();
                    if (this$firststation == null) {
                        if (other$firststation == null) {
                            break label91;
                        }
                    } else if (this$firststation.equals(other$firststation)) {
                        break label91;
                    }

                    return false;
                }

                Object this$firstcity = this.getFirstcity();
                Object other$firstcity = other.getFirstcity();
                if (this$firstcity == null) {
                    if (other$firstcity != null) {
                        return false;
                    }
                } else if (!this$firstcity.equals(other$firstcity)) {
                    return false;
                }

                label77: {
                    Object this$lastcity = this.getLastcity();
                    Object other$lastcity = other.getLastcity();
                    if (this$lastcity == null) {
                        if (other$lastcity == null) {
                            break label77;
                        }
                    } else if (this$lastcity.equals(other$lastcity)) {
                        break label77;
                    }

                    return false;
                }

                label70: {
                    Object this$laststation = this.getLaststation();
                    Object other$laststation = other.getLaststation();
                    if (this$laststation == null) {
                        if (other$laststation == null) {
                            break label70;
                        }
                    } else if (this$laststation.equals(other$laststation)) {
                        break label70;
                    }

                    return false;
                }

                Object this$stopnumber = this.getStopnumber();
                Object other$stopnumber = other.getStopnumber();
                if (this$stopnumber == null) {
                    if (other$stopnumber != null) {
                        return false;
                    }
                } else if (!this$stopnumber.equals(other$stopnumber)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MapTrainInfo;
    }
@Override
    public int hashCode() {
        int PRIME = 0;
        int result = 1;
        Object $id = this.getId();
         result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $number = this.getNumber();
        result = result * 59 + ($number == null ? 43 : $number.hashCode());
        Object $modelid = this.getModelid();
        result = result * 59 + ($modelid == null ? 43 : $modelid.hashCode());
        Object $trainModel = this.getTrainModel();
        result = result * 59 + ($trainModel == null ? 43 : $trainModel.hashCode());
        Object $firststation = this.getFirststation();
        result = result * 59 + ($firststation == null ? 43 : $firststation.hashCode());
        Object $firstcity = this.getFirstcity();
        result = result * 59 + ($firstcity == null ? 43 : $firstcity.hashCode());
        Object $lastcity = this.getLastcity();
        result = result * 59 + ($lastcity == null ? 43 : $lastcity.hashCode());
        Object $laststation = this.getLaststation();
        result = result * 59 + ($laststation == null ? 43 : $laststation.hashCode());
        Object $stopnumber = this.getStopnumber();
        result = result * 59 + ($stopnumber == null ? 43 : $stopnumber.hashCode());
        return result;
    }
}
