import ts from "typescript";
import * as karakum from "../karakum.mjs";

function isRrtypeParameterType(node) {
    return (
        node.parent
        && ts.isLiteralTypeNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "rrtype"

        && node.parent.parent.parent
        && (
            (
                ts.isFunctionDeclaration(node.parent.parent.parent)
                && node.parent.parent.parent.name
                && node.parent.parent.parent.name.text === "resolve"
            )
            || ts.isCallSignatureDeclaration(node.parent.parent.parent)
        )
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
            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

            const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

            // generate the same entity for promise and callback API
            if (!sourceFileName.endsWith("promises.d.ts")) {
                this.sourceFileName = sourceFileName
                this.namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)
            }

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
        const name = "ResourceRecordType"

        const entries = Array.from(this.rrtypes).map(eventName => {
            const key = karakum.constIdentifier(eventName)
            return [key, eventName]
        })

        const keys = entries.map(([key]) => key)

        const body = keys
            .map(key => `sealed interface ${key} : ${name}`)
            .join("\n")

        const companionBody = entries
            .map(([key, value]) => (
                `
@seskar.js.JsValue("${value}")
val ${key}: ${key}
                `.trim()
            ))
            .join("\n")

        const fileBody = `
sealed external interface ${name} {
${body}

companion object {
${companionBody}
}
}
        `

        const declaration = {
            sourceFileName: this.sourceFileName,
            namespace: this.namespace,
            fileName: `${name}.kt`,
            body: fileBody,
        }

        return karakum.generateDerivedDeclarations([declaration], context);
    },
}
