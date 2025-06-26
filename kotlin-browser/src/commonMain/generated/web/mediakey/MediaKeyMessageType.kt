// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediakey

import js.reflect.unsafeCast

sealed external interface MediaKeyMessageType {
    companion object
}

inline val MediaKeyMessageType.Companion.individualizationRequest: MediaKeyMessageType
    get() = unsafeCast("individualizationRequest")

inline val MediaKeyMessageType.Companion.licenseRelease: MediaKeyMessageType
    get() = unsafeCast("licenseRelease")

inline val MediaKeyMessageType.Companion.licenseRenewal: MediaKeyMessageType
    get() = unsafeCast("licenseRenewal")

inline val MediaKeyMessageType.Companion.licenseRequest: MediaKeyMessageType
    get() = unsafeCast("licenseRequest")
