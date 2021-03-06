package com.li3huo.mybatisplus.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * OrderItem
 */
@Data
@Accessors(chain = true)
@TableName("t_order_item")
public class OrderItem {
  @TableField("order_id")
  private Long orderId;
  @TableField("item_id")
  private Long itemId;
}
