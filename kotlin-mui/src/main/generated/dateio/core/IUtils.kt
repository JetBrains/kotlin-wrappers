// Automatically generated - do not modify!

package dateio.core

import kotlinx.js.ReadonlyArray

external interface DateIOFormats<TLibFormatToken : Any> {
    /** Localized full date @example "Jan 1, 2019" */
    var fullDate: TLibFormatToken

    /** Partially localized full date with weekday, useful for text-to-speech accessibility @example "Tuesday, January 1, 2019" */
    var fullDateWithWeekday: TLibFormatToken

    /** Date format string with month and day of month @example "1 January" */
    var normalDate: TLibFormatToken

    /** Date format string with weekday, month and day of month @example "Wed, Jan 1" */
    var normalDateWithWeekday: TLibFormatToken

    /** Shorter day format @example "Jan 1" */
    var shortDate: TLibFormatToken

    /** Year format string @example "2019" */
    var year: TLibFormatToken

    /** Month format string @example "January" */
    var month: TLibFormatToken

    /** Short month format string @example "Jan" */
    var monthShort: TLibFormatToken

    /** Month with year format string @example "January 2018" */
    var monthAndYear: TLibFormatToken

    /** Month with date format string @example "January 1" */
    var monthAndDate: TLibFormatToken

    /** Weekday format string @example "Wednesday" */
    var weekday: TLibFormatToken

    /** Short weekday format string @example "Wed" */
    var weekdayShort: TLibFormatToken

    /** Day format string @example "1" */
    var dayOfMonth: TLibFormatToken

    /** Hours format string @example "11" */
    var hours12h: TLibFormatToken

    /** Hours format string @example "23" */
    var hours24h: TLibFormatToken

    /** Minutes format string @example "44" */
    var minutes: TLibFormatToken

    /** Seconds format string @example "00" */
    var seconds: TLibFormatToken

    /** Full time localized format string @example "11:44 PM" for US, "23:44" for Europe */
    var fullTime: TLibFormatToken

    /** Not localized full time format string @example "11:44 PM" */
    var fullTime12h: TLibFormatToken

    /** Not localized full time format string @example "23:44" */
    var fullTime24h: TLibFormatToken

    /** Date & time format string with localized time @example "Jan 1, 2018 11:44 PM" */
    var fullDateTime: TLibFormatToken

    /** Not localized date & Time format 12h @example "Jan 1, 2018 11:44 PM" */
    var fullDateTime12h: TLibFormatToken

    /** Not localized date & Time format 24h @example "Jan 1, 2018 23:44" */
    var fullDateTime24h: TLibFormatToken

    /** Localized keyboard input friendly date format @example "02/13/2020 */
    var keyboardDate: TLibFormatToken

    /** Localized keyboard input friendly date/time format @example "02/13/2020 23:44" */
    var keyboardDateTime: TLibFormatToken

    /** Partially localized keyboard input friendly date/time 12h format @example "02/13/2020 11:44 PM" */
    var keyboardDateTime12h: TLibFormatToken

    /** Partially localized keyboard input friendly date/time 24h format @example "02/13/2020 23:44" */
    var keyboardDateTime24h: TLibFormatToken
}

external interface IUtils<TDate : Any> {
    val formats: DateIOFormats<*>
    val locale: Any?
    val moment: Any?
    val dayjs: Any?

    /** Name of the library that is used right now */
    val lib: String

// constructor (options?: { formats?: DateIOFormats, locale?: any, instance?: any })

    fun date(value: Any?): TDate?
    fun toJsDate(value: TDate): kotlin.js.Date
    fun parseISO(isString: String): TDate
    fun toISO(value: TDate): String
    fun parse(value: String, format: String): TDate?

    fun getCurrentLocaleCode(): String
    fun is12HourCycleInCurrentLocale(): Boolean

    /** Returns user readable format (taking into account localized format tokens), useful to render helper text for input (e.g. placeholder). For luxon always returns empty string. */
    fun getFormatHelperText(format: String): String

    fun isNull(value: TDate?): Boolean
    fun isValid(value: Any): Boolean
    fun getDiff(value: TDate, comparing: TDate, unit: String? /* Unit? */): Int
    fun isEqual(value: Any, comparing: Any): Boolean

    fun isSameDay(value: TDate, comparing: TDate): Boolean
    fun isSameMonth(value: TDate, comparing: TDate): Boolean
    fun isSameYear(value: TDate, comparing: TDate): Boolean
    fun isSameHour(value: TDate, comparing: TDate): Boolean

    fun isAfter(value: TDate, comparing: TDate): Boolean
    fun isAfterDay(value: TDate, comparing: TDate): Boolean
    fun isAfterYear(value: TDate, comparing: TDate): Boolean

    fun isBeforeDay(value: TDate, comparing: TDate): Boolean
    fun isBeforeYear(value: TDate, comparing: TDate): Boolean
    fun isBefore(value: TDate, comparing: TDate): Boolean

    fun isWithinRange(value: TDate, range: kotlinx.js.JsTuple2<TDate, TDate>): Boolean

    fun startOfYear(value: TDate): TDate
    fun endOfYear(value: TDate): TDate
    fun startOfMonth(value: TDate): TDate
    fun endOfMonth(value: TDate): TDate
    fun startOfWeek(value: TDate): TDate
    fun endOfWeek(value: TDate): TDate

    fun addSeconds(value: TDate, count: Int): TDate
    fun addMinutes(value: TDate, count: Int): TDate
    fun addHours(value: TDate, count: Int): TDate
    fun addDays(value: TDate, count: Int): TDate
    fun addWeeks(value: TDate, count: Int): TDate
    fun addMonths(value: TDate, count: Int): TDate
    fun addYears(value: TDate, count: Int): TDate

    fun startOfDay(value: TDate): TDate
    fun endOfDay(value: TDate): TDate

    fun format(value: TDate, formatKey: String /* keyof DateIOFormats */): String
    fun formatByString(value: TDate, formatString: String): String
    fun formatNumber(numberToFormat: String): String

    fun getHours(value: TDate): Int
    fun setHours(value: TDate, count: Int): TDate

    fun getMinutes(value: TDate): Int
    fun setMinutes(value: TDate, count: Int): TDate

    fun getSeconds(value: TDate): Int
    fun setSeconds(value: TDate, count: Int): TDate

    fun getMonth(value: TDate): Int
    fun getDaysInMonth(value: TDate): Int
    fun setMonth(value: TDate, count: Int): TDate
    fun getNextMonth(value: TDate): TDate
    fun getPreviousMonth(value: TDate): TDate

    fun getMonthArray(value: TDate): ReadonlyArray<TDate>

    fun getYear(value: TDate): Int
    fun setYear(value: TDate, count: Int): TDate

    fun mergeDateAndTime(date: TDate, time: TDate): TDate

    fun getWeekdays(): ReadonlyArray<String>
    fun getWeekArray(date: TDate): ReadonlyArray<ReadonlyArray<TDate>>
    fun getYearRange(start: TDate, end: TDate): ReadonlyArray<TDate>

    /** Allow to customize displaying "am/pm" strings */
    fun getMeridiemText(ampm: String /* "am" | "pm" */): String
}
