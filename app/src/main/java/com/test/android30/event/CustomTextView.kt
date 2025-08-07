package com.test.android30.event

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

private const val TAG = "CustomTextView"


/**
 *
 * //https://blog.csdn.net/ukynho/article/details/130763187
 * //DrawLinear onDraw android.graphics.RecordingCanvas@908c7ca
 * //CustomTextView onDraw android.graphics.RecordingCanvas@5d8cd3b
 * //DrawLinear onDraw android.graphics.RecordingCanvas@5d8cd3b
 * //DrawView1 onDraw android.graphics.RecordingCanvas@2798c58
 * //DrawView2 onDraw android.graphics.RecordingCanvas@2798c58
 * //因为canvas池
 * //ViewRootImpl.draw->mAttachInfo.mThreadedRenderer.draw(mView, mAttachInfo, this);
 * //->ThreadedRenderer.updateRootDisplayList(view, callbacks);
 * view.updateDisplayListIfDirty();
 */

/**
 * 非硬件加速是怎么执行的？
 * 硬件加速的各种层级
 * 硬件加速 + 软件绘制
 * render thread的作用？
 * layer surface
 * surface flinger
 */
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

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.i(TAG, "CustomTextView onDraw $canvas")
    }
}