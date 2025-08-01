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
    get() = unsafeCast("internal-error")

inline val MediaKeyStatus.Companion.outputDownscaled: MediaKeyStatus
    get() = unsafeCast("output-downscaled")

inline val MediaKeyStatus.Companion.outputRestricted: MediaKeyStatus
    get() = unsafeCast("output-restricted")

inline val MediaKeyStatus.Companion.released: MediaKeyStatus
    get() = unsafeCast("released")

inline val MediaKeyStatus.Companion.statusPending: MediaKeyStatus
    get() = unsafeCast("status-pending")

inline val MediaKeyStatus.Companion.usable: MediaKeyStatus
    get() = unsafeCast("usable")

inline val MediaKeyStatus.Companion.usableInFuture: MediaKeyStatus
    get() = unsafeCast("usable-in-future")
