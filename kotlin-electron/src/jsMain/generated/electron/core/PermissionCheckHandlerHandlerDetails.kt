package electron.core


external interface PermissionCheckHandlerHandlerDetails {
    /**
     * The origin of the frame embedding the frame that made the permission check.
     * Only set for cross-origin sub frames making permission checks.
     */
    var embeddingOrigin: String?

    /**
     * The security origin of the `media` check.
     */
    var securityOrigin: String?

    /**
     * The type of media access being requested, can be `video`, `audio` or `unknown`
     */
    var mediaType: (PermissionCheckHandlerHandlerDetailsMediaType)?

    /**
     * The last URL the requesting frame loaded.  This is not provided for cross-origin
     * sub frames making permission checks.
     */
    var requestingUrl: String?

    /**
     * Whether the frame making the request is the main frame
     */
    var isMainFrame: Boolean
}
