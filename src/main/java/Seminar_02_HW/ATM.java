package Seminar_02_HW;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ATM {
    private final Map<Integer, Integer> banknotes;

    public ATM() {
        banknotes = new TreeMap<>(Comparator.reverseOrder());
        banknotes.put(50, 2);
        banknotes.put(100, 4);
        banknotes.put(200, 7);
        banknotes.put(500, 10);
        banknotes.put(1000, 8);
        banknotes.put(2000, 6);
        banknotes.put(5000, 2);
    }

    public Map<Integer, Integer> getCash(int value) throws NoBanknotesToWithdrawException{
        int currCash = value;
        Map<Integer, Integer> withdraw = new TreeMap<>();
        for (Integer banknote : banknotes.keySet()) {
            int banknotesCount = currCash / banknote;
            if (banknotesCount > 0) {
                if (banknotesCount <= banknotes.get(banknote)) {
                    withdraw.put(banknote, banknotesCount);
                    currCash = currCash % banknote;
                } else {
                    withdraw.put(banknote, banknotes.get(banknote));
                    currCash = currCash - banknote * banknotes.get(banknote);
                }
            }
        }
        if (currCash != 0){
            throw new NoBanknotesToWithdrawException("Невозможно выдать сумму " + value, Integer.toString(currCash));
        }
        printCash(withdraw);
        return banknotes;
    }

    public void printCash(Map<Integer, Integer> cash) {
        System.out.printf("Выдача: \n");
        for (Integer k : cash.keySet()) {
            System.out.printf("Банкнот %d: %d\n", k, cash.get(k));
        }

    }

    public static void main(String[] args) {
        try {
            new ATM().getCash(18750);
        } catch (NoBanknotesToWithdrawException e) {
            throw new RuntimeException(e);
        }
    }
}
