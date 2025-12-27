// Automatically generated - do not modify!

package electron.core

external interface MediaAccessPermissionRequest : PermissionRequest {
// Docs: https://electronjs.org/docs/api/structures/media-access-permission-request
    /**
     * The types of media access being requested - elements can be `video` or `audio`.
     */
    var mediaTypes: Array<MediaAccessPermissionRequestMediaType>?

    /**
     * The security origin of the request.
     */
    var securityOrigin: String?
}
