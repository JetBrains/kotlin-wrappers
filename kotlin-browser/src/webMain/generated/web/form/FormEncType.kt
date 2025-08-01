// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.form

import js.reflect.unsafeCast

sealed external interface FormEncType {
    companion object
}

inline val FormEncType.Companion.applicationXWwwFormUrlencoded: FormEncType
    get() = unsafeCast("application/x-www-form-urlencoded")

inline val FormEncType.Companion.multipartFormData: FormEncType
    get() = unsafeCast("multipart/form-data")

inline val FormEncType.Companion.applicationJson: FormEncType
    get() = unsafeCast("application/json")

inline val FormEncType.Companion.textPlain: FormEncType
    get() = unsafeCast("text/plain")
