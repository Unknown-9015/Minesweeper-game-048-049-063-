package com.example.minesweeper_game;

public class MinesweeperGame {
    private MineGrid mineGrid;

    public MinesweeperGame(int size,int numberBombs)
    {
        mineGrid=new MineGrid(size);
        mineGrid.generateGrid(numberBombs);
    }

    public MineGrid getMineGrid()
    {
        return mineGrid;
    }

}
