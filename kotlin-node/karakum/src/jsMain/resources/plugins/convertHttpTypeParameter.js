import ts from "typescript";
import * as karakum from "../karakum.mjs";

function isInstanceType(node) {
    return (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "InstanceType"
    )
}

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (
        !sourceFileName.endsWith("http.d.ts")
        && !sourceFileName.endsWith("https.d.ts")
        && !sourceFileName.endsWith("http2.d.ts")
    ) return null

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
                && (
                    node.parent.name.text === "ServerOptions"
                    || node.parent.name.text === "SecureServerOptions"
                    || node.parent.name.text === "Http2Server"
                    || node.parent.name.text === "Http2SecureServer"
                    || node.parent.name.text === "ServerHttp2Session"
                    || node.parent.name.text === "ServerSessionOptions"
                    || node.parent.name.text === "SecureServerSessionOptions"
                )
            )
            || (
                ts.isTypeAliasDeclaration(node.parent)
                && node.parent.name.text === "ServerOptions"
            )
            || (
                ts.isFunctionDeclaration(node.parent)
                || node.parent.name?.text === "createServer"
                || node.parent.name?.text === "createSecureServer"
                || node.parent.name?.text === "performServerHandshake"
            )
        )
    ) {
        if (node.name.text === "Request") {
            return `Request : IncomingMessage`
        }

        if (node.name.text === "Http1Request") {
            return `Http1Request : IncomingMessage`
        }

        if (node.name.text === "Http2Request") {
            return `Http2Request : Http2ServerRequest`
        }

        if (node.name.text === "Response") {
            return `Response : ServerResponse<*>`
        }

        if (node.name.text === "Http1Response") {
            return `Http1Response : ServerResponse<*>`
        }

        if (node.name.text === "Http2Response") {
            return `Http2Response : Http2ServerResponse<*>`
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
            || node.typeName.text === "Http1Request"
            || node.typeName.text === "Http2Request"

            || node.typeName.text === "Response"
            || node.typeName.text === "Http1Response"
            || node.typeName.text === "Http2Response"
        )
    ) {
        if (
            node.parent
            && ts.isTypeReferenceNode(node.parent)
            && (
                (
                    ts.isIdentifier(node.parent.typeName)
                    && (
                        node.parent.typeName.text === "InstanceType"

                        || node.parent.typeName.text === "Server"
                        || node.parent.typeName.text === "ServerOptions"
                        || node.parent.typeName.text === "RequestListener"

                        || node.parent.typeName.text === "Http2Server"
                        || node.parent.typeName.text === "ServerHttp2Session"
                    )
                )
                || (
                    ts.isQualifiedName(node.parent.typeName)
                    && (
                        node.parent.typeName.right.text === "ServerOptions"
                        || node.parent.typeName.right.text === "RequestListener"
                    )
                )
            )
        ) {
            return null
        }

        if (
            node.parent
            && ts.isExpressionWithTypeArguments(node.parent)
            && ts.isIdentifier(node.parent.expression)
            && (
                node.parent.expression.text === "ServerSessionOptions"
                || node.parent.expression.text === "SecureServerSessionOptions"
            )
        ) {
            return null
        }

        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
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
                    && (
                        typeParameterDeclaration.parent.name.text === "ServerOptions"
                        || typeParameterDeclaration.parent.name.text === "SecureServerOptions"
                        || typeParameterDeclaration.parent.name.text === "Http2Server"
                        || typeParameterDeclaration.parent.name.text === "Http2SecureServer"
                        || typeParameterDeclaration.parent.name.text === "ServerHttp2Session"
                        || typeParameterDeclaration.parent.name.text === "ServerSessionOptions"
                        || typeParameterDeclaration.parent.name.text === "SecureServerSessionOptions"
                    )
                )
                || (
                    ts.isTypeAliasDeclaration(typeParameterDeclaration.parent)
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
