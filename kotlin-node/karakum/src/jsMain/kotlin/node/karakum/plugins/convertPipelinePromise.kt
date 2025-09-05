package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isConditionalTypeNode
import typescript.isTypeAliasDeclaration

val convertPipelinePromise = createPlugin { node, context, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("stream.d.ts"))

        ensure(isConditionalTypeNode(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(typeAlias.name.text == "PipelinePromise")

        val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

        "js.promise.Promise<*> /* ${typeScriptService.printNode(node)} */"
    }
}
