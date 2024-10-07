package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ZonedDateTimeAssignmentOptions :
    AssignmentOptions,
    ToInstantOptions,
    OffsetDisambiguationOptions
