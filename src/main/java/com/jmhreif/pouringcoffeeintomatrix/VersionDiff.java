package com.jmhreif.pouringcoffeeintomatrix;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class VersionDiff {
    @Id
    @GeneratedValue
    private final Long neoId;
    private String fromVendor, fromVersion, toVendor, toVersion;

    public VersionDiff(Long neoId, String fromVendor, String fromVersion, String toVendor, String toVersion) {
        this.neoId = neoId;
        this.fromVendor = fromVendor;
        this.fromVersion = fromVersion;
        this.toVendor = toVendor;
        this.toVersion = toVersion;
    }

    public Long getNeoId() {
        return neoId;
    }

    public String getFromVendor() {
        return fromVendor;
    }

    public String getFromVersion() {
        return fromVersion;
    }

    public String getToVendor() {
        return toVendor;
    }

    public String getToVersion() {
        return toVersion;
    }
}
