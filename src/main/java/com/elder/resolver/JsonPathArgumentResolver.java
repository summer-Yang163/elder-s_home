package com.elder.resolver;

import com.elder.selfDefineAnnotation.JsonArg;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by jsf on 2017/5/22.
 */
public class JsonPathArgumentResolver implements HandlerMethodArgumentResolver {

    private static final String JSONBODYATTRIBUTE = "JSON_REQUEST_BODY";

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        return methodParameter.hasParameterAnnotation(JsonArg.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        String jsonBody = getRequestBody(nativeWebRequest);
        JsonNode rootNode = objectMapper.readTree(jsonBody);

        JsonNode node = rootNode.path(methodParameter.getParameterName());
        return objectMapper.readValue(rootNode.toString(), methodParameter.getParameterType());
    }

    private String getRequestBody(NativeWebRequest nativeWebRequest) {
        HttpServletRequest servletRequest = nativeWebRequest.getNativeRequest(HttpServletRequest.class);
        String jsonBody = (String) nativeWebRequest.getAttribute(JSONBODYATTRIBUTE, NativeWebRequest.SCOPE_REQUEST);
        if (jsonBody == null) {
            try {
                jsonBody = IOUtils.toString(servletRequest.getInputStream());
                nativeWebRequest.setAttribute(JSONBODYATTRIBUTE, jsonBody, NativeWebRequest.SCOPE_REQUEST);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return jsonBody;
    }
}
