package com.seckill.entity;

import java.util.Date;

/**
 * 秒杀成功信息
 * Created by zslcc on 2017/5/5.
 */
public class SuccessSeckill {
    //秒杀单id
    private long seckillId;
    //用户电话号码
    private long userPhone;
    //当前状态
    private short state;
    //用户秒杀时刻,即表单创建时间
    private Date creatTime;
    //保存描述秒杀商品信息的Seckill对象
    //用于一对多匹配
    private Seckill seckill;

    public SuccessSeckill() {
    }

    public SuccessSeckill(long seckillId, long userPhone, short state, Date creatTime) {
        this.seckillId = seckillId;
        this.userPhone = userPhone;
        this.state = state;
        this.creatTime = creatTime;
    }

    public long getSeckillId(){
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "successSeckill{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", creatTime=" + creatTime +
                ", seckill=" + seckill +
                '}';
    }
}
