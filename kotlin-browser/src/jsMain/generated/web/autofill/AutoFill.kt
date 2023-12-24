// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.autofill

sealed external interface AutoFill

inline fun AutoFill(
    section: AutoFillSection,
    addressKind: AutoFillAddressKind,
    field: AutoFillField,
): AutoFill =
    "$section $addressKind $field".unsafeCast<AutoFill>()

inline fun AutoFill(
    section: AutoFillSection,
    addressKind: AutoFillAddressKind,
    field: AutoFillField,
    credentialField: AutoFillCredentialField,
): AutoFill =
    "$section $addressKind $field $credentialField".unsafeCast<AutoFill>()

inline fun AutoFill(
    addressKind: AutoFillAddressKind,
    field: AutoFillField,
): AutoFill =
    "$addressKind $field".unsafeCast<AutoFill>()

inline fun AutoFill(
    addressKind: AutoFillAddressKind,
    field: AutoFillField,
    credentialField: AutoFillCredentialField,
): AutoFill =
    "$addressKind $field $credentialField".unsafeCast<AutoFill>()

inline fun AutoFill(
    field: AutoFillField,
    credentialField: AutoFillCredentialField,
): AutoFill =
    "$field $credentialField".unsafeCast<AutoFill>()
