// Automatically generated - do not modify!

package electron.core

external interface PermissionRequest {
// Docs: https://electronjs.org/docs/api/structures/permission-request
    /**
     * Whether the frame making the request is the main frame.
     */
    var isMainFrame: Boolean

    /**
     * The last URL the requesting frame loaded.
     */
    var requestingUrl: String
}
