package manh.note_app.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import manh.note_app.model.Note

@Database(
    entities = [Note::class],
    version = 1, exportSchema = false
)
@TypeConverters(DateConverter::class)
abstract class Database : RoomDatabase() {
    abstract val noteDao: NoteDao
}