// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface Loading

inline val Loading.Companion.eager: Loading
    get() = unsafeCast("eager")

inline val Loading.Companion.lazy: Loading
    get() = unsafeCast("lazy")
