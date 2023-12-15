// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface TimeZoneNameFormat {
    companion object {
        @JsValue("short")
        val short: TimeZoneNameFormat

        @JsValue("long")
        val long: TimeZoneNameFormat

        @JsValue("shortOffset")
        val shortOffset: TimeZoneNameFormat

        @JsValue("longOffset")
        val longOffset: TimeZoneNameFormat

        @JsValue("shortGeneric")
        val shortGeneric: TimeZoneNameFormat

        @JsValue("longGeneric")
        val longGeneric: TimeZoneNameFormat
    }
}
