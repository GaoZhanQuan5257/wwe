package com.muyu.config;

public class AlipayConfig {
    // 商户appid
    public static String app_id = "";

    // 私钥 pkcs8格式的
    public static String merchant_private_key = "";

    // 支付宝公钥
    public static String alipay_public_key = "";

    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay/alipayNotifyNotice.action";

    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://localhost:8080/alipay/alipayReturnNotice.action";

    // RSA2
    public static String sign_type = "RSA2";

    // 编码
    public static String charset = "utf-8";

    // 请求网关地址
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

}
