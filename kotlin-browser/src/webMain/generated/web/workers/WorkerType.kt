// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.workers

import js.reflect.unsafeCast

sealed external interface WorkerType {
    companion object
}

inline val WorkerType.Companion.classic: WorkerType
    get() = unsafeCast("classic")

inline val WorkerType.Companion.module: WorkerType
    get() = unsafeCast("module")
