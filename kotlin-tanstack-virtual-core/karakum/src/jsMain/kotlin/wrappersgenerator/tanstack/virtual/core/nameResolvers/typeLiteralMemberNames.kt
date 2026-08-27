package wrappersgenerator.tanstack.virtual.core.nameResolvers

import arrow.core.raise.nullable
import js.reflect.invoke
import typescript.*

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
