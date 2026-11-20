// Automatically generated - do not modify!

package web.mouse

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/button)
 */
@JsUnion
sealed /* union */
external interface MouseButton

/**
 * Main button, usually the left button or the un-initialized
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/button#value)
 */
inline val MouseButton.Companion.MAIN: MouseButton
    get() = unsafeCast(0)

/**
 * Auxiliary button, usually the wheel button or the middle
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/button#value)
 */
inline val MouseButton.Companion.AUXILIARY: MouseButton
    get() = unsafeCast(1)

/**
 * Secondary button, usually the right button
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/button#value)
 */
inline val MouseButton.Companion.SECONDARY: MouseButton
    get() = unsafeCast(2)

/**
 * Fourth button, typically the "Browser Back" button
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/button#value)
 */
inline val MouseButton.Companion.FOURTH: MouseButton
    get() = unsafeCast(3)

/**
 * Fifth button, typically the "Browser Forward" button
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/button#value)
 */
inline val MouseButton.Companion.FIFTH: MouseButton
    get() = unsafeCast(4)
