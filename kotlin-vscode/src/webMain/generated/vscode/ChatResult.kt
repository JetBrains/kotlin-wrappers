// Automatically generated - do not modify!

package vscode

import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import kotlin.js.JsString

/**
 * The result of a chat request.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResult)
 */
@JsPlainObject
external interface ChatResult {
    /**
     * If the request resulted in an error, this property defines the error details.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResult.errorDetails)
     */
    var errorDetails: ChatErrorDetails?

    /**
     * Arbitrary metadata for this result. Can be anything, but must be JSON-stringifyable.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResult.metadata)
     */
    val metadata: ReadonlyRecord<JsString, *>?
}
