package it.petrovich.worker.service;

import it.petrovich.worker.dto.MavenRepository;
import it.petrovich.worker.repo.RepositoryEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RepositoryServiceImpl implements RepositoryService {
    private final RepositoryEntityRepository repository;

    @Override
    public void save(MavenRepository repository) {

    }
}
