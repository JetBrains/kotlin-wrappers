package js.date

import js.intl.DateTimeFormatOptions

/**
 * Exposes the [Date API](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) to Kotlin.
 */
external class Date() {
    constructor(milliseconds: Number)
    constructor(dateString: String)
    constructor(year: Int, month: Int)
    constructor(year: Int, month: Int, day: Int)
    constructor(year: Int, month: Int, day: Int, hour: Int)
    constructor(year: Int, month: Int, day: Int, hour: Int, minute: Int)
    constructor(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int)
    constructor(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int, millisecond: Number)

    fun getDate(): Int
    fun getDay(): Int
    fun getFullYear(): Int
    fun getHours(): Int
    fun getMilliseconds(): Int
    fun getMinutes(): Int
    fun getMonth(): Int
    fun getSeconds(): Int
    fun getTime(): Double
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
        locales: Array<String> = definedExternally,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleDateString(locales: String, options: DateTimeFormatOptions = definedExternally): String
    fun toLocaleString(
        locales: Array<String> = definedExternally,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleString(locales: String, options: DateTimeFormatOptions = definedExternally): String
    fun toLocaleTimeString(
        locales: Array<String> = definedExternally,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleTimeString(locales: String, options: DateTimeFormatOptions = definedExternally): String
    fun toTimeString(): String
    fun toUTCString(): String

    companion object {
        fun now(): Double
        fun parse(dateString: String): Double
        fun UTC(year: Int, month: Int): Double
        fun UTC(year: Int, month: Int, day: Int): Double
        fun UTC(year: Int, month: Int, day: Int, hour: Int): Double
        fun UTC(year: Int, month: Int, day: Int, hour: Int, minute: Int): Double
        fun UTC(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int): Double
        fun UTC(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int, millisecond: Number): Double
    }
}
