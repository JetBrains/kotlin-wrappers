// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import js.reflect.unsafeCast

sealed external interface AttestationConveyancePreference {
    companion object
}

inline val AttestationConveyancePreference.Companion.direct: AttestationConveyancePreference
    get() = unsafeCast("direct")

inline val AttestationConveyancePreference.Companion.enterprise: AttestationConveyancePreference
    get() = unsafeCast("enterprise")

inline val AttestationConveyancePreference.Companion.indirect: AttestationConveyancePreference
    get() = unsafeCast("indirect")

inline val AttestationConveyancePreference.Companion.none: AttestationConveyancePreference
    get() = unsafeCast("none")
