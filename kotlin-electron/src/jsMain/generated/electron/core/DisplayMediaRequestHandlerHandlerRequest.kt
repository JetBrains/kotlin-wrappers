package electron.core


external interface DisplayMediaRequestHandlerHandlerRequest {
    /**
     * Frame that is requesting access to media.
     */
    var frame: WebFrameMain

    /**
     * Origin of the page making the request.
     */
    var securityOrigin: String

    /**
     * true if the web content requested a video stream.
     */
    var videoRequested: Boolean

    /**
     * true if the web content requested an audio stream.
     */
    var audioRequested: Boolean

    /**
     * Whether a user gesture was active when this request was triggered.
     */
    var userGesture: Boolean
}
