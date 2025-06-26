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
    get() = unsafeCast("applicationXWwwFormUrlencoded")

inline val FormEncType.Companion.multipartFormData: FormEncType
    get() = unsafeCast("multipartFormData")

inline val FormEncType.Companion.applicationJson: FormEncType
    get() = unsafeCast("applicationJson")

inline val FormEncType.Companion.textPlain: FormEncType
    get() = unsafeCast("textPlain")
