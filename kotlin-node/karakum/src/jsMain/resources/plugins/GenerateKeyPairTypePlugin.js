import ts from "typescript";
import * as karakum from "../karakum.mjs";

function isGenerateKeyPairType(node) {
    return (
        node.parent
        && ts.isLiteralTypeNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text === "type"

        && node.parent.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name
        && (
            node.parent.parent.parent.name.text === "generateKeyPair"
            || node.parent.parent.parent.name.text === "generateKeyPairSync"
        )
    )
}

function isGenerateKeyPairOptions(node) {
    return (
        node.parent
        && ts.isParameter(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "options"

        && node.parent.parent
        && ts.isFunctionDeclaration(node.parent.parent)
        && node.parent.parent.name
        && (
            node.parent.parent.name.text === "generateKeyPair"
            || node.parent.parent.name.text === "generateKeyPairSync"
        )
    )
}

export default {
    setup(context) {
        this.sourceFileName = "generated.d.ts"
        this.namespace = undefined
        this.options = new Map()
    },

    traverse(node, context) {
        if (
            ts.isTypeReferenceNode(node)
            && isGenerateKeyPairOptions(node)
            && ts.isIdentifier(node.typeName)
            && node.typeArguments

            && ts.isLiteralTypeNode(node.typeArguments[0])
            && ts.isStringLiteral(node.typeArguments[0].literal)

            && ts.isLiteralTypeNode(node.typeArguments[1])
            && ts.isStringLiteral(node.typeArguments[1].literal)
        ) {
            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())

            this.sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
            this.namespace = typeScriptService?.findClosest(node, ts.isModuleDeclaration)

            const originalName = node.typeName.text

            const publicFormat = node.typeArguments[0].literal.text
            const privateFormat = node.typeArguments[1].literal.text

            const name = originalName.replace("Options", `${karakum.capitalize(publicFormat)}${karakum.capitalize(privateFormat)}Options`)

            this.options.set(name, [
                originalName,
                publicFormat,
                privateFormat,
            ])
        }
    },

    render(node, context) {
        if (ts.isStringLiteral(node) && isGenerateKeyPairType(node)) {
            return `KeyType.${karakum.identifier(node.text)}`
        }

        if (
            ts.isTypeReferenceNode(node)
            && isGenerateKeyPairOptions(node)
            && ts.isIdentifier(node.typeName)
            && node.typeArguments

            && ts.isLiteralTypeNode(node.typeArguments[0])
            && ts.isStringLiteral(node.typeArguments[0].literal)

            && ts.isLiteralTypeNode(node.typeArguments[1])
            && ts.isStringLiteral(node.typeArguments[1].literal)
        ) {
            const originalName = node.typeName.text

            const publicFormat = node.typeArguments[0].literal.text
            const privateFormat = node.typeArguments[1].literal.text

            return originalName.replace("Options", `${karakum.capitalize(publicFormat)}${karakum.capitalize(privateFormat)}Options`)
        }

        return null
    },

    generate(context) {
        const declarations = Array.from(this.options).map(([name, formats]) => {
            const [originalName, publicFormat, privateFormat] = formats

            return {
                sourceFileName: this.sourceFileName,
                namespace: this.namespace,
                fileName: `${name}.kt`,
                body: `external interface ${name} : ${originalName}<KeyFormat.${publicFormat}, KeyFormat.${privateFormat}>`,
            }
        })

        return karakum.generateDerivedDeclarations(declarations, context)
    },
}
