// Automatically generated - do not modify!

package js.intl

import js.array.ReadonlyArray
import js.core.JsInt
import js.objects.ReadonlyRecord
import kotlin.js.JsQualifier
import kotlin.js.definedExternally

@JsQualifier("Intl")
open external class DurationFormat(
    locales: UnicodeBCP47LocaleIdentifier = definedExternally,
    options: DurationFormatOptions = definedExternally,
) {
    constructor(
        locales: Locale,
        options: DurationFormatOptions = definedExternally,
    )

    constructor(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
        options: DurationFormatOptions = definedExternally,
    )

    constructor(
        locales: ReadonlyArray<Locale>,
        options: DurationFormatOptions = definedExternally,
    )

    /**
     * @param duration The duration object to be formatted. It should include some or all of the following properties: months, weeks, days, hours, minutes, seconds, milliseconds, microseconds, nanoseconds.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/DurationFormat/format).
     */
    fun format(duration: ReadonlyRecord<DurationFormatUnit, JsInt>): String

    /**
     * @param duration The duration object to be formatted. It should include some or all of the following properties: months, weeks, days, hours, minutes, seconds, milliseconds, microseconds, nanoseconds.
     *
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/DurationFormat/formatToParts).
     */
    fun formatToParts(duration: ReadonlyRecord<DurationFormatUnit, JsInt>): ReadonlyArray<DurationFormatPart>

    /**
     * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/DurationFormat/resolvedOptions).
     */
    fun resolvedOptions(): ResolvedDurationFormatOptions

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
         * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl/DurationFormat/supportedLocalesOf).
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
