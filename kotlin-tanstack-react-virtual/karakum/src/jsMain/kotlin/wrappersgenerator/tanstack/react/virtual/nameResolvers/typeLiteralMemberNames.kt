package wrappersgenerator.tanstack.react.virtual.nameResolvers

import arrow.core.raise.nullable
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isPropertySignature
import typescript.ast.`is`.isTypeLiteralNode

// `{ startIndex: number, endIndex: number }`
internal fun typeLiteralMemberNames(node: Node) = nullable {
    ensure(isTypeLiteralNode(node))

    node.members.mapTo(mutableSetOf()) { member ->
        ensure(isPropertySignature(member))

        val memberName = member.name
        ensure(isIdentifier(memberName))
        memberName.text
    }
}
