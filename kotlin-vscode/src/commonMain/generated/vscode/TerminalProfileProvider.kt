// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Provides a terminal profile for the contributed terminal profile when launched via the UI or
 * command.
*/
export interface TerminalProfileProvider {
/**
 * Provide the terminal profile.
 * @param token A cancellation token that indicates the result is no longer needed.
 * @returns The terminal profile.
*/
provideTerminalProfile(token: CancellationToken): ProviderResult<TerminalProfile>;
}

// ORIGINAL SOURCE
 **/
