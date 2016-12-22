package me.jrubio.ZeroStress.common;

import me.jrubio.ZeroStress.model.Entity.Todo;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public interface ITodoActionsInteractor {

    /**
     * Delete To.Do in the database
     * @param todo
     */
    void delete(Todo todo);

}
