// Automatically generated - do not modify!

package actions.http.client

sealed external interface RequestOptions {
    var headers: node.http.OutgoingHttpHeaders?
    var socketTimeout: Number?
    var ignoreSslError: Boolean?
    var allowRedirects: Boolean?
    var allowRedirectDowngrade: Boolean?
    var maxRedirects: Number?
    var maxSockets: Number?
    var keepAlive: Boolean?
    var deserializeDates: Boolean?
    var allowRetries: Boolean?
    var maxRetries: Number?
}
