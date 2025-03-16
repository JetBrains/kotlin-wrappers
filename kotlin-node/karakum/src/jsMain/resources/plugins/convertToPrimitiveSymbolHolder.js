import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isTypeLiteralNode(node)
        && node.members.length === 1
        && ts.isMethodSignature(node.members[0])
        && ts.isComputedPropertyName(node.members[0].name)
        && ts.isPropertyAccessExpression(node.members[0].name.expression)

        && ts.isIdentifier(node.members[0].name.expression.expression)
        && node.members[0].name.expression.expression.text === "Symbol"

        && ts.isIdentifier(node.members[0].name.expression.name)
        && node.members[0].name.expression.name.text === "toPrimitive"
    ) {
        return "js.symbol.ToPrimitiveSymbolHolder"
    }


    return null
}
