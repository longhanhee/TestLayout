package com.gtv.hanhee.testlayout.ui.customview.animationstyle;

import android.animation.ObjectAnimator;
import android.util.DisplayMetrics;
import android.view.View;

import com.gtv.hanhee.testlayout.ui.customview.FlipVerticalSwingEnterDialog.BaseAnimatorSet;



public class SlideTopEnter extends BaseAnimatorSet {
	public SlideTopEnter() {
		duration = 300;
	}
	@Override
	public void setAnimation(View view) {
		DisplayMetrics dm = view.getContext().getResources().getDisplayMetrics();
		animatorSet.playTogether(//
				ObjectAnimator.ofFloat(view, "translationY", -250 * dm.density, 0), //
				ObjectAnimator.ofFloat(view, "alpha", 0.2f, 1));
	}
}
