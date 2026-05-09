@file:JsModule("ajv")

package ajv

import js.objects.ReadonlyRecord

external class Ajv(
    options: Options = definedExternally,
) {
    fun compile(schema: ReadonlyRecord<JsString, JsAny?>): ValidateFunction
}
