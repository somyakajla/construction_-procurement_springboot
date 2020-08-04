package com.example.constructionPrecurment_backend.controllers;


import com.example.constructionPrecurment_backend.models.Project;
import com.example.constructionPrecurment_backend.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
Project routes
router.post('/createProject', ctrlProject.createProject);
router.get('/project', ctrlProject.getProject);
router.get('/projects', ctrlProject.getProjects);
router.get('/openProjects', ctrlProject.getOpenProjects);
router.put('/updateProject', ctrlProject.updateProject);
router.delete('/deleteProject', ctrlProject.deleteProject);
 */
@RequestMapping("/project")
@RestController
public class ProjectController {
    /*
    DI : instantiate as a bean projectService through @Autowired
     */
    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }

    @PostMapping(path = "/createProject")
    public Project addProject(@RequestBody Project project){
        projectService.saveProject(project);
        return project;
    }

//    @GetMapping(path = "/getProject")
//    public void getProject(@RequestParam(required = false) UUID projectId, @RequestParam(required = false) UUID userId) {
//        if(projectId != null) {
//            System.out.println("project");
//        }
//        else if(userId != null){
//            System.out.println("userId");
//        }
//
//        else{
//            System.out.println("None");
//        }
//    }
//
//
//    @DeleteMapping(path = "/deleteProject/{projectId}")
//    public void deleteProject(@PathVariable("projectId") UUID projectId) {
//
//    }
//
//    @PutMapping(path = "/updateProject/{projectId}")
//    public void updateProject(@PathVariable("projectId") UUID projectId) {
//
//
//    }
}



//@RestController
//@RequestMapping("/project")
//public class ProjectController1 {
//
//    private final ProjectDao1 projectDao;
//
//    @Autowired
//    public ProjectController1(ProjectDao1 projectDao) {
//        this.projectDao = projectDao;
//    }
//
//    @PostMapping
//    @ResponseStatus(code = HttpStatus.CREATED)
//    public Project1 add(@RequestBody Project1 candidate) {
//        return projectDao.save(candidate);
//
//    }
//
//    @GetMapping
//    public List<Project1> getAll() {
//        return projectDao.findAll();
//    }
//
//    @GetMapping(value = "/{id}")
//    public Project1 getOne(@PathVariable String id) throws ResourceNotFoundException1 {
//        return projectDao.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException1());
//    }
//
//}