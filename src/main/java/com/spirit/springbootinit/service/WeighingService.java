package com.spirit.springbootinit.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spirit.springbootinit.model.entity.Weighing;

/**
 * WeighingController
 *
 * @author yaojc
 * @date 2024/5/11
 */
public interface WeighingService extends IService<Weighing> {
    Weighing add(Weighing weighing);
}
