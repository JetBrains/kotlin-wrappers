// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface SelectionMode

inline val SelectionMode.Companion.end: SelectionMode
    get() = unsafeCast("end")

inline val SelectionMode.Companion.preserve: SelectionMode
    get() = unsafeCast("preserve")

inline val SelectionMode.Companion.select: SelectionMode
    get() = unsafeCast("select")

inline val SelectionMode.Companion.start: SelectionMode
    get() = unsafeCast("start")
