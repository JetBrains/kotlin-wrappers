// Automatically generated - do not modify!

package web.form

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FormStateRestoreMode

inline val FormStateRestoreMode.Companion.restore: FormStateRestoreMode
    get() = unsafeCast("restore")

inline val FormStateRestoreMode.Companion.autocomplete: FormStateRestoreMode
    get() = unsafeCast("autocomplete")
