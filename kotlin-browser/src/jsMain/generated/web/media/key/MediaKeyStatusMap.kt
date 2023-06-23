// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import js.collections.MapLike

/**
 * This EncryptedMediaExtensions API interface is a read-only map of media key statuses by key IDs.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap)
 */
sealed external class MediaKeyStatusMap :
    MapLike<BufferSource, MediaKeyStatus> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/size) */
    val size: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/get) */
    operator fun get(keyId: BufferSource): MediaKeyStatus?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/has) */
    fun has(keyId: BufferSource): Boolean
}
