package com.elder.controller;

import com.elder.domain.OldMan;
import com.elder.enums.IsHideEnums;
import com.elder.service.OldManService;
import com.elder.util.page.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jsf on 2017/5/27.
 */

@Controller
@RequestMapping("/oldMan")
public class OldManController extends BaseController {

    @Autowired
    private OldManService oldManService;

    @RequestMapping("/queryAllOldManByPage")
    @ResponseBody
    public Map<String, Object> queryAllOldManByPage(@RequestBody PageModel initialPageModel) {
        PageModel<OldMan> finalPageModel = new PageModel<>();
        Map<String, Object> map = new HashMap<>();
        try {
            finalPageModel = oldManService.queryAllByPage(initialPageModel);
            map = generateSuccessMsg("查询成功");
            map.put("pageMode", finalPageModel);
        } catch (Exception e) {
            map = generateFailureMsg("查询失败");
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping("/deleteOldManByUserId/{oldId}")
    @ResponseBody
    public Map<String, Object> deleteOldManByOldId(@PathVariable int oldId) {
        Map<String, Object> map = new HashMap<>();
        int i = oldManService.deleteOldManByOldId(oldId);
        if (i != IsHideEnums.NOHIDE.getIsHide()) {
            map = generateSuccessMsg("成功删除");
        } else {
            map = generateFailureMsg("删除失败");
        }
        return map;
    }

    @RequestMapping("/updateOldMan")
    @ResponseBody
    public Map<String, Object> updateOldMan(@RequestBody OldMan oldMan) {
        Map<String, Object> map = new HashMap<>();
        int i = oldManService.updateOldMan(oldMan);
        if (i != 0) {
            map = generateSuccessMsg("更新成功");
        } else {
            map = generateFailureMsg("更新失败");
        }
        return map;
    }
    @RequestMapping("/insertOldMan")
    @ResponseBody
    public Map<String,Object> insertOldMan(@RequestBody OldMan oldMan){
        Map<String, Object> map = new HashMap<>();
        int i = oldManService.insertOldMan(oldMan);
        if (i != 0) {
            map = generateSuccessMsg("成功添加");
        } else {
            map = generateFailureMsg("添加失败");
        }
        return map;
    }
}
