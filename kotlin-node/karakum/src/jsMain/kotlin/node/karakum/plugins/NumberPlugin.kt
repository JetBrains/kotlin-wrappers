package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.Plugin
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.*

class Matcher(
    val predicate: (Node) -> Boolean,
    val children: List<Matcher>,
)

interface MatcherScope {
    val children: MutableList<Matcher>
}

private class MatcherScopeImpl(
    override val children: MutableList<Matcher> = mutableListOf(),
) : MatcherScope

fun MatcherScope.match(
    predicate: (Node) -> Boolean,
    block: MatcherScope.() -> Unit = { },
) {
    val scope = MatcherScopeImpl().also(block)
    val matcher = Matcher(predicate, scope.children)
    children.add(matcher)
}

fun MatcherScope.match(
    predicate: (Node) -> Boolean,
    name: String,
    block: MatcherScope.() -> Unit = { },
) {
    match({ node ->
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        predicate(node) && (node as NamedDeclaration).name.let { it != null && isIdentifier(it) && it.text == name }
    }, block)
}

fun match(
    block: MatcherScope.() -> Unit,
): List<Matcher> {
    val scope = MatcherScopeImpl().also(block)
    return scope.children
}

private fun Matcher.toChain(): List<(Node) -> Boolean> {
    if (children.isEmpty()) return listOf(predicate)
    return children.flatMap { it.toChain() + predicate }
}

fun createNumberPlugin(vararg matchers: Pair<String, MatcherScope.() -> Unit>): Plugin {
    val config = matchers.map { (numberType, block) ->
        match(block).map { it.toChain() } to numberType
    }

    return createPlugin plugin@{ node, _, _ ->
        if (node.kind != SyntaxKind.NumberKeyword) return@plugin null

        for ((matcherChains, numberType) in config) {
            matcherChains@ for (matcherChain in matcherChains) {
                var current = node.getParentOrNull()

                for (matcher in matcherChain) {
                    if (current == null || !matcher(current)) continue@matcherChains
                    current = current.getParentOrNull()
                }

                return@plugin numberType
            }
        }

        null
    }
}
