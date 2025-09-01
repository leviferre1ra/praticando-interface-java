package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract(){
    }

    public Contract(LocalDate date, Double totalValue, Integer number) {
        this.date = date;
        this.totalValue = totalValue;
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double localValue) {
        this.totalValue = localValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
