package com.spirit.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spirit.springbootinit.mapper.WeighingDao;
import com.spirit.springbootinit.model.entity.Weighing;
import com.spirit.springbootinit.service.WeighingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * WeighingServiceImpl
 *
 * @author yaojc
 * @date 2024/5/11
 */
@Service
@Slf4j
public class WeighingServiceImpl extends ServiceImpl<WeighingDao, Weighing> implements WeighingService {
    @Override
    public Weighing add(Weighing weighing) {

        return null;
    }
}
