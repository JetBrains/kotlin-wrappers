// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * Describes pairs of strings where the close string will be automatically inserted when typing the opening string.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AutoClosingPair)
 */
@JsPlainObject
external interface AutoClosingPair {
    /**
     * The string that will trigger the automatic insertion of the closing string.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AutoClosingPair.open)
     */
    var open: String

    /**
     * The closing string that will be automatically inserted when typing the opening string.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AutoClosingPair.close)
     */
    var close: String

    /**
     * A set of tokens where the pair should not be auto closed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#AutoClosingPair.notIn)
     */
    var notIn: ReadonlyArray<SyntaxTokenType>?
}
