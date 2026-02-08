// Automatically generated - do not modify!

package node.workerThreads

sealed external interface LockMode {
    companion object
}

inline val LockMode.Companion.exclusive: LockMode
    get() = js.reflect.unsafeCast("exclusive")

inline val LockMode.Companion.shared: LockMode
    get() = js.reflect.unsafeCast("shared")
