// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediakey

import js.reflect.unsafeCast

sealed external interface MediaKeySessionClosedReason {
    companion object
}

inline val MediaKeySessionClosedReason.Companion.closedByApplication: MediaKeySessionClosedReason
    get() = unsafeCast("closed-by-application")

inline val MediaKeySessionClosedReason.Companion.hardwareContextReset: MediaKeySessionClosedReason
    get() = unsafeCast("hardware-context-reset")

inline val MediaKeySessionClosedReason.Companion.internalError: MediaKeySessionClosedReason
    get() = unsafeCast("internal-error")

inline val MediaKeySessionClosedReason.Companion.releaseAcknowledged: MediaKeySessionClosedReason
    get() = unsafeCast("release-acknowledged")

inline val MediaKeySessionClosedReason.Companion.resourceEvicted: MediaKeySessionClosedReason
    get() = unsafeCast("resource-evicted")
