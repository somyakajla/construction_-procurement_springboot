package com.example.constructionPrecurment_backend.service.project;

import com.example.constructionPrecurment_backend.dao.project.ProjectDao;
import com.example.constructionPrecurment_backend.models.Project;
import org.springframework.beans.factory.annotation.Autowired;

public class ProjectService {

    private final ProjectDao projectDao;

    @Autowired
    public ProjectService(ProjectDao projectDao){
        this.projectDao = projectDao;
    }

    public void saveProject(Project project) {
        projectDao.save(project);
    }
}
