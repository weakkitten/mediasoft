package com.example.mediasoft.PostOffice.controller;

import com.example.mediasoft.PostOffice.model.Dto.NewPostOffice;
import com.example.mediasoft.PostOffice.service.PostOfficeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostOfficeController {
    private final PostOfficeService postOfficeService;

    @PostMapping
    public void createPostOffice(NewPostOffice newPostOffice) {
        postOfficeService.createPostOffice(newPostOffice);
    }

    public void arrivalIntermediate() {

    }

    public void departureFromOffice() {

    }

    public void gettingPostItems() {

    }

    public void showTrace() {

    }
}
