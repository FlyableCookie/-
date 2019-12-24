package entity;

import javax.persistence.*;
import java.sql.Timestamp;

public class TBillEntity {
    private int billId;
    private String billType;
    private Timestamp billTime;
    private double billMoney;
    private String billMethod;
    private int billStatus;
    private Integer employeeId;
    private TResidentsEntity residentsEntity;


    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public TResidentsEntity getResidentsEntity() {
        return residentsEntity;
    }

    public void setResidentsEntity(TResidentsEntity residentsEntity) {
        this.residentsEntity = residentsEntity;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }


    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public Timestamp getBillTime() {
        return billTime;
    }

    public void setBillTime(Timestamp billTime) {
        this.billTime = billTime;
    }

    public double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(double billMoney) {
        this.billMoney = billMoney;
    }

    public String getBillMethod() {
        return billMethod;
    }

    public void setBillMethod(String billMethod) {
        this.billMethod = billMethod;
    }

    public int getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(int billStatus) {
        this.billStatus = billStatus;
    }

    public String toString(){
        return getBillId() + ":" + getBillType() + ":" + getBillTime() + ":" + getBillMoney() +
                ":" +getBillMethod() + ":" +getBillStatus() + ":";
    }

}
