package tanstack.virtual.core.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import typescript.*

suspend fun resolveItemRangeName(node: Node, context: Context) = nullable {
    ensure(isTypeLiteralNode(node))

    val names = node.members.asArray().map { member ->
        ensure(isPropertySignature(member))

        val memberName = member.name
        ensure(isIdentifier(memberName))
        memberName.text
    }

    ensure(names == listOf("startIndex", "endIndex"))

    "ItemRange"
}
