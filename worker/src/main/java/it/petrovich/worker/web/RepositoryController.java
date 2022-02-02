package it.petrovich.worker.web;

import it.petrovich.worker.dto.MavenRepository;
import it.petrovich.worker.service.RepositoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/api/v1/repository")
@RequiredArgsConstructor
public class RepositoryController {

    private final RepositoryService repositoryService;

    @PostMapping
    public BaseResponseEntity save(@RequestBody MavenRepository repository) {
        log.debug("Start processing request {}", repository);
        repositoryService.save(repository);
        return new BaseResponseEntity();
    }
}
