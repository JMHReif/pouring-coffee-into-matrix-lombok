package com.jmhreif.pouringcoffeeintomatrix;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
public class VersionDiff {
    @Id
    @GeneratedValue
    private final Long neoId;
    private String fromVendor, fromVersion, toVendor, toVersion;
}
