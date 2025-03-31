@file:JsModule("ajv")

package ajv

import js.core.JsAny
import js.objects.ReadonlyRecord

external class Ajv(
    opts: Options = definedExternally,
) {
    fun compile(schema: ReadonlyRecord<String, JsAny?>): ValidateFunction
}
