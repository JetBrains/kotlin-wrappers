package ringui

data class RGBImpl(override val r: Short = 0, override val g: Short = 0, override val b: Short = 0) : RGB

fun RGB(r: Short, g: Short, b: Short): RGB = RGBImpl(r, g, b)

var LoaderProps.dataTest: String
    set(value) {
        asDynamic()["data-test"] = value
    }
    get() = asDynamic()["data-test"] as? String ?: ""