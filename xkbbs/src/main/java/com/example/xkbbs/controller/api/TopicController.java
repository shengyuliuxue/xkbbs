package com.example.xkbbs.controller.api;

import com.example.xkbbs.model.Topic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    @PostMapping("/create")
    public String create(Topic topic){
        return topic.getTitle() + " ------" + topic.getContent();
    }
}
