@file:JsModule("ajv")

package ajv

import js.core.JsString
import js.objects.ReadonlyRecord
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

external class Ajv(
    options: Options = definedExternally,
) {
    fun compile(schema: ReadonlyRecord<JsString, JsAny?>): ValidateFunction
}
