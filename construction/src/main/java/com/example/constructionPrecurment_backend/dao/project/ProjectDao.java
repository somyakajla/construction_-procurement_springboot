package com.example.constructionPrecurment_backend.dao.project;

import com.example.constructionPrecurment_backend.models.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProjectDao extends MongoRepository<Project, UUID> {

}
