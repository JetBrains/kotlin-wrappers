package js.temporal

import js.objects.JsPlainObject

@JsPlainObject
external interface ZonedDateTimeAssignmentOptions :
    AssignmentOptions,
    ToInstantOptions,
    OffsetDisambiguationOptions
