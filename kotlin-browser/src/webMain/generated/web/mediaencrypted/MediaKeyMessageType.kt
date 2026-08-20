// Automatically generated - do not modify!

package web.mediaencrypted

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType)
 */
@JsUnion
sealed /* union */
external interface MediaKeyMessageType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType#individualization-request)
 */
inline val MediaKeyMessageType.Companion.individualizationRequest: MediaKeyMessageType
    get() = unsafeCast("individualization-request")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType#license-release)
 */
inline val MediaKeyMessageType.Companion.licenseRelease: MediaKeyMessageType
    get() = unsafeCast("license-release")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType#license-renewal)
 */
inline val MediaKeyMessageType.Companion.licenseRenewal: MediaKeyMessageType
    get() = unsafeCast("license-renewal")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType#license-request)
 */
inline val MediaKeyMessageType.Companion.licenseRequest: MediaKeyMessageType
    get() = unsafeCast("license-request")
