// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface PromptAPIHandlerDetails {
    /**
     * The unique id of the WebContents calling the Prompt API.
     */
    var webContentsId: Double

    /**
     * Origin of the page calling the Prompt API.
     */
    var securityOrigin: String

    /**
     * The frame token of the frame calling the Prompt API.
     */
    var frameToken: String

    /**
     * The process id of the renderer process hosting the frame calling the Prompt API.
     */
    var renderProcessId: Double
}
