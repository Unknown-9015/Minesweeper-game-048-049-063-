package com.example.minesweeper_game;

import java.util.ArrayList;
import java.util.List;

public class MineGrid {
    private List<Cell> cells;
    private  int size;
    public MineGrid(int size)
    {
        this.size=size;
        cells=new ArrayList<>();
        for(int i=0;i<size*size;i++)
        {
            cells.add(new Cell(Cell.BLANK));
        }
    }

    public List<Cell> getCells() {
        return cells;
    }
}
