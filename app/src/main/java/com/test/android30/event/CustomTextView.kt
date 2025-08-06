package com.test.android30.event

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

private const val TAG = "CustomTextView"

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : View(context, attrs, defStyleAttr) {
    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        Log.i(
            TAG,
            "dispatchTouchEvent: actionMasked=${event.actionMasked},action=${event.action} event=$event"
        )
        return super.dispatchTouchEvent(event)
    }
}