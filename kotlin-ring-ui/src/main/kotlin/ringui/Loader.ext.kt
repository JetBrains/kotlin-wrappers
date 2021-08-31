package ringui

var LoaderProps.dataTest: String?
    get() = asDynamic()["data-test"] as String?
    set(value) {
        asDynamic()["data-test"] = value
    }