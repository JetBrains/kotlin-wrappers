package web.mcp

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi
import kotlin.js.JsString

/**
 * JSON Schema definition for tool input parameters.
 *
 * [API Docs](https://json-schema.org/)
 */
@JsPlainObject
@ExperimentalWebApi
external interface InputSchema {
    /**
     * JSON Schema type for the root value (usually `'object'` for tool args).
     */
    var type: String

    /**
     * Property definitions for object schemas.
     */
    var properties: ReadonlyRecord<JsString, InputSchemaProperty>?

    /**
     * List of required property names.
     */
    var required: ReadonlyArray<JsString>?
}
