package com.company;

import java.util.LinkedList;

public class Maze {
    public int[][] maze;
    public LinkedList<Position> path = new LinkedList<>(); // one cannot push to a null list; therefore it must be initialised
    public Position start;
}
