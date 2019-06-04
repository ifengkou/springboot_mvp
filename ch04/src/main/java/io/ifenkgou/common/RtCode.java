package io.ifenkgou.common;

/**
 * . <br />
 *
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2019/6/4
 */
public class RtCode {
    public final static int SUCCESS = 0;

    /**
     * 错误请求（参数异常）
     */
    public final static int BadRequest = 400;

    /**
     * 未授权/授权失败
     */
    public final static int Unauthorized= 401;
    /**
     * 对某个资源/操作没有权限
     */
    public final static int Forbidden= 403;

    /**
     * 无token消费
     */
    public final static int NoPay= 405;
    /**
     * 服务器内部异常
     */
    public final static int ERROR = 500;
    /**
     * 数据访问异常
     */
    public final static int DBERROR = 501;

}