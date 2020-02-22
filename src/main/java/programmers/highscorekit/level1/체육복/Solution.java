package programmers.highscorekit.level1.체육복;

import java.util.*;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Set<Integer> borrowedStudents = new HashSet<>();

        for (int lostStudentNumber : lost) {
            for (int reserveStudentNumber : reserve) {
                if (lostStudentNumber == reserveStudentNumber) {
                    borrowedStudents.add(reserveStudentNumber);
                }
            }
        }

        for (int lostStudentNumber : lost) {
            if (borrowedStudents.contains(lostStudentNumber)) {
                continue;
            }

            boolean borrowed = false;

            for (int reserveStudentNumber : reserve) {
                if (reserveStudentNumber == lostStudentNumber - 1 && !borrowedStudents.contains(reserveStudentNumber)) {
                    borrowed = true;
                    borrowedStudents.add(reserveStudentNumber);
                    break;
                }

                if (reserveStudentNumber == lostStudentNumber + 1 && !borrowedStudents.contains(reserveStudentNumber)) {
                    borrowed = true;
                    borrowedStudents.add(reserveStudentNumber);
                    break;
                }
            }

            if (!borrowed) {
                answer--;
            }
        }

        return answer;
    }
}
