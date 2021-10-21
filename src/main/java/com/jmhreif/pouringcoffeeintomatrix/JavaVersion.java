package com.jmhreif.pouringcoffeeintomatrix;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;

@Node
public class JavaVersion {
    @Id
    @Property("version")
    private final String javaVersion;
    private String name, codeName, status, apiSpec;
    private LocalDate gaDate, eolDate;

    @Relationship("FROM_NEWER")
    private List<VersionDiff> olderVersionDiffs;

    @Relationship("FROM_OLDER")
    private List<VersionDiff> newerVersionDiffs;

    public JavaVersion(String javaVersion, String name, String codeName, String status, String apiSpec, LocalDate gaDate, LocalDate eolDate) {
        this.javaVersion = javaVersion;
        this.name = name;
        this.codeName = codeName;
        this.status = status;
        this.apiSpec = apiSpec;
        this.gaDate = gaDate;
        this.eolDate = eolDate;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public String getName() {
        return name;
    }

    public String getCodeName() {
        return codeName;
    }

    public String getStatus() {
        return status;
    }

    public String getApiSpec() {
        return apiSpec;
    }

    public LocalDate getGaDate() {
        return gaDate;
    }

    public LocalDate getEolDate() {
        return eolDate;
    }

    public List<VersionDiff> getOlderVersionDiffs() {
        return olderVersionDiffs;
    }

    public List<VersionDiff> getNewerVersionDiffs() {
        return newerVersionDiffs;
    }
}
