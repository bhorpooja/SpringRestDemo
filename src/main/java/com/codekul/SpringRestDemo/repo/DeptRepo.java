package com.codekul.SpringRestDemo.repo;

import com.codekul.SpringRestDemo.domain.Dept;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by pooja on 8/12/17.
 */

@RepositoryRestResource(collectionResourceRel = "dept",path = "dept")
public interface DeptRepo extends MongoRepository<Dept,String>{
}
