// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AttestationConveyancePreference {
    companion object {
        @JsValue("direct")
        val direct: AttestationConveyancePreference

        @JsValue("enterprise")
        val enterprise: AttestationConveyancePreference

        @JsValue("indirect")
        val indirect: AttestationConveyancePreference

        @JsValue("none")
        val none: AttestationConveyancePreference
    }
}
