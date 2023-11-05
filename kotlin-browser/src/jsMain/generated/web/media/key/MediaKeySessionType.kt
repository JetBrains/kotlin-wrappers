// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.key

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MediaKeySessionType {
    companion object {
        @JsValue("persistent-license")
        val persistentLicense: MediaKeySessionType

        @JsValue("temporary")
        val temporary: MediaKeySessionType
    }
}
