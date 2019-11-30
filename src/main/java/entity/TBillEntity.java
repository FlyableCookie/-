package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_bill", schema = "cpms")
public class TBillEntity {
    private int billId;
    private int residentId;
    private String billType;
    private Timestamp billTime;
    private double billMoney;
    private String billMethod;
    private byte billStatus;

    @Id
    @Column(name = "BillID")
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
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
    @Column(name = "BillType")
    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    @Basic
    @Column(name = "BillTime")
    public Timestamp getBillTime() {
        return billTime;
    }

    public void setBillTime(Timestamp billTime) {
        this.billTime = billTime;
    }

    @Basic
    @Column(name = "BillMoney")
    public double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(double billMoney) {
        this.billMoney = billMoney;
    }

    @Basic
    @Column(name = "BillMethod")
    public String getBillMethod() {
        return billMethod;
    }

    public void setBillMethod(String billMethod) {
        this.billMethod = billMethod;
    }

    @Basic
    @Column(name = "BillStatus")
    public byte getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(byte billStatus) {
        this.billStatus = billStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBillEntity that = (TBillEntity) o;

        if (billId != that.billId) return false;
        if (residentId != that.residentId) return false;
        if (Double.compare(that.billMoney, billMoney) != 0) return false;
        if (billStatus != that.billStatus) return false;
        if (billType != null ? !billType.equals(that.billType) : that.billType != null) return false;
        if (billTime != null ? !billTime.equals(that.billTime) : that.billTime != null) return false;
        if (billMethod != null ? !billMethod.equals(that.billMethod) : that.billMethod != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = billId;
        result = 31 * result + residentId;
        result = 31 * result + (billType != null ? billType.hashCode() : 0);
        result = 31 * result + (billTime != null ? billTime.hashCode() : 0);
        temp = Double.doubleToLongBits(billMoney);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (billMethod != null ? billMethod.hashCode() : 0);
        result = 31 * result + (int) billStatus;
        return result;
    }
}
