package com.example.pingtai.domain.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class ResultDo implements Serializable {

        private Boolean success;
        private Object data;
        private String message;


        @Override
        public String toString() {
            return "ResultDO{" +
                    "success=" + success +
                    ", data=" + data +
                    ", message='" + message + '\'' +
                    '}';
        }

    }



