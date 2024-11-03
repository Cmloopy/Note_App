package manh.note_app.repository

import manh.note_app.model.Note
import manh.note_app.room.NoteDao

class NoteRepository(private val noteDao: NoteDao) {
    suspend fun getNote() = noteDao.getNote()
    suspend fun insertNote(note : Note) = noteDao.insertNote(note)
    suspend fun deleteNote(ids : ArrayList<Note>) {
        val list : ArrayList<Int> = ArrayList()
        ids.forEach { list.add(it.id) }
        noteDao.deleteNote(list)
    }
}