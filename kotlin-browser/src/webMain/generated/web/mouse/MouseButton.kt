// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mouse

import js.reflect.unsafeCast

sealed external interface MouseButton {
    companion object
}

/**
 * Main button pressed, usually the left button or the un-initialized state
 */
inline val MouseButton.Companion.MAIN: MouseButton
    get() = unsafeCast(0)

/**
 * Auxiliary button pressed, usually the wheel button or the middle button (if present)
 */
inline val MouseButton.Companion.AUXILIARY: MouseButton
    get() = unsafeCast(1)

/**
 * Secondary button pressed, usually the right button
 */
inline val MouseButton.Companion.SECONDARY: MouseButton
    get() = unsafeCast(2)

/**
 * Fourth button, typically the Browser Back button
 */
inline val MouseButton.Companion.FOURTH: MouseButton
    get() = unsafeCast(3)

/**
 * Fifth button, typically the Browser Forward button
 */
inline val MouseButton.Companion.FIFTH: MouseButton
    get() = unsafeCast(4)
