// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray

open external class Segmenter(
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

    companion object {
        /**
         * Returns an array containing those of the provided locales that are supported without having to fall back to the runtime's default locale.
         *
         * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
         *  For the general form and interpretation of the `locales` argument,
         *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
         *
         * @param options An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter/supportedLocalesOf#parameters).
         *  with some or all possible options.
         *
         * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter/supportedLocalesOf)
         */
        fun supportedLocalesOf(
            locales: UnicodeBCP47LocaleIdentifier,
            options: SegmenterOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: Locale,
            options: SegmenterOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
            options: SegmenterOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: ReadonlyArray<Locale>,
            options: SegmenterOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>
    }
}
