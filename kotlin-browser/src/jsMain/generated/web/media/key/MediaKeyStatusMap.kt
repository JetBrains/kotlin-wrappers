// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import js.collections.MapLike

sealed external class MediaKeyStatusMap :
    MapLike<BufferSource, MediaKeyStatus> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/size) */
    val size: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/get) */
    operator fun get(keyId: BufferSource): MediaKeyStatus?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/has) */
    fun has(keyId: BufferSource): Boolean
}
