package electron.core


external interface PermissionRequestHandlerHandlerDetails {
    /**
     * The url of the `openExternal` request.
     */
    var externalURL: String?

    /**
     * The security origin of the `media` request.
     */
    var securityOrigin: String?

    /**
     * The types of media access being requested, elements can be `video` or `audio`
     */
    var mediaTypes: Array<PermissionRequestHandlerHandlerDetailsMediaType>?

    /**
     * The last URL the requesting frame loaded
     */
    var requestingUrl: String

    /**
     * Whether the frame making the request is the main frame
     */
    var isMainFrame: Boolean
}
