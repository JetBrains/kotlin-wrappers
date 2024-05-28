// Automatically generated - do not modify!

package actions.http.client

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface TypedResponse<T> {
    var statusCode: Number
    var result: T?
    var headers: node.http.IncomingHttpHeaders
}
