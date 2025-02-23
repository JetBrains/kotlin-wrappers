import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default function (node, context, render) {
    if (
        ts.isUnionTypeNode(node)
        && node.types.length === 3

        // -1
        && node.types[0]
        && ts.isLiteralTypeNode(node.types[0])
        && ts.isPrefixUnaryExpression(node.types[0].literal)
        && node.types[0].literal.operator === ts.SyntaxKind.MinusToken
        && ts.isNumericLiteral(node.types[0].literal.operand)
        && node.types[0].literal.operand.text === "1"

        // 0
        && node.types[1]
        && ts.isLiteralTypeNode(node.types[1])
        && ts.isNumericLiteral(node.types[1].literal)
        && node.types[1].literal.text === "0"

        // 1
        && node.types[2]
        && ts.isLiteralTypeNode(node.types[2])
        && ts.isNumericLiteral(node.types[2].literal)
        && node.types[2].literal.text === "1"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

        return `Int /* ${typeScriptService?.printNode(node)} */`
    }


    return null
}
