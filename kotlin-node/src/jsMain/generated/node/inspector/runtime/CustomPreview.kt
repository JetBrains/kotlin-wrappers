// Generated by Karakum - do not modify it manually!

package node.inspector.runtime

/**
 * @experimental
 */
sealed external interface CustomPreview {
    var header: String
    var hasBody: Boolean
    var formatterObjectId: RemoteObjectId
    var bindRemoteObjectFunctionId: RemoteObjectId
    var configObjectId: RemoteObjectId?
}
