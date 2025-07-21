// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * An enumeration of specific folding range kinds. The kind is an optional field of a {@link FoldingRange}
 * and is used to distinguish specific folding ranges such as ranges originated from comments. The kind is used by commands like
 * `Fold all comments` or `Fold all regions`.
 * If the kind is not set on the range, the range originated from a syntax element other than comments, imports or region markers.
*/
export enum FoldingRangeKind {
/**
 * Kind for folding range representing a comment.
*/
Comment = 1,
/**
 * Kind for folding range representing a import.
*/
Imports = 2,
/**
 * Kind for folding range representing regions originating from folding markers like `#region` and `#endregion`.
*/
Region = 3
}

// ORIGINAL SOURCE
 **/
