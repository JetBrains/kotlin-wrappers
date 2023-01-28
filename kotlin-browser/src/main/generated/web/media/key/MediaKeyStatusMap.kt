// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource

sealed external class MediaKeyStatusMap {
    val size: Int
    operator fun get(keyId: BufferSource): MediaKeyStatus?
    fun has(keyId: BufferSource): Boolean
    fun forEach(action: (item: MediaKeyStatus) -> Unit)
}
