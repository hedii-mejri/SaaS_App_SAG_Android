package me.jrubio.ZeroStress.List;

import me.jrubio.ZeroStress.model.Entity.Todo;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public interface IListPresenter {

    /**
     * Refresh data in view layer
     */
    void refreshSession();

    /**
     * Action when the user click on Fab button
     */
    void onAddTodoButtonClick();

    /**
     * Action when the user click to edit on To.Do item
     *
     * @param todo
     */
    void onClickTodoItemToEdit(Todo todo);

    /**
     * Action when the user long click on To.Do item
     *
     * @param todo
     */
    void onLongClickTodoItem(Todo todo);

    /**
     * Update To.Do completed property
     *
     * @param todo
     * @param completed
     * @param position
     */
    void updateTodoIsCompleted(Todo todo, boolean completed, int position);

    /**
     * Delete old To.Do
     *
     * @param todo
     */
    void delete(Todo todo);


}
