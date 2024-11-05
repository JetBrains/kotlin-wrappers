// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.autofill

import js.reflect.unsafeCast

sealed external interface AutoFillField :
    AutoFill

inline fun AutoFillField(
    contactKind: AutoFillContactKind,
    contactField: AutoFillContactField,
): AutoFillField =
    unsafeCast("$contactKind $contactField")
