// Automatically generated - do not modify!

package web.clipboard

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/presentationStyle)
 */
@JsUnion
sealed /* union */
external interface PresentationStyle

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/presentationStyle#attachment)
 */
inline val PresentationStyle.Companion.attachment: PresentationStyle
    get() = unsafeCast("attachment")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/presentationStyle#inline)
 */
inline val PresentationStyle.Companion.inline: PresentationStyle
    get() = unsafeCast("inline")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/presentationStyle#unspecified)
 */
inline val PresentationStyle.Companion.unspecified: PresentationStyle
    get() = unsafeCast("unspecified")
