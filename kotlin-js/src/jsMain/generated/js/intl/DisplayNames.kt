// Automatically generated - do not modify!

@file:JsQualifier("Intl")

package js.intl

import js.array.ReadonlyArray

open external class DisplayNames(
    locales: UnicodeBCP47LocaleIdentifier,
    options: DisplayNamesOptions,
) {
    constructor(
        locales: Locale,
        options: DisplayNamesOptions,
    )

    constructor(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
        options: DisplayNamesOptions,
    )

    constructor(
        locales: ReadonlyArray<Locale>,
        options: DisplayNamesOptions,
    )

    /**
     * Receives a code and returns a string based on the locale and options provided when instantiating
     * [`Intl.DisplayNames()`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames)
     *
     * @param code The `code` to provide depends on the `type` passed to display name during creation:
     *  - If the type is `"region"`, code should be either an [ISO-3166 two letters region code](https://www.iso.org/iso-3166-country-codes.html),
     *    or a [three digits UN M49 Geographic Regions](https://unstats.un.org/unsd/methodology/m49/).
     *  - If the type is `"script"`, code should be an [ISO-15924 four letters script code](https://unicode.org/iso15924/iso15924-codes.html).
     *  - If the type is `"language"`, code should be a `languageCode` ["-" `scriptCode`] ["-" `regionCode` ] *("-" `variant` )
     *    subsequence of the unicode_language_id grammar in [UTS 35's Unicode Language and Locale Identifiers grammar](https://unicode.org/reports/tr35/#Unicode_language_identifier).
     *    `languageCode` is either a two letters ISO 639-1 language code or a three letters ISO 639-2 language code.
     *  - If the type is `"currency"`, code should be a [3-letter ISO 4217 currency code](https://www.iso.org/iso-4217-currency-codes.html).
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/of).
     */
    fun of(code: String): String?

    /**
     * Returns a new object with properties reflecting the locale and style formatting options computed during the construction of the current
     * [`Intl/DisplayNames`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames) object.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/resolvedOptions).
     */
    fun resolvedOptions(): ResolvedDisplayNamesOptions

    companion object {
        /**
         * Returns an array containing those of the provided locales that are supported in display names without having to fall back to the runtime's default locale.
         *
         * @param locales A string with a BCP 47 language tag, or an array of such strings.
         *   For the general form and interpretation of the `locales` argument, see the [Intl](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#locale_identification_and_negotiation)
         *   page.
         *
         * @param options An object with a locale matcher.
         *
         * @returns An array of strings representing a subset of the given locale tags that are supported in display names without having to fall back to the runtime's default locale.
         *
         * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/supportedLocalesOf).
         */
        fun supportedLocalesOf(
            locales: UnicodeBCP47LocaleIdentifier = definedExternally,
            options: SupportedLocalesOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: Locale,
            options: SupportedLocalesOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
            options: SupportedLocalesOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>

        fun supportedLocalesOf(
            locales: ReadonlyArray<Locale>,
            options: SupportedLocalesOptions = definedExternally,
        ): ReadonlyArray<UnicodeBCP47LocaleIdentifier>
    }
}
