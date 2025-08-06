- Trace
- https://juejin.cn/post/6918272111152726024


- 底层驱动->IMS->(IMS向WMS查询Window对应的ViewRootImpl，然后进行通信)->ViewRootImpl
- 
  dispatchTouchEvent:13, CustomTextView (com.test.android30)
  dispatchTransformedTouchEvent:3118, ViewGroup (android.view)
  dispatchTouchEvent:2742, ViewGroup (android.view)
  dispatchTransformedTouchEvent:3118, ViewGroup (android.view)
  dispatchTouchEvent:2742, ViewGroup (android.view)
  dispatchTransformedTouchEvent:3118, ViewGroup (android.view)
  dispatchTouchEvent:2742, ViewGroup (android.view)
  dispatchTransformedTouchEvent:3118, ViewGroup (android.view)
  dispatchTouchEvent:2742, ViewGroup (android.view)
  dispatchTransformedTouchEvent:3118, ViewGroup (android.view)
  dispatchTouchEvent:2742, ViewGroup (android.view)
  dispatchTransformedTouchEvent:3118, ViewGroup (android.view)
  dispatchTouchEvent:2742, ViewGroup (android.view)
  `superDispatchTouchEvent:488, DecorView (com.android.internal.policy)`
  `superDispatchTouchEvent:1871, PhoneWindow (com.android.internal.policy)`
  `dispatchTouchEvent:4125, Activity (android.app)`
  dispatchTouchEvent:69, WindowCallbackWrapper (androidx.appcompat.view)
  `dispatchTouchEvent:446, DecorView (com.android.internal.policy)`
  dispatchPointerEvent:14568, View (android.view)
  processPointerEvent:6016, ViewRootImpl$ViewPostImeInputStage (android.view)
  onProcess:5819, ViewRootImpl$ViewPostImeInputStage (android.view)
  deliver:5310, ViewRootImpl$InputStage (android.view)
  onDeliverToNext:5367, ViewRootImpl$InputStage (android.view)
  forward:5333, ViewRootImpl$InputStage (android.view)
  forward:5485, ViewRootImpl$AsyncInputStage (android.view)
  apply:5341, ViewRootImpl$InputStage (android.view)
  apply:5542, ViewRootImpl$AsyncInputStage (android.view)
  deliver:5314, ViewRootImpl$InputStage (android.view)
  `onDeliverToNext:5367, ViewRootImpl$InputStage (android.view)`
  forward:5333, ViewRootImpl$InputStage (android.view)
  apply:5341, ViewRootImpl$InputStage (android.view)
  deliver:5314, ViewRootImpl$InputStage (android.view)
  deliverInputEvent:8080, ViewRootImpl (android.view)
  doProcessInputEvents:8031, ViewRootImpl (android.view)
  enqueueInputEvent:7992, ViewRootImpl (android.view)
  onInputEvent:8203, ViewRootImpl$WindowInputEventReceiver (android.view)
  `dispatchInputEvent:220, InputEventReceiver (android.view)`
  nativePollOnce:-1, MessageQueue (android.os)
  next:335, MessageQueue (android.os)
  loop:183, Looper (android.os)
  main:7656, ActivityThread (android.app)
  invoke:-1, Method (java.lang.reflect)
  run:592, RuntimeInit$MethodAndArgsCaller (com.android.internal.os)
  main:947, ZygoteInit (com.android.internal.os)