package com.ledao.project.system.judicial.controller;

import java.util.List;

import com.ledao.framework.aspectj.lang.enums.BusinessType;
import com.ledao.project.system.judicial.domain.Judicial;
import com.ledao.project.system.judicial.service.IJudicialService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ledao.framework.aspectj.lang.annotation.Log;

import com.ledao.framework.web.controller.BaseController;
import com.ledao.framework.web.page.TableDataInfo;
import com.ledao.framework.web.domain.AjaxResult;

/**
 * 司法 信息操作处理
 *
 * @author lxz
 * @date 2020-05-21
 */
@Controller
@RequestMapping("/system/judicial")
public class JudicialController extends BaseController {
    private String prefix = "system/judicial";

    @Autowired
    private IJudicialService judicialService;

    @RequiresPermissions("system:judicial:view")
    @GetMapping()
    public String judicial() {
        return prefix + "/judicial";
    }

    /**
     * 查询司法列表
     */
    @RequiresPermissions("system:judicial:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Judicial judicial) {
        startPage();
        List<Judicial> list = judicialService.selectJudicialList(judicial);
        return getDataTable(list);
    }

    /**
     * 新增司法
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存司法
     */
    @RequiresPermissions("system:judicial:add")
    @Log(title = "司法", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Judicial judicial) {
        return toAjax(judicialService.insertJudicial(judicial));
    }

    /**
     * 修改司法
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap) {
        Judicial judicial = judicialService.selectJudicialById(id);
        mmap.put("judicial", judicial);
        return prefix + "/edit";
    }

    /**
     * 修改保存司法
     */
    @RequiresPermissions("system:judicial:edit")
    @Log(title = "司法", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Judicial judicial) {
        return toAjax(judicialService.updateJudicial(judicial));
    }

    /**
     * 删除司法
     */
    @RequiresPermissions("system:judicial:remove")
    @Log(title = "司法", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(judicialService.deleteJudicialByIds(ids));
    }

}
