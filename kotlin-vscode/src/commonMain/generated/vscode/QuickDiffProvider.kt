// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * A quick diff provider provides a {@link Uri uri} to the original state of a
 * modified resource. The editor will use this information to render ad'hoc diffs
 * within the text.
*/
export interface QuickDiffProvider {

/**
 * Provide a {@link Uri} to the original resource of any given resource uri.
 *
 * @param uri The uri of the resource open in a text editor.
 * @param token A cancellation token.
 * @returns A thenable that resolves to uri of the matching original resource.
*/
provideOriginalResource?(uri: Uri, token: CancellationToken): ProviderResult<Uri>;
}

// ORIGINAL SOURCE
 **/
