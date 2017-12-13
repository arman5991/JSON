package json.com.json;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<ModelGson> modelList;
    private String imageUri;
    private Context context;

    public RecyclerViewAdapter(List<ModelGson> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_row_item, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.qid.setText(modelList.get(position).getUser().getAge().toString());
        holder.quest_name.setText(modelList.get(position).getUser().getFirstName());
        holder.quest_address.setText(modelList.get(position).getUser().getLastName());
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView qid;
        private TextView quest_name;
        private TextView quest_address;
        private ImageView quest_image;

        private MyViewHolder(View view) {
            super(view);

            qid = (TextView) view.findViewById(R.id.tv_qid);
            quest_name = (TextView) view.findViewById(R.id.tv_quest_name);
            quest_address = (TextView) view.findViewById(R.id.tv_quest_address);
            quest_image = (ImageView) view.findViewById(R.id.img_quest_image);
        }
    }
}