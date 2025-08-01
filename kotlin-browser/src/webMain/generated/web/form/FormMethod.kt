// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.form

import js.reflect.unsafeCast

sealed external interface FormMethod {
    companion object
}

inline val FormMethod.Companion.get: FormMethod
    get() = unsafeCast("get")

inline val FormMethod.Companion.dialog: FormMethod
    get() = unsafeCast("dialog")

inline val FormMethod.Companion.post: FormMethod
    get() = unsafeCast("post")
