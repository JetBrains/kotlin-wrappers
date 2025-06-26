// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import js.reflect.unsafeCast

sealed external interface RequestRedirect {
    companion object
}

inline val RequestRedirect.Companion.error: RequestRedirect
    get() = unsafeCast("error")

inline val RequestRedirect.Companion.follow: RequestRedirect
    get() = unsafeCast("follow")

inline val RequestRedirect.Companion.manual: RequestRedirect
    get() = unsafeCast("manual")
