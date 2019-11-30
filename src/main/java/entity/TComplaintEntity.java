package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_complaint", schema = "cpms")
public class TComplaintEntity {
    private int complaintId;
    private int residentId;
    private String complaintTitle;
    private String complaintContent;
    private Timestamp complaintTime;
    private String complaintFback;

    @Id
    @Column(name = "ComplaintID")
    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
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
    @Column(name = "ComplaintTitle")
    public String getComplaintTitle() {
        return complaintTitle;
    }

    public void setComplaintTitle(String complaintTitle) {
        this.complaintTitle = complaintTitle;
    }

    @Basic
    @Column(name = "ComplaintContent")
    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent;
    }

    @Basic
    @Column(name = "ComplaintTime")
    public Timestamp getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(Timestamp complaintTime) {
        this.complaintTime = complaintTime;
    }

    @Basic
    @Column(name = "ComplaintFback")
    public String getComplaintFback() {
        return complaintFback;
    }

    public void setComplaintFback(String complaintFback) {
        this.complaintFback = complaintFback;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TComplaintEntity that = (TComplaintEntity) o;

        if (complaintId != that.complaintId) return false;
        if (residentId != that.residentId) return false;
        if (complaintTitle != null ? !complaintTitle.equals(that.complaintTitle) : that.complaintTitle != null)
            return false;
        if (complaintContent != null ? !complaintContent.equals(that.complaintContent) : that.complaintContent != null)
            return false;
        if (complaintTime != null ? !complaintTime.equals(that.complaintTime) : that.complaintTime != null)
            return false;
        if (complaintFback != null ? !complaintFback.equals(that.complaintFback) : that.complaintFback != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = complaintId;
        result = 31 * result + residentId;
        result = 31 * result + (complaintTitle != null ? complaintTitle.hashCode() : 0);
        result = 31 * result + (complaintContent != null ? complaintContent.hashCode() : 0);
        result = 31 * result + (complaintTime != null ? complaintTime.hashCode() : 0);
        result = 31 * result + (complaintFback != null ? complaintFback.hashCode() : 0);
        return result;
    }
}
