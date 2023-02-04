// Automatically generated - do not modify!

@file:JsModule("@actions/http-client")

package actions.http.client

import js.errors.JsError

external class HttpClientError : JsError {
    constructor(
        message: String,
        statusCode: Number,
    )

    var statusCode: Number
    var result: Any?
}
