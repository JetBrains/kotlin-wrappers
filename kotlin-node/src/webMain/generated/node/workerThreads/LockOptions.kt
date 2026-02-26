// Automatically generated - do not modify!

package node.workerThreads

sealed external interface LockOptions {
    var ifAvailable: Boolean?
    var mode: LockMode?
    var signal: web.abort.AbortSignal?
    var steal: Boolean?
}
