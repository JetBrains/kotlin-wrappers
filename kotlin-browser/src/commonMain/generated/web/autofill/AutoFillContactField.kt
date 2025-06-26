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
    get() = unsafeCast("tel-area-code")

inline val AutoFillContactField.Companion.telCountryCode: AutoFillContactField
    get() = unsafeCast("tel-country-code")

inline val AutoFillContactField.Companion.telExtension: AutoFillContactField
    get() = unsafeCast("tel-extension")

inline val AutoFillContactField.Companion.telLocal: AutoFillContactField
    get() = unsafeCast("tel-local")

inline val AutoFillContactField.Companion.telLocalPrefix: AutoFillContactField
    get() = unsafeCast("tel-local-prefix")

inline val AutoFillContactField.Companion.telLocalSuffix: AutoFillContactField
    get() = unsafeCast("tel-local-suffix")

inline val AutoFillContactField.Companion.telNational: AutoFillContactField
    get() = unsafeCast("tel-national")
