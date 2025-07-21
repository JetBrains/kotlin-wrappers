// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
// ORIGINAL SOURCE

/**
 * A semantic tokens builder can help with creating a `SemanticTokens` instance
 * which contains delta encoded semantic tokens.
*/
export class SemanticTokensBuilder {

/**
 * Creates a semantic tokens builder.
 *
 * @param legend A semantic tokens legend.
*/
constructor(legend?: SemanticTokensLegend);

/**
 * Add another token.
 *
 * @param line The token start line number (absolute value).
 * @param char The token start character (absolute value).
 * @param length The token length in characters.
 * @param tokenType The encoded token type.
 * @param tokenModifiers The encoded token modifiers.
*/
push(line: number, char: number, length: number, tokenType: number, tokenModifiers?: number): void;

/**
 * Add another token. Use only when providing a legend.
 *
 * @param range The range of the token. Must be single-line.
 * @param tokenType The token type.
 * @param tokenModifiers The token modifiers.
*/
push(range: Range, tokenType: string, tokenModifiers?: readonly string[]): void;

/**
 * Finish and create a `SemanticTokens` instance.
*/
build(resultId?: string): SemanticTokens;
}

// ORIGINAL SOURCE
 **/
