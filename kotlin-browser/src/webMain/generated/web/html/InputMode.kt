// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode#value)
 */
@JsUnion
sealed /* union */
external interface InputMode

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode#decimal)
 */
inline val InputMode.Companion.decimal: InputMode
    get() = unsafeCast("decimal")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode#email)
 */
inline val InputMode.Companion.email: InputMode
    get() = unsafeCast("email")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode#none)
 */
inline val InputMode.Companion.none: InputMode
    get() = unsafeCast("none")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode#numeric)
 */
inline val InputMode.Companion.numeric: InputMode
    get() = unsafeCast("numeric")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode#search)
 */
inline val InputMode.Companion.search: InputMode
    get() = unsafeCast("search")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode#tel)
 */
inline val InputMode.Companion.tel: InputMode
    get() = unsafeCast("tel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode#text)
 */
inline val InputMode.Companion.text: InputMode
    get() = unsafeCast("text")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode#url)
 */
inline val InputMode.Companion.url: InputMode
    get() = unsafeCast("url")
