import ts from "typescript";
import * as karakum from "../karakum.mjs";

const numberProps = {
    // http
    "IncomingMessage": {
        "statusCode": "Int",
    },
}

const numberParams = {
    // process
    "Process": {
        "exit": {
            "code": "Int",
        },
    },
}

export default function (node, context, render) {
    // union property
    if (
        node.kind === ts.SyntaxKind.NumberKeyword

        && node.parent
        && ts.isUnionTypeNode(node.parent)

        && node.parent.parent
        && ts.isPropertyDeclaration(node.parent.parent)

        && node.parent.parent.parent
        && ts.isClassDeclaration(node.parent.parent.parent)

        && node.parent.parent.parent.name?.text in numberProps

        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text in numberProps[node.parent.parent.parent.name?.text]
    ) {
        return numberProps[node.parent.parent.parent.name?.text][node.parent.parent.name.text]
    }

    // union parameter
    if (
        node.kind === ts.SyntaxKind.NumberKeyword

        && node.parent
        && ts.isUnionTypeNode(node.parent)

        && node.parent.parent
        && ts.isParameter(node.parent.parent)

        && node.parent.parent.parent
        && ts.isMethodSignature(node.parent.parent.parent)

        && node.parent.parent.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent.parent.parent)

        && ts.isIdentifier(node.parent.parent.parent.parent.name)
        && node.parent.parent.parent.parent.name.text in numberParams

        && ts.isIdentifier(node.parent.parent.parent.name)
        && node.parent.parent.parent.name.text in numberParams[node.parent.parent.parent.parent.name.text]

        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text in numberParams[node.parent.parent.parent.parent.name.text][node.parent.parent.parent.name.text]
    ) {
        return numberParams[node.parent.parent.parent.parent.name.text][node.parent.parent.parent.name.text][node.parent.parent.name.text]
    }

    return null
}
