import ts from "typescript";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("http2.d.ts")) return null

    if (
        ts.isTypeQueryNode(node)
        && ts.isIdentifier(node.exprName)
        && (
            node.exprName.text === "IncomingMessage"
            || node.exprName.text === "ServerResponse"
            || node.exprName.text === "Http2ServerRequest"
            || node.exprName.text === "Http2ServerResponse"
        )

        && node.parent?.parent?.parent // TypeQuery / UnionType / PropertySignature / InterfaceDeclaration
        && ts.isInterfaceDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "ServerSessionOptions"
    ) {
        if (node.exprName.text === "ServerResponse") {
            return `JsClass<${render(node.exprName)}<*>>`
        }

        return `JsClass<${render(node.exprName)}>`
    }

    return null
}
