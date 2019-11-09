package edu.bu.projectportal;

import android.content.Context;
import android.os.Bundle;
import android.text.util.Linkify;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProjectDetailFragment extends Fragment {

    private final static String TAG = ProjectDetailFragment.class.getSimpleName ();

    private int projectId ;
    private TextView titleTextView, summaryTextView, authorsList, linksList, keywordsList;
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
        authorsList = view.findViewById(R.id.projectAuthorsListId);
        linksList = view.findViewById(R.id.projectLinksListId);
        keywordsList = view.findViewById(R.id.projectKeywordsListId);
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

        // Source: https://reversecoding.net/java-8-convert-list-string-comma/
        List<String> authors = Project.projects[projectId].getAuthors();
        String authorsCommandSeparated = String.join(", ", authors);
        authorsList.setText(authorsCommandSeparated);

        List<String> links = Project.projects[projectId].getLinks();
        String linksCommaSeparated = String.join(", ", links);
        linksList.setText(linksCommaSeparated);

        // Source: https://android-developers.googleblog.com/2008/03/linkify-your-text.html
        Linkify.addLinks(linksList, Linkify.ALL);

        List<String> keywords = Project.projects[projectId].getKeywords();
        String keywordsCommaSeparated = String.join(", ", keywords);
        keywordsList.setText(keywordsCommaSeparated);

        // I wanted to use Chips to display the keywords as a tag list, but I couldn't get this working.
        // The AVD just kept saying 'ProjectPortal has stopped' and wouldn't run
//        for(String keyword : keywords) {
//            Chip keywordChip = new Chip(getContext());
//            keywordChip.setText(keyword);
//            keywordsChipGroup.addView(keywordChip);
//        }

        favoriteSwitch.setChecked(Project.projects[projectId].getFavorite());
    }

    public int getProjectId(){
        return projectId;
    }
}
