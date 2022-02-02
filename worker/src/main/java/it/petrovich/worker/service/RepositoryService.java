package it.petrovich.worker.service;

import it.petrovich.worker.dto.MavenRepository;

public interface RepositoryService {
    void save(MavenRepository repository);
}
