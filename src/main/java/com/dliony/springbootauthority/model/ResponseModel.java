package com.dliony.springbootauthority.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
/**
 * @author lzy
 * @date 2020/9/14
 */
public class ResponseModel extends ResponseEntity<ResponseBody> {

    public ResponseModel() {
        super(new ResponseBody(HttpStatus.OK), HttpStatus.OK);
    }

    public ResponseModel(Object result) {
        super(new ResponseBody(result), HttpStatus.OK);
    }

    public ResponseModel(HttpStatus status) {
        super(new ResponseBody(status), status);
    }

    public ResponseModel(Object result, HttpStatus status) {
        super(new ResponseBody(status, status.name(), result), status);
    }

    public ResponseModel(HttpStatus status, String message) {
        super(new ResponseBody(status, message, null), status);
    }

    public ResponseModel(Object result, String message) {

        super(new ResponseBody(HttpStatus.OK, message, result), HttpStatus.OK);
    }

    public ResponseModel(HttpStatus status, String message, Object data) {
        super(new ResponseBody(status, message, data), status);
    }
}
