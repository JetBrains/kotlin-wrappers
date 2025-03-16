import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node) => {
    if (
        node.parent
        && ts.isTypeReferenceNode(node.parent)
        && ts.isIdentifier(node.parent.typeName)
        && node.parent.typeName.text === "Promise"

        && node.parent.parent
        && ts.isMethodSignature(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && (node.parent.parent.type === node.parent)
        && node.parent.parent.name.text === "write"

        && node.parent.parent.parameters[0]
        && node.parent.parent.parameters[0].type
        && node.parent.parent.parameters[0].type.kind === ts.SyntaxKind.StringKeyword

        && node.parent.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "FileHandle"
    ) {
        const methodName = node.parent.parent.name.text
        const parentName = node.parent.parent.parent.name.text

        return `${karakum.capitalize(parentName)}${karakum.capitalize(methodName)}StringResultPayload`
    }

    if (
        node.parent
        && ts.isTypeReferenceNode(node.parent)
        && ts.isIdentifier(node.parent.typeName)
        && node.parent.typeName.text === "Promise"

        && node.parent.parent
        && ts.isMethodSignature(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && (node.parent.parent.type === node.parent)

        && node.parent.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent.parent)
    ) {
        const methodName = node.parent.parent.name.text
        const parentName = node.parent.parent.parent.name.text

        return `${karakum.capitalize(parentName)}${karakum.capitalize(methodName)}ResultPayload`
    }

    return null
}
