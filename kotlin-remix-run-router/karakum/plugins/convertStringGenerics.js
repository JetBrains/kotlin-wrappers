const ts = require("typescript")
const karakum = require("karakum")

module.exports = function (node, context, render) {
    if (
        ts.isInterfaceDeclaration(node)
        && (
            node.name.text === "AgnosticRouteMatch"
            || node.name.text === "PathMatch"
            || node.name.text === "PathPattern"
        )
    ) {
        const inheritanceModifierService = context.lookupService(karakum.inheritanceModifierServiceKey)

        const name = render(node.name)

        const inheritanceModifier = inheritanceModifierService?.resolveInheritanceModifier(node, context)

        const typeParameters = node.typeParameters
            ?.filter(typeParameter => typeParameter?.constraint?.kind !== ts.SyntaxKind.StringKeyword)
            ?.map(typeParameter => render(typeParameter))
            ?.join(", ")

        const heritageClauses = node.heritageClauses
            ?.map(heritageClause => render(heritageClause))
            ?.join(" ")

        const members = node.members
            .map(member => render(member))
            .join("\n")

        return `
${karakum.ifPresent(inheritanceModifier, it => `${it} `)}external interface ${name}${karakum.ifPresent(typeParameters, it => `<${it}>`)}${karakum.ifPresent(heritageClauses, it => ` : ${it}`)} {
${members}
}
        `
    }

    if (
        (
            ts.isTypeReferenceNode(node)
            && ts.isIdentifier(node.typeName)
            && (
                node.typeName.text === "AgnosticRouteMatch"
                || node.typeName.text === "PathMatch"
                || node.typeName.text === "PathPattern"
            )
        )
        || (
            ts.isExpressionWithTypeArguments(node)
            && ts.isIdentifier(node.expression)
            && (
                node.expression.text === "AgnosticRouteMatch"
                || node.expression.text === "PathMatch"
                || node.expression.text === "PathPattern"
            )
        )
    ) {
        const name = node.typeName ?? node.expression

        // remove first generic
        let typeArguments = node.typeArguments
            ?.filter((typeArgument, index) => index !== 0)
            ?.map(typeArgument => render(typeArgument))
            ?.join(", ")

        if (
            name.text === "AgnosticRouteMatch"
            && !typeArguments
        ) {
            typeArguments = "*"
        }

        return `${render(name)}${typeArguments ? `<${typeArguments}>` : ""}`
    }

    return null
}
