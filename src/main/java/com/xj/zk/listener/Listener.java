package com.xj.zk.listener;

import com.xj.zk.ZkClientException;
import org.apache.zookeeper.Watcher.Event.EventType;

import java.net.SocketException;

/**
 * Author: xiajun
 * Date: 14/5/20
 */
public interface Listener {
    /**
     * 监听回调函数
     *
     * @param path      发生变化的节点路径
     * @param eventType 变化类型
     * @param data      变化数据，当监听的是数据变化时有效，其它为null
     * @throws ZkClientException
     * @throws SocketException
     */
    void listen(String path, EventType eventType, byte[] data) throws ZkClientException, SocketException;

}
