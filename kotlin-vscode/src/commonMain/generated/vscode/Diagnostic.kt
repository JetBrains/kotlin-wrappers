// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents a diagnostic, such as a compiler error or warning. Diagnostic objects
 * are only valid in the scope of a file.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Diagnostic)
 */
open external class Diagnostic {
    /**
     * The range to which this diagnostic applies.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Diagnostic.range)
     */
    var range: Range

    /**
     * The human-readable message.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Diagnostic.message)
     */
    var message: String

    /**
     * The severity, default is [error][DiagnosticSeverity.Error].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Diagnostic.severity)
     */
    var severity: DiagnosticSeverity

    /**
     * A human-readable string describing the source of this
     * diagnostic, e.g. 'typescript' or 'super lint'.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Diagnostic.source)
     */
    var source: String?

    /**
     * A code or identifier for this diagnostic.
     * Should be used for later processing, e.g. when providing [code actions][CodeActionContext].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Diagnostic.code)
     */
    /*
    code?: string | number | {
        /**
         * A code or identifier for this diagnostic.
         * Should be used for later processing, e.g. when providing {@link CodeActionContext code actions}.
         */
        value: string | number;

        /**
         * A target URI to open with more information about the diagnostic error.
         */
        target: Uri;
    }
    */

    /**
     * An array of related diagnostic information, e.g. when symbol-names within
     * a scope collide all definitions can be marked via this property.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Diagnostic.relatedInformation)
     */
    var relatedInformation: ReadonlyArray<DiagnosticRelatedInformation>?

    /**
     * Additional metadata about the diagnostic.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Diagnostic.tags)
     */
    var tags: ReadonlyArray<DiagnosticTag>?

    /**
     * Creates a new diagnostic object.
     *
     * @param range The range to which this diagnostic applies.
     * @param message The human-readable message.
     * @param severity The severity, default is [error][DiagnosticSeverity.Error].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Diagnostic.constructor)
     */
    constructor(
        range: Range,
        message: String,
        severity: DiagnosticSeverity = definedExternally,
    )
}
