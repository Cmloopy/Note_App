package manh.note_app.utils

import manh.note_app.databinding.ItemBinding
import manh.note_app.model.Note

interface INote {
    fun onClick(note : Note, position : Int, view : ItemBinding)
    fun onLongClick(note : Note, position : Int, view : ItemBinding)
}