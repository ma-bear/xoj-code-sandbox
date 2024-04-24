package com.example.xojcodesandbox;

import com.example.xojcodesandbox.model.ExecuteCodeRequest;
import com.example.xojcodesandbox.model.ExecuteCodeResponse;

import java.io.IOException;

/**
 * @author xq
 * @create 2024/4/5 10:47
 */
public interface CodeSandBox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) throws IOException;
}
