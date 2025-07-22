// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.errors.JsError

/**
 * An error type for language model specific errors.
 *
 * Consumers of language models should check the code property to determine specific
 * failure causes, like `if(someError.code === vscode.LanguageModelError.NotFound.name) {...}`
 * for the case of referring to an unknown language model. For unspecified errors the `cause`-property
 * will contain the actual error.
 */
open external class LanguageModelError :
    JsError {
    /**
    // ORIGINAL SOURCE


    /**
     * The requestor does not have permissions to use this
     * language model
    */
    static NoPermissions(message?: string): LanguageModelError;

    /**
     * The requestor is blocked from using this language model.
    */
    static Blocked(message?: string): LanguageModelError;

    /**
     * The language model does not exist.
    */
    static NotFound(message?: string): LanguageModelError;

    /**
     * A code that identifies this error.
     *
     * Possible values are names of errors, like {@linkcode LanguageModelError.NotFound NotFound},
     * or `Unknown` for unspecified errors from the language model itself. In the latter case the
     * `cause`-property will contain the actual error.
    */
    readonly code: string;

    // ORIGINAL SOURCE
     **/
}
