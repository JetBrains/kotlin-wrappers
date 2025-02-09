import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("stream.d.ts")
        && ts.isConditionalTypeNode(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "PipelinePromise"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

        return `js.promise.Promise<*> /* ${typeScriptService?.printNode(node)} */`;
    }

    return null
}
