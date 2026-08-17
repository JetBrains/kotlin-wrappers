// Automatically generated - do not modify!

package web.autofill

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AutoFillContactField :
    AutoFillField

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
