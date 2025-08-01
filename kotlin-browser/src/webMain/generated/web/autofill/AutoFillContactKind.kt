// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.autofill

import js.reflect.unsafeCast

sealed external interface AutoFillContactKind {
    companion object
}

inline val AutoFillContactKind.Companion.home: AutoFillContactKind
    get() = unsafeCast("home")

inline val AutoFillContactKind.Companion.mobile: AutoFillContactKind
    get() = unsafeCast("mobile")

inline val AutoFillContactKind.Companion.work: AutoFillContactKind
    get() = unsafeCast("work")
