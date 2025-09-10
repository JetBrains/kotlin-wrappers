package emotion.cache

import js.objects.JsPlainObject

@JsPlainObject
external interface StylisElement {
    val type: String
    val value: String
    val props: JsAny /* Array<String> | String */
    val root: StylisElement?
    val parent: StylisElement?
    val children: JsAny /* Array<StylisElement> | String */
    val line: Int
    val column: Int
    val length: Int
    val `return`: String
}
