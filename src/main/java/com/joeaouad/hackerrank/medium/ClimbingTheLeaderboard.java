package com.joeaouad.hackerrank.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClimbingTheLeaderboard {

    /**
     * Computes player ranking for each game.
     *
     * @param ranked The current rankings.
     * @param player The player's game scores.
     * @return The player's ranking for each game.
     */
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> playerRank = new ArrayList<>();
        for (int playerScore : player) {

            int rank = 1;
            for (int i = 0; i < ranked.size(); i++) {
                if (playerScore >= ranked.get(i)) {
                    // 1-based ranking system
                    playerRank.add(rank);

                    // Update rankings
                    ranked.add(i, playerScore);
                    break; // code-smell

                } else if (i == 0 || !Objects.equals(ranked.get(i - 1), ranked.get(i))) {
                    rank++;

                    // Player is still unranked
                    if (i == ranked.size() - 1) {
                        playerRank.add(rank);
                        // Update rankings
                        ranked.add(playerScore); // Adds 1 iteration => exit
                        break; // code-smell
                    }
                }

            }
        }
        return playerRank;
    }
}
