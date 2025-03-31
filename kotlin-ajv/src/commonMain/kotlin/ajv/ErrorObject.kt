package ajv

import js.core.JsAny
import js.objects.ReadonlyRecord

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
