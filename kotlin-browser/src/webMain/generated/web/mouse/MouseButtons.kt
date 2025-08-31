// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mouse

import js.core.Bitmask
import js.reflect.unsafeCast

sealed external interface MouseButtons :
    Bitmask<MouseButtons> {
    companion object
}

/**
 * No button or un-initialized
 */
inline val MouseButtons.Companion.NONE: MouseButtons
    get() = unsafeCast(0)

/**
 * Primary button (usually the left button)
 */
inline val MouseButtons.Companion.PRIMARY: MouseButtons
    get() = unsafeCast(1)

/**
 * Secondary button (usually the right button)
 */
inline val MouseButtons.Companion.SECONDARY: MouseButtons
    get() = unsafeCast(2)

/**
 * Auxiliary button (usually the mouse wheel button or middle button)
 */
inline val MouseButtons.Companion.AUXILIARY: MouseButtons
    get() = unsafeCast(4)

/**
 * 4th button (typically the "Browser Back" button)
 */
inline val MouseButtons.Companion.FOURTH: MouseButtons
    get() = unsafeCast(8)

/**
 * 5th button (typically the "Browser Forward" button)
 */
inline val MouseButtons.Companion.FIFTH: MouseButtons
    get() = unsafeCast(16)
