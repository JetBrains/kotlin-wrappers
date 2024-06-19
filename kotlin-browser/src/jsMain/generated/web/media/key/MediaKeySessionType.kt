// Automatically generated - do not modify!

package web.media.key

import seskar.js.JsValue

sealed external interface MediaKeySessionType {
    companion object {
        @JsValue("persistent-license")
        val persistentLicense: MediaKeySessionType

        @JsValue("temporary")
        val temporary: MediaKeySessionType
    }
}
