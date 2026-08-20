// Automatically generated - do not modify!

package web.mediaencrypted

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/BufferSource))
 */
@JsUnion
sealed /* union */
external interface MediaKeyStatus

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/BufferSource)#expired)
 */
inline val MediaKeyStatus.Companion.expired: MediaKeyStatus
    get() = unsafeCast("expired")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/BufferSource)#internal-error)
 */
inline val MediaKeyStatus.Companion.internalError: MediaKeyStatus
    get() = unsafeCast("internal-error")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/BufferSource)#output-downscaled)
 */
inline val MediaKeyStatus.Companion.outputDownscaled: MediaKeyStatus
    get() = unsafeCast("output-downscaled")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/BufferSource)#output-restricted)
 */
inline val MediaKeyStatus.Companion.outputRestricted: MediaKeyStatus
    get() = unsafeCast("output-restricted")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/BufferSource)#released)
 */
inline val MediaKeyStatus.Companion.released: MediaKeyStatus
    get() = unsafeCast("released")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/BufferSource)#status-pending)
 */
inline val MediaKeyStatus.Companion.statusPending: MediaKeyStatus
    get() = unsafeCast("status-pending")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/BufferSource)#usable)
 */
inline val MediaKeyStatus.Companion.usable: MediaKeyStatus
    get() = unsafeCast("usable")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/BufferSource)#usable-in-future)
 */
inline val MediaKeyStatus.Companion.usableInFuture: MediaKeyStatus
    get() = unsafeCast("usable-in-future")
