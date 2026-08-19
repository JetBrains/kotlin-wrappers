// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/transfer)
 */
@JsUnion
sealed /* union */
external interface VideoTransferCharacteristics

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/transfer#bt709)
 */
inline val VideoTransferCharacteristics.Companion.bt709: VideoTransferCharacteristics
    get() = unsafeCast("bt709")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/transfer#iec61966-2-1)
 */
inline val VideoTransferCharacteristics.Companion.iec6196621: VideoTransferCharacteristics
    get() = unsafeCast("iec61966-2-1")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/transfer#smpte170m)
 */
inline val VideoTransferCharacteristics.Companion.smpte170m: VideoTransferCharacteristics
    get() = unsafeCast("smpte170m")
