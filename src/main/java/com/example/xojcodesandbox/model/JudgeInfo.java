package com.example.xojcodesandbox.model;

import lombok.Data;

/**
 * @author xq
 * @create 2024/2/25 0:28
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间（KB）
     */
    private Long time;

}
