// Automatically generated - do not modify!

package web.gpu

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage/type)
 */
@JsUnion
sealed /* union */
external interface GPUCompilationMessageType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage/type#error)
 */
inline val GPUCompilationMessageType.Companion.error: GPUCompilationMessageType
    get() = unsafeCast("error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage/type#info)
 */
inline val GPUCompilationMessageType.Companion.info: GPUCompilationMessageType
    get() = unsafeCast("info")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUCompilationMessage/type#warning)
 */
inline val GPUCompilationMessageType.Companion.warning: GPUCompilationMessageType
    get() = unsafeCast("warning")
