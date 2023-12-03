package org.springdoc.webmvc.ui;

import jakarta.servlet.http.HttpServletRequest;

public interface CustomSwaggerIndexTransformer {
    String transform(HttpServletRequest request, String html);
}
