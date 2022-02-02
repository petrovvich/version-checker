package it.petrovich.worker.repo;

import it.petrovich.worker.entity.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositoryEntityRepository extends JpaRepository<Repository, UUID> {
}
