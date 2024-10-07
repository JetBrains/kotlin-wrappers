package js.temporal

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface TimeZoneProtocol :
    TimeZoneLike {
    val id: String
    val getOffsetNanosecondsFor: (instant: Instant /* | string */) -> Int
    val getOffsetStringFor: ((instant: Instant /* | string */) -> String)?
    val getPlainDateTimeFor: ((
        instant: Instant, /* | string */
        calendar: CalendarLike?,
    ) -> PlainDateTime)?
    val getInstantFor: ((
        dateTime: PlainDateTime, /* | PlainDateTimeLike | string */
        options: ToInstantOptions?,
    ) -> Instant)?
    val getNextTransition: ((
        startingPoint: Instant, /* | string */
    ) -> Instant?)?
    val getPreviousTransition: ((
        startingPoint: Instant, /* | string */
    ) -> Instant?)?
    val getPossibleInstantsFor: (
        dateTime: PlainDateTime, /* | PlainDateTimeLike | string */
    ) -> ReadonlyArray<Instant>
    val toString: (() -> String)?
    val toJSON: (() -> String)?
}
