// Automatically generated - do not modify!

package actions.http.client

sealed external interface TypedResponse<T> {
    var statusCode: Number
    var result: T?
    var headers: node.http.IncomingHttpHeaders
}
