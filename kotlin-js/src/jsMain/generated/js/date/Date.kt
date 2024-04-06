package js.date

import js.array.ReadonlyArray
import js.core.JsLong
import js.intl.DateTimeFormatOptions
import js.intl.UnicodeBCP47LocaleIdentifier

/**
 * Exposes the [Date API](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) to Kotlin.
 */
external class Date() {
    constructor(value: JsLong)
    constructor(value: String)
    constructor(
        year: Int,
        monthIndex: Int,
        day: Int = definedExternally,
        hour: Int = definedExternally,
        minute: Int = definedExternally,
        second: Int = definedExternally,
        millisecond: Int = definedExternally,
    )

    fun getDate(): Int
    fun getDay(): Int
    fun getFullYear(): Int
    fun getHours(): Int
    fun getMilliseconds(): Int
    fun getMinutes(): Int
    fun getMonth(): Int
    fun getSeconds(): Int
    fun getTime(): JsLong
    fun getTimezoneOffset(): Int
    fun getUTCDate(): Int
    fun getUTCDay(): Int
    fun getUTCFullYear(): Int
    fun getUTCHours(): Int
    fun getUTCMilliseconds(): Int
    fun getUTCMinutes(): Int
    fun getUTCMonth(): Int
    fun getUTCSeconds(): Int
    fun toDateString(): String
    fun toISOString(): String
    fun toJSON(): Any
    fun toLocaleDateString(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier> = definedExternally,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleDateString(
        locales: UnicodeBCP47LocaleIdentifier,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleString(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier> = definedExternally,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleString(
        locales: UnicodeBCP47LocaleIdentifier,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleTimeString(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier> = definedExternally,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleTimeString(
        locales: UnicodeBCP47LocaleIdentifier,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toTimeString(): String
    fun toUTCString(): String

    companion object {
        fun now(): JsLong
        fun parse(value: String): JsLong
        fun UTC(
            year: Int,
            monthIndex: Int,
            day: Int = definedExternally,
            hour: Int = definedExternally,
            minute: Int = definedExternally,
            second: Int = definedExternally,
            millisecond: Int = definedExternally,
        ): JsLong
    }
}
