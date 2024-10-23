package com.StudyAPI.handller;

import java.util.Date;

public class ResponseError {
    private Date timestamp = new Date();
    private  String status;
    private  int statusCode ;
    private  String error;

    public  ResponseError(String status, String error, int statusCode){
        this.error = error;
        this.statusCode = statusCode;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseError{" +
                "timestamp=" + timestamp +
                ", status='" + status + '\'' +
                ", statusCode=" + statusCode +
                ", error='" + error + '\'' +
                '}';
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
