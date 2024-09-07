import ts from "typescript"
import * as karakum from "karakum";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("inspector.d.ts")
        && ts.isClassDeclaration(node)
        && node.name.text === "Session"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)

        const namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)

        if (
            namespace
            && ts.isStringLiteral(namespace.name)
            && namespace.name.text === "inspector"
        ) {
            return `@JsName("Session")`
        }
    }

    return null
}
