import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isMethodSignature(node)
        && (
            node.name.text === "getUserDefault"
            || node.name.text === "setUserDefault"
        )

        && node.parent
        && ts.isInterfaceDeclaration(node.parent)
        && (
            node.parent.name.text === "SystemPreferences"
        )
    ) {
        const name = render(node.name)

        const returnType = render(node.type)

        return karakum.convertParameterDeclarations(node, context, render, {
            strategy: "function",
            template: parameters => {
                // remove generics
                return `fun ${name}(${parameters}): ${returnType}`
            }
        })

    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Type"

        && node.parent
        && ts.isParameter(node.parent)

        && node.parent.parent
        && ts.isMethodSignature(node.parent.parent)
        && (
            node.parent.parent.name.text === "getUserDefault"
            || node.parent.parent.name.text === "setUserDefault"
        )
    ) {
        return "String"
    }

    return null
}
