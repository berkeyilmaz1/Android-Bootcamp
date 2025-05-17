package com.duzceders.bootcamp.gamepass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.duzceders.bootcamp.R

class GamePassActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_pass)
        
        setupFeaturedGames()
    }
    
    private fun setupFeaturedGames() {
        val recyclerView = findViewById<RecyclerView>(R.id.featuredGamesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = FeaturedGamesAdapter(getFeaturedGames())
    }
    
    private fun getFeaturedGames(): List<FeaturedGame> {
        return listOf(
            FeaturedGame(R.drawable.game_image_1, "Deathloop"), 
            FeaturedGame(R.drawable.game_image_2, "Game 2")
        )
    }
}

data class FeaturedGame(val imageRes: Int, val title: String)

class FeaturedGamesAdapter(private val games: List<FeaturedGame>) : 
    RecyclerView.Adapter<FeaturedGamesAdapter.GameViewHolder>() {
    
    class GameViewHolder(view: android.view.View) : RecyclerView.ViewHolder(view) {
        val imageView: android.widget.ImageView = view.findViewById(R.id.gameImage)
        val titleView: android.widget.TextView = view.findViewById(R.id.gameTitle)
    }
    
    override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): GameViewHolder {
        val view = android.view.LayoutInflater.from(parent.context)
            .inflate(R.layout.item_featured_game, parent, false)
        return GameViewHolder(view)
    }
    
    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val game = games[position]
        holder.imageView.setImageResource(game.imageRes)
        holder.titleView.text = game.title
    }
    
    override fun getItemCount() = games.size
}
