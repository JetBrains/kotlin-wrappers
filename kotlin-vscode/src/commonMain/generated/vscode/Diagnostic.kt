// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents a diagnostic, such as a compiler error or warning. Diagnostic objects
 * are only valid in the scope of a file.
 */
open external class Diagnostic {
    /**
     * The range to which this diagnostic applies.
     */
    var range: Range

    /**
     * The human-readable message.
     */
    var message: String

    /**
     * The severity, default is {@link DiagnosticSeverity.Error error}.
     */
    var severity: DiagnosticSeverity

    /**
     * A human-readable string describing the source of this
     * diagnostic, e.g. 'typescript' or 'super lint'.
     */
    var source: String?

    /**
     * A code or identifier for this diagnostic.
     * Should be used for later processing, e.g. when providing {@link CodeActionContext code actions}.
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
     */
    var relatedInformation: ReadonlyArray<DiagnosticRelatedInformation>?

    /**
     * Additional metadata about the diagnostic.
     */
    var tags: ReadonlyArray<DiagnosticTag>?

    /**
     * Creates a new diagnostic object.
     *
     * @param range The range to which this diagnostic applies.
     * @param message The human-readable message.
     * @param severity The severity, default is {@link DiagnosticSeverity.Error error}.
     */
    constructor(
        range: Range,
        message: String,
        severity: DiagnosticSeverity = definedExternally,
    )
}
