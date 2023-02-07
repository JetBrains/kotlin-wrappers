// Automatically generated - do not modify!

package actions.artifact

sealed external interface ContainerEntry {
    var containerId: Number
    var scopeIdentifier: String
    var path: String
    var itemType: String
    var status: String
    var fileLength: Number?
    var fileEncoding: Number?
    var fileType: Number?
    var dateCreated: String
    var dateLastModified: String
    var createdBy: String
    var lastModifiedBy: String
    var itemLocation: String
    var contentLocation: String
    var fileId: Number?
    var contentId: String
}
