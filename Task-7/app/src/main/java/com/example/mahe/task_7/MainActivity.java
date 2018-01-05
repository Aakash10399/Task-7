package com.example.mahe.task_7;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.DefaultItemAnimator;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    public ArrayList<String> movieList = new ArrayList<>();
    public ArrayList<String> cast = new ArrayList<>();
    public ArrayList<String> desc = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieList.add("Avengers: Infinity War");
        cast.add("Cast : Robert Downey Jr, Chris Evans, Chris Pratt");
        desc.add("Iron Man, Thor, the Hulk and the rest of the Avengers unite to battle their most powerful enemy yet -- the evil Thanos.");
        movieList.add("Black Panther");
        cast.add("Cast : Chadwick Boseman, Michael B. Jordan, Lupita Nyong'o");
        desc.add("Black Panther (Chadwick Boseman) springs into action when an old enemy threatens the fate of his nation and the world.");
        movieList.add("Deadpool 2");
        cast.add("Cast : Ryan Renolds, Josh Brolin, Morena Baccarin");
        desc.add("Wisecracking mercenary Deadpool battles ninjas, the yakuza and a pack of aggressive canines as he embarks on a new adventure.");
        movieList.add("Jurassic World: Fallen Kingdom");
        cast.add("Cast : Chris Pratt, Bryce Dallas, Jeff Goldblum");
        desc.add("Four years after the destruction of the Jurassic World theme park, Owen Grady and Claire Dearing return to the island of Isla Nublar to save the remaining dinosaurs from a volcano that's about to erupt.");
        movieList.add("Aquaman");
        cast.add("Cast : Jason Momoa, Amber Heard, Willem Dafoe");
        desc.add("Aquaman finds himself caught between a surface world that ravages the sea and the underwater Atlanteans who are ready to revolt.");
        movieList.add("Solo: A Star Wars Story");
        cast.add("Cast : Alden Ehrenreich, Emilia Clarke, Donald Glover");
        desc.add("Solo: A Star Wars Story, or simply Solo, is an upcoming American space Western film centered on Han Solo, a character from the Star Wars franchise.");
        movieList.add("Avengers: Infinity War");
        cast.add("Cast : Robert Downey Jr, Chris Evans, Chris Pratt");
        desc.add("Iron Man, Thor, the Hulk and the rest of the Avengers unite to battle their most powerful enemy yet -- the evil Thanos.");
        movieList.add("Black Panther");
        cast.add("Cast : Chadwick Boseman, Michael B. Jordan, Lupita Nyong'o");
        desc.add("Black Panther (Chadwick Boseman) springs into action when an old enemy threatens the fate of his nation and the world.");
        movieList.add("Deadpool 2");
        cast.add("Cast : Ryan Renolds, Josh Brolin, Morena Baccarin");
        desc.add("Wisecracking mercenary Deadpool battles ninjas, the yakuza and a pack of aggressive canines as he embarks on a new adventure.");
        movieList.add("Jurassic World: Fallen Kingdom");
        cast.add("Cast : Chris Pratt, Bryce Dallas, Jeff Goldblum");
        desc.add("Four years after the destruction of the Jurassic World theme park, Owen Grady and Claire Dearing return to the island of Isla Nublar to save the remaining dinosaurs from a volcano that's about to erupt.");
        movieList.add("Aquaman");
        cast.add("Cast : Jason Momoa, Amber Heard, Willem Dafoe");
        desc.add("Aquaman finds himself caught between a surface world that ravages the sea and the underwater Atlanteans who are ready to revolt.");
        movieList.add("Solo: A Star Wars Story");
        cast.add("Cast : Alden Ehrenreich, Emilia Clarke, Donald Glover");
        desc.add("Solo: A Star Wars Story, or simply Solo, is an upcoming American space Western film centered on Han Solo, a character from the Star Wars franchise.");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        RecyclerAdapter adapter = new RecyclerAdapter(movieList,cast,desc);
        RecyclerView.LayoutManager layoutManger = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManger);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}
