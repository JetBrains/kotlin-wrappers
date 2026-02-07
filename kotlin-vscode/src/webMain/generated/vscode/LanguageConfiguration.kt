// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.regexp.RegExp
import kotlinx.js.JsPlainObject

/**
 * The language configuration interfaces defines the contract between extensions
 * and various editor features, like automatic bracket insertion, automatic indentation etc.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageConfiguration)
 */
@JsPlainObject
external interface LanguageConfiguration {
    /**
     * The language's comment settings.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageConfiguration.comments)
     */
    var comments: CommentRule?

    /**
     * The language's brackets.
     * This configuration implicitly affects pressing Enter around these brackets.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageConfiguration.brackets)
     */
    var brackets: ReadonlyArray<CharacterPair>?

    /**
     * The language's word definition.
     * If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
     * to provide a word definition that uses exclusion of known separators.
     * e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
     * ```
     * /(-?\d*\.\d\w*)|([^\`\~\!\@\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g
     * ```
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageConfiguration.wordPattern)
     */
    var wordPattern: RegExp?

    /**
     * The language's indentation settings.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageConfiguration.indentationRules)
     */
    var indentationRules: IndentationRule?

    /**
     * The language's rules to be evaluated when pressing Enter.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageConfiguration.onEnterRules)
     */
    var onEnterRules: ReadonlyArray<OnEnterRule>?

    /**
     * The language's auto closing pairs.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageConfiguration.autoClosingPairs)
     */
    var autoClosingPairs: ReadonlyArray<AutoClosingPair>?
}
