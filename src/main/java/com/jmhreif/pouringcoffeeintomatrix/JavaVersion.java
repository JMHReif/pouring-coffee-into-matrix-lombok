package com.jmhreif.pouringcoffeeintomatrix;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalDate;
import java.util.List;

@Node
@Data
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
}
