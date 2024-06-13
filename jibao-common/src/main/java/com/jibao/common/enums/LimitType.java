package com.jibao.common.enums;

/**
 * 限流类型
 *
 * @author jack
 */

public enum LimitType
{
    /**
     * 默认策略全局限流
     */
    DEFAULT,

    /**
     * 根据请求者IP进行限流
     */
    IP
}
