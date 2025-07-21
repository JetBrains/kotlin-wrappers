// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Represents rendering styles for a {@link TextEditorDecorationType text editor decoration}.
*/
export interface DecorationRenderOptions extends ThemableDecorationRenderOptions {
/**
 * Should the decoration be rendered also on the whitespace after the line text.
 * Defaults to `false`.
*/
isWholeLine?: boolean;

/**
 * Customize the growing behavior of the decoration when edits occur at the edges of the decoration's range.
 * Defaults to `DecorationRangeBehavior.OpenOpen`.
*/
rangeBehavior?: DecorationRangeBehavior;

/**
 * The position in the overview ruler where the decoration should be rendered.
*/
overviewRulerLane?: OverviewRulerLane;

/**
 * Overwrite options for light themes.
*/
light?: ThemableDecorationRenderOptions;

/**
 * Overwrite options for dark themes.
*/
dark?: ThemableDecorationRenderOptions;
}

// ORIGINAL SOURCE
 **/
