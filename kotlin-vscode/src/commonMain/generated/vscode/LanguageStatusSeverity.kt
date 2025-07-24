// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Represents the severity of a language status item.
 * Represents the severity level of a language status.
 */
sealed /* enum */
external interface LanguageStatusSeverity {
    companion object {
        /**
         * Informational severity level.
         */
        val Information: LanguageStatusSeverity // 0

        /**
         * Warning severity level.
         */
        val Warning: LanguageStatusSeverity // 1

        /**
         * Error severity level.
         */
        val Error: LanguageStatusSeverity // 2
    }
}
