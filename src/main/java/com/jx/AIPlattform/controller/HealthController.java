package com.jx.AIPlattform.controller;

import com.jx.AIPlattform.common.BaseResponse;
import com.jx.AIPlattform.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping("/")
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("OK");
    }
}
