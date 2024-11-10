// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray

open external class RelativeTimeFormat(
    locales: UnicodeBCP47LocaleIdentifier = definedExternally,
    options: RelativeTimeFormatOptions = definedExternally,
) {
    constructor(
        locales: Locale,
        options: RelativeTimeFormatOptions = definedExternally,
    )

    constructor(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
        options: RelativeTimeFormatOptions = definedExternally,
    )

    constructor(
        locales: ReadonlyArray<Locale>,
        options: RelativeTimeFormatOptions = definedExternally,
    )

    /**
     * Formats a value and a unit according to the locale
     * and formatting options of the given
     * [`Intl.RelativeTimeFormat`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
     * object.
     *
     * While this method automatically provides the correct plural forms,
     * the grammatical form is otherwise as neutral as possible.
     *
     * It is the caller's responsibility to handle cut-off logic
     * such as deciding between displaying "in 7 days" or "in 1 week".
     * This API does not support relative dates involving compound units.
     * e.g "in 5 days and 4 hours".
     *
     * @param value -  Numeric value to use in the internationalized relative time message
     *
     * @param unit - [Unit](https://tc39.es/ecma402/#sec-singularrelativetimeunit) to use in the relative time internationalized message.
     *
     * @throws `RangeError` if `unit` was given something other than `unit` possible values
     *
     * @returns {string} Internationalized relative time message as string
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/format).
     */
    fun format(
        value: Number,
        unit: RelativeTimeFormatUnit,
    ): String

    /**
     *  Returns an array of objects representing the relative time format in parts that can be used for custom locale-aware formatting.
     *
     *  @param value - Numeric value to use in the internationalized relative time message
     *
     *  @param unit - [Unit](https://tc39.es/ecma402/#sec-singularrelativetimeunit) to use in the relative time internationalized message.
     *
     *  @throws `RangeError` if `unit` was given something other than `unit` possible values
     *
     *  [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/formatToParts).
     */
    fun formatToParts(
        value: Number,
        unit: RelativeTimeFormatUnit,
    ): ReadonlyArray<dynamic /* RelativeTimeFormatPart */>

    /**
     * Provides access to the locale and options computed during initialization of this `Intl.RelativeTimeFormat` object.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/resolvedOptions).
     */
    fun resolvedOptions(): ResolvedRelativeTimeFormatOptions

    companion object {
        /**
         * Returns an array containing those of the provided locales
         * that are supported in date and time formatting
         * without having to fall back to the runtime's default locale.
         *
         * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
         *  For the general form and interpretation of the locales argument,
         *  see the [`Intl` page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
         *
         * @param options - An [object](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters)
         *  with some or all of options of the formatting.
         *
         * @returns An array containing those of the provided locales
         *  that are supported in date and time formatting
         *  without having to fall back to the runtime's default locale.
         *
         * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/supportedLocalesOf).
         */
        fun supportedLocalesOf(
            locales: UnicodeBCP47LocaleIdentifier = definedExternally,
            options: RelativeTimeFormatOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: Locale,
            options: RelativeTimeFormatOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
            options: RelativeTimeFormatOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: ReadonlyArray<Locale>,
            options: RelativeTimeFormatOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>
    }
}
