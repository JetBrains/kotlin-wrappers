package web.mcp

import js.internal.InternalApi
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

/**
 * Elicitation request parameters.
 */
@JsPlainObject
@ExperimentalWebApi
@SubclassOptInRequired(InternalApi::class)
external interface ElicitationParams
