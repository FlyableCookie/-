package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_repair", schema = "cpms")
public class TRepairEntity {
    private int repairId;
    private int residentId;
    private String repairType;
    private String repairContent;
    private Timestamp repairTime;
    private String repairFback;
    private Double repairMoney;

    @Id
    @Column(name = "RepairID")
    public int getRepairId() {
        return repairId;
    }

    public void setRepairId(int repairId) {
        this.repairId = repairId;
    }

    @Basic
    @Column(name = "ResidentID")
    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    @Basic
    @Column(name = "RepairType")
    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    @Basic
    @Column(name = "RepairContent")
    public String getRepairContent() {
        return repairContent;
    }

    public void setRepairContent(String repairContent) {
        this.repairContent = repairContent;
    }

    @Basic
    @Column(name = "RepairTime")
    public Timestamp getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Timestamp repairTime) {
        this.repairTime = repairTime;
    }

    @Basic
    @Column(name = "RepairFback")
    public String getRepairFback() {
        return repairFback;
    }

    public void setRepairFback(String repairFback) {
        this.repairFback = repairFback;
    }

    @Basic
    @Column(name = "RepairMoney")
    public Double getRepairMoney() {
        return repairMoney;
    }

    public void setRepairMoney(Double repairMoney) {
        this.repairMoney = repairMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TRepairEntity that = (TRepairEntity) o;

        if (repairId != that.repairId) return false;
        if (residentId != that.residentId) return false;
        if (repairType != null ? !repairType.equals(that.repairType) : that.repairType != null) return false;
        if (repairContent != null ? !repairContent.equals(that.repairContent) : that.repairContent != null)
            return false;
        if (repairTime != null ? !repairTime.equals(that.repairTime) : that.repairTime != null) return false;
        if (repairFback != null ? !repairFback.equals(that.repairFback) : that.repairFback != null) return false;
        if (repairMoney != null ? !repairMoney.equals(that.repairMoney) : that.repairMoney != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repairId;
        result = 31 * result + residentId;
        result = 31 * result + (repairType != null ? repairType.hashCode() : 0);
        result = 31 * result + (repairContent != null ? repairContent.hashCode() : 0);
        result = 31 * result + (repairTime != null ? repairTime.hashCode() : 0);
        result = 31 * result + (repairFback != null ? repairFback.hashCode() : 0);
        result = 31 * result + (repairMoney != null ? repairMoney.hashCode() : 0);
        return result;
    }
}
