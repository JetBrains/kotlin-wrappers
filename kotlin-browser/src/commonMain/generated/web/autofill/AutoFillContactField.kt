// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.autofill

import js.reflect.unsafeCast

sealed external interface AutoFillContactField :
    AutoFillField {
    companion object
}

inline val AutoFillContactField.Companion.email: AutoFillContactField
    get() = unsafeCast("email")

inline val AutoFillContactField.Companion.tel: AutoFillContactField
    get() = unsafeCast("tel")

inline val AutoFillContactField.Companion.telAreaCode: AutoFillContactField
    get() = unsafeCast("telAreaCode")

inline val AutoFillContactField.Companion.telCountryCode: AutoFillContactField
    get() = unsafeCast("telCountryCode")

inline val AutoFillContactField.Companion.telExtension: AutoFillContactField
    get() = unsafeCast("telExtension")

inline val AutoFillContactField.Companion.telLocal: AutoFillContactField
    get() = unsafeCast("telLocal")

inline val AutoFillContactField.Companion.telLocalPrefix: AutoFillContactField
    get() = unsafeCast("telLocalPrefix")

inline val AutoFillContactField.Companion.telLocalSuffix: AutoFillContactField
    get() = unsafeCast("telLocalSuffix")

inline val AutoFillContactField.Companion.telNational: AutoFillContactField
    get() = unsafeCast("telNational")
