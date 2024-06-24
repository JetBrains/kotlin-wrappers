import ts from "typescript";
import * as karakum from "karakum";

export default function (node, context, render) {
    if (
        ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && (
            node.expression.text === "Array"
            || node.expression.text === "ReadonlyArray"
        )
    ) {
        const typeArguments = node.typeArguments
            ?.map(typeArgument => render(typeArgument))
            ?.filter(Boolean)
            ?.join(", ")

        return `ReadonlyArrayAdapter${karakum.ifPresent(typeArguments, it => `<${it}>`)}`
    }

    return null
}
