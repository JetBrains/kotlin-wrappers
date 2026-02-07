// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Represents an error result from a chat request.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatErrorDetails)
 */
@JsPlainObject
external interface ChatErrorDetails {
    /**
     * An error message that is shown to the user.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatErrorDetails.message)
     */
    var message: String

    /**
     * If set to true, the response will be partly blurred out.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatErrorDetails.responseIsFiltered)
     */
    var responseIsFiltered: Boolean?
}
