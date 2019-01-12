package com.nft.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @类名称: IpUtil
 * @作者: 段聪祺
 * @创建时间: 2018/11/28 10:30
 * @说明: 获取请求ip工具类
 */
public class IpUtil {
    /**
     * 获取ip
     * @param request
     * @return
     */
    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
