// Automatically generated - do not modify!

package vscode

/**
 * Represents a line of text, such as a line of source code.
 *
 * TextLine objects are __immutable__. When a {@link TextDocument document} changes,
 * previously retrieved lines will not represent the latest state.
 */
external interface TextLine {
    /**
     * The zero-based line number.
     */
//  readonly lineNumber: number;

    /**
     * The text of this line without the line separator characters.
     */
//  readonly text: string;

    /**
     * The range this line covers without the line separator characters.
     */
//  readonly range: Range;

    /**
     * The range this line covers with the line separator characters.
     */
//  readonly rangeIncludingLineBreak: Range;

    /**
     * The offset of the first character which is not a whitespace character as defined
     * by `/\s/`. **Note** that if a line is all whitespace the length of the line is returned.
     */
//  readonly firstNonWhitespaceCharacterIndex: number;

    /**
     * Whether this line is whitespace only, shorthand
     * for {@link TextLine.firstNonWhitespaceCharacterIndex} === {@link TextLine.text TextLine.text.length}.
     */
//  readonly isEmptyOrWhitespace: boolean;
}
