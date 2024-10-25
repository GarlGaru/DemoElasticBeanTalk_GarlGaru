package com.ohgiraffers.demoelasticbeantalk.service;

import com.ohgiraffers.demoelasticbeantalk.dto.MenuDTO;
import com.ohgiraffers.demoelasticbeantalk.entity.Menu;
import com.ohgiraffers.demoelasticbeantalk.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuDTO> getAllMenus() {

        List<Menu> menus = menuRepository.findAll();

        List<MenuDTO> menuDTOS = menus.stream().map(MenuDTO::new).collect(Collectors.toList());

        return menuDTOS;
    }
}
