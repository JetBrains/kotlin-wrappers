// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * The configuration target
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ConfigurationTarget)
 */
sealed /* enum */
external interface ConfigurationTarget {
    companion object {
        /**
         * Global configuration
         */
        val Global: ConfigurationTarget // 1

        /**
         * Workspace configuration
         */
        val Workspace: ConfigurationTarget // 2

        /**
         * Workspace folder configuration
         */
        val WorkspaceFolder: ConfigurationTarget // 3
    }
}
