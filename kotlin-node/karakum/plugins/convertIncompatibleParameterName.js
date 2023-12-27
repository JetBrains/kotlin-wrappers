import ts from "typescript";

const incompatibleParameterNames = {
    // globals
    "ReadableStream": {
        "wrap": {
            "oldStream": "stream",
        },
    },

    // stream
    "Duplex": {
        "write": {
            "cb": "callback",
        },
    },

    // net
    "Socket": {
        "end": {
            "callback": "cb",
            "buffer": "data",
        }
    },

    // http
    "ClientRequest": {
        "setTimeout": {
            "timeout": "msecs",
        }
    },
}

export default function (node) {
    if (
        ts.isIdentifier(node)
        && ts.isParameter(node.parent)
        && node.parent.name === node
        && ts.isMethodDeclaration(node.parent.parent)
        && ts.isClassDeclaration(node.parent.parent.parent)

        && node.parent.parent.parent.name
        && node.parent.parent.parent.name.text in incompatibleParameterNames
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text in incompatibleParameterNames[node.parent.parent.parent.name.text]
        && node.text in incompatibleParameterNames[node.parent.parent.parent.name.text][node.parent.parent.name.text]
    ) {
        return incompatibleParameterNames[node.parent.parent.parent.name.text][node.parent.parent.name.text][node.text]
    }

    if (
        ts.isIdentifier(node)
        && ts.isParameter(node.parent)
        && node.parent.name === node
        && ts.isMethodSignature(node.parent.parent)
        && ts.isInterfaceDeclaration(node.parent.parent.parent)

        && node.parent.parent.parent.name.text in incompatibleParameterNames
        && ts.isIdentifier(node.parent.parent.name)
        && node.parent.parent.name.text in incompatibleParameterNames[node.parent.parent.parent.name.text]
        && node.text in incompatibleParameterNames[node.parent.parent.parent.name.text][node.parent.parent.name.text]
    ) {
        return incompatibleParameterNames[node.parent.parent.parent.name.text][node.parent.parent.name.text][node.text]
    }
    return null
}
