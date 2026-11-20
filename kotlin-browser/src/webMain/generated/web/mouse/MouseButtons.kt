// Automatically generated - do not modify!

package web.mouse

import js.numbers.Bitmask
import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons)
 */
@JsUnion
sealed /* union */
external interface MouseButtons :
    Bitmask<MouseButtons>

/**
 * No button or un-initialized
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons#value)
 */
inline val MouseButtons.Companion.NONE: MouseButtons
    get() = unsafeCast(0)

/**
 * Primary button (usually the left button)
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons#value)
 */
inline val MouseButtons.Companion.PRIMARY: MouseButtons
    get() = unsafeCast(1)

/**
 * Secondary button (usually the right button)
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons#value)
 */
inline val MouseButtons.Companion.SECONDARY: MouseButtons
    get() = unsafeCast(2)

/**
 * Auxiliary button (usually the mouse wheel button or middle
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons#value)
 */
inline val MouseButtons.Companion.AUXILIARY: MouseButtons
    get() = unsafeCast(4)

/**
 * 4th button (typically the "Browser Back" button)
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons#value)
 */
inline val MouseButtons.Companion.FOURTH: MouseButtons
    get() = unsafeCast(8)

/**
 * 5th button (typically the "Browser Forward" button)
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons#value)
 */
inline val MouseButtons.Companion.FIFTH: MouseButtons
    get() = unsafeCast(16)
