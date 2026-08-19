// Automatically generated - do not modify!

package web.selection

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionDirection)
 */
@JsUnion
sealed /* union */
external interface SelectionDirection

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionDirection#forward)
 */
inline val SelectionDirection.Companion.forward: SelectionDirection
    get() = unsafeCast("forward")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionDirection#backward)
 */
inline val SelectionDirection.Companion.backward: SelectionDirection
    get() = unsafeCast("backward")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionDirection#none)
 */
inline val SelectionDirection.Companion.none: SelectionDirection
    get() = unsafeCast("none")
