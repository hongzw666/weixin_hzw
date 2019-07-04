package com.hong.weixin.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hong.weixin.menu.domain.SelfMenu;

@Repository
public interface SelfMenuRepository extends JpaRepository<SelfMenu, String> {

}
