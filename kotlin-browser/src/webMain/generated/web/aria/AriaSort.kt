// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AriaSort

inline val AriaSort.Companion.ascending: AriaSort
    get() = unsafeCast("ascending")

inline val AriaSort.Companion.descending: AriaSort
    get() = unsafeCast("descending")

inline val AriaSort.Companion.none: AriaSort
    get() = unsafeCast("none")

inline val AriaSort.Companion.other: AriaSort
    get() = unsafeCast("other")
