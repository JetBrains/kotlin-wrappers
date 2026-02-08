// Automatically generated - do not modify!

package node.vm

sealed external interface ModuleStatus {
    companion object
}

inline val ModuleStatus.Companion.unlinked: ModuleStatus
    get() = js.reflect.unsafeCast("unlinked")

inline val ModuleStatus.Companion.linking: ModuleStatus
    get() = js.reflect.unsafeCast("linking")

inline val ModuleStatus.Companion.linked: ModuleStatus
    get() = js.reflect.unsafeCast("linked")

inline val ModuleStatus.Companion.evaluating: ModuleStatus
    get() = js.reflect.unsafeCast("evaluating")

inline val ModuleStatus.Companion.evaluated: ModuleStatus
    get() = js.reflect.unsafeCast("evaluated")

inline val ModuleStatus.Companion.errored: ModuleStatus
    get() = js.reflect.unsafeCast("errored")
