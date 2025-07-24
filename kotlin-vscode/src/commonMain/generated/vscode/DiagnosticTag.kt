// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Additional metadata about the type of a diagnostic.
 */
sealed /* enum */
external interface DiagnosticTag {
    companion object {
        /**
         * Unused or unnecessary code.
         *
         * Diagnostics with this tag are rendered faded out. The amount of fading
         * is controlled by the `"editorUnnecessaryCode.opacity"` theme color. For
         * example, `"editorUnnecessaryCode.opacity": "#000000c0"` will render the
         * code with 75% opacity. For high contrast themes, use the
         * `"editorUnnecessaryCode.border"` theme color to underline unnecessary code
         * instead of fading it out.
         */
        val Unnecessary: DiagnosticTag // 1

        /**
         * Deprecated or obsolete code.
         *
         * Diagnostics with this tag are rendered with a strike through.
         */
        val Deprecated: DiagnosticTag // 2
    }
}
