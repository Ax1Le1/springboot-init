package com.spirit.springbootinit.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spirit.springbootinit.mapper.TreeDao;
import com.spirit.springbootinit.mapper.UserDao;
import com.spirit.springbootinit.mapper.WeighingDao;
import com.spirit.springbootinit.model.entity.Weighing;
import com.spirit.springbootinit.service.WeighingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.UUID;

/**
 * WeighingServiceImpl
 *
 * @author yaojc
 * @date 2024/5/11
 */
@Service
@Slf4j
public class WeighingServiceImpl extends ServiceImpl<WeighingDao, Weighing> implements WeighingService {

    @Autowired
    TreeDao treeDao;
    @Autowired
    UserDao userDao;
    @Autowired
    WeighingDao weighingDao;

    @Override
    public Weighing add(Weighing weighing) {
        //车重
        String bsm = weighing.getBsm();
        if (bsm != null) {
            updateById(weighing);
        } else {
            weighing.setBsm(UUID.randomUUID().toString());
            save(weighing);
        }
        return weighing;
    }

    @Override
    public Weighing calculateSum(String bsm) {
        LambdaQueryWrapper<Weighing> weighingqueryWrapper = new LambdaQueryWrapper<>();
        weighingqueryWrapper.eq(Weighing::getBsm, bsm);
        Weighing weighing = this.baseMapper.selectOne(weighingqueryWrapper);
        Assert.notNull(weighing, "没有这条记录");
        Double carweight = weighing.getCarweight();
        //第一次称重
        Double firstweighing = weighing.getFirstweighing();
        Double firstmonesy = weighing.getFirstmonesy();
        Double firstprice = weighing.getFirstprice();
        Double allmonesy = weighing.getAllmonesy();

        //第二次称重
        Double secondweighing = weighing.getSecondweighing();
        Double secondmonesy = weighing.getSecondmonesy();
        Double secondprice = weighing.getSecondprice();

        //第三次称重
        Double thirdweighing = weighing.getThirdweighing();
        Double thirdmonesy = weighing.getThirdmonesy();
        Double thirdprice = weighing.getThirdprice();

        if (secondweighing != null) {
            firstmonesy = getaDouble(secondweighing, firstweighing, firstprice, firstmonesy);
        } else {
            firstmonesy = getaDouble(carweight, firstweighing, firstprice, firstmonesy);
        }
        weighing.setFirstmonesy(firstmonesy);
        if (allmonesy == null) {
            allmonesy = (double) 0;
        }
        if (firstmonesy != null) {
            allmonesy = firstmonesy + allmonesy;
        }
        if (thirdweighing != null) {
            secondmonesy = getaDouble(thirdweighing, secondweighing, secondprice, secondmonesy);
        } else {
            secondmonesy = getaDouble(carweight, secondweighing, secondprice, secondmonesy);
        }
        weighing.setSecondmonesy(secondmonesy);
        if (secondmonesy != null) {
            allmonesy = secondmonesy + allmonesy;
        }
        thirdmonesy = getaDouble(carweight, thirdweighing, thirdprice, thirdmonesy);
        weighing.setThirdmonesy(thirdmonesy);
        weighing.setAllmonesy(allmonesy);
        if (thirdmonesy != null) {
            allmonesy = thirdmonesy + allmonesy;
        }
//        String sellerid = weighing.getSellerid();
//        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
//        queryWrapper.eq(User::getId, sellerid);
//        User user = userDao.selectOne(queryWrapper);
        weighing.setAllmonesy(allmonesy);
        saveOrUpdate(weighing);
        return weighing;
    }


    private Double getaDouble(Double carweight, Double weighing, Double price, Double monesy) {
        if (price != null) {
            if (monesy == null) {
                if (weighing != null) {
                    monesy = (weighing - carweight) * price / 1000;
                }
            }
        }
        return monesy;
    }
}
