// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.promise.Promise
import node.http.OutgoingHttpHeaders

@JsName("downloadTool")
external fun downloadToolAsync(
    url: String,
    dest: String = definedExternally,
    auth: String = definedExternally,
    headers: OutgoingHttpHeaders = definedExternally,
): Promise<String>
