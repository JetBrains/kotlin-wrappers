@file:JsQualifier("Temporal")

package js.temporal

import js.array.ReadonlyArray

/**
 * A `Temporal.TimeZone` is a representation of a time zone: either an
 * {@link https://www.iana.org/time-zones|IANA time zone}, including
 * information about the time zone such as the offset between the local time
 * and UTC at a particular time, and daylight saving time (DST) changes; or
 * simply a particular UTC offset with no DST.
 *
 * `Temporal.ZonedDateTime` is the only Temporal type to contain a time zone.
 * Other types, like `Temporal.Instant` and `Temporal.PlainDateTime`, do not
 * contain any time zone information, and a `Temporal.TimeZone` object is
 * required to convert between them.
 *
 * See https://tc39.es/proposal-temporal/docs/timezone.html for more details.
 */
external class TimeZone(
    timeZoneIdentifier: String,
) /* : TimeZoneProtocol */ {
    val id: String

    // fun equals(timeZone: TimeZoneLike): Boolean
    fun getOffsetNanosecondsFor(instant: Instant /* | string */): Int
    fun getOffsetStringFor(instant: Instant /* | string */): String
    fun getPlainDateTimeFor(
        instant: Instant, /* | string */
        calendar: CalendarLike = definedExternally,
    ): PlainDateTime

    fun getInstantFor(
        dateTime: PlainDateTime, /* | PlainDateTimeLike | string */
        options: ToInstantOptions = definedExternally,
    ): Instant

    fun getNextTransition(
        startingPoint: Instant, /* | string */
    ): Instant?

    fun getPreviousTransition(
        startingPoint: Instant, /* | string */
    ): Instant?

    fun getPossibleInstantsFor(
        dateTime: PlainDateTime, /* | PlainDateTimeLike | string */
    ): ReadonlyArray<Instant>

    fun toJSON(): String

    companion object {
        fun from(timeZone: TimeZoneLike): /* TimeZone | */ TimeZoneProtocol
    }
}
