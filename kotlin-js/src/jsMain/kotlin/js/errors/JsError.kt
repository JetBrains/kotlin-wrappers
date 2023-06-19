package js.errors

typealias JsError = Throwable

var JsError.name: JsErrorName
    get() = asDynamic().name
    set(value) {
        asDynamic().name = value
    }
