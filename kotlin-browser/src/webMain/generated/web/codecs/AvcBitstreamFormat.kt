// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AvcBitstreamFormat

inline val AvcBitstreamFormat.Companion.annexb: AvcBitstreamFormat
    get() = unsafeCast("annexb")

inline val AvcBitstreamFormat.Companion.avc: AvcBitstreamFormat
    get() = unsafeCast("avc")
