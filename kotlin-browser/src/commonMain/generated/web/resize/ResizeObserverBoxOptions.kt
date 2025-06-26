// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.resize

import js.reflect.unsafeCast

sealed external interface ResizeObserverBoxOptions {
    companion object
}

inline val ResizeObserverBoxOptions.Companion.borderBox: ResizeObserverBoxOptions
    get() = unsafeCast("border-box")

inline val ResizeObserverBoxOptions.Companion.contentBox: ResizeObserverBoxOptions
    get() = unsafeCast("content-box")

inline val ResizeObserverBoxOptions.Companion.devicePixelContentBox: ResizeObserverBoxOptions
    get() = unsafeCast("device-pixel-content-box")
