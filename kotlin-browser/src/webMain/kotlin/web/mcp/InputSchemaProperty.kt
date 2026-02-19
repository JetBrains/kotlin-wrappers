package web.mcp

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * JSON Schema property definition.
 *
 * [API Docs](https://json-schema.org/)
 */
@JsPlainObject
@ExperimentalWebApi
external interface InputSchemaProperty {
    /**
     * JSON Schema type for this property.
     */
    var type: String

    /**
     * Human-readable description of the property.
     */
    var description: String?
}
