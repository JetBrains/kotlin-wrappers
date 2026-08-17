// Automatically generated - do not modify!

package web.credentials

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CredentialMediationRequirement

inline val CredentialMediationRequirement.Companion.conditional: CredentialMediationRequirement
    get() = unsafeCast("conditional")

inline val CredentialMediationRequirement.Companion.optional: CredentialMediationRequirement
    get() = unsafeCast("optional")

inline val CredentialMediationRequirement.Companion.required: CredentialMediationRequirement
    get() = unsafeCast("required")

inline val CredentialMediationRequirement.Companion.silent: CredentialMediationRequirement
    get() = unsafeCast("silent")
