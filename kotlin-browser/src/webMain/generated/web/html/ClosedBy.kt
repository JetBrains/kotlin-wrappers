// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/closedBy#value)
 */
@JsUnion
sealed /* union */
external interface ClosedBy

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/closedBy#any)
 */
inline val ClosedBy.Companion.any: ClosedBy
    get() = unsafeCast("any")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/closedBy#closerequest)
 */
inline val ClosedBy.Companion.closerequest: ClosedBy
    get() = unsafeCast("closerequest")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/closedBy#none)
 */
inline val ClosedBy.Companion.none: ClosedBy
    get() = unsafeCast("none")
