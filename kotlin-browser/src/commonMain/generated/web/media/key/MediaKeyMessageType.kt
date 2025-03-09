// Automatically generated - do not modify!

package web.media.key

import seskar.js.JsValue

sealed external interface MediaKeyMessageType {
    companion object {
        @JsValue("individualization-request")
        val individualizationRequest: MediaKeyMessageType

        @JsValue("license-release")
        val licenseRelease: MediaKeyMessageType

        @JsValue("license-renewal")
        val licenseRenewal: MediaKeyMessageType

        @JsValue("license-request")
        val licenseRequest: MediaKeyMessageType
    }
}
