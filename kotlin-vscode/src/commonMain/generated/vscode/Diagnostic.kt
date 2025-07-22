// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a diagnostic, such as a compiler error or warning. Diagnostic objects
 * are only valid in the scope of a file.
 */
open external class Diagnostic {
    /**
     * The range to which this diagnostic applies.
     */
//  range: Range;

    /**
     * The human-readable message.
     */
//  message: string;

    /**
     * The severity, default is {@link DiagnosticSeverity.Error error}.
     */
//  severity: DiagnosticSeverity;

    /**
     * A human-readable string describing the source of this
     * diagnostic, e.g. 'typescript' or 'super lint'.
     */
//  source?: string;

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
    };
    */

    /**
     * An array of related diagnostic information, e.g. when symbol-names within
     * a scope collide all definitions can be marked via this property.
     */
//  relatedInformation?: DiagnosticRelatedInformation[];

    /**
     * Additional metadata about the diagnostic.
     */
//  tags?: DiagnosticTag[];

    /**
     * Creates a new diagnostic object.
     *
     * @param range The range to which this diagnostic applies.
     * @param message The human-readable message.
     * @param severity The severity, default is {@link DiagnosticSeverity.Error error}.
     */
//  constructor(range: Range, message: string, severity?: DiagnosticSeverity);
}
