import ts from "typescript";
import * as karakum from "karakum";

function isReactNodeReference(node) {
    return (
        ts.isTypeReferenceNode(node)
        && ts.isQualifiedName(node.typeName)
        && ts.isIdentifier(node.typeName.left)
        && node.typeName.left.text === "React"
        && node.typeName.right.text === "ReactNode"
    )
}

export default function (node, context, render) {
    if (
        ts.isPropertySignature(node)

        && node.questionToken

        && node.type

        && (
            isReactNodeReference(node.type)
            || (
                ts.isUnionTypeNode(node.type)
                && node.type.types.length === 2

                && node.type.types[0]
                && isReactNodeReference(node.type.types[0])

                && node.type.types[1]
                && ts.isLiteralTypeNode(node.type.types[1])
                && node.type.types[1].literal.kind === ts.SyntaxKind.NullKeyword
            )
        )
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
