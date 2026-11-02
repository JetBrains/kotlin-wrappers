// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface MediaAccessPermissionRequest : PermissionRequest {
// Docs: https://electronjs.org/docs/api/structures/media-access-permission-request
    /**
     * The types of media access being requested - elements can be `video` or `audio`.
     * For a `media` permission request these are the camera and microphone
     * respectively; for a `display-capture` permission request they are the screen,
     * window or tab video and its audio.
     */
    var mediaTypes: js.array.ReadonlyArray<MediaAccessPermissionRequestMediaType>?

    /**
     * The security origin of the request.
     */
    var securityOrigin: String?
}
