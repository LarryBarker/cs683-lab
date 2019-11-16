package edu.bu.projectportal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ProjectListFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ProjectListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProjectListFragment extends Fragment {

    public ProjectListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState
    ) {
        // Inflate the view for this fragment
        View v = inflater.inflate(R.layout.fragment_project_list, container, false);

        RecyclerView projectsListRecyclerView = (RecyclerView) (v.findViewById(R.id.projectList_recyclerView));
        ProjectListAdapter projectListAdapter = new ProjectListAdapter(Project.projects);
        projectsListRecyclerView.setAdapter(projectListAdapter);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        projectsListRecyclerView.setLayoutManager(mLayoutManager);

        return v;
    }

}
