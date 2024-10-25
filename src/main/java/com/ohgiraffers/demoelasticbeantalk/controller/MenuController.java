package com.ohgiraffers.demoelasticbeantalk.controller;

import com.ohgiraffers.demoelasticbeantalk.dto.MenuDTO;
import com.ohgiraffers.demoelasticbeantalk.entity.Menu;
import com.ohgiraffers.demoelasticbeantalk.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MenuController {
    private final MenuService menuService;

    @GetMapping("/list")
    public List<MenuDTO> getAllMenus() {
        List<MenuDTO> list = menuService.getAllMenus();
        log.info("[MenuController] : MenuDTO -> {}", list);
        return list;
    }

    @GetMapping("/check")
    public String checkMenu() {
        return "version 1.0.0";
    }
}
