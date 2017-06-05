package com.elder.controller;

import com.elder.domain.Project;
import com.elder.enums.IsHideEnums;
import com.elder.service.ProjectService;
import com.elder.util.page.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/project")
public class ProjectController extends BaseController {

    @Autowired
    private ProjectService projectService;


    @RequestMapping("/queryAllProjectByPage")
    @ResponseBody
    public Map<String, Object> queryAllProjectByPage(@RequestBody PageModel initialPageModel) {
        PageModel<Project> finalPageModel = new PageModel<>();
        Map<String, Object> map = new HashMap<>();
        try {
            finalPageModel = projectService.queryAllByPage(initialPageModel);
            map = generateSuccessMsg("查询成功");
            map.put("pageMode", finalPageModel);
        } catch (Exception e) {
            map = generateFailureMsg("查询失败");
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping("/deleteProjectByProjectId/{projectId}")
    @ResponseBody
    public Map<String, Object> deleteProjectByProjectId(@PathVariable int projectId) {
        Map<String, Object> map = new HashMap<>();
        int i = projectService.deleteProjectByProjectId(projectId);
        if (i != IsHideEnums.NOHIDE.getIsHide()) {
            map = generateSuccessMsg("成功删除");
        } else {
            map = generateFailureMsg("删除失败");
        }
        return map;
    }

    @RequestMapping("/updateProject")
    @ResponseBody
    public Map<String, Object> updateProject(@RequestBody Project project) {
        Map<String, Object> map = new HashMap<>();
        int i = projectService.updateProject(project);
        if (i != 0) {
            map = generateSuccessMsg("更新成功");
        } else {
            map = generateFailureMsg("更新失败");
        }
        return map;
    }

    @RequestMapping("/insertProject")
    @ResponseBody
    public Map<String, Object> insertProject(@RequestBody Project project) {
        Map<String, Object> map = new HashMap<>();
        int i = projectService.insertProject(project);
        if (i != 0) {
            map = generateSuccessMsg("成功添加");
        } else {
            map = generateFailureMsg("添加失败");
        }
        return map;
    }
}
