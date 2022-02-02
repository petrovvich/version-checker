package it.petrovich.worker;

import it.petrovich.worker.dto.MavenRepository;
import lombok.experimental.UtilityClass;

import static it.petrovich.worker.dto.RepositoryType.MAVEN;
import static it.petrovich.worker.dto.ScanType.NO_SCAN;

@UtilityClass
public class TestUtils {

    public static final String TEST_NAME = "TEST_NAME";
    public static final String TEST_URL = "TEST_URL";

    public static MavenRepository buildMavenRepo() {
        return new MavenRepository(TEST_URL, TEST_NAME, MAVEN, NO_SCAN);
    }
}
