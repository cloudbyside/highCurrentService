package com.seckill.entity;

import java.util.Date;

/**
 * 秒杀单信息实体
 * Created by zslcc on 2017/5/5.
 */
public class Seckill {
    //秒杀信息的ID
    private long seckillId;
    //秒杀商品名称
    private String name;
    //秒杀商品数量
    private int number;
    //秒杀开始时间
    private Date startTime;
    //秒杀结束时间
    private Date endTime;
    //秒杀单创建时间
    private  Date creatTime;

    public Seckill() {
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seckill seckill = (Seckill) o;

        if (seckillId != seckill.seckillId) return false;
        if (number != seckill.number) return false;
        if (!name.equals(seckill.name)) return false;
        if (!startTime.equals(seckill.startTime)) return false;
        if (!endTime.equals(seckill.endTime)) return false;
        return creatTime.equals(seckill.creatTime);
    }

    @Override
    public int hashCode() {
        int result = (int) (seckillId ^ (seckillId >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + number;
        result = 31 * result + startTime.hashCode();
        result = 31 * result + endTime.hashCode();
        result = 31 * result + creatTime.hashCode();
        return result;
    }

    public Seckill(long seckillId, String name, int number, Date startTime, Date endTime, Date creatTime) {
        this.seckillId = seckillId;
        this.name = name;
        this.number = number;
        this.startTime = startTime;
        this.endTime = endTime;
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", creatTime=" + creatTime +
                '}';
    }
}
