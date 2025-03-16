import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("test.d.ts")) return null

    if (
        ts.isImportTypeNode(node)

        && node.parent
        && ts.isPropertySignature(node.parent)

        && node.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "TestContextAssert"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

        return `js.function.JsFunction<*, *> /* ${typeScriptService?.printNode(node)} */`
    }

    return null
}
