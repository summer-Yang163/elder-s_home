package com.elder.controller;

import com.elder.domain.ProjectType;
import com.elder.service.ProjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/projectType")
public class ProjectTypeController extends BaseController {
    @Autowired
    private ProjectTypeService projectTypeService;

    @RequestMapping("/queryAllProjectType")
    public Map<String, Object> queryAllProjectType() {
        Map<String, Object> map = new HashMap<>();
        List<ProjectType>  projectTypeList=projectTypeService.queryAllProjectType();
        if(projectTypeList!=null&&projectTypeList.size()!=0){
            map=generateSuccessMsg("查询成功");
            map.put("projectTypeList",projectTypeList);
        }else{
            map=generateFailureMsg("查询失败");
        }
        return map;
    }
}
