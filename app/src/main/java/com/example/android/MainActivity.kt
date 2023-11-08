package com.example.android

import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        var list: ArrayList<GroupApp> = ArrayList<GroupApp>()

        var listApp: ArrayList<App> = ArrayList<App>()
        listApp.add(App("Football Manager", R.drawable.game1, 4.7))
        listApp.add(App("Grand Theft Auto: San Andreas", R.drawable.game2, 4.6))
        listApp.add(App("Half-Life 2", R.drawable.game3, 4.0))
        listApp.add(App("Baldur's Gates 3", R.drawable.game4, 4.1))
        listApp.add(App("Call of Duty: Modern Warfare", R.drawable.game5, 4.8))
        list.add(GroupApp("Top-rated games", listApp))

        var listApp1: ArrayList<App> = ArrayList<App>()
        listApp1.add(App("Assasin's Creed Odyssey", R.drawable.game6, 4.7))
        listApp1.add(App("Call of Duty: Modern Warfare", R.drawable.game5, 4.6))
        listApp1.add(App("Baldur's Gates 3", R.drawable.game4, 4.0))
        listApp1.add(App("Half-Life 2", R.drawable.game3, 4.1))
        listApp1.add(App("Grand Theft Auto: San Andreas", R.drawable.game2, 4.8))
        list.add(GroupApp("Offline games", listApp1))

        var listApp2: ArrayList<App> = ArrayList<App>()
        listApp2.add(App("Football Manager", R.drawable.game1, 4.7))
        listApp2.add(App("Grand Theft Auto: San Andreas", R.drawable.game2, 4.6))
        listApp2.add(App("Half-Life 2", R.drawable.game3, 4.0))
        listApp2.add(App("Baldur's Gates 3", R.drawable.game4, 4.1))
        listApp2.add(App("Call of Duty: Modern Warfare", R.drawable.game5, 4.8))
        list.add(GroupApp("Stylized games", listApp2))

        var listApp3: ArrayList<App> = ArrayList<App>()
        listApp3.add(App("Assasin's Creed Odyssey", R.drawable.game6, 4.7))
        listApp3.add(App("Call of Duty: Modern Warfare", R.drawable.game5, 4.6))
        listApp3.add(App("Baldur's Gates 3", R.drawable.game4, 4.0))
        listApp3.add(App("Half-Life 2", R.drawable.game3, 4.1))
        listApp3.add(App("Grand Theft Auto: San Andreas", R.drawable.game2, 4.8))
        list.add(GroupApp("Roguelike games", listApp3 ))

        val customAdapter: GroupAdapater = GroupAdapater(list, this)

        val listView = findViewById<RecyclerView>(R.id.recyclerViewGroup)
        listView.adapter = customAdapter
        listView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

    }

}

