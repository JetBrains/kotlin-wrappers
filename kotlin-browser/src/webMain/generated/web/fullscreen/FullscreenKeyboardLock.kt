// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fullscreen

import js.reflect.unsafeCast

sealed /* union */
external interface FullscreenKeyboardLock {
    companion object
}

inline val FullscreenKeyboardLock.Companion.browser: FullscreenKeyboardLock
    get() = unsafeCast("browser")

inline val FullscreenKeyboardLock.Companion.none: FullscreenKeyboardLock
    get() = unsafeCast("none")
