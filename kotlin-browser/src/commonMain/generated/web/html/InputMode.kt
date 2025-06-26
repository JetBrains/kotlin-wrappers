// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import js.reflect.unsafeCast

sealed external interface InputMode {
    companion object
}

inline val InputMode.Companion.none: InputMode
    get() = unsafeCast("none")

inline val InputMode.Companion.text: InputMode
    get() = unsafeCast("text")

inline val InputMode.Companion.tel: InputMode
    get() = unsafeCast("tel")

inline val InputMode.Companion.url: InputMode
    get() = unsafeCast("url")

inline val InputMode.Companion.email: InputMode
    get() = unsafeCast("email")

inline val InputMode.Companion.numeric: InputMode
    get() = unsafeCast("numeric")

inline val InputMode.Companion.decimal: InputMode
    get() = unsafeCast("decimal")

inline val InputMode.Companion.search: InputMode
    get() = unsafeCast("search")
