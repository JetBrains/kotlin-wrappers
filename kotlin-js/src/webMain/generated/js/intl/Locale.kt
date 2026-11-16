// Automatically generated - do not modify!

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package js.intl

import js.array.ReadonlyArray

@JsQualifier("Intl")
open external class Locale(
    tag: UnicodeBCP47LocaleIdentifier,
    options: LocaleOptions = definedExternally,
) : LocaleOptions {
    constructor(
        tag: Locale,
        options: LocaleOptions = definedExternally,
    )

    /**
     * A string containing the language, and the script and region if available.
     */
    open var baseName: String

    /**
     * The primary language subtag associated with the locale.
     */
    open var language: String

    /**
     * Gets the most likely values for the language, script, and region of the locale based on existing values.
     */
    open fun maximize(): Locale

    /**
     * Attempts to remove information about the locale that would be added by calling `Locale.maximize()`.
     */
    open fun minimize(): Locale

    /**
     * Returns a list of one or more unique calendar identifiers for this locale.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getCalendars)
     */
    open fun getCalendars(): ReadonlyArray<JsString>

    /**
     * Returns a list of one or more collation types for this locale.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getCollations)
     */
    open fun getCollations(): ReadonlyArray<JsString>

    /**
     * Returns a list of one or more unique hour cycle identifiers for this locale.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getHourCycles)
     */
    open fun getHourCycles(): ReadonlyArray<JsString>

    /**
     * Returns a list of one or more unique numbering system identifiers for this locale.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getNumberingSystems)
     */
    open fun getNumberingSystems(): ReadonlyArray<JsString>

    /**
     * Returns the ordering of characters indicated by either ltr (left-to-right) or by rtl (right-to-left) for this locale.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getTextInfo)
     */
    open fun getTextInfo(): TextInfo

    /**
     * Returns a list of supported time zones for this locale.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getTimeZones)
     */
    open fun getTimeZones(): ReadonlyArray<JsString>?

    /**
     * Returns a `WeekInfo` object with the properties `firstDay`, `weekend` and `minimalDays` for this locale.
     *
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getWeekInfo)
     */
    open fun getWeekInfo(): WeekInfo
}
