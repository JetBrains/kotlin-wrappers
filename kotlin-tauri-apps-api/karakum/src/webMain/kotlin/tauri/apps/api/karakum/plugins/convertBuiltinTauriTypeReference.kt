package tauri.apps.api.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isTypeReferenceNode

private val builtinTauriTypes = mapOf(
    "Promise" to "js.promise.Promise",
    "Uint8Array" to "js.typedarrays.Uint8Array<*>",
    "ArrayBuffer" to "js.buffer.ArrayBuffer",
    "HeadersInit" to "web.http.HeadersInit",
)

val convertBuiltinTauriTypeReference = createPlugin { node, _, _ ->
    nullable {
        ensure(isIdentifier(node))

        val parent = ensureNotNull(node.getParentOrNull())

        ensure(
            isTypeReferenceNode(parent)
                    || isExpressionWithTypeArguments(parent)
        )

        builtinTauriTypes[node.text]
    }
}
