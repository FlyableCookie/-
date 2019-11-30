package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_parking", schema = "cpms")
public class TParkingEntity {
    private int parkingId;

    @Id
    @Column(name = "ParkingID")
    public int getParkingId() {
        return parkingId;
    }

    public void setParkingId(int parkingId) {
        this.parkingId = parkingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TParkingEntity that = (TParkingEntity) o;

        if (parkingId != that.parkingId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return parkingId;
    }
}
