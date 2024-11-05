// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.autofill

import js.reflect.unsafeCast

sealed external interface AutoFill

inline fun AutoFill(
    section: AutoFillSection,
    addressKind: AutoFillAddressKind,
    field: AutoFillField,
): AutoFill =
    unsafeCast("$section $addressKind $field")

inline fun AutoFill(
    section: AutoFillSection,
    addressKind: AutoFillAddressKind,
    field: AutoFillField,
    credentialField: AutoFillCredentialField,
): AutoFill =
    unsafeCast("$section $addressKind $field $credentialField")

inline fun AutoFill(
    addressKind: AutoFillAddressKind,
    field: AutoFillField,
): AutoFill =
    unsafeCast("$addressKind $field")

inline fun AutoFill(
    addressKind: AutoFillAddressKind,
    field: AutoFillField,
    credentialField: AutoFillCredentialField,
): AutoFill =
    unsafeCast("$addressKind $field $credentialField")

inline fun AutoFill(
    field: AutoFillField,
    credentialField: AutoFillCredentialField,
): AutoFill =
    unsafeCast("$field $credentialField")
