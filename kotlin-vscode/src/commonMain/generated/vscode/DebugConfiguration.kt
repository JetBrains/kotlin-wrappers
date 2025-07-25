// Automatically generated - do not modify!

package vscode

/**
 * Configuration for a debug session.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConfiguration)
 */
external interface DebugConfiguration {
    /**
     * The type of the debug session.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConfiguration.type)
     */
    var type: String

    /**
     * The name of the debug session.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConfiguration.name)
     */
    var name: String

    /**
     * The request type of the debug session.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConfiguration.request)
     */
    var request: String

    /**
     * Additional debug type specific properties.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DebugConfiguration.[key)
     */
    // [key: string]: any
}
