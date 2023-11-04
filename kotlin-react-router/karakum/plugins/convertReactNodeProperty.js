import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isPropertySignature(node)

        && node.questionToken

        && node.type
        && ts.isTypeReferenceNode(node.type)
        && ts.isQualifiedName(node.type.typeName)
        && ts.isIdentifier(node.type.typeName.left)
        && node.type.typeName.left.text === "React"
        && node.type.typeName.right.text === "ReactNode"
    ) {
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey)

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

        const readonly = node.modifiers?.find(modifier => modifier.kind === ts.SyntaxKind.ReadonlyKeyword)

        const modifier = readonly
            ? "val "
            : "var "

        const name = karakum.escapeIdentifier(render(node.name))

        return `${karakum.ifPresent(inheritanceModifier, it => `${it} `)}${modifier}${name}: react.ReactNode?`
    }

    return null
}
