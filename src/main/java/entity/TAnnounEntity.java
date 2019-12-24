package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_announ", schema = "cpms")
public class TAnnounEntity {
    private int announId;
    private String announTitle;
    private String announContent;
    private Timestamp announTime;
    private int employeeID;

    @Basic
    @Column(name = "EmployeeID")
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Id
    @Column(name = "AnnounID")
    public int getAnnounId() {
        return announId;
    }

    public void setAnnounId(int announId) {
        this.announId = announId;
    }

    @Basic
    @Column(name = "AnnounTitle")
    public String getAnnounTitle() {
        return announTitle;
    }

    public void setAnnounTitle(String announTitle) {
        this.announTitle = announTitle;
    }

    @Basic
    @Column(name = "AnnounContent")
    public String getAnnounContent() {
        return announContent;
    }

    public void setAnnounContent(String announContent) {
        this.announContent = announContent;
    }

    @Basic
    @Column(name = "AnnounTime")
    public Timestamp getAnnounTime() {
        return announTime;
    }

    public void setAnnounTime(Timestamp announTime) {
        this.announTime = announTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TAnnounEntity that = (TAnnounEntity) o;

        if (announId != that.announId) return false;
        if (announTitle != null ? !announTitle.equals(that.announTitle) : that.announTitle != null) return false;
        if (announContent != null ? !announContent.equals(that.announContent) : that.announContent != null)
            return false;
        if (announTime != null ? !announTime.equals(that.announTime) : that.announTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = announId;
        result = 31 * result + (announTitle != null ? announTitle.hashCode() : 0);
        result = 31 * result + (announContent != null ? announContent.hashCode() : 0);
        result = 31 * result + (announTime != null ? announTime.hashCode() : 0);
        return result;
    }
}
