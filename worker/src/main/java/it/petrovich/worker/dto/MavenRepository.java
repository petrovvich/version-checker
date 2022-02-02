package it.petrovich.worker.dto;

public record MavenRepository(String url, String name, RepositoryType type, ScanType scanType) {
}
