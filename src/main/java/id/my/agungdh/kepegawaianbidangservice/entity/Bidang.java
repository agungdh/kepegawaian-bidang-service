package id.my.agungdh.kepegawaianbidangservice.entity;

import com.github.f4b6a3.uuid.UuidCreator;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Bidang {
    @Id
    @Column(
            name = "id",
            columnDefinition = "uniqueidentifier",  // pakai UNIQUEIDENTIFIER di SQL Server
            updatable = false,
            nullable = false
    )
    private UUID id;

    @Column(nullable = false)
    private String bidang;

    @PrePersist
    private void ensureId() {
        if (this.id == null) {
            // generate UUID v7 (time-ordered)
            this.id = UuidCreator.getTimeOrdered();
        }
    }
}
