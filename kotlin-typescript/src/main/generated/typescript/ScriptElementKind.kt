// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package typescript

// language=JavaScript
@JsName("""(/*union*/{unknown: '', warning: 'warning', keyword: 'keyword', scriptElement: 'script', moduleElement: 'module', classElement: 'class', localClassElement: 'local class', interfaceElement: 'interface', typeElement: 'type', enumElement: 'enum', enumMemberElement: 'enum member', variableElement: 'var', localVariableElement: 'local var', functionElement: 'function', localFunctionElement: 'local function', memberFunctionElement: 'method', memberGetAccessorElement: 'getter', memberSetAccessorElement: 'setter', memberVariableElement: 'property', constructorImplementationElement: 'constructor', callSignatureElement: 'call', indexSignatureElement: 'index', constructSignatureElement: 'construct', parameterElement: 'parameter', typeParameterElement: 'type parameter', primitiveType: 'primitive type', label: 'label', alias: 'alias', constElement: 'const', letElement: 'let', directory: 'directory', externalModuleName: 'external module name', jsxAttribute: 'JSX attribute', string: 'string', link: 'link', linkName: 'link name', linkText: 'link text'}/*union*/)""")
external enum class ScriptElementKind {
    unknown,
    warning,

    /** predefined type (void) or keyword (class) */
    keyword,

    /** top level script node */
    scriptElement,

    /** module foo {} */
    moduleElement,

    /** class X {} */
    classElement,

    /** var x = class X {} */
    localClassElement,

    /** interface Y {} */
    interfaceElement,

    /** type T = ... */
    typeElement,

    /** enum E */
    enumElement,
    enumMemberElement,

    /**
     * Inside module and script only
     * const v = ..
     */
    variableElement,

    /** Inside function */
    localVariableElement,

    /**
     * Inside module and script only
     * function f() { }
     */
    functionElement,

    /** Inside function */
    localFunctionElement,

    /** class X { [public|private]* foo() {} } */
    memberFunctionElement,

    /** class X { [public|private]* [get|set] foo:number; } */
    memberGetAccessorElement,
    memberSetAccessorElement,

    /**
     * class X { [public|private]* foo:number; }
     * interface Y { foo:number; }
     */
    memberVariableElement,

    /**
     * class X { constructor() { } }
     * class X { static { } }
     */
    constructorImplementationElement,

    /** interface Y { ():number; } */
    callSignatureElement,

    /** interface Y { []:number; } */
    indexSignatureElement,

    /** interface Y { new():Y; } */
    constructSignatureElement,

    /** function foo(*Y*: string) */
    parameterElement,
    typeParameterElement,
    primitiveType,
    label,
    alias,
    constElement,
    letElement,
    directory,
    externalModuleName,

    /**
     * <JsxTagName attribute1 attribute2={0} />
     * @deprecated
     */
    jsxAttribute,

    /** String literal */
    string,

    /** Jsdoc @link: in `{@link C link text}`, the before and after text "{@link " and "}" */
    link,

    /** Jsdoc @link: in `{@link C link text}`, the entity name "C" */
    linkName,

    /** Jsdoc @link: in `{@link C link text}`, the link text "link text" */
    linkText,

    ;
}
