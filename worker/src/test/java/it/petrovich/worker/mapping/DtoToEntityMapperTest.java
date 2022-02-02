package it.petrovich.worker.mapping;

import org.junit.jupiter.api.Test;

import static it.petrovich.worker.TestUtils.TEST_NAME;
import static it.petrovich.worker.TestUtils.TEST_URL;
import static it.petrovich.worker.TestUtils.buildMavenRepo;
import static it.petrovich.worker.dto.RepositoryType.MAVEN;
import static it.petrovich.worker.dto.ScanType.NO_SCAN;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class DtoToEntityMapperTest {
    private final DtoToEntityMapper mapper = DtoToEntityMapper.INSTANCE;

    @Test
    void testMap_shouldReturnExpectedObject() {
        // when
        final var actual = mapper.map(buildMavenRepo());

        // then
        assertAll(
                () -> assertNotNull(actual),
                () -> assertNull(actual.getId()),
                () -> assertNotNull(actual.getCreated()),
                () -> assertNotNull(actual.getUpdated()),
                () -> assertNotNull(actual.getUrl()),
                () -> assertEquals(TEST_URL, actual.getUrl()),
                () -> assertNotNull(actual.getName()),
                () -> assertEquals(TEST_NAME, actual.getName()),
                () -> assertNotNull(actual.getType()),
                () -> assertEquals(MAVEN, actual.getType()),
                () -> assertNotNull(actual.getScanType()),
                () -> assertEquals(NO_SCAN, actual.getScanType())
        );
    }

}