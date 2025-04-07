// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.errors.JsError

external class NetworkError : JsError {
    var code: String

    constructor(code: String)

    companion object {
        fun isNetworkErrorCode(code: String?): Boolean
    }
}
