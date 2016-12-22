package me.jrubio.ZeroStress.Todo;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import me.jrubio.ZeroStress.BaseActivity;
import me.jrubio.ZeroStress.R;
import me.jrubio.ZeroStress.model.ContentProvider.TodoContract;
import me.jrubio.ZeroStress.model.Entity.Todo;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public class TodoActivity extends BaseActivity implements ITodoView {

    public static final String EXTRA_EDIT_TODO = "Todo";

    private ITodoPresenter presenter;

    public ITodoPresenter getPresenter() {
        if (presenter == null) {
            presenter = new TodoPresenter(this, this);
        }
        return presenter;
    }

    public EditText getTitleField() {
        return (EditText) findViewById(R.id.todo_title);
    }

    public EditText getDescriptionField() {
        return (EditText) findViewById(R.id.todo_description);
    }

    public CheckBox getCompletedCheckbox() {
        return (CheckBox) findViewById(R.id.completed);
    }

    public TextView getEditedDateField() {
        return (TextView) findViewById(R.id.todo_edited);
    }

    public EditText getNotesField()  {
        return (EditText) findViewById(R.id.todo_notes);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Edit intent
        Intent intent = getIntent();
        Todo editTodo = intent.getParcelableExtra(EXTRA_EDIT_TODO);
        if (editTodo != null) {
            getPresenter().setEditTodo(editTodo);
        }

        // Toolbar navigation
        this.setBackButtonEnabled(true);
        this.setOnClickBackButton(onBackButtonClickListener);

        // Listeners
        getTitleField().addTextChangedListener(textWatcherListener);
        getDescriptionField().addTextChangedListener(textWatcherListener);

        // Presenter
        getPresenter().updateEditedTime();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        getPresenter().create(
                getTitleField().getText().toString(),
                getDescriptionField().getText().toString(),
                getCompletedCheckbox().isChecked(),
                getNotesField().getText().toString(),
                TodoContract.COMPANY_NAME
        );
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_todo;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_todo, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_delete:
                getPresenter().delete();
                return true;
            case R.id.action_discard:
                getPresenter().discard();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private TextWatcher textWatcherListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            getPresenter().updateEditedTime();
        }
    };

    private View.OnClickListener onBackButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            getPresenter().create(
                    getTitleField().getText().toString(),
                    getDescriptionField().getText().toString(),
                    getCompletedCheckbox().isChecked(),
                    getNotesField().getText().toString(),
                    TodoContract.COMPANY_NAME
            );
        }
    };

    @Override
    public void updateFields(String title, String description, boolean completed, String notes, String company) {
        super.setToolbarTitle(R.string.title_activity_todo_edit);
        getTitleField().setText(title);
        getDescriptionField().setText(description);
        getCompletedCheckbox().setChecked(completed);
        getNotesField().setText(notes);
    }

    @Override
    public void updateEditedField(String date) {
        String message = getString(R.string.edited, date);
        getEditedDateField().setText(Html.fromHtml(message));
    }

    @Override
    public void finishView() {
        finish();
    }

}
