// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ButtonType

inline val ButtonType.Companion.submit: ButtonType
    get() = unsafeCast("submit")

inline val ButtonType.Companion.reset: ButtonType
    get() = unsafeCast("reset")

inline val ButtonType.Companion.button: ButtonType
    get() = unsafeCast("button")
