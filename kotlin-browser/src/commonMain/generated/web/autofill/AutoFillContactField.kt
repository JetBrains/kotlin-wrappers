// Automatically generated - do not modify!

package web.autofill

import seskar.js.JsValue

sealed external interface AutoFillContactField :
    AutoFillField {
    companion object {
        @JsValue("email")
        val email: AutoFillContactField

        @JsValue("tel")
        val tel: AutoFillContactField

        @JsValue("tel-area-code")
        val telAreaCode: AutoFillContactField

        @JsValue("tel-country-code")
        val telCountryCode: AutoFillContactField

        @JsValue("tel-extension")
        val telExtension: AutoFillContactField

        @JsValue("tel-local")
        val telLocal: AutoFillContactField

        @JsValue("tel-local-prefix")
        val telLocalPrefix: AutoFillContactField

        @JsValue("tel-local-suffix")
        val telLocalSuffix: AutoFillContactField

        @JsValue("tel-national")
        val telNational: AutoFillContactField
    }
}
