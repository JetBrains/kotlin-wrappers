// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * The configuration target
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
