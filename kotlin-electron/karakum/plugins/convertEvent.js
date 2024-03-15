import ts from "typescript"
import * as karakum from "karakum"

export default function (node, context, render) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "Event"
        && ts.isIntersectionTypeNode(node.type)
        && ts.isTypeLiteralNode(node.type.types[0])
    ) {
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey)

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

        const typeParameters = node.typeParameters
            ?.map(typeParameter => render(typeParameter))
            ?.filter(Boolean)
            ?.join(", ")

        const members = node.type.types[0].members
            .map(member => render(member))
            .join("\n")

        return `
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface Event${karakum.ifPresent(typeParameters, it => `<${it}>`)} {
${members}

@Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)
inline val params: Params
    get() = unsafeCast<Params>()
}
        `
    }

    return null
}
