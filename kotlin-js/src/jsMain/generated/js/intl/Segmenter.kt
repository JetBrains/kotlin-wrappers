// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray

external class Segmenter(
    locales: UnicodeBCP47LocaleIdentifier = definedExternally,
    options: SegmenterOptions = definedExternally,
) {
    constructor(
        locales: Locale,
        options: SegmenterOptions = definedExternally,
    )

    constructor(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
        options: SegmenterOptions = definedExternally,
    )

    constructor(
        locales: ReadonlyArray<Locale>,
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
