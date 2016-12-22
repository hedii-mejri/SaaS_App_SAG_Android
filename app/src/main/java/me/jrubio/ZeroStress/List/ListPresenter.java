package me.jrubio.ZeroStress.List;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

import me.jrubio.ZeroStress.R;
import me.jrubio.ZeroStress.model.Entity.Todo;
import me.jrubio.ZeroStress.model.TodoRepository;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public class ListPresenter implements IListPresenter {

    private IListView view;
    private IListInteractor interactor;
    private Context context;

    public ListPresenter(IListView view, Context context) {
        this.view       = view;
        this.interactor = new TodoRepository(context.getContentResolver());
        this.context    = context;
    }

    @Override
    public void refreshSession() {
        view.setTodos(interactor.get());
        view.notifyListDataSetChanged();
    }

    @Override
    public void onAddTodoButtonClick() {
        view.showTodoView();
    }

    @Override
    public void onClickTodoItemToEdit(Todo todo) {
        view.showTodoViewToEdit(todo);
    }

    @Override
    public void onLongClickTodoItem(Todo todo) {

        if(todo.getTitle().startsWith("[A")){
            CharSequence items[] = new CharSequence[] {
                    context.getString(R.string.section) + ": " +context.getString(R.string.sectionA),
                    context.getString(R.string.edit),
                    context.getString(R.string.delete)
            };
            view.showItemDialog(todo, items);
        }
        else if(todo.getTitle().startsWith("[B")){
            CharSequence items[] = new CharSequence[] {
                    context.getString(R.string.section) + ": " +context.getString(R.string.sectionB),
                    context.getString(R.string.edit),
                    context.getString(R.string.delete)
            };
            view.showItemDialog(todo, items);
        }
        else if(todo.getTitle().startsWith("[C")){
            CharSequence items[] = new CharSequence[] {
                    context.getString(R.string.section) + ": " +context.getString(R.string.sectionC),
                    context.getString(R.string.edit),
                    context.getString(R.string.delete)
            };
            view.showItemDialog(todo, items);
        }
        else if(todo.getTitle().startsWith("[D")){
            CharSequence items[] = new CharSequence[] {
                    context.getString(R.string.section) + ": " +context.getString(R.string.sectionD),
                    context.getString(R.string.edit),
                    context.getString(R.string.delete)
            };
            view.showItemDialog(todo, items);
        }
        else if(todo.getTitle().startsWith("[E")){
            CharSequence items[] = new CharSequence[] {
                    context.getString(R.string.section) + ": " +context.getString(R.string.sectionE),
                    context.getString(R.string.edit),
                    context.getString(R.string.delete)
            };
            view.showItemDialog(todo, items);
        }
        else {
            CharSequence items[] = new CharSequence[]{
                    context.getString(R.string.section)+ ": " +context.getString(R.string.sectionX),
                    context.getString(R.string.edit),
                    context.getString(R.string.delete)
            };

            view.showItemDialog(todo, items);
        }
    }

    @Override
    public void updateTodoIsCompleted(Todo todo, boolean completed, int position) {
        todo.setCompleted(completed);
        interactor.update(todo);
        ArrayList<Todo> todoList = interactor.get();
        view.notifyListItemRemoved(position);
        view.setTodos(todoList);
        for (Todo todoObject : todoList) {
            if (todoObject.getId() == todo.getId()) {
                view.notifyListItemInserted(todoList.indexOf(todoObject));
            }
        }
    }

    @Override
    public void delete(Todo todo) {
        interactor.delete(todo);
        view.setTodos(interactor.get());
        view.notifyListDataSetChanged();
        Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show();
    }

}
