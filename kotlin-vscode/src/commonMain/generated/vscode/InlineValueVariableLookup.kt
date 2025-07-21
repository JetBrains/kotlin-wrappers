// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * Provide inline value through a variable lookup.
 * If only a range is specified, the variable name will be extracted from the underlying document.
 * An optional variable name can be used to override the extracted name.
*/
export class InlineValueVariableLookup {
/**
 * The document range for which the inline value applies.
 * The range is used to extract the variable name from the underlying document.
*/
readonly range: Range;
/**
 * If specified the name of the variable to look up.
*/
readonly variableName?: string | undefined;
/**
 * How to perform the lookup.
*/
readonly caseSensitiveLookup: boolean;
/**
 * Creates a new InlineValueVariableLookup object.
 *
 * @param range The document line where to show the inline value.
 * @param variableName The name of the variable to look up.
 * @param caseSensitiveLookup How to perform the lookup. If missing lookup is case sensitive.
*/
constructor(range: Range, variableName?: string, caseSensitiveLookup?: boolean);
}

// ORIGINAL SOURCE
 **/
