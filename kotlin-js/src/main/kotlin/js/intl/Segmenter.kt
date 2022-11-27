// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.core.ReadonlyArray

external class Segmenter(
    locales: BCP47LanguageTag = definedExternally,
    options: SegmenterOptions = definedExternally,
) {
    constructor(
        locales: ReadonlyArray<BCP47LanguageTag>,
        options: SegmenterOptions = definedExternally,
    )

    /**
     * Returns `Segments` object containing the segments of the input string, using the segmenter's locale and granularity.
     *
     * @param input - The text to be segmented as a `string`.
     *
     * @returns A new iterable Segments object containing the segments of the input string, using the segmenter's locale and granularity.
     */
    fun segment(input: String): Segments
    fun resolvedOptions(): ResolvedSegmenterOptions
}
