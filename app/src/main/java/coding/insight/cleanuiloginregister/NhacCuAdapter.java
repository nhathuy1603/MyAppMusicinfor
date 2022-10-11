package coding.insight.cleanuiloginregister;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NhacCuAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<NhacCu> nhacCuList;

    public NhacCuAdapter(Context context, int layout, List<NhacCu> nhacCuList) {
        this.context = context;
        this.layout = layout;
        this.nhacCuList = nhacCuList;
    }

    @Override
    public int getCount() {
        return nhacCuList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private  class ViewHolder {
        ImageView imgHinh;
        TextView txtTen, txtMoTa;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);

            holder = new ViewHolder();
            //ánh xạ view
            holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);

            holder.txtMoTa =(TextView) view.findViewById(R.id.textviewMota);
            holder.imgHinh =(ImageView) view.findViewById(R.id.imageviewHinh);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        //gán giá trị

        NhacCu nhacCu  = nhacCuList.get(i);

       holder.txtTen.setText(nhacCu.getTen());

      holder.txtMoTa.setText(nhacCu.getMota());
      holder.imgHinh.setImageResource(nhacCu.getHinh());

        return view;



    }
}
