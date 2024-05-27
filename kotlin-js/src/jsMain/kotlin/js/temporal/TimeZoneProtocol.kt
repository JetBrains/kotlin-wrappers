package js.temporal

import js.array.ReadonlyArray

// @JsPlainObject
//  Details - https://youtrack.jetbrains.com/issue/KT-68554
sealed external interface TimeZoneProtocol :
    TimeZoneLike {
    var id: String
    var getOffsetNanosecondsFor: (instant: Instant /* | string */) -> Int
    var getOffsetStringFor: ((instant: Instant /* | string */) -> String)?
    var getPlainDateTimeFor: ((
        instant: Instant, /* | string */
        calendar: CalendarLike?,
    ) -> PlainDateTime)?
    var getInstantFor: ((
        dateTime: PlainDateTime, /* | PlainDateTimeLike | string */
        options: ToInstantOptions?,
    ) -> Instant)?
    var getNextTransition: ((
        startingPoint: Instant, /* | string */
    ) -> Instant?)?
    var getPreviousTransition: ((
        startingPoint: Instant, /* | string */
    ) -> Instant?)?
    var getPossibleInstantsFor: (
        dateTime: PlainDateTime, /* | PlainDateTimeLike | string */
    ) -> ReadonlyArray<Instant>
    var toString: (() -> String)?
    var toJSON: (() -> String)?
}
