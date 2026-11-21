// Automatically generated - do not modify!

package web.data

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/dropEffect)
 */
@JsUnion
sealed /* union */
external interface DropEffect

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/dropEffect#none)
 */
inline val DropEffect.Companion.none: DropEffect
    get() = unsafeCast("none")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/dropEffect#copy)
 */
inline val DropEffect.Companion.copy: DropEffect
    get() = unsafeCast("copy")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/dropEffect#link)
 */
inline val DropEffect.Companion.link: DropEffect
    get() = unsafeCast("link")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/dropEffect#move)
 */
inline val DropEffect.Companion.move: DropEffect
    get() = unsafeCast("move")
