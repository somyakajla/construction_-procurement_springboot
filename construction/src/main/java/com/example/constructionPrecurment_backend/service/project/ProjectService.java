package com.example.constructionPrecurment_backend.service.project;

import com.example.constructionPrecurment_backend.dao.project.ProjectDao;
import com.example.constructionPrecurment_backend.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProjectService {

    private final ProjectDao projectDao;

    @Autowired
    public ProjectService(ProjectDao projectDao){
        this.projectDao = projectDao;
    }

    public Project saveProject(Project project) {
        return projectDao.save(project);
    }

    public void findByProjectId(UUID projectId) {
    }
}
