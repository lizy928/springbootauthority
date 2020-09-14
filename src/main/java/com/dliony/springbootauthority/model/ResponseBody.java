package com.dliony.springbootauthority.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @author lzy
 * @date 2020/9/14
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseBody {

    /**
     * 状态码
     */
    private int status;
    /**
     * 操作结果
     */
    private Object message;
    /**
     * 数据结果
     */
    private Object data;

    public ResponseBody(HttpStatus status, Object message, Object data) {
        this.status = status.value();
        this.message = message;
        this.data = data;
    }

    public ResponseBody(HttpStatus status, Object message) {
        this.status = status.value();
        this.message = message;
    }

    public ResponseBody(HttpStatus status) {
        this.status = status.value();
        this.message = status.name();
    }

    public ResponseBody(Object data) {
        this.status = HttpStatus.OK.value();
        this.message = HttpStatus.OK.name();
        this.data = data;
    }
}
