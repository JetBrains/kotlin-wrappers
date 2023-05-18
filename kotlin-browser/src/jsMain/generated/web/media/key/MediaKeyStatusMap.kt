// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import js.collections.MapLike

sealed external class MediaKeyStatusMap :
    MapLike<BufferSource, MediaKeyStatus> {
    val size: Int
    operator fun get(keyId: BufferSource): MediaKeyStatus?
    fun has(keyId: BufferSource): Boolean
}
