// Automatically generated - do not modify!

package web.touch

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface TouchType

inline val TouchType.Companion.direct: TouchType
    get() = unsafeCast("direct")

inline val TouchType.Companion.stylus: TouchType
    get() = unsafeCast("stylus")
