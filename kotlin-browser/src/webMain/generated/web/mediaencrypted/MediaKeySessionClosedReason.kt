// Automatically generated - do not modify!

package web.mediaencrypted

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MediaKeySessionClosedReason

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
