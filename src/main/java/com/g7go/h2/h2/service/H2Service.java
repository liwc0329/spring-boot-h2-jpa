package com.g7go.h2.h2.service;

import com.g7go.h2.h2.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 作用描述
 *
 * @Author: Mr_li
 * @CreateDate: 2018-12-27$ 14:52$
 * @Version: 1.0
 */
@Repository
public interface H2Service extends JpaRepository<User, Integer> {

}
