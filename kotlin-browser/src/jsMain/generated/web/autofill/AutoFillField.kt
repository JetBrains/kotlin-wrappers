// Automatically generated - do not modify!

package web.autofill

import js.reflect.unsafeCast

sealed external interface AutoFillField :
    AutoFill

inline fun AutoFillField(
    contactKind: AutoFillContactKind,
    contactField: AutoFillContactField,
): AutoFillField =
    unsafeCast("$contactKind $contactField")
