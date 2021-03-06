package com.affwl.exchange;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter5 extends BaseAdapter {

	Context context;
	List<RowItem5> rowItems5;

	CustomAdapter5(Context context, List<RowItem5> rowItems5) {
		this.context = context;
		this.rowItems5 = rowItems5;
	}

	@Override
	public int getCount() {
		return rowItems5.size();
	}

	@Override
	public Object getItem(int position) {
		return rowItems5.get(position);
	}

	@Override
	public long getItemId(int position) {
		return rowItems5.indexOf(getItem(position));
	}

	/* private view holder class */
	private class ViewHolder {
		ImageView profile_pic5;
		TextView member_name5;
		TextView status5;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder holder = null;

		LayoutInflater mInflater = (LayoutInflater) context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.list_item5, null);
			holder = new ViewHolder();

			holder.member_name5 = (TextView) convertView.findViewById(R.id.member_name5);
			holder.profile_pic5 = (ImageView) convertView.findViewById(R.id.profile_pic5);
			holder.status5 = (TextView) convertView.findViewById(R.id.status5);


			RowItem5 row_pos = rowItems5.get(position);

			//holder.profile_pic.setBackground(R.drawable.circle);
			holder.profile_pic5.setBackground(ContextCompat.getDrawable(context, R.drawable.ic_view_headline_blue_grey_200_18dp));
			holder.member_name5.setText(row_pos.getMember_name5());
			holder.status5.setText(row_pos.getStatus5());
		;

			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		return convertView;
	}

}
