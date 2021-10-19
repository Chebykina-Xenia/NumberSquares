package ru.netology.sqr;

public class SQRService {
    public int squareNumber(int rangeMin, int rangeMax) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int squareNumber = i * i;
            if (squareNumber >= rangeMin && squareNumber <= rangeMax) {
                count++;
            }
        }
        return count;
    }
}