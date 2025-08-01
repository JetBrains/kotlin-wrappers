// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * The kind of executions that {@link TestRunProfile TestRunProfiles} control.
 */
sealed /* enum */
external interface TestRunProfileKind {
    companion object {
        /**
         * The `Run` test profile kind.
         */
        val Run: TestRunProfileKind // 1

        /**
         * The `Debug` test profile kind.
         */
        val Debug: TestRunProfileKind // 2

        /**
         * The `Coverage` test profile kind.
         */
        val Coverage: TestRunProfileKind // 3
    }
}
