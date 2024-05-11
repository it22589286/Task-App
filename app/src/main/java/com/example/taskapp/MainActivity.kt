package com.example.taskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.taskapp.database.NoteDatabse
import com.example.taskapp.repository.NoteRepository
import com.example.taskapp.viewmodel.NoteViewModeFactory
import com.example.taskapp.viewmodel.NoteViewModel

class MainActivity : AppCompatActivity() {

    lateinit var noteViewModel: NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViewModel()
    }
    private fun setupViewModel(){
        val noteRepository = NoteRepository(NoteDatabse(this))
        val viewModelProviderFactory = NoteViewModeFactory(application,noteRepository)
        noteViewModel =ViewModelProvider(this,viewModelProviderFactory)[NoteViewModel::class.java]
    }
}