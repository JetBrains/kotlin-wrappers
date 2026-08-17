// Automatically generated - do not modify!

package web.mediaencrypted

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MediaKeyMessageType

inline val MediaKeyMessageType.Companion.individualizationRequest: MediaKeyMessageType
    get() = unsafeCast("individualization-request")

inline val MediaKeyMessageType.Companion.licenseRelease: MediaKeyMessageType
    get() = unsafeCast("license-release")

inline val MediaKeyMessageType.Companion.licenseRenewal: MediaKeyMessageType
    get() = unsafeCast("license-renewal")

inline val MediaKeyMessageType.Companion.licenseRequest: MediaKeyMessageType
    get() = unsafeCast("license-request")
