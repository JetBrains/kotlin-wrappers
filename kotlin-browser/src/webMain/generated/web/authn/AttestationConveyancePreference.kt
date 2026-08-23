// Automatically generated - do not modify!

package web.authn

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions/attestation)
 */
@JsUnion
sealed /* union */
external interface AttestationConveyancePreference

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions/attestation#direct)
 */
inline val AttestationConveyancePreference.Companion.direct: AttestationConveyancePreference
    get() = unsafeCast("direct")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions/attestation#enterprise)
 */
inline val AttestationConveyancePreference.Companion.enterprise: AttestationConveyancePreference
    get() = unsafeCast("enterprise")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions/attestation#indirect)
 */
inline val AttestationConveyancePreference.Companion.indirect: AttestationConveyancePreference
    get() = unsafeCast("indirect")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PublicKeyCredentialCreationOptions/attestation#none)
 */
inline val AttestationConveyancePreference.Companion.none: AttestationConveyancePreference
    get() = unsafeCast("none")
