import ts from "typescript";

export default function (node, context, render) {
    if (
        ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "DebugLoggerFunction"
    ) {
        return "js.function.JsFunction<js.array.JsTuple, Unit>"
    }

    return null
}
