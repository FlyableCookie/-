package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_residents", schema = "cpms")
public class TResidentsEntity {
    private int residentId;
    private String residentName;
    private String residentSex;
    private String idNumber;
    private String phoneNumber;
    private Timestamp checkinTime;

    @Id
    @Column(name = "ResidentID")
    public int getResidentId() {
        return residentId;
    }

    public void setResidentId(int residentId) {
        this.residentId = residentId;
    }

    @Basic
    @Column(name = "ResidentName")
    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    @Basic
    @Column(name = "ResidentSex")
    public String getResidentSex() {
        return residentSex;
    }

    public void setResidentSex(String residentSex) {
        this.residentSex = residentSex;
    }

    @Basic
    @Column(name = "IdNumber")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Basic
    @Column(name = "PhoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "CheckinTime")
    public Timestamp getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Timestamp checkinTime) {
        this.checkinTime = checkinTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TResidentsEntity that = (TResidentsEntity) o;

        if (residentId != that.residentId) return false;
        if (residentName != null ? !residentName.equals(that.residentName) : that.residentName != null) return false;
        if (residentSex != null ? !residentSex.equals(that.residentSex) : that.residentSex != null) return false;
        if (idNumber != null ? !idNumber.equals(that.idNumber) : that.idNumber != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (checkinTime != null ? !checkinTime.equals(that.checkinTime) : that.checkinTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = residentId;
        result = 31 * result + (residentName != null ? residentName.hashCode() : 0);
        result = 31 * result + (residentSex != null ? residentSex.hashCode() : 0);
        result = 31 * result + (idNumber != null ? idNumber.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (checkinTime != null ? checkinTime.hashCode() : 0);
        return result;
    }
}
