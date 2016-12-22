package me.jrubio.ZeroStress.Todo;

import me.jrubio.ZeroStress.model.Entity.Todo;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public interface ITodoPresenter {

    /**
     * To.Do to edit is saved
     *
     * @param todo
     */
    void setEditTodo(Todo todo);

    /**
     * Create new To.Do or update an old one
     *
     * @param title
     * @param description
     * @param completed
     */
    void create(String title, String description, boolean completed, String Notes, String company);

    /**
     * Delete or discard To.Do
     */
    void delete();

    /**
     * Discard To.Do
     */
    void discard();

    /**
     * Get new Edited Time
     */
    void updateEditedTime();

}
