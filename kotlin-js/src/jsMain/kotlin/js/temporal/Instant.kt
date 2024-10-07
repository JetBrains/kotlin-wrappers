@file:JsQualifier("Temporal")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package js.temporal

import js.core.BigInt
import js.core.JsLong
import kotlinx.js.JsPlainObject

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
    val epochNanoseconds: BigInt,
) : HasArithmeticOperations<Instant, Nothing, TimeUnit<*>>,
    Roundable<Instant, TimeUnit<*>>,
    LocalizableDateTime {
    val epochSeconds: JsLong
    val epochMilliseconds: JsLong
    val epochMicroseconds: BigInt

    // fun equals(other: Instant): Boolean
    // fun equals(other: string): Boolean

    fun toZonedDateTime(
        options: ToZonedDateTimeOptions,
    ): ZonedDateTime

    @JsPlainObject
    interface ToZonedDateTimeOptions {
        val timeZone: TimeZoneLike
        val calendar: CalendarLike
    }

    fun toZonedDateTimeISO(tzLike: TimeZoneLike): ZonedDateTime

    fun toJSON(): String
    fun toString(options: InstantToStringOptions = definedExternally): String

    companion object :
        Factory<Instant, Nothing, Nothing>,
        Comparator<Instant, Nothing> {

        fun fromEpochSeconds(epochSeconds: JsLong): Instant
        fun fromEpochMilliseconds(epochMilliseconds: JsLong): Instant
        fun fromEpochMicroseconds(epochMicroseconds: BigInt): Instant
        fun fromEpochNanoseconds(epochNanoseconds: BigInt): Instant
    }
}
