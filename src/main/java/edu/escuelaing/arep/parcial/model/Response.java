package edu.escuelaing.arep.parcial.model;

public class Response {

    private String operation;
    private Double input;
    private Double output;

    public Response() {
    }

    public Response(String operation, Double input, Double output) {
        this.operation = operation;
        this.input = input;
        this.output = output;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getInput() {
        return input;
    }

    public void setInput(Double input) {
        this.input = input;
    }

    public Double getOutput() {
        return output;
    }

    public void setOutput(Double output) {
        this.output = output;
    }

}
