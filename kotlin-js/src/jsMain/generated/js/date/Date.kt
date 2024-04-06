// Automatically generated - do not modify!

package js.date

import js.array.ReadonlyArray
import js.core.JsLong
import js.intl.DateTimeFormatOptions
import js.intl.Locale
import js.intl.UnicodeBCP47LocaleIdentifier

external class Date() {
    constructor(value: JsLong)
    constructor(value: String)
    constructor(value: Date)

    /**
     * Creates a new Date.
     * @param year The full year designation is required for cross-century date accuracy. If year is between 0 and 99 is used, then year is assumed to be 1900 + year.
     * @param monthIndex The month as a number between 0 and 11 (January to December).
     * @param date The date as a number between 1 and 31.
     * @param hours Must be supplied if minutes is supplied. A number from 0 to 23 (midnight to 11pm) that specifies the hour.
     * @param minutes Must be supplied if seconds is supplied. A number from 0 to 59 that specifies the minutes.
     * @param seconds Must be supplied if milliseconds is supplied. A number from 0 to 59 that specifies the seconds.
     * @param ms A number from 0 to 999 that specifies the milliseconds.
     */
    constructor(
        year: Int,
        monthIndex: Int,
        date: Int = definedExternally,
        hours: Int = definedExternally,
        minutes: Int = definedExternally,
        seconds: Int = definedExternally,
        ms: Int = definedExternally,
    )

    /** Returns a date as a string value. */
    fun toDateString(): String

    /** Returns a time as a string value. */
    fun toTimeString(): String

    /** Returns a value as a string value appropriate to the host environment's current locale. */
    fun toLocaleString(): String

    /** Returns a date as a string value appropriate to the host environment's current locale. */
    fun toLocaleDateString(): String

    /** Returns a time as a string value appropriate to the host environment's current locale. */
    fun toLocaleTimeString(): String

    /** Returns the stored time value in milliseconds since midnight, January 1, 1970 UTC. */
    fun valueOf(): JsLong

    /** Returns the stored time value in milliseconds since midnight, January 1, 1970 UTC. */
    fun getTime(): JsLong

    /** Gets the year, using local time. */
    fun getFullYear(): Int

    /** Gets the year using Universal Coordinated Time (UTC). */
    fun getUTCFullYear(): Int

    /** Gets the month, using local time. */
    fun getMonth(): Int

    /** Gets the month of a Date object using Universal Coordinated Time (UTC). */
    fun getUTCMonth(): Int

    /** Gets the day-of-the-month, using local time. */
    fun getDate(): Int

    /** Gets the day-of-the-month, using Universal Coordinated Time (UTC). */
    fun getUTCDate(): Int

    /** Gets the day of the week, using local time. */
    fun getDay(): Int

    /** Gets the day of the week using Universal Coordinated Time (UTC). */
    fun getUTCDay(): Int

    /** Gets the hours in a date, using local time. */
    fun getHours(): Int

    /** Gets the hours value in a Date object using Universal Coordinated Time (UTC). */
    fun getUTCHours(): Int

    /** Gets the minutes of a Date object, using local time. */
    fun getMinutes(): Int

    /** Gets the minutes of a Date object using Universal Coordinated Time (UTC). */
    fun getUTCMinutes(): Int

    /** Gets the seconds of a Date object, using local time. */
    fun getSeconds(): Int

    /** Gets the seconds of a Date object using Universal Coordinated Time (UTC). */
    fun getUTCSeconds(): Int

    /** Gets the milliseconds of a Date, using local time. */
    fun getMilliseconds(): Int

    /** Gets the milliseconds of a Date object using Universal Coordinated Time (UTC). */
    fun getUTCMilliseconds(): Int

    /** Gets the difference in minutes between the time on the local computer and Universal Coordinated Time (UTC). */
    fun getTimezoneOffset(): Int

    /**
     * Sets the date and time value in the Date object.
     * @param time A numeric value representing the number of elapsed milliseconds since midnight, January 1, 1970 GMT.
     */
    fun setTime(time: JsLong): JsLong

    /**
     * Sets the milliseconds value in the Date object using local time.
     * @param ms A numeric value equal to the millisecond value.
     */
    fun setMilliseconds(ms: Int): Int

    /**
     * Sets the milliseconds value in the Date object using Universal Coordinated Time (UTC).
     * @param ms A numeric value equal to the millisecond value.
     */
    fun setUTCMilliseconds(ms: Int): Int

    /**
     * Sets the seconds value in the Date object using local time.
     * @param sec A numeric value equal to the seconds value.
     * @param ms A numeric value equal to the milliseconds value.
     */
    fun setSeconds(
        sec: Int,
        ms: Int = definedExternally,
    ): Int

    /**
     * Sets the seconds value in the Date object using Universal Coordinated Time (UTC).
     * @param sec A numeric value equal to the seconds value.
     * @param ms A numeric value equal to the milliseconds value.
     */
    fun setUTCSeconds(
        sec: Int,
        ms: Int = definedExternally,
    ): Int

    /**
     * Sets the minutes value in the Date object using local time.
     * @param min A numeric value equal to the minutes value.
     * @param sec A numeric value equal to the seconds value.
     * @param ms A numeric value equal to the milliseconds value.
     */
    fun setMinutes(
        min: Int,
        sec: Int = definedExternally,
        ms: Int = definedExternally,
    ): Int

    /**
     * Sets the minutes value in the Date object using Universal Coordinated Time (UTC).
     * @param min A numeric value equal to the minutes value.
     * @param sec A numeric value equal to the seconds value.
     * @param ms A numeric value equal to the milliseconds value.
     */
    fun setUTCMinutes(
        min: Int,
        sec: Int = definedExternally,
        ms: Int = definedExternally,
    ): Int

    /**
     * Sets the hour value in the Date object using local time.
     * @param hours A numeric value equal to the hours value.
     * @param min A numeric value equal to the minutes value.
     * @param sec A numeric value equal to the seconds value.
     * @param ms A numeric value equal to the milliseconds value.
     */
    fun setHours(
        hours: Int,
        min: Int = definedExternally,
        sec: Int = definedExternally,
        ms: Int = definedExternally,
    ): Int

    /**
     * Sets the hours value in the Date object using Universal Coordinated Time (UTC).
     * @param hours A numeric value equal to the hours value.
     * @param min A numeric value equal to the minutes value.
     * @param sec A numeric value equal to the seconds value.
     * @param ms A numeric value equal to the milliseconds value.
     */
    fun setUTCHours(
        hours: Int,
        min: Int = definedExternally,
        sec: Int = definedExternally,
        ms: Int = definedExternally,
    ): Int

    /**
     * Sets the numeric day-of-the-month value of the Date object using local time.
     * @param date A numeric value equal to the day of the month.
     */
    fun setDate(date: Int): Int

    /**
     * Sets the numeric day of the month in the Date object using Universal Coordinated Time (UTC).
     * @param date A numeric value equal to the day of the month.
     */
    fun setUTCDate(date: Int): Int

    /**
     * Sets the month value in the Date object using local time.
     * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively.
     * @param date A numeric value representing the day of the month. If this value is not supplied, the value from a call to the getDate method is used.
     */
    fun setMonth(
        month: Int,
        date: Int = definedExternally,
    ): Int

    /**
     * Sets the month value in the Date object using Universal Coordinated Time (UTC).
     * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively.
     * @param date A numeric value representing the day of the month. If it is not supplied, the value from a call to the getUTCDate method is used.
     */
    fun setUTCMonth(
        month: Int,
        date: Int = definedExternally,
    ): Int

    /**
     * Sets the year of the Date object using local time.
     * @param year A numeric value for the year.
     * @param month A zero-based numeric value for the month (0 for January, 11 for December). Must be specified if numDate is specified.
     * @param date A numeric value equal for the day of the month.
     */
    fun setFullYear(
        year: Int,
        month: Int = definedExternally,
        date: Int = definedExternally,
    ): Int

    /**
     * Sets the year value in the Date object using Universal Coordinated Time (UTC).
     * @param year A numeric value equal to the year.
     * @param month A numeric value equal to the month. The value for January is 0, and other month values follow consecutively. Must be supplied if numDate is supplied.
     * @param date A numeric value equal to the day of the month.
     */
    fun setUTCFullYear(
        year: Int,
        month: Int = definedExternally,
        date: Int = definedExternally,
    ): Int

    /** Returns a date converted to a string using Universal Coordinated Time (UTC). */
    fun toUTCString(): String

    /** Returns a date as a string value in ISO format. */
    fun toISOString(): String

    /** Used by the JSON.stringify method to enable the transformation of an object's data for JavaScript Object Notation (JSON) serialization. */
    fun toJSON(key: Any? = definedExternally): String

    /**
     * Converts a date and time to a string by using the current or specified locale.
     * @param locales A locale string, array of locale strings, Intl.Locale object, or array of Intl.Locale objects that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
     * @param options An object that contains one or more properties that specify comparison options.
     */
    fun toLocaleString(
        locales: UnicodeBCP47LocaleIdentifier = definedExternally,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleString(
        locales: Locale,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleString(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleString(
        locales: ReadonlyArray<Locale>,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    /**
     * Converts a date to a string by using the current or specified locale.
     * @param locales A locale string, array of locale strings, Intl.Locale object, or array of Intl.Locale objects that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
     * @param options An object that contains one or more properties that specify comparison options.
     */
    fun toLocaleDateString(
        locales: UnicodeBCP47LocaleIdentifier = definedExternally,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleDateString(
        locales: Locale,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleDateString(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleDateString(
        locales: ReadonlyArray<Locale>,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    /**
     * Converts a time to a string by using the current or specified locale.
     * @param locales A locale string, array of locale strings, Intl.Locale object, or array of Intl.Locale objects that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
     * @param options An object that contains one or more properties that specify comparison options.
     */
    fun toLocaleTimeString(
        locales: UnicodeBCP47LocaleIdentifier = definedExternally,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleTimeString(
        locales: Locale,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleTimeString(
        locales: ReadonlyArray<UnicodeBCP47LocaleIdentifier>,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    fun toLocaleTimeString(
        locales: ReadonlyArray<Locale>,
        options: DateTimeFormatOptions = definedExternally,
    ): String

    companion object {
        /**
         * Parses a string containing a date, and returns the number of milliseconds between that date and midnight, January 1, 1970.
         * @param s A date string
         */
        fun parse(s: String): JsLong

        /**
         * Returns the number of milliseconds between midnight, January 1, 1970 Universal Coordinated Time (UTC) (or GMT) and the specified date.
         * @param year The full year designation is required for cross-century date accuracy. If year is between 0 and 99 is used, then year is assumed to be 1900 + year.
         * @param monthIndex The month as a number between 0 and 11 (January to December).
         * @param date The date as a number between 1 and 31.
         * @param hours Must be supplied if minutes is supplied. A number from 0 to 23 (midnight to 11pm) that specifies the hour.
         * @param minutes Must be supplied if seconds is supplied. A number from 0 to 59 that specifies the minutes.
         * @param seconds Must be supplied if milliseconds is supplied. A number from 0 to 59 that specifies the seconds.
         * @param ms A number from 0 to 999 that specifies the milliseconds.
         */
        fun UTC(
            year: Int,
            monthIndex: Int,
            date: Int = definedExternally,
            hours: Int = definedExternally,
            minutes: Int = definedExternally,
            seconds: Int = definedExternally,
            ms: Int = definedExternally,
        ): JsLong

        /** Returns the number of milliseconds elapsed since midnight, January 1, 1970 Universal Coordinated Time (UTC). */
        fun now(): JsLong
    }
}
