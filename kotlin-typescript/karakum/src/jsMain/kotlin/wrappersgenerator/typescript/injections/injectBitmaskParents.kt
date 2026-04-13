package wrappersgenerator.typescript.injections

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createInjection
import typescript.isEnumDeclaration

val injectBitmaskParents = createInjection { node, _, _ ->
    nullable {
        ensure(isEnumDeclaration(node))
        ensure(
            node.name.text == "NodeFlags"
                    || node.name.text == "ModifierFlags"
                    || node.name.text == "GeneratedIdentifierFlags"
                    || node.name.text == "TokenFlags"
                    || node.name.text == "NodeBuilderFlags"
                    || node.name.text == "TypeFormatFlags"
                    || node.name.text == "SymbolFormatFlags"
                    || node.name.text == "SymbolFlags"
                    || node.name.text == "TypeFlags"
                    || node.name.text == "ObjectFlags"
                    || node.name.text == "ElementFlags"
                    || node.name.text == "InferencePriority"
                    || node.name.text == "EmitFlags"
                    || node.name.text == "OuterExpressionKinds"
                    || node.name.text == "ListFormat"
                    || node.name.text == "CompletionInfoFlags"
        )

        arrayOf("js.numbers.Bitmask<${node.name.text}>")
    }
}
