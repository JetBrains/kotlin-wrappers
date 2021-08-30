package ringui

interface Color {
    var r: Short
    var g: Short
    var b: Short
}

var LoaderProps.dataTest: String
    get() = asDynamic()["data-test"] as? String ?: ""
    set(value) {
        asDynamic()["data-test"] = value
    }