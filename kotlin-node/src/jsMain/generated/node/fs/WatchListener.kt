package node.fs


typealias WatchListener<T> = (event: WatchEventType, filename: T) -> Unit
