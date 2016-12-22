package me.jrubio.ZeroStress.Todo;

import android.content.Context;
import android.widget.Toast;

import java.util.Date;

import me.jrubio.ZeroStress.common.ParseDate;
import me.jrubio.ZeroStress.model.ContentProvider.TodoContract;
import me.jrubio.ZeroStress.model.Entity.Todo;
import me.jrubio.ZeroStress.model.TodoRepository;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public class TodoPresenter implements ITodoPresenter {

    private ITodoView view;
    private ITodoInteractor interactor;
    private Context context;

    private Todo editTodo;

    public TodoPresenter(ITodoView view, Context context) {
        this.view       = view;
        this.interactor = new TodoRepository(context.getContentResolver());
        this.context    = context;
    }

    @Override
    public void setEditTodo(Todo todo) {
        this.editTodo = todo;
        view.updateFields(todo.getTitle(), todo.getDescription(), todo.isCompleted(), todo.getNotes(), todo.getCompany());
        view.updateEditedField(ParseDate.parseDate(todo.getEdited(), ParseDate.HOUR_PATTERN));
    }

    @Override
    public void create(String title, String description, boolean completed, String notes, String company) {
        if (!title.equals("") || !description.equals("")) {
            Todo todo = (this.editTodo != null) ? this.editTodo : new Todo();
            todo.setTitle(title);
            todo.setDescription(description);
            todo.setNotes(notes);
            todo.setCompleted(completed);
            todo.setEdited(new Date().getTime());
            todo.setCompany(TodoContract.COMPANY_NAME);
            interactor.create(todo);
            Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show();
        }
        view.finishView();
    }

    @Override
    public void delete() {
        if (editTodo != null) {
            interactor.delete(editTodo);
            Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show();
        }
        view.finishView();
    }

    @Override
    public void discard() {
        Toast.makeText(context, "Discarded", Toast.LENGTH_SHORT).show();
        view.finishView();
    }

    @Override
    public void updateEditedTime() {
        view.updateEditedField(ParseDate.parseDate(null, ParseDate.HOUR_PATTERN));
    }

}
