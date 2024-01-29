package com.lhloj.lhlojcodesandbox;


import com.lhloj.lhlojcodesandbox.model.ExecuteCodeRequest;
import com.lhloj.lhlojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
