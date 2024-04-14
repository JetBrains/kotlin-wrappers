// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.intl

import js.array.ReadonlyArray

external interface Localizable<in O : Any> {
    /**
     * Returns a value as a string value appropriate to the host environment's current locale.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/toLocaleString)
     */
    fun toLocaleString(): String = definedExternally

    /**
     * Converts a value to a string by using the current or specified locale.
     * @param locales A locale string, array of locale strings, Intl.Locale object, or array of Intl.Locale objects that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
     * @param options An object that contains one or more properties that specify comparison options.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Object/toLocaleString)
     */
    fun toLocaleString(
        locales: UnicodeBCP47LocaleIdentifier,
        options: O = definedExternally,
    ): String = definedExternally

    fun toLocaleString(
        locales: Locale,
        options: O = definedExternally,
    ): String = definedExternally

    fun toLocaleString(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
        options: O = definedExternally,
    ): String = definedExternally

    fun toLocaleString(
        locales: ReadonlyArray<Locale>,
        options: O = definedExternally,
    ): String = definedExternally
}
