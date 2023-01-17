package com.jmhreif.pouringcoffeeintomatrix;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface JavaVersionRepo extends Neo4jRepository<JavaVersion, String> {
}
