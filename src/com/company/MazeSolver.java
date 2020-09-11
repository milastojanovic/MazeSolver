package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class MazeSolver {

    static int[][] maze = {
            {2, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 1}
    }; // Mila: start - second 1
    // 0 = wall
    // 1 = path
    // 2 = destination

    static LinkedList<Position> path = new LinkedList<>(); // Mila: will be used as stack

    public static void main(String[] args) {
        Position p = new Position(3, 0); // Mila: x - column, y - row

        path.push(p); // Mila: start

        maze[path.peek().y][path.peek().x] = 0;
//        path.peek(); // Mila: the position where we've been; it does not remove element, it gives the first element of the list
        System.out.println(Arrays.deepToString(maze));
    }
}
