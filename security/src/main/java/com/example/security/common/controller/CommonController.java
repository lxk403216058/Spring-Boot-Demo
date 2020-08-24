package com.example.security.common.controller;

import com.example.security.common.pojo.PageInfo;
import com.example.security.common.pojo.Result;
import com.example.security.common.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class CommonController<V, E , T> {
    @Autowired
    private CommonService<V, E, T> commonService;

    /*
        CRUD、分页、排序测试
     */
    //方便测试暂时改成GetMapping
    @GetMapping("page")
//    @PostMapping("page")
    public Result<PageInfo<V>> page(V entityVo) {
        return commonService.page(entityVo);
    }

    //方便测试暂时改成GetMapping
    @GetMapping("list")
//    @PostMapping("list")
    public Result<List<V>> list(V entityVo) {
        return commonService.list(entityVo);
    }

    @GetMapping("get/{id}")
    public Result<V> get(@PathVariable("id") T id) {
        return commonService.get(id);
    }

    //方便测试暂时改成GetMapping
    @GetMapping("save")
//    @PostMapping("save")
    public Result<V> save(V entityVo) {
        return commonService.save(entityVo);
    }

    @GetMapping("delete/{id}")
    public Result<T> delete( @PathVariable("id") T id) {
        /*
        批量删除
        @DeleteMapping("deleteBatch")
        public Result<T> deleteBatch(@RequestBody List<String> ids){}
        前端调用：
        $.ajax({
            url: ctx + "deleteBatch",
            type: "DELETE",
            data: JSON.stringify([id1,id2]),
            dataType: "JSON",
            contentType: 'application/json',
            success: function (data) {
            }
        });
         */
        return commonService.delete(id);
    }
}
