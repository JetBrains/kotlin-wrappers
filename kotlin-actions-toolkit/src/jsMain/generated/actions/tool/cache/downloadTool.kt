// Automatically generated - do not modify!

package actions.tool.cache

import js.promise.await
import node.http.OutgoingHttpHeaders

suspend fun downloadTool(
    url: String,
): String =
    downloadToolAsync(
        url = url,
    ).await()

suspend fun downloadTool(
    url: String,
    dest: String,
): String =
    downloadToolAsync(
        url = url,
        dest = dest,
    ).await()

suspend fun downloadTool(
    url: String,
    dest: String,
    auth: String,
): String =
    downloadToolAsync(
        url = url,
        dest = dest,
        auth = auth,
    ).await()

suspend fun downloadTool(
    url: String,
    dest: String,
    auth: String,
    headers: OutgoingHttpHeaders,
): String =
    downloadToolAsync(
        url = url,
        dest = dest,
        auth = auth,
        headers = headers,
    ).await()
