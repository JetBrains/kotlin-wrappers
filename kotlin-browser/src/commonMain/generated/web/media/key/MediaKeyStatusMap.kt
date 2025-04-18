// Automatically generated - do not modify!

package web.media.key

import js.buffer.BufferSource
import js.collections.ReadonlyMap

/**
 * The **`MediaKeyStatusMap`** interface of the Encrypted Media Extensions API is a read-only map of media key statuses by key IDs.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap)
 */
sealed /* final */
external class MediaKeyStatusMap
protected /* private */ constructor() :
    ReadonlyMap<BufferSource, MediaKeyStatus> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/size)
     */
    override val size: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/get)
     */
    override fun get(key: BufferSource): MediaKeyStatus?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/has)
     */
    override fun has(key: BufferSource): Boolean
}
