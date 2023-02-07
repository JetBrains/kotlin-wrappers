package js.errors

typealias JsError = Throwable

var JsError.name: String
    get() = asDynamic().name
    set(value) {
        asDynamic().name = value
    }
