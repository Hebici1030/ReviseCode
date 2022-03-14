package com.lin.service;

import com.lin.pojo.Tag;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TagService {
    List<Tag> getAllTags();
}
