import ts from "typescript";
import * as karakum from "../karakum.mjs"

export default function (node, context) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("test.d.ts")) return null

    if (
        (
            ts.isUnionTypeNode(node)

            && node.parent
            && ts.isTypeReferenceNode(node.parent)
            && ts.isIdentifier(node.parent.typeName)
            && node.parent.typeName.text === "AsyncGenerator"

            && node.parent.parent
            && ts.isFunctionDeclaration(node.parent.parent)
            && node.parent.parent.name?.text === "dot"
        )
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

        return `String /* ${typeScriptService?.printNode(node)} */`
    }

    return null
}
