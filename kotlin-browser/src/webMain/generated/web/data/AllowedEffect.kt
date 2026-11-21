// Automatically generated - do not modify!

package web.data

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed)
 */
@JsUnion
sealed /* union */
external interface AllowedEffect

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed#none)
 */
inline val AllowedEffect.Companion.none: AllowedEffect
    get() = unsafeCast("none")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed#copy)
 */
inline val AllowedEffect.Companion.copy: AllowedEffect
    get() = unsafeCast("copy")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed#copylink)
 */
inline val AllowedEffect.Companion.copyLink: AllowedEffect
    get() = unsafeCast("copyLink")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed#copymove)
 */
inline val AllowedEffect.Companion.copyMove: AllowedEffect
    get() = unsafeCast("copyMove")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed#link)
 */
inline val AllowedEffect.Companion.link: AllowedEffect
    get() = unsafeCast("link")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed#linkmove)
 */
inline val AllowedEffect.Companion.linkMove: AllowedEffect
    get() = unsafeCast("linkMove")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed#move)
 */
inline val AllowedEffect.Companion.move: AllowedEffect
    get() = unsafeCast("move")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed#all)
 */
inline val AllowedEffect.Companion.all: AllowedEffect
    get() = unsafeCast("all")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed#uninitialized)
 */
inline val AllowedEffect.Companion.uninitialized: AllowedEffect
    get() = unsafeCast("uninitialized")
