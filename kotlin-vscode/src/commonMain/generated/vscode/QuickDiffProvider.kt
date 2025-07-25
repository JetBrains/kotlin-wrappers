// Automatically generated - do not modify!

package vscode

/**
 * A quick diff provider provides a [uri][Uri] to the original state of a
 * modified resource. The editor will use this information to render ad'hoc diffs
 * within the text.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickDiffProvider)
 */
external interface QuickDiffProvider {
    /**
     * Provide a [Uri] to the original resource of any given resource uri.
     *
     * @param uri The uri of the resource open in a text editor.
     * @param token A cancellation token.
     * @returns A thenable that resolves to uri of the matching original resource.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#QuickDiffProvider.provideOriginalResource)
     */
    var provideOriginalResource: ((
        uri: Uri,
        token: CancellationToken,
    ) -> ProviderResult<Uri>)?
}
