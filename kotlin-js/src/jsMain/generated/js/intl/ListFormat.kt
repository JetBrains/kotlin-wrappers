// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray
import js.iterable.JsIterable

open external class ListFormat(
    locales: UnicodeBCP47LocaleIdentifier = definedExternally,
    options: ListFormatOptions = definedExternally,
) {
    constructor(
        locales: Locale,
        options: ListFormatOptions = definedExternally,
    )

    constructor(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
        options: ListFormatOptions = definedExternally,
    )

    constructor(
        locales: ReadonlyArray<Locale>,
        options: ListFormatOptions = definedExternally,
    )

    /**
     * Returns a string with a language-specific representation of the list.
     *
     * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array).
     *
     * @throws `TypeError` if `list` includes something other than the possible values.
     *
     * @returns {string} A language-specific formatted string representing the elements of the list.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/format).
     */
    fun format(list: JsIterable<String>): String

    /**
     * Returns an Array of objects representing the different components that can be used to format a list of values in a locale-aware fashion.
     *
     * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array), to be formatted according to a locale.
     *
     * @throws `TypeError` if `list` includes something other than the possible values.
     *
     * @returns {{ type: "element" | "literal", value: string; }[]} An Array of components which contains the formatted parts from the list.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/formatToParts).
     */
    fun formatToParts(list: JsIterable<String>): ReadonlyArray<dynamic /* { type; value; } */>

    /**
     * Returns a new object with properties reflecting the locale and style
     * formatting options computed during the construction of the current
     * `Intl.ListFormat` object.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/resolvedOptions).
     */
    fun resolvedOptions(): ResolvedListFormatOptions

    companion object {
        /**
         * Returns an array containing those of the provided locales that are
         * supported in list formatting without having to fall back to the runtime's default locale.
         *
         * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
         *  For the general form and interpretation of the `locales` argument,
         *  see the [`Intl` page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
         *
         * @param options - An [object](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/supportedLocalesOf#parameters).
         *  with some or all possible options.
         *
         * @returns An array of strings representing a subset of the given locale tags that are supported in list
         *  formatting without having to fall back to the runtime's default locale.
         *
         * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/supportedLocalesOf).
         */
        fun supportedLocalesOf(
            locales: UnicodeBCP47LocaleIdentifier,
            options: ListFormatOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: Locale,
            options: ListFormatOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
            options: ListFormatOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: ReadonlyArray<Locale>,
            options: ListFormatOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>
    }
}
