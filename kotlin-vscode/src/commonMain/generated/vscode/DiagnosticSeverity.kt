// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents the severity of diagnostics.
 */
sealed /* enum */
external interface DiagnosticSeverity {
    companion object {
        /**
         * Something not allowed by the rules of a language or other means.
         */
        val Error: DiagnosticSeverity // 0

        /**
         * Something suspicious but allowed.
         */
        val Warning: DiagnosticSeverity // 1

        /**
         * Something to inform about but not a problem.
         */
        val Information: DiagnosticSeverity // 2

        /**
         * Something to hint to a better way of doing it, like proposing
         * a refactoring.
         */
        val Hint: DiagnosticSeverity // 3
    }
}
