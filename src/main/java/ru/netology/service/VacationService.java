package ru.netology.service;
public class VacationService {
    public int calculateMonth(int income, int expenses, int threshold) {
        int cash = 0;
        int monthVacation = 0;
        for (int i = 1; i <= 12; i++) {
            if (cash < threshold) {
                cash += income - expenses;
            } else {
                cash = (cash - expenses) / 3;
                monthVacation++;
            }
        }
        return monthVacation;
    }
}
