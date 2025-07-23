// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.regexp.RegExp

/**
 * The language configuration interfaces defines the contract between extensions
 * and various editor features, like automatic bracket insertion, automatic indentation etc.
 */
external interface LanguageConfiguration {
    /**
     * The language's comment settings.
     */
    var comments: CommentRule?

    /**
     * The language's brackets.
     * This configuration implicitly affects pressing Enter around these brackets.
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
     */
    var wordPattern: RegExp?

    /**
     * The language's indentation settings.
     */
    var indentationRules: IndentationRule?

    /**
     * The language's rules to be evaluated when pressing Enter.
     */
    var onEnterRules: ReadonlyArray<OnEnterRule>?

    /**
     * The language's auto closing pairs.
     */
    var autoClosingPairs: ReadonlyArray<AutoClosingPair>?
}
