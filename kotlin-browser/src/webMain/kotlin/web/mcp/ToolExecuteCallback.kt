package web.mcp

import js.objects.ReadonlyRecord
import js.promise.PromiseLike

typealias ToolExecuteCallback = (
    args: ReadonlyRecord<JsString, *>,
) -> PromiseLike<*>
