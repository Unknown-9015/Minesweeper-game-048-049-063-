package com.example.minesweeper_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnCellClickListener{
    RecyclerView gridRecycleView;
    MineGridRecyclerAdapter mineGridRecyclerAdapter;
    MinesweeperGame game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridRecycleView=findViewById(R.id.activity_main_grid);
        gridRecycleView.setLayoutManager(new GridLayoutManager(this,10));
        game=new MinesweeperGame(10);
        mineGridRecyclerAdapter=new MineGridRecyclerAdapter(game.getMineGrid().getCells(),this);
        gridRecycleView.setAdapter(mineGridRecyclerAdapter);
    }

    @Override
    public void cellClick(Cell cell) {
        Toast.makeText(getApplicationContext(), "Cell clicked", Toast.LENGTH_SHORT).show();
    }
}