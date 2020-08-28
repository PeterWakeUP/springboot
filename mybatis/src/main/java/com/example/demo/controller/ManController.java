package com.example.demo.controller;

import com.example.demo.dao.ManMapper;
import com.example.demo.domain.Man;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.lang.reflect.Method;

/**
 * Created by 苏文辉 on 2018/4/2.
 */
@Slf4j
@RestController
@Api(description = "Man信息管理")
public class ManController {

    @Autowired
    ManMapper manMapper;

    //@ApiIgnore
    @ApiOperation(value="测试", notes="test")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "name", value = "用户NAME", required = true, dataType = "String", paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code=200,message="请求成功"),
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @PostMapping("test")
    public String test(String id, String name){
        return "ManController";
    }

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @ApiResponses({
            @ApiResponse(code=200,message="请求成功"),
            @ApiResponse(code=400,message="请求参数没填好"),
            @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
    })
    @RequestMapping(value = "man/getManById/{id}", method = RequestMethod.GET)
    public Man getManById(@PathVariable(value = "id") String id){
        Man man = manMapper.selectById(id);
        manMapper.updateById("1");
        log.info("{}, {}", man.getId(), man.getName());
        return man;
    }

}
