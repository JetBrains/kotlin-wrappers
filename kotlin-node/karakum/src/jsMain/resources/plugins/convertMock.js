import ts from "typescript"
import * as karakum from "../karakum.mjs"

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("test.d.ts")) return null

    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "Mock"
        && ts.isIntersectionTypeNode(node.type)
        && node.type.types.length > 1
        && ts.isTypeLiteralNode(node.type.types[1])
    ) {
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey.get())

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

        const typeParameters = node.typeParameters
            ?.map(typeParameter => render(typeParameter))
            ?.filter(Boolean)
            ?.join(", ")

        const members = node.type.types[1].members
            .map(member => render(member))
            .join("\n")

        return `
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface Mock${karakum.ifPresent(typeParameters, it => `<${it}>`)} {
${members}

@Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)
inline val fn: F
    get() = unsafeCast<F>()
}
        `
    }

    return null
}
