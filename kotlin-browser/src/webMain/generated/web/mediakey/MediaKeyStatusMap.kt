// Automatically generated - do not modify!

package web.mediakey

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
     * The **`size`** read-only property of the MediaKeyStatusMap interface returns the number of key/value paIrs in the status map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/size)
     */
    override val size: Int

    /**
     * The **`get()`** method of the MediaKeyStatusMap interface returns the status value associated with the given key, or undefined if there is none.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/get)
     */
    override fun get(key: BufferSource): MediaKeyStatus?

    /**
     * The **`has()`** method of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been associated with the given key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/has)
     */
    override fun has(key: BufferSource): Boolean
}
