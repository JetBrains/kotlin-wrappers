import ts from "typescript";
import * as karakum from "karakum";

function isRrtypeParameterType(node) {
    return (
        node.parent
        && ts.isLiteralTypeNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "rrtype"

        && node.parent.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name
        && node.parent.parent.parent.name.text === "resolve"
    )
}

export default {
    setup(context) {
        this.sourceFileName = "generated.d.ts"
        this.namespace = undefined
        this.rrtypes = new Set()
    },

    traverse(node, context) {
        if (ts.isStringLiteral(node) && isRrtypeParameterType(node)) {
            this.sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
            this.namespace = karakum.findClosest(node, ts.isModuleDeclaration)

            this.rrtypes.add(node.text)
        }
    },

    render(node, context) {
        if (ts.isStringLiteral(node) && isRrtypeParameterType(node)) {
            return `ResourceRecordType.${karakum.constIdentifier(node.text)}`
        }

        return null
    },

    generate(context) {
        const configurationService = context.lookupService(karakum.configurationServiceKey)
        const configuration = configurationService?.configuration
        if (configuration === undefined) throw new Error("EventPlugin.js can't work without ConfigurationService")

        const namespaceInfoService = context.lookupService(karakum.namespaceInfoServiceKey)
        const resolveNamespaceStrategy = namespaceInfoService?.resolveNamespaceStrategy?.bind(namespaceInfoService)
        if (resolveNamespaceStrategy === undefined) throw new Error("AnonymousDeclarationPlugin can't work without NamespaceInfoService")

        const name = "ResourceRecordType"

        const entries = Array.from(this.rrtypes).map(eventName => {
            const key = karakum.constIdentifier(eventName)
            return [key, eventName]
        })

        const keys = entries.map(([key]) => key)

        const body = keys
            .map(key => `object ${key} : ${name}`)
            .join("\n")

        const jsName = entries
            .map(([key, value]) => `${key}: '${value}'`)
            .join(", ")

        const fileBody = `
@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{${jsName}}/*union*/)""")
sealed external interface ${name} {
${body}
}
        `

        const declaration = {
            sourceFileName: this.sourceFileName,
            namespace: this.namespace,
            fileName: `${name}.kt`,
            body: fileBody,
        }

        return karakum.generateDerivedDeclarations([declaration], configuration, resolveNamespaceStrategy);
    },
}
