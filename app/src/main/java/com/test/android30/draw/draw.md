https://juejin.cn/post/7163858831309537294
单buffer，生产者gpu，消费者display，同时读写，容易产生屏幕撕裂问题，屏幕显示了两帧画面。
双buffer，解决了屏幕撕裂问题，生产者和消费者读写不同的buffer，当vsync信号到来时，交换两个buffer。
双buffer仍然有问题，当jank发生时，frame buffer被display使用，back buffer被gpu使用，cpu绘制没有buffer可用，导致cpu无法绘制。引发jank的连锁反应。
引入3 buffer，display，gpu，cpu各一个，并行写入。解决jank导致的连锁jank问题。`cpu绘制也需要buffer吗？不是很理解.`