import ts from "typescript"
import * as karakum from "karakum"

export default function (node, context, render) {
    if (
        ts.isInterfaceDeclaration(node)
        && (
            node.name.text === "RouteMatch"
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
            ?.join(", ")

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
                node.typeName.text === "RouteMatch"
                || node.typeName.text === "AgnosticRouteMatch"
            )
        )
        || (
            ts.isExpressionWithTypeArguments(node)
            && ts.isIdentifier(node.expression)
            && (
                node.expression.text === "RouteMatch"
                || node.expression.text === "AgnosticRouteMatch"
            )
        )
    ) {
        const name = node.typeName ?? node.expression

        // remove first generic
        let typeArguments = node.typeArguments
            ?.filter((typeArgument, index) => index !== 0)
            ?.map(typeArgument => render(typeArgument))
            ?.join(", ")

        return `${render(name)}${typeArguments ? `<${typeArguments}>` : "<*>"}`
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Params"
            || node.typeName.text === "PathPattern"
            || node.typeName.text === "PathMatch"
        )
    ) {
        // remove generics
        return render(node.typeName)
    }

    return null
}
