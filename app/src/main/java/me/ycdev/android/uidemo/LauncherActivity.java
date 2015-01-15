package me.ycdev.android.uidemo;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;

import me.ycdev.android.uidemo.base.GridEntriesActivity;
import me.ycdev.android.uidemo.drawables.DrawablesActivity;

public class LauncherActivity extends GridEntriesActivity {
    @Override
    protected boolean needLoadIntentsAsync() {
        return true;
    }

    @Override
    protected List<ActivityEntry> getIntents() {
        List<ActivityEntry> activities = new ArrayList<ActivityEntry>();
        activities.add(new ActivityEntry(
                new Intent(this, DrawablesActivity.class),
                getString(R.string.module_drawables_title),
                getString(R.string.module_drawables_desc)));
        return activities;
    }
}
