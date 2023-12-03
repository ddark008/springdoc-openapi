package org.springdoc.webflux.ui;

import org.springframework.web.server.ServerWebExchange;

/**
 *
 */
public interface CustomSwaggerIndexTransformer {
    String transform(ServerWebExchange serverWebExchange, String html);
}
