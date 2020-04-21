package org.triumphxx.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:triumphxx
 * @Date:2020/4/21
 * @Time:4:07 下午
 * @desc:资源服务器接口
 **/
@RestController
public class ResourceController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping("/admin/hello")
    public String admin() {
        return "admin";
    }
}
