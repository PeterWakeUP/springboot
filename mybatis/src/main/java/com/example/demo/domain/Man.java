package com.example.demo.domain;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by 苏文辉 on 2018/4/2.
 */
@Api(description = "man")
public class Man {

    @ApiModelProperty(value = "id", name = "id", required = true, example = "1")
    private Integer id;

    @ApiModelProperty(hidden = true)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
