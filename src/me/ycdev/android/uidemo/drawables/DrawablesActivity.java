package me.ycdev.android.uidemo.drawables;

import java.util.ArrayList;
import java.util.List;

import me.ycdev.android.uidemo.R;
import me.ycdev.android.uidemo.base.GridEntriesActivity;

import android.content.Intent;

public class DrawablesActivity extends GridEntriesActivity {
    @Override
    protected boolean needLoadIntentsAsync() {
        return true;
    }

    @Override
    protected List<ActivityEntry> getIntents() {
        List<ActivityEntry> activities = new ArrayList<ActivityEntry>();
        activities.add(new ActivityEntry(
                new Intent(this, ShapesActivity.class),
                getString(R.string.module_shapes_title),
                getString(R.string.module_shapes_desc)));
        activities.add(new ActivityEntry(
                new Intent(this, TransitionsActivity.class),
                getString(R.string.module_transitions_title),
                getString(R.string.module_transitions_desc)));
        return activities;
    }

}
