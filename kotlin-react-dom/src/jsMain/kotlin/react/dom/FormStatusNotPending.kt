package react.dom

import seskar.js.JsTypeGuard

@JsTypeGuard(
    property = "pending",
    value = "false",
)
external class FormStatusNotPending
private constructor() :
    FormStatus
