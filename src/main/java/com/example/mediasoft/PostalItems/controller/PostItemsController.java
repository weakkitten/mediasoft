package com.example.mediasoft.PostalItems.controller;

import com.example.mediasoft.PostalItems.service.PostalItemsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/items")
public class PostItemsController {
    private final PostalItemsService service;

    @PostMapping("/arrival")
    public void arrivalIntermediate(@RequestParam Long itemId,
                                    @RequestParam Long officeId) {

    }

    @PostMapping("/departure")
    public void departureFromOffice(@RequestParam Long itemId,
                                    @RequestParam Long officeId) {

    }

    @PostMapping("/getting")
    public void gettingPostItems(@RequestParam Long itemId,
                                 @RequestParam Long officeId) {

    }

    @GetMapping("/{itemId}")
    public void showTrace(@PathVariable Long itemId) {

    }
}
