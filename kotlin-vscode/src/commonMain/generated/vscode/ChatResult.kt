// Automatically generated - do not modify!

package vscode

import js.objects.ReadonlyRecord

/**
 * The result of a chat request.
 */
external interface ChatResult {
    /**
     * If the request resulted in an error, this property defines the error details.
     */
//  errorDetails?: ChatErrorDetails

    /**
     * Arbitrary metadata for this result. Can be anything, but must be JSON-stringifyable.
     */
    val metadata: ReadonlyRecord<String, *>?
}
