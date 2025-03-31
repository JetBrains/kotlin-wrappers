@file:JsModule("ajv")

package ajv

import js.core.JsAny
import js.core.JsString
import js.import.JsModule
import js.objects.ReadonlyRecord
import kotlin.js.definedExternally

external class Ajv(
    options: Options = definedExternally,
) {
    fun compile(schema: ReadonlyRecord<JsString, JsAny?>): ValidateFunction
}
