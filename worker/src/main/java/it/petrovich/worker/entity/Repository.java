package it.petrovich.worker.entity;

import it.petrovich.worker.dto.RepositoryType;
import it.petrovich.worker.dto.ScanType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.TypeDef;
import org.hibernate.type.PostgresUUIDType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Table
@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@TypeDef(name = "postgres-uuid", defaultForType = UUID.class, typeClass = PostgresUUIDType.class)
public class Repository {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "postgres-uuid")
    private UUID id;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime created;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime updated;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RepositoryType type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ScanType scanType;
}
