// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.Void

/**
 * A provider that enables detection and handling of links within terminals.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLinkProvider)
 */
external interface TerminalLinkProvider<T : TerminalLink> {
    /**
     * Provide terminal links for the given context. Note that this can be called multiple times
     * even before previous calls resolve, make sure to not share global objects (eg. `RegExp`)
     * that could have problems when asynchronous usage may overlap.
     * @param context Information about what links are being provided for.
     * @param token A cancellation token.
     * @returns A list of terminal links for the given line.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLinkProvider.provideTerminalLinks)
     */
    fun provideTerminalLinks(
        context: TerminalLinkContext,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<T>>

    /**
     * Handle an activated terminal link.
     * @param link The link to handle.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalLinkProvider.handleTerminalLink)
     */
    fun handleTerminalLink(link: T): ProviderResult<Void>
}
