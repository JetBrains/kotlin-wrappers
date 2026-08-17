// Automatically generated - do not modify!

package web.fullscreen

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FullscreenKeyboardLock

inline val FullscreenKeyboardLock.Companion.browser: FullscreenKeyboardLock
    get() = unsafeCast("browser")

inline val FullscreenKeyboardLock.Companion.none: FullscreenKeyboardLock
    get() = unsafeCast("none")
