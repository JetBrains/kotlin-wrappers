// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a list of ranges that can be edited together along with a word pattern to describe valid range contents.
 */
open external class LinkedEditingRanges {
    /**
     * Create a new linked editing ranges object.
     *
     * @param ranges A list of ranges that can be edited together
     * @param wordPattern An optional word pattern that describes valid contents for the given ranges
     */
//  constructor(ranges: Range[], wordPattern?: RegExp);

    /**
     * A list of ranges that can be edited together. The ranges must have
     * identical length and text content. The ranges cannot overlap.
     */
//  readonly ranges: Range[];

    /**
     * An optional word pattern that describes valid contents for the given ranges.
     * If no pattern is provided, the language configuration's word pattern will be used.
     */
//  readonly wordPattern: RegExp | undefined;
}
