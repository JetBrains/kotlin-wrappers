// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.form

import js.reflect.unsafeCast

sealed external interface FormStateRestoreMode {
    companion object
}

inline val FormStateRestoreMode.Companion.restore: FormStateRestoreMode
    get() = unsafeCast("restore")

inline val FormStateRestoreMode.Companion.autocomplete: FormStateRestoreMode
    get() = unsafeCast("autocomplete")
