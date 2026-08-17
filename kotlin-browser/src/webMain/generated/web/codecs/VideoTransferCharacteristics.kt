// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface VideoTransferCharacteristics

inline val VideoTransferCharacteristics.Companion.bt709: VideoTransferCharacteristics
    get() = unsafeCast("bt709")

inline val VideoTransferCharacteristics.Companion.iec6196621: VideoTransferCharacteristics
    get() = unsafeCast("iec61966-2-1")

inline val VideoTransferCharacteristics.Companion.smpte170m: VideoTransferCharacteristics
    get() = unsafeCast("smpte170m")
