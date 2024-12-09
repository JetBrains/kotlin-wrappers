package react.dom.client

import js.errors.JsError

typealias ErrorHandler = (
    error: JsError,
) -> Unit
