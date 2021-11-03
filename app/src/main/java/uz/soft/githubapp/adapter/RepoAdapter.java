package uz.soft.githubapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.soft.githubapp.R;
import uz.soft.githubapp.model.Repository;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.RepoVH> {
    private List<Repository> list;

    public RepoAdapter(List<Repository> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public RepoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.repo_item, parent, false);
        return new RepoVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RepoVH holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void updateData(List<Repository> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    class RepoVH extends RecyclerView.ViewHolder {
        private TextView tvName;

        public RepoVH(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.repo_name);
        }

        public void onBind(Repository repository) {
            tvName.setText(repository.getName());
        }
    }
}
