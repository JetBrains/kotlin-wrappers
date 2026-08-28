// Automatically generated - do not modify!

package tanstack.virtual.core

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ScrollAlignment

inline val ScrollAlignment.Companion.start: ScrollAlignment
    get() = unsafeCast("start")

inline val ScrollAlignment.Companion.center: ScrollAlignment
    get() = unsafeCast("center")

inline val ScrollAlignment.Companion.end: ScrollAlignment
    get() = unsafeCast("end")

inline val ScrollAlignment.Companion.auto: ScrollAlignment
    get() = unsafeCast("auto")
