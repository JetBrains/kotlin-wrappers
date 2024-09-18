import ts from "typescript";
import * as karakum from "karakum";

const comparisonResultType = JSON.stringify(["1", "0", "-1"].sort())

export default function (node, context) {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

    if (
        ts.isUnionTypeNode(node)
        && node.types.every(type => ts.isLiteralTypeNode(type) && (ts.isNumericLiteral(type.literal) || (ts.isPrefixUnaryExpression(type.literal) && ts.isNumericLiteral(type.literal.operand))))
        && JSON.stringify(node.types.map(type => typeScriptService.printNode(type)).sort()) === comparisonResultType

        && node.parent
        && (ts.isFunctionDeclaration(node.parent) || ts.isMethodDeclaration(node.parent))
        && node.parent.type === node

        && ts.isIdentifier(node.parent.name)
        && (node.parent.name.text.startsWith("compare")
            || node.parent.name.text.startsWith("rcompare"))
    ) {
        return "Int"
    }

    return null
}
