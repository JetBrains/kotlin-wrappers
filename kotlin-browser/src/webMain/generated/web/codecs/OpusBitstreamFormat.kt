// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface OpusBitstreamFormat

inline val OpusBitstreamFormat.Companion.ogg: OpusBitstreamFormat
    get() = unsafeCast("ogg")

inline val OpusBitstreamFormat.Companion.opus: OpusBitstreamFormat
    get() = unsafeCast("opus")
