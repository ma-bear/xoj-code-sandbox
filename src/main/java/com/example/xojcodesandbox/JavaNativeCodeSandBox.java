package com.example.xojcodesandbox;

import com.example.xojcodesandbox.model.ExecuteCodeRequest;
import com.example.xojcodesandbox.model.ExecuteCodeResponse;

import java.io.IOException;

/**
 * Java 原生代码沙箱实现（直接复用模板方法）
 *
 * @author 29923
 */
public class JavaNativeCodeSandBox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) throws IOException {
        return super.executeCode(executeCodeRequest);
    }
}
