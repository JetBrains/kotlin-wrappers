// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import js.reflect.unsafeCast

sealed external interface RequestMode {
    companion object
}

inline val RequestMode.Companion.cors: RequestMode
    get() = unsafeCast("cors")

inline val RequestMode.Companion.navigate: RequestMode
    get() = unsafeCast("navigate")

inline val RequestMode.Companion.noCors: RequestMode
    get() = unsafeCast("no-cors")

inline val RequestMode.Companion.sameOrigin: RequestMode
    get() = unsafeCast("same-origin")
