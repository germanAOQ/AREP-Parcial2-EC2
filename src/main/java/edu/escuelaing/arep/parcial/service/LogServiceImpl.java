package edu.escuelaing.arep.parcial.service;

public class LogServiceImpl implements LogService{
    @Override
    public Double calculateLog(Double number) {
        return Math.log(number);
    }
}
