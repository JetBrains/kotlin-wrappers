// Automatically generated - do not modify!

package node.workerThreads

sealed external interface LockGrantedCallback<T> {
    operator fun invoke(lock: Lock?): T
}
