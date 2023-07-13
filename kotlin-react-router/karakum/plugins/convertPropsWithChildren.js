import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text.endsWith("Props")
        && ts.isTypeReferenceNode(node.type)
        && ts.isQualifiedName(node.type.typeName)
        && node.type.typeName.right.text === "PropsWithChildren"
        && node.type.typeArguments !== undefined
        && ts.isTypeLiteralNode(node.type.typeArguments[0])
    ) {
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey)

        const name = render(node.name)

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

        const members = node.type.typeArguments[0].members
            .map(member => render(member))
            .join("\n")

        return `
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface ${name} : react.PropsWithChildren {
${members}
}
        `
    }
    return null
}
