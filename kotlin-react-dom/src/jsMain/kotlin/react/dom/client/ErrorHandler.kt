package react.dom.client

import js.errors.JsError

typealias ErrorHandler<I> = (
    error: JsError,
    errorInfo: I,
) -> Unit
