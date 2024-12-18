// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import js.collections.ReadonlyMap

/**
 * This EncryptedMediaExtensions API interface is a read-only map of media key statuses by key IDs.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap)
 */
sealed /* final */
external class MediaKeyStatusMap
private constructor() :
    ReadonlyMap<BufferSource, MediaKeyStatus> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/size)
     */
    override val size: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/get)
     */
    override operator fun get(key: BufferSource): MediaKeyStatus?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/has)
     */
    override fun has(key: BufferSource): Boolean
}
