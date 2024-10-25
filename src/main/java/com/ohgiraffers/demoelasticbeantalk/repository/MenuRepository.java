package com.ohgiraffers.demoelasticbeantalk.repository;

import com.ohgiraffers.demoelasticbeantalk.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
