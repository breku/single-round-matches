package com.brekol.srm148.div1;

import java.util.*;

/**
 * Created by brekol on 07.12.16.
 */
public class CircleGame {


    private Map<String, Integer> values = new HashMap<>();

    public int cardsLeft(String deck) {
        init();

        int[] cardValues = Arrays.stream(deck.split("")).map(x -> values.get(x)).mapToInt((Integer::intValue)).toArray();
        List<Integer> indexes = new ArrayList<>();

        removeK(cardValues);

        boolean check = check(cardValues, indexes);
        while (check) {
            check = check(cardValues, indexes);
            if (!check) {
                check = tryWrappedCards(cardValues);
            }

        }

        int result = 0;
        for (int cardValue : cardValues) {
            if (cardValue > 0) {
                result++;
            }
        }

        return result;

    }

    private boolean tryWrappedCards(int[] cardValues) {
        for (int i = 0, j = cardValues.length - 1; i < j; ) {

            if (cardValues[i] == 0) {
                i++;
            }

            if (cardValues[j] == 0) {
                j--;
            }

            if (cardValues[i] > 0 && cardValues[j] > 0) {
                if (cardValues[i] + cardValues[j] == 13) {
                    cardValues[i] = 0;
                    cardValues[j] = 0;
                    return true;
                } else {
                    return false;
                }

            }
        }
        return false;
    }

    private void removeK(int[] cardValues) {
        for (int i = 0; i < cardValues.length; i++) {
            if (cardValues[i] == 13) {
                cardValues[i] = 0;
            }
        }
    }

    private boolean check(int[] cardValues, List<Integer> indexes) {
        for (int i = 0; i < cardValues.length; i++) {
            indexes.clear();
            int sum = 0;
            for (int j = 0; j < cardValues.length; j++) {
                if (cardValues[j] > 0) {
                    sum += cardValues[j];
                    indexes.add(j);
                    if (sum == 13) {
                        zeroCardValuesFormIndexes(indexes, cardValues);
                        return true;
                    } else if (sum < 13 && indexes.size() <= 2) {
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
        return false;
    }

    private void zeroCardValuesFormIndexes(List<Integer> indexes, int[] cardValues) {
        for (int i = 0; i < indexes.size(); i++) {
            cardValues[indexes.get(i)] = 0;
        }
    }

    private void init() {
        values.put("A", 1);
        values.put("2", 2);
        values.put("3", 3);
        values.put("4", 4);
        values.put("5", 5);
        values.put("6", 6);
        values.put("7", 7);
        values.put("8", 8);
        values.put("9", 9);
        values.put("T", 10);
        values.put("J", 11);
        values.put("Q", 12);
        values.put("K", 13);
    }

}
