// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.history

import js.reflect.unsafeCast

sealed external interface ScrollRestoration {
    companion object
}

inline val ScrollRestoration.Companion.auto: ScrollRestoration
    get() = unsafeCast("auto")

inline val ScrollRestoration.Companion.manual: ScrollRestoration
    get() = unsafeCast("manual")
