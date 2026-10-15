package wrappersgenerator.tanstack.react.virtual.nameResolvers

import arrow.core.raise.nullable
import typescript.*

// `{ startIndex: number, endIndex: number }`
internal fun typeLiteralMemberNames(node: Node) = nullable {
    ensure(isTypeLiteralNode(node))

    node.members.asArray().mapTo(mutableSetOf()) { member ->
        ensure(isPropertySignature(member))

        val memberName = member.name
        ensure(isIdentifier(memberName))
        memberName.text
    }
}
