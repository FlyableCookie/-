package entity;

import javax.persistence.*;

@Entity
@Table(name = "t_house", schema = "cpms")
public class THouseEntity {
    private int houseId;
    private String houseNo;
    private String unitNo;

    @Id
    @Column(name = "HouseID")
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    @Basic
    @Column(name = "HouseNo")
    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    @Basic
    @Column(name = "UnitNo")
    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        THouseEntity that = (THouseEntity) o;

        if (houseId != that.houseId) return false;
        if (houseNo != null ? !houseNo.equals(that.houseNo) : that.houseNo != null) return false;
        if (unitNo != null ? !unitNo.equals(that.unitNo) : that.unitNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = houseId;
        result = 31 * result + (houseNo != null ? houseNo.hashCode() : 0);
        result = 31 * result + (unitNo != null ? unitNo.hashCode() : 0);
        return result;
    }
}
