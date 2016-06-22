package me.proft.retrofitdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private List<PostItem> posts;
    private int rowLayout;
    private Context context;

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        LinearLayout llPosts;
        TextView tvUserId;
        TextView tvTitle;
        TextView tvBody;

        public PostViewHolder(View v) {
            super(v);
            llPosts = (LinearLayout) v.findViewById(R.id.llPosts);
            tvUserId = (TextView) v.findViewById(R.id.tvUserId);
            tvTitle = (TextView) v.findViewById(R.id.tvTitle);
            tvBody = (TextView) v.findViewById(R.id.tvBody);
        }

    }

    public PostAdapter(List<PostItem> posts, int rowLayout, Context context) {
        this.posts = posts;
        this.context = context;
        this.rowLayout = rowLayout;
    }

    @Override
    public PostAdapter.PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new PostViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PostViewHolder holder, final int position) {
        holder.tvTitle.setText(posts.get(position).getTitle());
        holder.tvBody.setText(posts.get(position).getBody());
        holder.tvUserId.setText(posts.get(position).getUserId().toString());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}
