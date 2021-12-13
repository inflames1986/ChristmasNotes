package com.inflames1986.christmasnotes.ui.details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.inflames1986.christmasnotes.R;
import com.inflames1986.christmasnotes.domain.Note;

public class NoteDetailsActivity extends AppCompatActivity {

    public static final String ARG_NOTE = "ARG_NOTE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);

        FragmentManager fragmentManager = getSupportFragmentManager(); // получаем саппорт фрэгмент мэнеджер который в рамках транзакция позволяет управлять фрагментами

        Note note = getIntent().getParcelableExtra(ARG_NOTE); //получаем заметку по соотв. Ключу

        fragmentManager.beginTransaction() //начинаем транзакцию
                .replace(R.id.container, NoteDetailsFragment.newInstance(note), "NoteDetailsFragment") //помещаем в контейнер фрагмент из "Хелпер метода" NoteDetailsFragment.newInstance() по Тэгу
                .commit();
    }
}