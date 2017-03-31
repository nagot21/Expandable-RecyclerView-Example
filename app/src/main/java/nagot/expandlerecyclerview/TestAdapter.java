package nagot.expandlerecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import java.util.List;

/**
 * Created by Nagot on 31/03/2017.
 */

public class TestAdapter extends ExpandableRecyclerAdapter<TestAdapter.ParentRowViewHolder, TestAdapter.ChildRowViewHolder> {
    Context context;

    public TestAdapter(Context context, @NonNull List<? extends ParentListItem> parentItemList) {
        super(parentItemList);
        this.context = context;
    }

    @Override
    public ParentRowViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {
        View parentView = LayoutInflater.from(context).inflate(R.layout.parent_row, parentViewGroup, false);
        return new ParentRowViewHolder(parentView);
    }

    @Override
    public ChildRowViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        View childView = LayoutInflater.from(context).inflate(R.layout.child_row, childViewGroup, false);
        return new ChildRowViewHolder(childView);
    }

    @Override
    public void onBindParentViewHolder(ParentRowViewHolder parentViewHolder, int position, ParentListItem parentListItem) {
        App app = (App) parentListItem;
        parentViewHolder.text.setText(app.getName());
    }

    @Override
    public void onBindChildViewHolder(ChildRowViewHolder childViewHolder, int position, Object childListItem) {
        childViewHolder.version.setText(((AppInfo) childListItem).version);
        childViewHolder.comment.setText(((AppInfo) childListItem).comment);
    }

    public class ParentRowViewHolder extends ParentViewHolder {
        TextView text;
        Button btnParent;

        public ParentRowViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text_view_parent);
            btnParent = (Button) itemView.findViewById(R.id.button_parent);
        }
    }

    public class ChildRowViewHolder extends ChildViewHolder {

        TextView version;
        TextView comment;

        public ChildRowViewHolder(View itemView) {
            super(itemView);

            version = (TextView) itemView.findViewById(R.id.child_1);
            comment = (TextView) itemView.findViewById(R.id.child_2);
        }

    }
}
