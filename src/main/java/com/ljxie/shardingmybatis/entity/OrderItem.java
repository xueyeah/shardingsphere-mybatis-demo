package com.ljxie.shardingmybatis.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
    private long itemId;
    private long orderId;
    private long userId;
    private String status;
}
