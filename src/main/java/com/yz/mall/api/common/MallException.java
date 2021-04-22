package com.yz.mall.api.common;

/**
 * @author imyizai
 * @ClassName MalllException
 * @Description
 * @Date 2021/4/22 4:26 下午
 **/
public class MallException extends RuntimeException {
    public MallException() {
    }

    public MallException(String message) {
        super(message);
    }

    /**
     * 抛出异常     *     * @param message 消息
     */
    public static void fail(String message) {
        throw new MallException(message);
    }
}
