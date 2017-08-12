package com.controller;

import com.dao.ScoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Score")
public class ScoreController {
    @Autowired
    private ScoreDao scoreDao;
}
