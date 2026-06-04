package java_learning.lld.problems.parkinglot.dto;

import java_learning.lld.problems.parkinglot.entity.Receipt;

public class ExitResponseDTO {
    private boolean status;
    private String message;
    private Receipt receipt;
    public ExitResponseDTO(boolean status, String message, Receipt receipt) {
        this.status = status;
        this.message = message;
        this.receipt = receipt;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Receipt getReceipt() {
        return receipt;
    }
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }
    @Override
    public String toString() {
        return "ExitResponseDTO [status=" + status + ", message=" + message + ", receipt=" + receipt + "]";
    }

    
}
