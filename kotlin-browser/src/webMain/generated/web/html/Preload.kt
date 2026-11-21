// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preload)
 */
@JsUnion
sealed /* union */
external interface Preload

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preload#none)
 */
inline val Preload.Companion.none: Preload
    get() = unsafeCast("none")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preload#metadata)
 */
inline val Preload.Companion.metadata: Preload
    get() = unsafeCast("metadata")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preload#auto)
 */
inline val Preload.Companion.auto: Preload
    get() = unsafeCast("auto")
