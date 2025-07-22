// Automatically generated - do not modify!

package vscode

/**
 * The language configuration interfaces defines the contract between extensions
 * and various editor features, like automatic bracket insertion, automatic indentation etc.
 */
external interface LanguageConfiguration {
    /**
    // ORIGINAL SOURCE

    /**
     * The language's comment settings.
    */
    comments?: CommentRule;
    /**
     * The language's brackets.
     * This configuration implicitly affects pressing Enter around these brackets.
    */
    brackets?: CharacterPair[];
    /**
     * The language's word definition.
     * If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
     * to provide a word definition that uses exclusion of known separators.
     * e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
     * ```
     * /(-?\d*\.\d\w*)|([^\`\~\!\@\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g
     * ```
    */
    wordPattern?: RegExp;
    /**
     * The language's indentation settings.
    */
    indentationRules?: IndentationRule;
    /**
     * The language's rules to be evaluated when pressing Enter.
    */
    onEnterRules?: OnEnterRule[];
    /**
     * The language's auto closing pairs.
    */
    autoClosingPairs?: AutoClosingPair[];

    /**
     * **Deprecated** Do not use.
     *
     * @deprecated Will be replaced by a better API soon.
    */
    __electricCharacterSupport?: {
    /**
     * This property is deprecated and will be **ignored** from
     * the editor.
     * @deprecated
    */
    brackets?: any;
    /**
     * This property is deprecated and not fully supported anymore by
     * the editor (scope and lineStart are ignored).
     * Use the autoClosingPairs property in the language configuration file instead.
     * @deprecated
    */
    docComment?: {
    /**
     * @deprecated
    */
    scope: string;
    /**
     * @deprecated
    */
    open: string;
    /**
     * @deprecated
    */
    lineStart: string;
    /**
     * @deprecated
    */
    close?: string;
    };
    };

    /**
     * **Deprecated** Do not use.
     *
     * @deprecated * Use the autoClosingPairs property in the language configuration file instead.
    */
    __characterPairSupport?: {
    /**
     * @deprecated
    */
    autoClosingPairs: {
    /**
     * @deprecated
    */
    open: string;
    /**
     * @deprecated
    */
    close: string;
    /**
     * @deprecated
    */
    notIn?: string[];
    }[];
    };

    // ORIGINAL SOURCE
     **/
}
