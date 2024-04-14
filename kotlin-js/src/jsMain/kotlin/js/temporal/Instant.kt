@file:JsQualifier("Temporal")

package js.temporal

import js.core.BigInt
import js.core.JsLong

/**
 * A `Temporal.Instant` is an exact point in time, with a precision in
 * nanoseconds. No time zone or calendar information is present. Therefore,
 * `Temporal.Instant` has no concept of days, months, or even hours.
 *
 * For convenience of interoperability, it internally uses nanoseconds since
 * the {@link https://en.wikipedia.org/wiki/Unix_time|Unix epoch} (midnight
 * UTC on January 1, 1970). However, a `Temporal.Instant` can be created from
 * any of several expressions that refer to a single point in time, including
 * an {@link https://en.wikipedia.org/wiki/ISO_8601|ISO 8601 string} with a
 * time zone offset such as '2020-01-23T17:04:36.491865121-08:00'.
 *
 * See https://tc39.es/proposal-temporal/docs/instant.html for more details.
 */
external class Instant(
    epochNanoseconds: BigInt,
) : LocalizableDateTime {
    val epochSeconds: JsLong
    val epochMilliseconds: JsLong
    val epochMicroseconds: BigInt
    val epochNanoseconds: BigInt

    // fun equals(other: Instant): Boolean
    // fun equals(other: string): Boolean
    fun add(
        durationLike: Any,
        /*
        | Omit<
        Duration | DurationLike,
        "years" | "months" | "weeks" | "days"
        >
        | string,
         */
    ): Instant

    fun subtract(
        durationLike: Any,
        /*
        | Omit<
        Duration | DurationLike,
        "years" | "months" | "weeks" | "days"
        >
        | string,
         */
    ): Instant

    fun until(
        other: Instant, /* | string */
        options: DifferenceOptions<TimeUnit<*>> = definedExternally,
    ): Duration

    fun since(
        other: Instant, /* | string */
        options: DifferenceOptions<TimeUnit<*>> = definedExternally,
    ): Duration

    fun round(
        roundTo: RoundTo<TimeUnit<*>>,
    ): Instant

    fun toZonedDateTime(
        calendarAndTimeZone: Any, /* { timeZone: TimeZoneLike; calendar: CalendarLike } */
    ): ZonedDateTime

    fun toZonedDateTimeISO(tzLike: TimeZoneLike): ZonedDateTime

    fun toJSON(): String
    fun toString(options: InstantToStringOptions = definedExternally): String

    companion object :
        Comparator<Instant, Nothing> {

        fun fromEpochSeconds(epochSeconds: JsLong): Instant
        fun fromEpochMilliseconds(epochMilliseconds: JsLong): Instant
        fun fromEpochMicroseconds(epochMicroseconds: BigInt): Instant
        fun fromEpochNanoseconds(epochNanoseconds: BigInt): Instant
        fun from(item: Instant): Instant
        fun from(item: String): Instant
    }
}
