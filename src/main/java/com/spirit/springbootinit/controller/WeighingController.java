package com.spirit.springbootinit.controller;

import com.spirit.springbootinit.model.entity.Weighing;
import com.spirit.springbootinit.service.WeighingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * WeighingController
 *
 * @author yaojc
 * @date 2024/5/11
 */
@RestController
@RequestMapping("/post")
public class WeighingController {
    @Autowired
    WeighingService weighingService;

    @PostMapping("/save")
    public void save(@RequestBody Weighing weighing) {
        weighingService.add(weighing);
    }

    @GetMapping("calculateSum")
    public Weighing calculateSum(String bsm) {
        return weighingService.calculateSum(bsm);
    }
}
