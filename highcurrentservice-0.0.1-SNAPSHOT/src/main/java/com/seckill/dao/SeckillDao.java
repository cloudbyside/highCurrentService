package com.seckill.dao;

import com.seckill.entity.Seckill;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 对秒杀商品库存进行操作的统一化接口
 * Created by zslcc on 2017/5/5.
 */
public interface SeckillDao {


    /**
     * 减库存操作
     * @param seckillId
     * @param killTime
     * 返回值表示影响的库存信息行数(return>=1时)
     */
    int reduceNumer(long seckillId, Date killTime);

    /**
     * 依据秒杀商品的Id查询秒杀商品的库存信息
     * @param seckillId
     * @return
     * 返回秒杀商品的库存信息
     */
    Seckill queryById(long seckillId);

    /**
     * 依据商品列表的偏移量和查询的商品信息数量返回商品库存信息列表
     * @param offset
     * @param limit
     * @return
     * 返回商品库存信息列表
     */
    List<Seckill> queryAll(int offset, int limit);
}
