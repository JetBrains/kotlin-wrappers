package ringui

var LoaderProps.dataTest: String?
    get() = asDynamic()["data-test"]
    set(value) {
        asDynamic()["data-test"] = value
    }
