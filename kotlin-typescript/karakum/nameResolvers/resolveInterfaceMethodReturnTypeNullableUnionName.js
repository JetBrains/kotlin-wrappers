import ts from "typescript";
import * as karakum from "karakum";

export default (node) => {
    if (
        node.parent
        && ts.isUnionTypeNode(node.parent)
        && node.parent.types.length > 1
        && node.parent.types[1].kind === ts.SyntaxKind.UndefinedKeyword

        && node.parent.parent
        && ts.isTypeAliasDeclaration(node.parent.parent)
        && (node.parent.parent.type === node.parent)
    ) {
        const parentName = node.parent.parent.name.text

        return `Required${karakum.capitalize(parentName)}`
    }

    return null
}
