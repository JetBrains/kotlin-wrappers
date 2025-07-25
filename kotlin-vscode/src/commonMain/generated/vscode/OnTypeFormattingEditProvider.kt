// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsName

/**
 * The document formatting provider interface defines the contract between extensions and
 * the formatting-feature.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OnTypeFormattingEditProvider)
 */
external interface OnTypeFormattingEditProvider {
    /**
     * Provide formatting edits after a character has been typed.
     *
     * The given position and character should hint to the provider
     * what range the position to expand to, like find the matching `{`
     * when `}` has been entered.
     *
     * @param document The document in which the command was invoked.
     * @param position The position at which the command was invoked.
     * @param ch The character that has been typed.
     * @param options Options controlling formatting.
     * @param token A cancellation token.
     * @returns A set of text edits or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined`, `null`, or an empty array.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#OnTypeFormattingEditProvider.provideOnTypeFormattingEdits)
     */
    @JsName("provideOnTypeFormattingEdits")
    fun provideOnTypeFormattingEditsAsync(
        document: TextDocument,
        position: Position,
        ch: String,
        options: FormattingOptions,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<TextEdit>>
}
