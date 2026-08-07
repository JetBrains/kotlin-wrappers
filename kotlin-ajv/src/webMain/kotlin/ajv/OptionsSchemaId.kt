@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package ajv

import seskar.js.JsValue
import kotlin.js.JsName

@JsName("NaN")
sealed external interface OptionsSchemaId {
    companion object {
        @JsValue("id")
        val id: OptionsSchemaId

        @JsValue("\$id")
        val `$id`: OptionsSchemaId
    }
}
