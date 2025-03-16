import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node) => {
    if (
        node.parent
        && ts.isUnionTypeNode(node.parent)
        && node.parent.types.length > 1
        && node.parent.types[1].kind === ts.SyntaxKind.UndefinedKeyword

        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && (node.parent.parent.type === node.parent)
    ) {
        const parentName = node.parent.parent.name.text

        return `${karakum.capitalize(parentName)}Result`
    }

    return null
}
