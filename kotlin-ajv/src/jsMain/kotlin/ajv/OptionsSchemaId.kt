package ajv

import seskar.js.JsValue

sealed external interface OptionsSchemaId {
    companion object {
        @JsValue("id")
        val id: OptionsSchemaId

        @JsValue("\$id")
        val `$id`: OptionsSchemaId
    }
}
