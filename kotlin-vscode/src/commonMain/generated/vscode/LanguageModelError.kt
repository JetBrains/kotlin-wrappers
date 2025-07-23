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
     * A code that identifies this error.
     *
     * Possible values are names of errors, like {@linkcode LanguageModelError.NotFound NotFound},
     * or `Unknown` for unspecified errors from the language model itself. In the latter case the
     * `cause`-property will contain the actual error.
     */
    val code: String

    companion object {
        /**
         * The requestor does not have permissions to use this
         * language model
         */
        fun NoPermissions(message: String = definedExternally): LanguageModelError

        /**
         * The requestor is blocked from using this language model.
         */
        fun Blocked(message: String = definedExternally): LanguageModelError

        /**
         * The language model does not exist.
         */
        fun NotFound(message: String = definedExternally): LanguageModelError
    }
}
