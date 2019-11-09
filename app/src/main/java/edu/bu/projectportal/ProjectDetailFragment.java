package edu.bu.projectportal;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectDetailFragment extends Fragment {

    private final static String TAG = ProjectDetailFragment.class.getSimpleName ();

    private int projectId ;
    private TextView titleTextView, summaryTextView;
    private Switch favoriteSwitch;

    public ProjectDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_project_detail, container, false);

        titleTextView = view.findViewById(R.id.projTitleTextViewId);
        summaryTextView = view.findViewById(R.id.projSummaryTextViewId);
        favoriteSwitch = view.findViewById(R.id.projectFavoriteSwitchId);

        projectId = 0;

        Log.d(TAG, " Project Id: " + projectId);
        setProject(projectId);

        return view;
    }

    public void setProject(int projId) {
        projectId = projId;
        titleTextView.setText(Project.projects[projectId].getTitle());
        summaryTextView.setText(Project.projects[projectId].getSummary());
        favoriteSwitch.setChecked(Project.projects[projectId].getFavorite());
    }

    public int getProjectId(){
        return projectId;
    }
}
