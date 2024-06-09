package js.temporal

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface ZonedDateTimeAssignmentOptions :
    AssignmentOptions,
    ToInstantOptions,
    OffsetDisambiguationOptions
