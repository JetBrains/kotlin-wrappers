// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/type)
 */
@JsUnion
sealed /* union */
external interface ButtonType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/type#:~:text=submit)
 */
inline val ButtonType.Companion.submit: ButtonType
    get() = unsafeCast("submit")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/type#:~:text=reset)
 */
inline val ButtonType.Companion.reset: ButtonType
    get() = unsafeCast("reset")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/type#:~:text=button)
 */
inline val ButtonType.Companion.button: ButtonType
    get() = unsafeCast("button")
