import ts from "typescript";

const duplicatedConstants = new Set([
    "NODATA",
    "FORMERR",
    "SERVFAIL",
    "NOTFOUND",
    "NOTIMP",
    "REFUSED",
    "BADQUERY",
    "BADNAME",
    "BADFAMILY",
    "BADRESP",
    "CONNREFUSED",
    "TIMEOUT",
    "EOF",
    "FILE",
    "NOMEM",
    "DESTRUCTION",
    "BADSTR",
    "BADFLAGS",
    "NONAME",
    "BADHINTS",
    "NOTINITIALIZED",
    "LOADIPHLPAPI",
    "ADDRGETNETWORKPARAMS",
    "CANCELLED",
])

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("dns/promises.d.ts")
        && ts.isVariableDeclaration(node)
        && ts.isIdentifier(node.name)
        && duplicatedConstants.has(node.name.text)
    ) {
        return ""
    }


    return null
}
