import ts from "typescript";
import * as karakum from "../karakum.mjs";

function isSessionPostMethod(node) {
    return (
        node.parent
        && ts.isLiteralTypeNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "method"

        && node.parent.parent.parent
        && ts.isMethodDeclaration(node.parent.parent.parent)
        && ts.isIdentifier(node.parent.parent.parent.name)
        && node.parent.parent.parent.name.text === "post"

        && node.parent.parent.parent.parent
        && ts.isClassDeclaration(node.parent.parent.parent.parent)
        && node.parent.parent.parent.parent.name?.text === "Session"
    )
}

export default {
    setup(context) {
        this.sourceFileName = "generated.d.ts"
        this.namespace = undefined
        this.methods = new Set()
    },

    traverse(node, context) {
        if (ts.isStringLiteral(node) && isSessionPostMethod(node)) {
            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

            this.sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
            this.namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)
            this.methods.add(node.text)
        }
    },

    render(node, context) {
        if (ts.isStringLiteral(node) && isSessionPostMethod(node)) {
            return `SessionMethod.${karakum.constIdentifier(node.text)}`
        }

        return null
    },

    generate(context) {
        const name = "SessionMethod"

        const entries = Array.from(this.methods).map(eventName => {
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
