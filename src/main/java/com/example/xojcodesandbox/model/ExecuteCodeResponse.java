package com.example.xojcodesandbox.model;

import lombok.Data;

import java.util.List;

/**
 * @author xq
 * @create 2024/3/31 11:48
 */
@Data
public class ExecuteCodeResponse {
    /**
     * 接口信息
     */
    private String message;

    /**
     * 执行状态
     */
    private Integer status;

    /**
     * 执行信息
     */
    private JudgeInfo judgeInfo;

    /**
     * 输出示例
     */
    private List<String> outPutList;
}
