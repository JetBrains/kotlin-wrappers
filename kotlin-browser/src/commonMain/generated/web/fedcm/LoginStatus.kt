// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.fedcm

import seskar.js.JsValue

sealed external interface LoginStatus {
    companion object {
        @JsValue("logged-in")
        val loggedIn: LoginStatus

        @JsValue("logged-out")
        val loggedOut: LoginStatus
    }
}
