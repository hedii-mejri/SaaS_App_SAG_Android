package me.jrubio.ZeroStress.model.Entity;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

import me.jrubio.ZeroStress.model.ContentProvider.TodoContract;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public class Todo implements Parcelable {

    public static final long UNSAVED_ID = Long.MAX_VALUE;

    private long id;
    private String title;
    private String description;
    private String notes;
    private Long edited;
    private boolean completed;
    private String company;

    /**
     * Empty new To.Do constructor
     */
    public Todo() {
        this.id          = UNSAVED_ID;
        this.title       = "";
        this.description = "";
        this.edited      = new Date().getTime();
        this.completed   = false;
        this.notes       = "";
        this.company     ="";
    }

    /**
     * Fill new To.Do constructor
     *
     * @param id
     * @param title
     * @param description
     * @param edited
     * @param completed
     * @param notes
     */
    public Todo(Long id, String title, String description, Long edited, boolean completed, String notes, String company) {
        this.id          = id;
        this.title       = title;
        this.description = description;
        this.edited      = edited;
        this.completed   = completed;
        this.notes       = notes;
        this.company     = company;
    }

    /**
     * Map POJO from database
     *
     * @param cursor
     */
    public Todo(Cursor cursor) {
        int idIdx           = cursor.getColumnIndex(TodoContract._ID);
        int titleIdx        = cursor.getColumnIndex(TodoContract.TITLE);
        int descriptionIdx  = cursor.getColumnIndex(TodoContract.DESCRIPTION);
        int editedIdx       = cursor.getColumnIndex(TodoContract.EDITED);
        int completedIdx    = cursor.getColumnIndex(TodoContract.COMPLETED);
        int notesIdx        = cursor.getColumnIndex(TodoContract.NOTES);
        int companyIdx      = cursor.getColumnIndex(TodoContract.COMPANY);

        this.id          = cursor.getInt(idIdx);
        this.title       = cursor.getString(titleIdx);
        this.description = cursor.getString(descriptionIdx);
        this.edited      = cursor.getLong(editedIdx);
        this.completed   = cursor.getInt(completedIdx) == 1;
        this.notes       = cursor.getString(notesIdx);
        this.company     = cursor.getString(companyIdx);
    }

    /**
     * Map parcel to object
     *
     * @param in
     */
    public Todo(Parcel in) {
        this.id          = in.readLong();
        this.title       = in.readString();
        this.description = in.readString();
        this.edited      = in.readLong();
        this.completed   = in.readInt() != 0;
        this.notes       = in.readString();
        this.company     = in.readString();
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEdited(Long edited) {
        this.edited = edited;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getEdited() {
        return edited;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeLong(edited);
        dest.writeInt(completed ? 1 : 0);
        dest.writeString(notes);
        dest.writeString(company);
    }

    public static final Parcelable.Creator<Todo> CREATOR = new Parcelable.Creator<Todo>() {
        public Todo createFromParcel(Parcel in) {
            return new Todo(in);
        }

        public Todo[] newArray(int size) {
            return new Todo[size];
        }
    };
}
