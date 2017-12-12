package com.codekul.SpringRestDemo.repo;

import com.codekul.SpringRestDemo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by pooja on 8/12/17.
 */

@RepositoryRestResource(collectionResourceRel = "student",path = "student")
public interface StudentRepo extends MongoRepository<Student,String> {

    @RestResource(path = "/findByName")
    Student findByName(@Param("name") String name);
}
