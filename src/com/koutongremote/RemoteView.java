package com.koutongremote;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;

public class RemoteView extends ImageView {

	public RemoteView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public RemoteView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public RemoteView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
	}
	

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Log.v(TAG, "x : "+event.getRawX());
		Log.v(TAG, "y : "+event.getRawY());
		return super.onTouchEvent(event);
		
	}
	
	private static final String TAG = "RemoteView";
	
	

}