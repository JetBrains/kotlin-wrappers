// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.credentials

import js.reflect.unsafeCast

sealed external interface CredentialMediationRequirement {
    companion object
}

inline val CredentialMediationRequirement.Companion.conditional: CredentialMediationRequirement
    get() = unsafeCast("conditional")

inline val CredentialMediationRequirement.Companion.optional: CredentialMediationRequirement
    get() = unsafeCast("optional")

inline val CredentialMediationRequirement.Companion.required: CredentialMediationRequirement
    get() = unsafeCast("required")

inline val CredentialMediationRequirement.Companion.silent: CredentialMediationRequirement
    get() = unsafeCast("silent")
