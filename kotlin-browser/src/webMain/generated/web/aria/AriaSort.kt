// Automatically generated - do not modify!

package web.aria

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSort)
 */
@JsUnion
sealed /* union */
external interface AriaSort

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSort#ascending)
 */
inline val AriaSort.Companion.ascending: AriaSort
    get() = unsafeCast("ascending")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSort#descending)
 */
inline val AriaSort.Companion.descending: AriaSort
    get() = unsafeCast("descending")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSort#none)
 */
inline val AriaSort.Companion.none: AriaSort
    get() = unsafeCast("none")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSort#other)
 */
inline val AriaSort.Companion.other: AriaSort
    get() = unsafeCast("other")
