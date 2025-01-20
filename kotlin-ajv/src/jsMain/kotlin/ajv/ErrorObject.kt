package ajv

import js.objects.ReadonlyRecord

external interface ErrorObject {
    val keyword: String
    val instancePath: String
    val schemaPath: String
    val params: ReadonlyRecord<String, Any?>
    val propertyName: String?
    val message: String?
    val schema: Any?
    val parentSchema: Any?
    val data: Any?
}
