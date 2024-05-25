package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
sealed external interface ZonedDateTimeAssignmentOptions :
    AssignmentOptions,
    ToInstantOptions,
    OffsetDisambiguationOptions
