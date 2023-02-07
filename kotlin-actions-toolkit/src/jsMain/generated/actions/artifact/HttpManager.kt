// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import actions.http.client.HttpClient

external class HttpManager {
    constructor(
        clientCount: Number,
        userAgent: String,
    )

    fun getClient(index: Number): HttpClient
    fun disposeAndReplaceClient(index: Number)
    fun disposeAndReplaceAllClients()
}
