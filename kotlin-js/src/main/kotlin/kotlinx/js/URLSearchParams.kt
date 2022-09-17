package kotlinx.js

external class URLSearchParams() :
    org.w3c.dom.url.URLSearchParams,
    HasSymbol.iterator<JsTuple2<String, String>> {

    constructor(init: ReadonlyArray<JsTuple2<String, String>>)
    constructor(init: ReadonlyRecord<String, String>)
    constructor(init: String)
    constructor(init: URLSearchParams)

    fun entries(): JsIterable.Iterator<JsTuple2<String, String>>
    fun keys(): JsIterable.Iterator<String>
    fun values(): JsIterable.Iterator<String>
}
