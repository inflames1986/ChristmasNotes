package com.inflames1986.christmasnotes.ui.list;


import com.inflames1986.christmasnotes.domain.Note;

import java.util.List;

/*** интерфейс View, которая будет отображать города
 *
 *
 */

public interface NotesListView {

    void showNotes (List<Note> notes); //имеет медод отображения городов, передаем ему список городов, который он будет отображать
}
