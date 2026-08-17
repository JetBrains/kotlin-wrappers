// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface BitrateMode

inline val BitrateMode.Companion.constant: BitrateMode
    get() = unsafeCast("constant")

inline val BitrateMode.Companion.variable: BitrateMode
    get() = unsafeCast("variable")
