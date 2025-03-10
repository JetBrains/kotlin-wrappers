import ts from "typescript";
import * as karakum from "../karakum.mjs";

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("os.d.ts")) return null

    if (
        ts.isIdentifier(node)
        && node.text === "key"

        && node.parent
        && ts.isTypeParameterDeclaration(node.parent)

        && node.parent.parent
        && ts.isMappedTypeNode(node.parent.parent)

        && node.parent.parent.parent
        && ts.isTypeAliasDeclaration(node.parent.parent.parent)
        && node.parent.parent.parent.name.text === "SignalConstants"
    ) {
        return "Key"
    }

    if (
        ts.isTypeAliasDeclaration(node)
        && node.name.text === "SignalConstants"

        && ts.isMappedTypeNode(node.type)
    ) {
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey.get())

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)
        const accessorsInheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node.type, context)

        const typeParameters = node.typeParameters
            ?.map(typeParameter => render(typeParameter))
            ?.join(", ")

        const readonly = node.type.readonlyToken && node.type.readonlyToken.kind !== ts.SyntaxKind.MinusToken

        const typeParameter = render(node.type.typeParameter)

        const type = karakum.renderNullable(node.type.type, true, context, render)

        const getter = `
@seskar.js.JsNativeGetter
${karakum.ifPresent(accessorsInheritanceModifier, it => `${it} `)}operator fun <${typeParameter}> get(key: Key): ${type}
        `

        let setter = ""

        if (!readonly) {
            setter = `
@seskar.js.JsNativeSetter
${karakum.ifPresent(accessorsInheritanceModifier, it => `${it} `)}operator fun <${typeParameter}> set(key: Key, value: ${type})
            `
        }

        const accessors = `
${getter}${karakum.ifPresent(setter, it => `\n\n${it}`)}
        `

        return `
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface SignalConstants${karakum.ifPresent(typeParameters, it => `<${it}> `)} {
${accessors}
}
        `
    }

    return null
}
