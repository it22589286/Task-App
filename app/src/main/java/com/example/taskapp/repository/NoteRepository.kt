package com.example.taskapp.repository

import com.example.taskapp.database.NoteDatabse
import com.example.taskapp.model.Note

class NoteRepository (private val db:NoteDatabse){

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query:String?) = db.getNoteDao().searchNote(query)
}