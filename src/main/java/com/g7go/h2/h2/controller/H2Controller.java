package com.g7go.h2.h2.controller;

import com.g7go.h2.h2.pojo.User;
import com.g7go.h2.h2.service.H2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * 作用描述
 *
 * @Author: Mr_li
 * @CreateDate: 2018-12-27$ 14:56$
 * @Version: 1.0
 */
@RestController
public class H2Controller {

    @Autowired
    private H2Service service;

    @RequestMapping("/out")
    public List<User> getAll() {
        return service.findAll();
    }


    @RequestMapping("/in")
    public void insertOne() {
        User lwc = new User();
        lwc.setUseAge(12);
        service.save(lwc);

    }


}
