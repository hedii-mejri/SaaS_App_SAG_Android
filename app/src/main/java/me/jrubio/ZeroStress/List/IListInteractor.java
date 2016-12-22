package me.jrubio.ZeroStress.List;

import java.util.ArrayList;

import me.jrubio.ZeroStress.common.ITodoActionsInteractor;
import me.jrubio.ZeroStress.model.Entity.Todo;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public interface IListInteractor extends ITodoActionsInteractor {

    /**
     * Get all To.Dos from database
     * @return ArrayList
     */
    ArrayList<Todo> get();

    /**
     * Update old To.Do
     *
     * @param todo
     */
    void update(Todo todo);


}
