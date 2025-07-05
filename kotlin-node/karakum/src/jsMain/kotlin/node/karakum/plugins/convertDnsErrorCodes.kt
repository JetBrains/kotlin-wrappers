package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isIdentifier
import typescript.isVariableDeclaration

private val duplicatedConstants = setOf(
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
)

val convertDnsErrorCodes = createPlugin { node, _, _ ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("dns/promises.d.ts"))

        ensure(isVariableDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))
        ensure(name.text in duplicatedConstants)

        ""
    }
}
