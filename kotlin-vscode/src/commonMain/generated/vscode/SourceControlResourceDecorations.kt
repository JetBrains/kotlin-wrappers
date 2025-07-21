// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * The decorations for a {@link SourceControlResourceState source control resource state}.
 * Can be independently specified for light and dark themes.
*/
export interface SourceControlResourceDecorations extends SourceControlResourceThemableDecorations {

/**
 * Whether the {@link SourceControlResourceState source control resource state} should
 * be striked-through in the UI.
*/
readonly strikeThrough?: boolean;

/**
 * Whether the {@link SourceControlResourceState source control resource state} should
 * be faded in the UI.
*/
readonly faded?: boolean;

/**
 * The title for a specific
 * {@link SourceControlResourceState source control resource state}.
*/
readonly tooltip?: string;

/**
 * The light theme decorations.
*/
readonly light?: SourceControlResourceThemableDecorations;

/**
 * The dark theme decorations.
*/
readonly dark?: SourceControlResourceThemableDecorations;
}

// ORIGINAL SOURCE
 **/
