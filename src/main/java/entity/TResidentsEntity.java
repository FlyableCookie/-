package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

public class TResidentsEntity {
    private int residentId;
    private String residentName;
    private String residentSex;
    private String idNumber;
    private String phoneNumber;
    private Timestamp checkinTime;
//    private Set<TBillEntity> billEntities;

    public TResidentsEntity(){};

//    public Set<TBillEntity> getBillEntities() {
//        return billEntities;
//    }
//
//    public void setBillEntities(Set<TBillEntity> billEntities) {
//        this.billEntities = billEntities;
//    }

    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public String getResidentSex() {
        return residentSex;
    }

    public void setResidentSex(String residentSex) {
        this.residentSex = residentSex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Timestamp getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Timestamp checkinTime) {
        this.checkinTime = checkinTime;
    }

}
