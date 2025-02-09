import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default (node, context) => {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("https.d.ts")) return []

    if (
        ts.isInterfaceDeclaration(node)
        && node.name.text === "AgentOptions"
        && context.type === "MEMBER"
    ) {
        return ["override var port: dynamic"]
    }

    return []
}
