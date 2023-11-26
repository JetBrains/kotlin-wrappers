import ts from "typescript";
import * as karakum from "karakum";

function isInstanceType(node) {
    return (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "InstanceType"
    )
}

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("http.d.ts")) return null

    if (
        ts.isTypeParameterDeclaration(node)
        && node.parent
        && (
            (
                ts.isClassDeclaration(node.parent)
                && node.parent.name?.text === "Server"
            )
            || (
                ts.isInterfaceDeclaration(node.parent)
                && node.parent.name.text === "ServerOptions"
            )
            || (
                ts.isFunctionDeclaration(node.parent)
                && node.parent.name?.text === "createServer"
            )
        )
    ) {
        if (node.name.text === "Request") {
            return `Request : IncomingMessage`
        }

        if (node.name.text === "Response") {
            return `Response : ServerResponse<*>`
        }
    }

    if (
        ts.isTypeParameterDeclaration(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "RequestListener"
    ) {
        if (node.name.text === "Request") {
            return `Request /* : IncomingMessage */`
        }

        if (node.name.text === "Response") {
            return `Response /* : ServerResponse<*> */`
        }
    }

    if (
        isInstanceType(node)
    ) {
        return render(node.typeArguments[0])
    }

    if (
        ts.isIntersectionTypeNode(node)
        && node.types[0]
        && isInstanceType(node.types[0])
    ) {
        return render(node.types[0].typeArguments[0])
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && (
            node.typeName.text === "Request"
            || node.typeName.text === "Response"
        )
    ) {
        if (
            node.parent
            && ts.isTypeReferenceNode(node.parent)
            && ts.isIdentifier(node.parent.typeName)
            && (
                node.parent.typeName.text === "InstanceType"
                || node.parent.typeName.text === "Server"
                || node.parent.typeName.text === "ServerOptions"
                || node.parent.typeName.text === "RequestListener"
            )
        ) {
            return null
        }

        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
        const typeChecker = typeScriptService?.program.getTypeChecker()

        const symbol = typeChecker?.getSymbolAtLocation(node.typeName)

        const typeParameterDeclarations = (symbol?.declarations ?? [])
        const typeParameterDeclaration = typeParameterDeclarations
            .find(declaration => ts.isTypeParameterDeclaration(declaration))

        if (
            typeParameterDeclaration
            && typeParameterDeclaration.parent
            && (
                (
                    ts.isClassDeclaration(typeParameterDeclaration.parent)
                    && typeParameterDeclaration.parent.name?.text === "Server"
                )
                || (
                    ts.isInterfaceDeclaration(typeParameterDeclaration.parent)
                    && typeParameterDeclaration.parent.name.text === "ServerOptions"
                )
                || (
                    ts.isFunctionDeclaration(typeParameterDeclaration.parent)
                    && typeParameterDeclaration.parent.name?.text === "createServer"
                )
                || (
                    ts.isTypeAliasDeclaration(typeParameterDeclaration.parent)
                    && typeParameterDeclaration.parent.name.text === "RequestListener"
                )
            )
        ) {
            return `JsClass<${render(node)}>`
        }
    }

    return null
}
