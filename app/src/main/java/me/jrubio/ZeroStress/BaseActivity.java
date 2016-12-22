package me.jrubio.ZeroStress;

import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mikepenz.aboutlibraries.Libs;
import com.mikepenz.aboutlibraries.LibsBuilder;

import me.jrubio.ZeroStress.model.Connection.Database;

/**
 *
 * @author Hedi MEJRI (@hedii-mejri)
 *
 */
public abstract class BaseActivity extends AppCompatActivity {

    public Toolbar getToolbar() {
        return (Toolbar) findViewById(R.id.toolbar);
    }

    private Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        //db = new Database(getApplicationContext());

        if (getToolbar() != null) {
            setSupportActionBar(getToolbar());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_base, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_about:
                new LibsBuilder()
                        .withFields(R.string.class.getFields())
                        .withActivityTitle(getString(R.string.title_activity_about))
                        .withActivityStyle(Libs.ActivityStyle.LIGHT_DARK_TOOLBAR)
                        .withLicenseShown(false)
                        .withAboutIconShown(true)
                        .start(this);
                return true;

            /*case R.id.action_reset:
                db.
                return true;
                */

        }
        return super.onOptionsItemSelected(item);
    }

    public void setToolbarTitle(@StringRes int title) {
        getToolbar().setTitle(title);
    }

    public void setBackButtonEnabled(boolean enabled) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(enabled);
            getSupportActionBar().setHomeButtonEnabled(enabled);
        }
    }

    public void setOnClickBackButton(View.OnClickListener listener) {
        getToolbar().setNavigationOnClickListener(listener);
    }

    protected abstract int getLayoutResource();

}
