// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import js.reflect.unsafeCast

sealed external interface GPUCompilationMessageType {
    companion object
}

inline val GPUCompilationMessageType.Companion.error: GPUCompilationMessageType
    get() = unsafeCast("error")

inline val GPUCompilationMessageType.Companion.info: GPUCompilationMessageType
    get() = unsafeCast("info")

inline val GPUCompilationMessageType.Companion.warning: GPUCompilationMessageType
    get() = unsafeCast("warning")
