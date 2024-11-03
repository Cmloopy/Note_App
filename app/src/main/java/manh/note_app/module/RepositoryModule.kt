package manh.note_app.module

import manh.note_app.repository.NoteRepository
import org.koin.dsl.module

val repoModule = module {
    factory {
        NoteRepository(get())
    }
}