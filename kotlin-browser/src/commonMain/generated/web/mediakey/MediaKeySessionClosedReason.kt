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
    get() = unsafeCast("closedByApplication")

inline val MediaKeySessionClosedReason.Companion.hardwareContextReset: MediaKeySessionClosedReason
    get() = unsafeCast("hardwareContextReset")

inline val MediaKeySessionClosedReason.Companion.internalError: MediaKeySessionClosedReason
    get() = unsafeCast("internalError")

inline val MediaKeySessionClosedReason.Companion.releaseAcknowledged: MediaKeySessionClosedReason
    get() = unsafeCast("releaseAcknowledged")

inline val MediaKeySessionClosedReason.Companion.resourceEvicted: MediaKeySessionClosedReason
    get() = unsafeCast("resourceEvicted")
