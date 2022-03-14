package com.lin.controller;

import com.lin.pojo.Tag;
import com.lin.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TagController {
    @Autowired
    private TagService tagService;

    //GET请求获取全部Tag
    @GetMapping("/tags")
    public List<Tag> getAllTag(){
        return tagService.getAllTags();
    }
}
