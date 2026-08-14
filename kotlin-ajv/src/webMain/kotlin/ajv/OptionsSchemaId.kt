@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package ajv

import js.union.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface OptionsSchemaId {
    companion object {
        @JsValue("id")
        val id: OptionsSchemaId

        @JsValue("\$id")
        val `$id`: OptionsSchemaId
    }
}
