// Automatically generated - do not modify!

package web.resize

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ResizeObserverBoxOptions

inline val ResizeObserverBoxOptions.Companion.borderBox: ResizeObserverBoxOptions
    get() = unsafeCast("border-box")

inline val ResizeObserverBoxOptions.Companion.contentBox: ResizeObserverBoxOptions
    get() = unsafeCast("content-box")

inline val ResizeObserverBoxOptions.Companion.devicePixelContentBox: ResizeObserverBoxOptions
    get() = unsafeCast("device-pixel-content-box")
