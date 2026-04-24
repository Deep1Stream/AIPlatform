package com.jx.AIPlatform.service;

import jakarta.servlet.http.HttpServletResponse;

public interface ProjectDownloadService {
    void downloadProjectAsZip(String projectPath, String downloadFileName, HttpServletResponse response);
}
