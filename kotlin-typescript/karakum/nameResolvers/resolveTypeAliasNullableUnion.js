import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    if (
        node.parent
        && ts.isUnionTypeNode(node.parent)
        && node.parent.types.length > 1
        && node.parent.types[1].kind === ts.SyntaxKind.UndefinedKeyword

        && node.parent.parent
        && ts.isMethodSignature(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && (node.parent.parent.type === node.parent)

        && node.parent.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent.parent)
    ) {
        const methodName = node.parent.parent.name.text
        const parentName = node.parent.parent.parent.name.text

        return `${karakum.capitalize(parentName)}${karakum.capitalize(methodName)}Result`
    }

    return null
}
