// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * The shell quoting options.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellQuotingOptions)
 */
@JsPlainObject
external interface ShellQuotingOptions {
    /**
     * The character used to do character escaping. If a string is provided only spaces
     * are escaped. If a `{ escapeChar, charsToEscape }` literal is provide all characters
     * in `charsToEscape` are escaped using the `escapeChar`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellQuotingOptions.escape)
     */
    /*
    escape?: string | {
        /**
         * The escape character.
         */
        escapeChar: string;
        /**
         * The characters to escape.
         */
        charsToEscape: string;
    }
    */

    /**
     * The character used for strong quoting. The string's length must be 1.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellQuotingOptions.strong)
     */
    var strong: String?

    /**
     * The character used for weak quoting. The string's length must be 1.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ShellQuotingOptions.weak)
     */
    var weak: String?
}
