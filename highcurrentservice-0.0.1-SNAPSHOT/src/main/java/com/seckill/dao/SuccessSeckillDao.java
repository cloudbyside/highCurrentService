package com.seckill.dao;

import com.seckill.entity.SuccessSeckill;

/**
 *
 * Created by zslcc on 2017/5/5.
 */
public interface SuccessSeckillDao {

    /**
     * 秒杀后,插入购买明细
     * @param seckillId
     * @param userPhone
     * @return
     * 返回插入影响的行数,如果用户出现重复秒杀,则插入不成功,返回0
     * 否则,放回1
     */
    int insertSuccessSeckill(long seckillId,long userPhone);

    /**
     * 依据Id查询秒杀成功的商品购买明细,返回一条秒杀成功信息
     * @param seckillId
     * @return
     */
    SuccessSeckill  queryByIdWithSeckill(long seckillId);

}
