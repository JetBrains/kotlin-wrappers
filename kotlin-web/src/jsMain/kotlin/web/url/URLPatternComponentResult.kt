package web.url

import js.objects.JsPlainObject
import js.objects.ReadonlyRecord

@JsPlainObject
external interface URLPatternComponentResult {
    val input: String
    val groups: ReadonlyRecord<String, String?>
}
