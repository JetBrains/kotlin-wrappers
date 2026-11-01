// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface PermissionCheckHandlerHandlerDetails {
    /**
     * The origin of the frame embedding the frame that made the permission check.
     * Only set for cross-origin sub frames making permission checks.
     */
    var embeddingOrigin: String?

    /**
     * The origin of the requesting frame, for `media`, `hid`, `usb` and `serial`
     * checks.
     */
    var securityOrigin: String?

    /**
     * The type of media access being requested, can be `video`, `audio` or `unknown`.
     */
    var mediaType: (PermissionCheckHandlerHandlerDetailsMediaType)?

    /**
     * The last URL the requesting frame loaded. Not provided when the check is not
     * made on behalf of a document (for example for a service worker).
     */
    var requestingUrl: String?

    /**
     * Whether the frame making the request is the main frame.
     */
    var isMainFrame: Boolean

    /**
     * The path of a `fileSystem` request.
     */
    var filePath: String?

    /**
     * Whether a `fileSystem` request is a directory.
     */
    var isDirectory: Boolean?

    /**
     * The access type of a `fileSystem` request. Can be `writable` or `readable`.
     */
    var fileAccessType: (PermissionCheckHandlerHandlerDetailsFileAccessType)?
}
