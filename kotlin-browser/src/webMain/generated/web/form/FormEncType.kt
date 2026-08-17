// Automatically generated - do not modify!

package web.form

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface FormEncType

inline val FormEncType.Companion.applicationXWwwFormUrlencoded: FormEncType
    get() = unsafeCast("application/x-www-form-urlencoded")

inline val FormEncType.Companion.multipartFormData: FormEncType
    get() = unsafeCast("multipart/form-data")

inline val FormEncType.Companion.applicationJson: FormEncType
    get() = unsafeCast("application/json")

inline val FormEncType.Companion.textPlain: FormEncType
    get() = unsafeCast("text/plain")
