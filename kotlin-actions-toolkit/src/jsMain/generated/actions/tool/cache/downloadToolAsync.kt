// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import node.http.OutgoingHttpHeaders
import kotlin.js.Promise

@JsName("downloadTool")
external fun downloadToolAsync(
    url: String,
    dest: String = definedExternally,
    auth: String = definedExternally,
    headers: OutgoingHttpHeaders = definedExternally,
): Promise<String>
