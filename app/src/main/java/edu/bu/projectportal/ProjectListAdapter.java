package edu.bu.projectportal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ProjectListAdapter extends RecyclerView.Adapter<ProjectListAdapter.ProjectListViewHolder> {
    private Project[] projects;

    public ProjectListAdapter(Project[] projects) {
        this.projects = projects;
    }

    @Override
    public ProjectListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.project_list_item, parent, false);
        return new ProjectListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProjectListViewHolder viewHolder, int position) {
        viewHolder.projectTitleView.setText(projects[position].getTitle());
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    // ViewHolder inner class
    public static class ProjectListViewHolder extends RecyclerView.ViewHolder {
        private TextView projectTitleView;
        public ProjectListViewHolder(View itemView) {
            super(itemView);
            projectTitleView = (TextView) itemView.findViewById(R.id.projectListTitleTextViewId);
        }
    }
}
