package org.springdoc.webmvc.ui;

import jakarta.servlet.http.HttpServletRequest;
import org.springdoc.ui.AbstractSwaggerIndexTransformer;

/**
 * The interface for custom Swagger index page transformer.
 * <p>
 * All beans with this interface apply after {@link AbstractSwaggerIndexTransformer#defaultTransformations}
 * @author ddark008
 */
public interface CustomSwaggerIndexTransformer {
    /**
     * Custom transform for the Swagger index page
     * @param request the current request
     * @param html the Swagger index page to transform
     * @return the transformed Swagger index page
     */
    String transform(HttpServletRequest request, String html);
}
