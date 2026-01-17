package karakum.tauri.apps.api.plugins

import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.checkCoverageServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isTypeReferenceNode

private val builtinTauriTypes = mapOf(
    "Promise" to "js.promise.Promise",
    "Uint8Array" to "js.typedarrays.Uint8Array<js.buffer.ArrayBuffer>",
    "ArrayBuffer" to "js.buffer.ArrayBuffer",
    "HeadersInit" to "web.http.Headers",
)

val convertBuiltinTauriTypeReference = createPlugin plugin@{ node, context, _ ->
    if (!isIdentifier(node)) return@plugin null

    val parent = node.getParentOrNull() ?: return@plugin null
    if (
        !isTypeReferenceNode(parent)
        && !isExpressionWithTypeArguments(parent)
    ) return@plugin null

    if (node.text !in builtinTauriTypes) return@plugin null

    val checkCoverageService = context.lookupService(checkCoverageServiceKey)
    checkCoverageService?.cover(node)

    builtinTauriTypes.getValue(node.text)
}
