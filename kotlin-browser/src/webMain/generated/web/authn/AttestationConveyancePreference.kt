// Automatically generated - do not modify!

package web.authn

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AttestationConveyancePreference

inline val AttestationConveyancePreference.Companion.direct: AttestationConveyancePreference
    get() = unsafeCast("direct")

inline val AttestationConveyancePreference.Companion.enterprise: AttestationConveyancePreference
    get() = unsafeCast("enterprise")

inline val AttestationConveyancePreference.Companion.indirect: AttestationConveyancePreference
    get() = unsafeCast("indirect")

inline val AttestationConveyancePreference.Companion.none: AttestationConveyancePreference
    get() = unsafeCast("none")
