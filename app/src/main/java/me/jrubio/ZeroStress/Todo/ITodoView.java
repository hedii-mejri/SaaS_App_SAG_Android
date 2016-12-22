package me.jrubio.ZeroStress.Todo;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public interface ITodoView {

    /**
     * When To.Do to edit is sent, update contents in the UI fields
     *
     * @param title field
     * @param description field
     * @param completed checkbox
     */
    void updateFields(String title, String description, boolean completed, String Notes, String company);

    /**
     * Updates the date of the Edited field
     *
     * @param date string
     */
    void updateEditedField(String date);

    /**
     * Finish view layer
     */
    void finishView();


}
