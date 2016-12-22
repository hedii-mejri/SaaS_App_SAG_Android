package me.jrubio.ZeroStress.model;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

import java.util.ArrayList;
import java.util.Date;

import me.jrubio.ZeroStress.CompanyLoginActivity;
import me.jrubio.ZeroStress.List.IListInteractor;
import me.jrubio.ZeroStress.Todo.ITodoInteractor;
import me.jrubio.ZeroStress.model.ContentProvider.TodoContract;
import me.jrubio.ZeroStress.model.Entity.Todo;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public class TodoRepository implements IListInteractor, ITodoInteractor {

    private ContentResolver contentResolver;

    //private

    public ContentResolver getContentResolver() {
        return contentResolver;
    }

    public TodoRepository(ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    @Override
    public ArrayList<Todo> get() {
        //String whereCond[] = {TodoContract.COMPANY_NAME};
        ArrayList<Todo> todoList = new ArrayList<>();
        Cursor cursor = getContentResolver().query(
                TodoContract.CONTENT_URI,
                TodoContract.PROJECTION_ALL,
                TodoContract.COMPANY+"='" + CompanyLoginActivity.COMPANY_NAME +"'",
                null ,
                TodoContract.COMPLETED + " ASC, " +
                TodoContract.EDITED + " ASC");




        if (null == cursor || !cursor.moveToNext()) {
            return todoList;
        }

        do {
            Todo todo = new Todo(cursor);
            //System.out.println(todo.getCompany());
            todoList.add(todo);
        } while (cursor.moveToNext());

        cursor.close();



        return todoList;
    }

    @Override
    public void update(Todo todo) {
        todo.setEdited(new Date().getTime());
        save(todo);
    }

    @Override
    public void create(Todo todo) {
        save(todo);
    }

    @Override
    public void delete(Todo todo) {
        String[] selectionArgs = {String.valueOf(todo.getId())};
        getContentResolver().delete(
                TodoContract.CONTENT_URI,
                TodoContract._ID + " = ?",
                selectionArgs);
    }

    private void save(Todo todo) {
        ContentValues values = new ContentValues();
        values.put(TodoContract.TITLE, todo.getTitle());
        values.put(TodoContract.DESCRIPTION, todo.getDescription());
        values.put(TodoContract.EDITED, todo.getEdited());
        values.put(TodoContract.COMPLETED, todo.isCompleted());
        values.put(TodoContract.NOTES, todo.getNotes());
        values.put(TodoContract.COMPANY, TodoContract.COMPANY_NAME);

        if (todo.getId() == Todo.UNSAVED_ID) {
            Uri insertUri = getContentResolver().insert(TodoContract.CONTENT_URI, values);
            todo.setId(Long.valueOf(insertUri.getLastPathSegment()));
        } else {
            String[] selectionArgs = {String.valueOf(todo.getId())};
            getContentResolver().update(
                    TodoContract.CONTENT_URI,
                    values,
                    TodoContract._ID + " = ?",
                    selectionArgs);
        }
    }
}
