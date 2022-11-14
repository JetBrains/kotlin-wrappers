package web.errors

typealias JsError = Throwable

var JsError.name: String
    get() = asDynamic().name
    set(value) {
        asDynamic().name = value
    }
