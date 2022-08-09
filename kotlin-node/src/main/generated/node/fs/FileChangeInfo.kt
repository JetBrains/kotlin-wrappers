// Automatically generated - do not modify!

package node.fs

sealed external interface FileChangeInfo<T : Any /* string | Buffer */> {
    var eventType: WatchEventType
    var filename: T
}
