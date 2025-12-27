// Automatically generated - do not modify!

package node.workerThreads

sealed external interface LockManagerSnapshot {
    var held: js.array.ReadonlyArray<LockInfo>
    var pending: js.array.ReadonlyArray<LockInfo>
}
