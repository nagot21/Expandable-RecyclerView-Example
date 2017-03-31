package nagot.expandlerecyclerview;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;

/**
 * Created by Nagot on 31/03/2017.
 */

public class App implements ParentListItem {
    private List<AppInfo> mApps;
    String appName;

    public App(List<AppInfo> apps, String appName) {
        mApps = apps;
        this.appName = appName;
    }

    public String getName() {
        return appName;
    }

    @Override
    public List<?> getChildItemList() {
        return mApps;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }
}
