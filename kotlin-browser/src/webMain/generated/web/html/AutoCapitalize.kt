// Automatically generated - do not modify!

package web.html

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize#value)
 */
@JsUnion
sealed /* union */
external interface AutoCapitalize

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize#none)
 */
inline val AutoCapitalize.Companion.none: AutoCapitalize
    get() = unsafeCast("none")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize#off)
 */
inline val AutoCapitalize.Companion.off: AutoCapitalize
    get() = unsafeCast("off")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize#sentences)
 */
inline val AutoCapitalize.Companion.sentences: AutoCapitalize
    get() = unsafeCast("sentences")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize#on)
 */
inline val AutoCapitalize.Companion.on: AutoCapitalize
    get() = unsafeCast("on")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize#words)
 */
inline val AutoCapitalize.Companion.words: AutoCapitalize
    get() = unsafeCast("words")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize#characters)
 */
inline val AutoCapitalize.Companion.characters: AutoCapitalize
    get() = unsafeCast("characters")
