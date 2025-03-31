@file:JsModule("ajv")

package ajv

import js.core.JsAny
import js.objects.ReadonlyRecord

external class Ajv(
    options: Options = definedExternally,
) {
    fun compile(schema: ReadonlyRecord<String, JsAny?>): ValidateFunction
}
