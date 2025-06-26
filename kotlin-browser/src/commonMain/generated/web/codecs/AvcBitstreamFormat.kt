// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import js.reflect.unsafeCast

sealed external interface AvcBitstreamFormat {
    companion object
}

inline val AvcBitstreamFormat.Companion.annexb: AvcBitstreamFormat
    get() = unsafeCast("annexb")

inline val AvcBitstreamFormat.Companion.avc: AvcBitstreamFormat
    get() = unsafeCast("avc")
