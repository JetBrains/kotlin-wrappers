// Automatically generated - do not modify!

package node.inspector.network

/**
 * HTTP request data.
 */
sealed external interface Request {
    var url: String
    var method: String
    var headers: Headers
    var hasPostData: Boolean
}
