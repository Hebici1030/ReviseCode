package com.lin.service.Impl;

import com.lin.mapper.TagMapper;
import com.lin.pojo.Tag;
import com.lin.service.TagService;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagMapper tagMapper;
    @Override
    public List<Tag> getAllTags() {
        return tagMapper.selectByExample(null);
    }
}
