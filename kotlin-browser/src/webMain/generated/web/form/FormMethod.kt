// Automatically generated - do not modify!

package web.form

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FormMethod

inline val FormMethod.Companion.get: FormMethod
    get() = unsafeCast("get")

inline val FormMethod.Companion.dialog: FormMethod
    get() = unsafeCast("dialog")

inline val FormMethod.Companion.post: FormMethod
    get() = unsafeCast("post")
