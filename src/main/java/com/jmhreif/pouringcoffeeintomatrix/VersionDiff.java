package com.jmhreif.pouringcoffeeintomatrix;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
@RequiredArgsConstructor
public class VersionDiff {
    @Id
    @GeneratedValue
    private final Long neoId;
    private String fromVendor, fromVersion, toVendor, toVersion;
}
