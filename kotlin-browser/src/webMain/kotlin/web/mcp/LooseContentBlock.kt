package web.mcp

import js.objects.ReadonlyRecord
import web.experimental.ExperimentalWebApi

/**
 * Looser content block shape accepted by many MCP tool implementations.
 *
 * This keeps tool return typing practical while preserving strict content
 * unions via {@link ContentBlock} for consumers that want discriminated checks.
 */
@ExperimentalWebApi
external interface LooseContentBlock :
    ContentBlockBase,
    ReadonlyRecord<JsString, JsAny?>
