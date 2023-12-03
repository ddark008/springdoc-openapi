package org.springdoc.webflux.ui;

import org.springdoc.ui.AbstractSwaggerIndexTransformer;
import org.springframework.web.server.ServerWebExchange;

/**
 * The interface for custom Swagger index page transformer.
 * <p>
 * All beans with this interface apply after {@link AbstractSwaggerIndexTransformer#defaultTransformations}
 * @author ddark008
 */
public interface CustomSwaggerIndexTransformer {
    /**
     * Custom transform for the Swagger index page
     * @param exchange the current exchange
     * @param html the Swagger index page to transform
     * @return the transformed Swagger index page
     */
    String transform(ServerWebExchange exchange, String html);
}
