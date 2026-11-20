// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/loading#value)
 */
@JsUnion
sealed /* union */
external interface Loading

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/loading#:~:text=eager)
 */
inline val Loading.Companion.eager: Loading
    get() = unsafeCast("eager")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/loading#:~:text=lazy)
 */
inline val Loading.Companion.lazy: Loading
    get() = unsafeCast("lazy")
