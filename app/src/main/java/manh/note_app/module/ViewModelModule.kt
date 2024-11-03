package manh.note_app.module

import manh.note_app.viewmodel.NoteViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModelModule = module {
    viewModel {
        NoteViewModel(get())
    }
}