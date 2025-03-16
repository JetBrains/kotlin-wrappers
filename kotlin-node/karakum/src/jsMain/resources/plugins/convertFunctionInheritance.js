import ts from "typescript";
import * as karakum from "../karakum.mjs"

export default function (node, context) {
    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

    if (
        ts.isExpressionWithTypeArguments(node)
        && ts.isIdentifier(node.expression)
        && node.expression.text === "DebugLoggerFunction"
    ) {
        return `js.function.JsFunction<js.array.JsTuple1<String>, Unit> /* ${typeScriptService?.printNode(node)} */`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "REPLWriter"

        && node.parent
        && ts.isIntersectionTypeNode(node.parent)
    ) {
        return `js.function.JsFunction<js.array.JsTuple1<Any?>, String> /* ${typeScriptService?.printNode(node)} */`
    }

    return null
}
