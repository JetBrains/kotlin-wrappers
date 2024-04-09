package js.temporal

sealed external interface InstantToStringOptions :
    ToStringPrecisionOptions {
    var timeZone: TimeZoneLike
}
