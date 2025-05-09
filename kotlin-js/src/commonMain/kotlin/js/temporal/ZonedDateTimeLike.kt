package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface ZonedDateTimeLike {

    val era: String?
    val eraYear: Int?
    val year: Int?
    val month: Int?
    val monthCode: String?
    val day: Int?
    val hour: Int?
    val minute: Int?
    val second: Int?
    val millisecond: Int?
    val microsecond: Int?
    val nanosecond: Int?
    val offset: String?
    val timeZone: TimeZone?
    val calendar: Calendar?
}
