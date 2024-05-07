import ts from "typescript";
import * as karakum from "karakum";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("https.d.ts")) return []

    if (
        ts.isInterfaceDeclaration(node)
        && node.name.text === "AgentOptions"
        && context.type === karakum.InjectionType.MEMBER
    ) {
        return ["override var port: dynamic"]
    }

    return []
}
