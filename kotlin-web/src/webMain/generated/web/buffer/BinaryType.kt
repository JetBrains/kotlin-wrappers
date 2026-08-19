// Automatically generated - do not modify!

package web.buffer

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/binaryType)
 */
@JsUnion
sealed /* union */
external interface BinaryType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/binaryType#arraybuffer)
 */
inline val BinaryType.Companion.arraybuffer: BinaryType
    get() = unsafeCast("arraybuffer")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/binaryType#blob)
 */
inline val BinaryType.Companion.blob: BinaryType
    get() = unsafeCast("blob")
