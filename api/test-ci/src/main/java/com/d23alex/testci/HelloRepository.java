package com.d23alex.testci;

import org.springframework.data.repository.CrudRepository;

public interface HelloRepository extends CrudRepository<Hello, Long> {
}
