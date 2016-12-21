package com.brekol.srm161.div2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.Collectors;

public class CardCount {

    public String[] dealHands(int numPlayers, String deck) {
        Queue<String> deckQueue = new ArrayDeque<>(Arrays.stream(deck.split("")).collect(Collectors.toList()));

        String[] result = new String[numPlayers];
        Arrays.fill(result, "");
        int counter = 0;
        while (deckQueue.size() >= numPlayers - (counter % numPlayers)) {
            final String top = deckQueue.poll();
            result[counter % numPlayers] += top;
            counter++;

        }
        return result;

    }
}
