package it.petrovich.worker.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.TypeDef;
import org.hibernate.type.PostgresUUIDType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table
@ToString
@NoArgsConstructor
@TypeDef(name = "postgres-uuid", defaultForType = UUID.class, typeClass = PostgresUUIDType.class)
public class Artifact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "postgres-uuid")
    private UUID id;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime created;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime updated;

    @OneToOne
    @JoinColumn(name = "repository_id", referencedColumnName = "id")
    private Repository repository;
}
