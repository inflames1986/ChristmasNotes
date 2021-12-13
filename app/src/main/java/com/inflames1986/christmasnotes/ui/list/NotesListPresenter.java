package com.inflames1986.christmasnotes.ui.list;

import com.inflames1986.christmasnotes.domain.Note;
import com.inflames1986.christmasnotes.domain.NotesRepository;

import java.util.List;

public class NotesListPresenter {

    private NotesListView view; //презентеру нужна вьюха, которой он будет говорить что делать

    private NotesRepository repository; // и нужен источник данных

    public NotesListPresenter(NotesListView view, NotesRepository repository) {// предоставляем параметры конструктора
        this.view = view;
        this.repository = repository;
    }

    public void requestNotes() { // метод будет у презентера запрашивать список городов

        List<Note> result = repository.getNotes(); //запрашиваем у репозитория список заметок

        view.showNotes(result); // передаем вьюхе результат

    }
}

