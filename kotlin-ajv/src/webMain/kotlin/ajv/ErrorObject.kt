package ajv

import js.objects.ReadonlyRecord
import kotlin.js.JsAny
import kotlin.js.JsString

external interface ErrorObject {
    val keyword: String
    val instancePath: String
    val schemaPath: String
    val params: ReadonlyRecord<JsString, JsAny?>
    val propertyName: String?
    val message: String?
    val schema: JsAny?
    val parentSchema: JsAny?
    val data: JsAny?
}
