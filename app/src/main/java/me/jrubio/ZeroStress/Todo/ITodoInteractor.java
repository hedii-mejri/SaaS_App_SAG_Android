package me.jrubio.ZeroStress.Todo;

import me.jrubio.ZeroStress.common.ITodoActionsInteractor;
import me.jrubio.ZeroStress.model.Entity.Todo;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public interface ITodoInteractor extends ITodoActionsInteractor {

    /**
     * Insert new To.Do in the database
     *
     * @param todo
     */
    void create(Todo todo);

}
