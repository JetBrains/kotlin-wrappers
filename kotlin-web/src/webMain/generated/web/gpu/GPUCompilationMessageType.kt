// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface GPUCompilationMessageType

inline val GPUCompilationMessageType.Companion.error: GPUCompilationMessageType
    get() = unsafeCast("error")

inline val GPUCompilationMessageType.Companion.info: GPUCompilationMessageType
    get() = unsafeCast("info")

inline val GPUCompilationMessageType.Companion.warning: GPUCompilationMessageType
    get() = unsafeCast("warning")
