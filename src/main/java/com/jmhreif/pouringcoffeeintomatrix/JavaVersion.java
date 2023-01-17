package com.jmhreif.pouringcoffeeintomatrix;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.time.LocalDate;

@Node
@Data
@RequiredArgsConstructor
public class JavaVersion {
    @Id
    @Property("version")
    private final String javaVersion;
    private String name, codeName, status, apiSpec;
    private LocalDate gaDate, eolDate;
}
