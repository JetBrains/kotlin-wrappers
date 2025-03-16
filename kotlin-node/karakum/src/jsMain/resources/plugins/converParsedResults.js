import ts from "typescript"
import * as karakum from "../karakum.mjs"

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"

    if (
        sourceFileName.endsWith("util.d.ts")
        && ts.isTypeAliasDeclaration(node)
        && node.name.text === "ParsedResults"
        && ts.isConditionalTypeNode(node.type)
        && ts.isTypeLiteralNode(node.type.trueType)
    ) {
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey.get())

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node.type.trueType, context)

        const name = render(node.name)

        const typeParameters = node.typeParameters
            ?.map(typeParameter => render(typeParameter))
            ?.filter(Boolean)
            ?.join(", ")

        const injectionService = context.lookupService(karakum.injectionServiceKey.get())
        const injections = injectionService?.resolveInjections(node.type.trueType, context, render)

        const members = node.type.trueType.members
            .map(member => render(member))
            .join("\n")

        const injectedMembers = (injections ?? [])
            .join("\n")

        return `
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface ${name}${karakum.ifPresent(typeParameters, it => `<${it}>`)} {
${members}${karakum.ifPresent(injectedMembers, it => `\n${it}`)}
}
    `
    }

    return null
}
