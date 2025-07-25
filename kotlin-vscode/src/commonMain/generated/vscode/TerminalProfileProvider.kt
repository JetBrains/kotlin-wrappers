// Automatically generated - do not modify!

package vscode

import kotlin.js.JsName

/**
 * Provides a terminal profile for the contributed terminal profile when launched via the UI or
 * command.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalProfileProvider)
 */
external interface TerminalProfileProvider {
    /**
     * Provide the terminal profile.
     * @param token A cancellation token that indicates the result is no longer needed.
     * @returns The terminal profile.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalProfileProvider.provideTerminalProfile)
     */
    @JsName("provideTerminalProfile")
    fun provideTerminalProfileAsync(token: CancellationToken): ProviderResult<TerminalProfile>
}
