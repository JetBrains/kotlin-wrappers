// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediakey

import js.reflect.unsafeCast

sealed external interface MediaKeyStatus {
    companion object
}

inline val MediaKeyStatus.Companion.expired: MediaKeyStatus
    get() = unsafeCast("expired")

inline val MediaKeyStatus.Companion.internalError: MediaKeyStatus
    get() = unsafeCast("internalError")

inline val MediaKeyStatus.Companion.outputDownscaled: MediaKeyStatus
    get() = unsafeCast("outputDownscaled")

inline val MediaKeyStatus.Companion.outputRestricted: MediaKeyStatus
    get() = unsafeCast("outputRestricted")

inline val MediaKeyStatus.Companion.released: MediaKeyStatus
    get() = unsafeCast("released")

inline val MediaKeyStatus.Companion.statusPending: MediaKeyStatus
    get() = unsafeCast("statusPending")

inline val MediaKeyStatus.Companion.usable: MediaKeyStatus
    get() = unsafeCast("usable")

inline val MediaKeyStatus.Companion.usableInFuture: MediaKeyStatus
    get() = unsafeCast("usableInFuture")
