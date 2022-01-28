// Automatically generated - do not modify!

package typescript

sealed external interface NodeFactory {
    fun <T : Node> createNodeArray(
        elements: ReadonlyArray<T> = definedExternally,
        hasTrailingComma: Boolean = definedExternally,
    ): NodeArray<T>

    fun createNumericLiteral(
        value: dynamic, /* string | number */
        numericLiteralFlags: TokenFlags = definedExternally,
    ): NumericLiteral

    fun createBigIntLiteral(value: dynamic /* string | PseudoBigInt */): BigIntLiteral
    fun createStringLiteral(
        text: String,
        isSingleQuote: Boolean = definedExternally,
    ): StringLiteral

    fun createStringLiteralFromNode(
        sourceNode: PropertyNameLiteral,
        isSingleQuote: Boolean = definedExternally,
    ): StringLiteral

    fun createRegularExpressionLiteral(text: String): RegularExpressionLiteral
    fun createIdentifier(text: String): Identifier

    /**
     * Create a unique temporary variable.
     * @param recordTempVariable An optional callback used to record the temporary variable name. This
     * should usually be a reference to `hoistVariableDeclaration` from a `TransformationContext`, but
     * can be `undefined` if you plan to record the temporary variable manually.
     * @param reservedInNestedScopes When `true`, reserves the temporary variable name in all nested scopes
     * during emit so that the variable can be referenced in a nested function body. This is an alternative to
     * setting `EmitFlags.ReuseTempVariableScope` on the nested function itself.
     */
    fun createTempVariable(
        recordTempVariable: ((node: Identifier) -> Unit)?,
        reservedInNestedScopes: Boolean = definedExternally,
    ): Identifier

    /**
     * Create a unique temporary variable for use in a loop.
     * @param reservedInNestedScopes When `true`, reserves the temporary variable name in all nested scopes
     * during emit so that the variable can be referenced in a nested function body. This is an alternative to
     * setting `EmitFlags.ReuseTempVariableScope` on the nested function itself.
     */
    fun createLoopVariable(reservedInNestedScopes: Boolean = definedExternally): Identifier

    /** Create a unique name based on the supplied text. */
    fun createUniqueName(
        text: String,
        flags: GeneratedIdentifierFlags = definedExternally,
    ): Identifier

    /** Create a unique name generated for a node. */
    fun getGeneratedNameForNode(
        node: Node?,
        flags: GeneratedIdentifierFlags = definedExternally,
    ): Identifier

    fun createPrivateIdentifier(text: String): PrivateIdentifier
    fun createToken(token: SyntaxKind.SuperKeyword): SuperExpression
    fun createToken(token: SyntaxKind.ThisKeyword): ThisExpression
    fun createToken(token: SyntaxKind.NullKeyword): NullLiteral
    fun createToken(token: SyntaxKind.TrueKeyword): TrueLiteral
    fun createToken(token: SyntaxKind.FalseKeyword): FalseLiteral

    // TODO: restore after alias update
    // fun <TKind : PunctuationSyntaxKind> createToken(token: TKind): PunctuationToken<TKind>
    // TODO: restore after alias update
    // fun <TKind : KeywordTypeSyntaxKind> createToken(token: TKind): KeywordTypeNode<TKind>
    // TODO: restore after alias update
    // fun <TKind : ModifierSyntaxKind> createToken(token: TKind): ModifierToken<TKind>
    // TODO: restore after alias update
    // fun <TKind : KeywordSyntaxKind> createToken(token: TKind): KeywordToken<TKind>
    // TODO: restore after alias update
    // fun <TKind : SyntaxKind.Unknown | SyntaxKind.EndOfFileToken> createToken(token: TKind): Token<TKind>
    fun createSuper(): SuperExpression
    fun createThis(): ThisExpression
    fun createNull(): NullLiteral
    fun createTrue(): TrueLiteral
    fun createFalse(): FalseLiteral
    fun <T : ModifierSyntaxKind> createModifier(kind: T): ModifierToken<T>
    fun createModifiersFromModifierFlags(flags: ModifierFlags): ReadonlyArray<Modifier>
    fun createQualifiedName(
        left: EntityName,
        right: dynamic, /* string | Identifier */
    ): QualifiedName

    fun updateQualifiedName(
        node: QualifiedName,
        left: EntityName,
        right: Identifier,
    ): QualifiedName

    fun createComputedPropertyName(expression: Expression): ComputedPropertyName
    fun updateComputedPropertyName(
        node: ComputedPropertyName,
        expression: Expression,
    ): ComputedPropertyName

    fun createTypeParameterDeclaration(
        name: dynamic, /* string | Identifier */
        constraint: TypeNode = definedExternally,
        defaultType: TypeNode = definedExternally,
    ): TypeParameterDeclaration

    fun updateTypeParameterDeclaration(
        node: TypeParameterDeclaration,
        name: Identifier,
        constraint: TypeNode?,
        defaultType: TypeNode?,
    ): TypeParameterDeclaration

    fun createParameterDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        dotDotDotToken: DotDotDotToken?,
        name: dynamic, /* string | BindingName */
        questionToken: QuestionToken = definedExternally,
        type: TypeNode = definedExternally,
        initializer: Expression = definedExternally,
    ): ParameterDeclaration

    fun updateParameterDeclaration(
        node: ParameterDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        dotDotDotToken: DotDotDotToken?,
        name: dynamic, /* string | BindingName */
        questionToken: QuestionToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): ParameterDeclaration

    fun createDecorator(expression: Expression): Decorator
    fun updateDecorator(
        node: Decorator,
        expression: Expression,
    ): Decorator

    fun createPropertySignature(
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* PropertyName | string */
        questionToken: QuestionToken?,
        type: TypeNode?,
    ): PropertySignature

    fun updatePropertySignature(
        node: PropertySignature,
        modifiers: ReadonlyArray<Modifier>?,
        name: PropertyName,
        questionToken: QuestionToken?,
        type: TypeNode?,
    ): PropertySignature

    fun createPropertyDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* string | PropertyName */
        questionOrExclamationToken: dynamic, /* QuestionToken | ExclamationToken */
        type: TypeNode?,
        initializer: Expression?,
    ): PropertyDeclaration

    fun updatePropertyDeclaration(
        node: PropertyDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* string | PropertyName */
        questionOrExclamationToken: dynamic, /* QuestionToken | ExclamationToken */
        type: TypeNode?,
        initializer: Expression?,
    ): PropertyDeclaration

    fun createMethodSignature(
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* string | PropertyName */
        questionToken: QuestionToken?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): MethodSignature

    fun updateMethodSignature(
        node: MethodSignature,
        modifiers: ReadonlyArray<Modifier>?,
        name: PropertyName,
        questionToken: QuestionToken?,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode?,
    ): MethodSignature

    fun createMethodDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        asteriskToken: AsteriskToken?,
        name: dynamic, /* string | PropertyName */
        questionToken: QuestionToken?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): MethodDeclaration

    fun updateMethodDeclaration(
        node: MethodDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        asteriskToken: AsteriskToken?,
        name: PropertyName,
        questionToken: QuestionToken?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): MethodDeclaration

    fun createConstructorDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        body: Block?,
    ): ConstructorDeclaration

    fun updateConstructorDeclaration(
        node: ConstructorDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        body: Block?,
    ): ConstructorDeclaration

    fun createGetAccessorDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* string | PropertyName */
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): GetAccessorDeclaration

    fun updateGetAccessorDeclaration(
        node: GetAccessorDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: PropertyName,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): GetAccessorDeclaration

    fun createSetAccessorDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* string | PropertyName */
        parameters: ReadonlyArray<ParameterDeclaration>,
        body: Block?,
    ): SetAccessorDeclaration

    fun updateSetAccessorDeclaration(
        node: SetAccessorDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: PropertyName,
        parameters: ReadonlyArray<ParameterDeclaration>,
        body: Block?,
    ): SetAccessorDeclaration

    fun createCallSignature(
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): CallSignatureDeclaration

    fun updateCallSignature(
        node: CallSignatureDeclaration,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode?,
    ): CallSignatureDeclaration

    fun createConstructSignature(
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): ConstructSignatureDeclaration

    fun updateConstructSignature(
        node: ConstructSignatureDeclaration,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode?,
    ): ConstructSignatureDeclaration

    fun createIndexSignature(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode,
    ): IndexSignatureDeclaration

    fun updateIndexSignature(
        node: IndexSignatureDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode,
    ): IndexSignatureDeclaration

    fun createTemplateLiteralTypeSpan(
        type: TypeNode,
        literal: dynamic, /* TemplateMiddle | TemplateTail */
    ): TemplateLiteralTypeSpan

    fun updateTemplateLiteralTypeSpan(
        node: TemplateLiteralTypeSpan,
        type: TypeNode,
        literal: dynamic, /* TemplateMiddle | TemplateTail */
    ): TemplateLiteralTypeSpan

    fun createClassStaticBlockDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        body: Block,
    ): ClassStaticBlockDeclaration

    fun updateClassStaticBlockDeclaration(
        node: ClassStaticBlockDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        body: Block,
    ): ClassStaticBlockDeclaration

    fun <TKind : KeywordTypeSyntaxKind> createKeywordTypeNode(kind: TKind): KeywordTypeNode<TKind>
    fun createTypePredicateNode(
        assertsModifier: AssertsKeyword?,
        parameterName: dynamic, /* Identifier | ThisTypeNode | string */
        type: TypeNode?,
    ): TypePredicateNode

    fun updateTypePredicateNode(
        node: TypePredicateNode,
        assertsModifier: AssertsKeyword?,
        parameterName: dynamic, /* Identifier | ThisTypeNode */
        type: TypeNode?,
    ): TypePredicateNode

    fun createTypeReferenceNode(
        typeName: dynamic, /* string | EntityName */
        typeArguments: ReadonlyArray<TypeNode> = definedExternally,
    ): TypeReferenceNode

    fun updateTypeReferenceNode(
        node: TypeReferenceNode,
        typeName: EntityName,
        typeArguments: NodeArray<TypeNode>?,
    ): TypeReferenceNode

    fun createFunctionTypeNode(
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode,
    ): FunctionTypeNode

    fun updateFunctionTypeNode(
        node: FunctionTypeNode,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode,
    ): FunctionTypeNode

    fun createConstructorTypeNode(
        modifiers: ReadonlyArray<Modifier>?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode,
    ): ConstructorTypeNode

    /** @deprecated */
    fun createConstructorTypeNode(
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode,
    ): ConstructorTypeNode

    fun updateConstructorTypeNode(
        node: ConstructorTypeNode,
        modifiers: ReadonlyArray<Modifier>?,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode,
    ): ConstructorTypeNode

    /** @deprecated */
    fun updateConstructorTypeNode(
        node: ConstructorTypeNode,
        typeParameters: NodeArray<TypeParameterDeclaration>?,
        parameters: NodeArray<ParameterDeclaration>,
        type: TypeNode,
    ): ConstructorTypeNode

    fun createTypeQueryNode(exprName: EntityName): TypeQueryNode
    fun updateTypeQueryNode(
        node: TypeQueryNode,
        exprName: EntityName,
    ): TypeQueryNode

    fun createTypeLiteralNode(members: ReadonlyArray<TypeElement>?): TypeLiteralNode
    fun updateTypeLiteralNode(
        node: TypeLiteralNode,
        members: NodeArray<TypeElement>,
    ): TypeLiteralNode

    fun createArrayTypeNode(elementType: TypeNode): ArrayTypeNode
    fun updateArrayTypeNode(
        node: ArrayTypeNode,
        elementType: TypeNode,
    ): ArrayTypeNode

    fun createTupleTypeNode(elements: dynamic /* (TypeNode | NamedTupleMember)[] */): TupleTypeNode
    fun updateTupleTypeNode(
        node: TupleTypeNode,
        elements: dynamic, /* (TypeNode | NamedTupleMember)[] */
    ): TupleTypeNode

    fun createNamedTupleMember(
        dotDotDotToken: DotDotDotToken?,
        name: Identifier,
        questionToken: QuestionToken?,
        type: TypeNode,
    ): NamedTupleMember

    fun updateNamedTupleMember(
        node: NamedTupleMember,
        dotDotDotToken: DotDotDotToken?,
        name: Identifier,
        questionToken: QuestionToken?,
        type: TypeNode,
    ): NamedTupleMember

    fun createOptionalTypeNode(type: TypeNode): OptionalTypeNode
    fun updateOptionalTypeNode(
        node: OptionalTypeNode,
        type: TypeNode,
    ): OptionalTypeNode

    fun createRestTypeNode(type: TypeNode): RestTypeNode
    fun updateRestTypeNode(
        node: RestTypeNode,
        type: TypeNode,
    ): RestTypeNode

    fun createUnionTypeNode(types: ReadonlyArray<TypeNode>): UnionTypeNode
    fun updateUnionTypeNode(
        node: UnionTypeNode,
        types: NodeArray<TypeNode>,
    ): UnionTypeNode

    fun createIntersectionTypeNode(types: ReadonlyArray<TypeNode>): IntersectionTypeNode
    fun updateIntersectionTypeNode(
        node: IntersectionTypeNode,
        types: NodeArray<TypeNode>,
    ): IntersectionTypeNode

    fun createConditionalTypeNode(
        checkType: TypeNode,
        extendsType: TypeNode,
        trueType: TypeNode,
        falseType: TypeNode,
    ): ConditionalTypeNode

    fun updateConditionalTypeNode(
        node: ConditionalTypeNode,
        checkType: TypeNode,
        extendsType: TypeNode,
        trueType: TypeNode,
        falseType: TypeNode,
    ): ConditionalTypeNode

    fun createInferTypeNode(typeParameter: TypeParameterDeclaration): InferTypeNode
    fun updateInferTypeNode(
        node: InferTypeNode,
        typeParameter: TypeParameterDeclaration,
    ): InferTypeNode

    fun createImportTypeNode(
        argument: TypeNode,
        qualifier: EntityName = definedExternally,
        typeArguments: ReadonlyArray<TypeNode> = definedExternally,
        isTypeOf: Boolean = definedExternally,
    ): ImportTypeNode

    fun updateImportTypeNode(
        node: ImportTypeNode,
        argument: TypeNode,
        qualifier: EntityName?,
        typeArguments: ReadonlyArray<TypeNode>?,
        isTypeOf: Boolean = definedExternally,
    ): ImportTypeNode

    fun createParenthesizedType(type: TypeNode): ParenthesizedTypeNode
    fun updateParenthesizedType(
        node: ParenthesizedTypeNode,
        type: TypeNode,
    ): ParenthesizedTypeNode

    fun createThisTypeNode(): ThisTypeNode
    fun createTypeOperatorNode(
        operator: dynamic, /* SyntaxKind.KeyOfKeyword | SyntaxKind.UniqueKeyword | SyntaxKind.ReadonlyKeyword */
        type: TypeNode,
    ): TypeOperatorNode

    fun updateTypeOperatorNode(
        node: TypeOperatorNode,
        type: TypeNode,
    ): TypeOperatorNode

    fun createIndexedAccessTypeNode(
        objectType: TypeNode,
        indexType: TypeNode,
    ): IndexedAccessTypeNode

    fun updateIndexedAccessTypeNode(
        node: IndexedAccessTypeNode,
        objectType: TypeNode,
        indexType: TypeNode,
    ): IndexedAccessTypeNode

    fun createMappedTypeNode(
        readonlyToken: dynamic, /* ReadonlyKeyword | PlusToken | MinusToken */
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: dynamic, /* QuestionToken | PlusToken | MinusToken */
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun updateMappedTypeNode(
        node: MappedTypeNode,
        readonlyToken: dynamic, /* ReadonlyKeyword | PlusToken | MinusToken */
        typeParameter: TypeParameterDeclaration,
        nameType: TypeNode?,
        questionToken: dynamic, /* QuestionToken | PlusToken | MinusToken */
        type: TypeNode?,
        members: NodeArray<TypeElement>?,
    ): MappedTypeNode

    fun createLiteralTypeNode(literal: dynamic /* LiteralTypeNode["literal"] */): LiteralTypeNode
    fun updateLiteralTypeNode(
        node: LiteralTypeNode,
        literal: dynamic, /* LiteralTypeNode["literal"] */
    ): LiteralTypeNode

    fun createTemplateLiteralType(
        head: TemplateHead,
        templateSpans: ReadonlyArray<TemplateLiteralTypeSpan>,
    ): TemplateLiteralTypeNode

    fun updateTemplateLiteralType(
        node: TemplateLiteralTypeNode,
        head: TemplateHead,
        templateSpans: ReadonlyArray<TemplateLiteralTypeSpan>,
    ): TemplateLiteralTypeNode

    fun createObjectBindingPattern(elements: ReadonlyArray<BindingElement>): ObjectBindingPattern
    fun updateObjectBindingPattern(
        node: ObjectBindingPattern,
        elements: ReadonlyArray<BindingElement>,
    ): ObjectBindingPattern

    fun createArrayBindingPattern(elements: ReadonlyArray<ArrayBindingElement>): ArrayBindingPattern
    fun updateArrayBindingPattern(
        node: ArrayBindingPattern,
        elements: ReadonlyArray<ArrayBindingElement>,
    ): ArrayBindingPattern

    fun createBindingElement(
        dotDotDotToken: DotDotDotToken?,
        propertyName: dynamic, /* string | PropertyName */
        name: dynamic, /* string | BindingName */
        initializer: Expression = definedExternally,
    ): BindingElement

    fun updateBindingElement(
        node: BindingElement,
        dotDotDotToken: DotDotDotToken?,
        propertyName: PropertyName?,
        name: BindingName,
        initializer: Expression?,
    ): BindingElement

    fun createArrayLiteralExpression(
        elements: ReadonlyArray<Expression> = definedExternally,
        multiLine: Boolean = definedExternally,
    ): ArrayLiteralExpression

    fun updateArrayLiteralExpression(
        node: ArrayLiteralExpression,
        elements: ReadonlyArray<Expression>,
    ): ArrayLiteralExpression

    fun createObjectLiteralExpression(
        properties: ReadonlyArray<ObjectLiteralElementLike> = definedExternally,
        multiLine: Boolean = definedExternally,
    ): ObjectLiteralExpression

    fun updateObjectLiteralExpression(
        node: ObjectLiteralExpression,
        properties: ReadonlyArray<ObjectLiteralElementLike>,
    ): ObjectLiteralExpression

    fun createPropertyAccessExpression(
        expression: Expression,
        name: dynamic, /* string | MemberName */
    ): PropertyAccessExpression

    fun updatePropertyAccessExpression(
        node: PropertyAccessExpression,
        expression: Expression,
        name: MemberName,
    ): PropertyAccessExpression

    fun createPropertyAccessChain(
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        name: dynamic, /* string | MemberName */
    ): PropertyAccessChain

    fun updatePropertyAccessChain(
        node: PropertyAccessChain,
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        name: MemberName,
    ): PropertyAccessChain

    fun createElementAccessExpression(
        expression: Expression,
        index: dynamic, /* number | Expression */
    ): ElementAccessExpression

    fun updateElementAccessExpression(
        node: ElementAccessExpression,
        expression: Expression,
        argumentExpression: Expression,
    ): ElementAccessExpression

    fun createElementAccessChain(
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        index: dynamic, /* number | Expression */
    ): ElementAccessChain

    fun updateElementAccessChain(
        node: ElementAccessChain,
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        argumentExpression: Expression,
    ): ElementAccessChain

    fun createCallExpression(
        expression: Expression,
        typeArguments: ReadonlyArray<TypeNode>?,
        argumentsArray: ReadonlyArray<Expression>?,
    ): CallExpression

    fun updateCallExpression(
        node: CallExpression,
        expression: Expression,
        typeArguments: ReadonlyArray<TypeNode>?,
        argumentsArray: ReadonlyArray<Expression>,
    ): CallExpression

    fun createCallChain(
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        typeArguments: ReadonlyArray<TypeNode>?,
        argumentsArray: ReadonlyArray<Expression>?,
    ): CallChain

    fun updateCallChain(
        node: CallChain,
        expression: Expression,
        questionDotToken: QuestionDotToken?,
        typeArguments: ReadonlyArray<TypeNode>?,
        argumentsArray: ReadonlyArray<Expression>,
    ): CallChain

    fun createNewExpression(
        expression: Expression,
        typeArguments: ReadonlyArray<TypeNode>?,
        argumentsArray: ReadonlyArray<Expression>?,
    ): NewExpression

    fun updateNewExpression(
        node: NewExpression,
        expression: Expression,
        typeArguments: ReadonlyArray<TypeNode>?,
        argumentsArray: ReadonlyArray<Expression>?,
    ): NewExpression

    fun createTaggedTemplateExpression(
        tag: Expression,
        typeArguments: ReadonlyArray<TypeNode>?,
        template: TemplateLiteral,
    ): TaggedTemplateExpression

    fun updateTaggedTemplateExpression(
        node: TaggedTemplateExpression,
        tag: Expression,
        typeArguments: ReadonlyArray<TypeNode>?,
        template: TemplateLiteral,
    ): TaggedTemplateExpression

    fun createTypeAssertion(
        type: TypeNode,
        expression: Expression,
    ): TypeAssertion

    fun updateTypeAssertion(
        node: TypeAssertion,
        type: TypeNode,
        expression: Expression,
    ): TypeAssertion

    fun createParenthesizedExpression(expression: Expression): ParenthesizedExpression
    fun updateParenthesizedExpression(
        node: ParenthesizedExpression,
        expression: Expression,
    ): ParenthesizedExpression

    fun createFunctionExpression(
        modifiers: ReadonlyArray<Modifier>?,
        asteriskToken: AsteriskToken?,
        name: dynamic, /* string | Identifier */
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>?,
        type: TypeNode?,
        body: Block,
    ): FunctionExpression

    fun updateFunctionExpression(
        node: FunctionExpression,
        modifiers: ReadonlyArray<Modifier>?,
        asteriskToken: AsteriskToken?,
        name: Identifier?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block,
    ): FunctionExpression

    fun createArrowFunction(
        modifiers: ReadonlyArray<Modifier>?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        equalsGreaterThanToken: EqualsGreaterThanToken?,
        body: ConciseBody,
    ): ArrowFunction

    fun updateArrowFunction(
        node: ArrowFunction,
        modifiers: ReadonlyArray<Modifier>?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        equalsGreaterThanToken: EqualsGreaterThanToken,
        body: ConciseBody,
    ): ArrowFunction

    fun createDeleteExpression(expression: Expression): DeleteExpression
    fun updateDeleteExpression(
        node: DeleteExpression,
        expression: Expression,
    ): DeleteExpression

    fun createTypeOfExpression(expression: Expression): TypeOfExpression
    fun updateTypeOfExpression(
        node: TypeOfExpression,
        expression: Expression,
    ): TypeOfExpression

    fun createVoidExpression(expression: Expression): VoidExpression
    fun updateVoidExpression(
        node: VoidExpression,
        expression: Expression,
    ): VoidExpression

    fun createAwaitExpression(expression: Expression): AwaitExpression
    fun updateAwaitExpression(
        node: AwaitExpression,
        expression: Expression,
    ): AwaitExpression

    fun createPrefixUnaryExpression(
        operator: PrefixUnaryOperator,
        operand: Expression,
    ): PrefixUnaryExpression

    fun updatePrefixUnaryExpression(
        node: PrefixUnaryExpression,
        operand: Expression,
    ): PrefixUnaryExpression

    fun createPostfixUnaryExpression(
        operand: Expression,
        operator: PostfixUnaryOperator,
    ): PostfixUnaryExpression

    fun updatePostfixUnaryExpression(
        node: PostfixUnaryExpression,
        operand: Expression,
    ): PostfixUnaryExpression

    fun createBinaryExpression(
        left: Expression,
        operator: dynamic, /* BinaryOperator | BinaryOperatorToken */
        right: Expression,
    ): BinaryExpression

    fun updateBinaryExpression(
        node: BinaryExpression,
        left: Expression,
        operator: dynamic, /* BinaryOperator | BinaryOperatorToken */
        right: Expression,
    ): BinaryExpression

    fun createConditionalExpression(
        condition: Expression,
        questionToken: QuestionToken?,
        whenTrue: Expression,
        colonToken: ColonToken?,
        whenFalse: Expression,
    ): ConditionalExpression

    fun updateConditionalExpression(
        node: ConditionalExpression,
        condition: Expression,
        questionToken: QuestionToken,
        whenTrue: Expression,
        colonToken: ColonToken,
        whenFalse: Expression,
    ): ConditionalExpression

    fun createTemplateExpression(
        head: TemplateHead,
        templateSpans: ReadonlyArray<TemplateSpan>,
    ): TemplateExpression

    fun updateTemplateExpression(
        node: TemplateExpression,
        head: TemplateHead,
        templateSpans: ReadonlyArray<TemplateSpan>,
    ): TemplateExpression

    fun createTemplateHead(
        text: String,
        rawText: String = definedExternally,
        templateFlags: TokenFlags = definedExternally,
    ): TemplateHead

    fun createTemplateHead(
        text: String?,
        rawText: String,
        templateFlags: TokenFlags = definedExternally,
    ): TemplateHead

    fun createTemplateMiddle(
        text: String,
        rawText: String = definedExternally,
        templateFlags: TokenFlags = definedExternally,
    ): TemplateMiddle

    fun createTemplateMiddle(
        text: String?,
        rawText: String,
        templateFlags: TokenFlags = definedExternally,
    ): TemplateMiddle

    fun createTemplateTail(
        text: String,
        rawText: String = definedExternally,
        templateFlags: TokenFlags = definedExternally,
    ): TemplateTail

    fun createTemplateTail(
        text: String?,
        rawText: String,
        templateFlags: TokenFlags = definedExternally,
    ): TemplateTail

    fun createNoSubstitutionTemplateLiteral(
        text: String,
        rawText: String = definedExternally,
    ): NoSubstitutionTemplateLiteral

    fun createNoSubstitutionTemplateLiteral(
        text: String?,
        rawText: String,
    ): NoSubstitutionTemplateLiteral

    fun createYieldExpression(
        asteriskToken: AsteriskToken,
        expression: Expression,
    ): YieldExpression

    fun createYieldExpression(
        asteriskToken: Nothing?,
        expression: Expression?,
    ): YieldExpression

    fun updateYieldExpression(
        node: YieldExpression,
        asteriskToken: AsteriskToken?,
        expression: Expression?,
    ): YieldExpression

    fun createSpreadElement(expression: Expression): SpreadElement
    fun updateSpreadElement(
        node: SpreadElement,
        expression: Expression,
    ): SpreadElement

    fun createClassExpression(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* string | Identifier */
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        heritageClauses: ReadonlyArray<HeritageClause>?,
        members: ReadonlyArray<ClassElement>,
    ): ClassExpression

    fun updateClassExpression(
        node: ClassExpression,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: Identifier?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        heritageClauses: ReadonlyArray<HeritageClause>?,
        members: ReadonlyArray<ClassElement>,
    ): ClassExpression

    fun createOmittedExpression(): OmittedExpression
    fun createExpressionWithTypeArguments(
        expression: Expression,
        typeArguments: ReadonlyArray<TypeNode>?,
    ): ExpressionWithTypeArguments

    fun updateExpressionWithTypeArguments(
        node: ExpressionWithTypeArguments,
        expression: Expression,
        typeArguments: ReadonlyArray<TypeNode>?,
    ): ExpressionWithTypeArguments

    fun createAsExpression(
        expression: Expression,
        type: TypeNode,
    ): AsExpression

    fun updateAsExpression(
        node: AsExpression,
        expression: Expression,
        type: TypeNode,
    ): AsExpression

    fun createNonNullExpression(expression: Expression): NonNullExpression
    fun updateNonNullExpression(
        node: NonNullExpression,
        expression: Expression,
    ): NonNullExpression

    fun createNonNullChain(expression: Expression): NonNullChain
    fun updateNonNullChain(
        node: NonNullChain,
        expression: Expression,
    ): NonNullChain

    fun createMetaProperty(
        keywordToken: dynamic, /* MetaProperty["keywordToken"] */
        name: Identifier,
    ): MetaProperty

    fun updateMetaProperty(
        node: MetaProperty,
        name: Identifier,
    ): MetaProperty

    fun createTemplateSpan(
        expression: Expression,
        literal: dynamic, /* TemplateMiddle | TemplateTail */
    ): TemplateSpan

    fun updateTemplateSpan(
        node: TemplateSpan,
        expression: Expression,
        literal: dynamic, /* TemplateMiddle | TemplateTail */
    ): TemplateSpan

    fun createSemicolonClassElement(): SemicolonClassElement
    fun createBlock(
        statements: ReadonlyArray<Statement>,
        multiLine: Boolean = definedExternally,
    ): Block

    fun updateBlock(
        node: Block,
        statements: ReadonlyArray<Statement>,
    ): Block

    fun createVariableStatement(
        modifiers: ReadonlyArray<Modifier>?,
        declarationList: dynamic, /* VariableDeclarationList | readonly VariableDeclaration[] */
    ): VariableStatement

    fun updateVariableStatement(
        node: VariableStatement,
        modifiers: ReadonlyArray<Modifier>?,
        declarationList: VariableDeclarationList,
    ): VariableStatement

    fun createEmptyStatement(): EmptyStatement
    fun createExpressionStatement(expression: Expression): ExpressionStatement
    fun updateExpressionStatement(
        node: ExpressionStatement,
        expression: Expression,
    ): ExpressionStatement

    fun createIfStatement(
        expression: Expression,
        thenStatement: Statement,
        elseStatement: Statement = definedExternally,
    ): IfStatement

    fun updateIfStatement(
        node: IfStatement,
        expression: Expression,
        thenStatement: Statement,
        elseStatement: Statement?,
    ): IfStatement

    fun createDoStatement(
        statement: Statement,
        expression: Expression,
    ): DoStatement

    fun updateDoStatement(
        node: DoStatement,
        statement: Statement,
        expression: Expression,
    ): DoStatement

    fun createWhileStatement(
        expression: Expression,
        statement: Statement,
    ): WhileStatement

    fun updateWhileStatement(
        node: WhileStatement,
        expression: Expression,
        statement: Statement,
    ): WhileStatement

    fun createForStatement(
        initializer: ForInitializer?,
        condition: Expression?,
        incrementor: Expression?,
        statement: Statement,
    ): ForStatement

    fun updateForStatement(
        node: ForStatement,
        initializer: ForInitializer?,
        condition: Expression?,
        incrementor: Expression?,
        statement: Statement,
    ): ForStatement

    fun createForInStatement(
        initializer: ForInitializer,
        expression: Expression,
        statement: Statement,
    ): ForInStatement

    fun updateForInStatement(
        node: ForInStatement,
        initializer: ForInitializer,
        expression: Expression,
        statement: Statement,
    ): ForInStatement

    fun createForOfStatement(
        awaitModifier: AwaitKeyword?,
        initializer: ForInitializer,
        expression: Expression,
        statement: Statement,
    ): ForOfStatement

    fun updateForOfStatement(
        node: ForOfStatement,
        awaitModifier: AwaitKeyword?,
        initializer: ForInitializer,
        expression: Expression,
        statement: Statement,
    ): ForOfStatement

    fun createContinueStatement(label: dynamic /* string | Identifier */ = definedExternally): ContinueStatement
    fun updateContinueStatement(
        node: ContinueStatement,
        label: Identifier?,
    ): ContinueStatement

    fun createBreakStatement(label: dynamic /* string | Identifier */ = definedExternally): BreakStatement
    fun updateBreakStatement(
        node: BreakStatement,
        label: Identifier?,
    ): BreakStatement

    fun createReturnStatement(expression: Expression = definedExternally): ReturnStatement
    fun updateReturnStatement(
        node: ReturnStatement,
        expression: Expression?,
    ): ReturnStatement

    fun createWithStatement(
        expression: Expression,
        statement: Statement,
    ): WithStatement

    fun updateWithStatement(
        node: WithStatement,
        expression: Expression,
        statement: Statement,
    ): WithStatement

    fun createSwitchStatement(
        expression: Expression,
        caseBlock: CaseBlock,
    ): SwitchStatement

    fun updateSwitchStatement(
        node: SwitchStatement,
        expression: Expression,
        caseBlock: CaseBlock,
    ): SwitchStatement

    fun createLabeledStatement(
        label: dynamic, /* string | Identifier */
        statement: Statement,
    ): LabeledStatement

    fun updateLabeledStatement(
        node: LabeledStatement,
        label: Identifier,
        statement: Statement,
    ): LabeledStatement

    fun createThrowStatement(expression: Expression): ThrowStatement
    fun updateThrowStatement(
        node: ThrowStatement,
        expression: Expression,
    ): ThrowStatement

    fun createTryStatement(
        tryBlock: Block,
        catchClause: CatchClause?,
        finallyBlock: Block?,
    ): TryStatement

    fun updateTryStatement(
        node: TryStatement,
        tryBlock: Block,
        catchClause: CatchClause?,
        finallyBlock: Block?,
    ): TryStatement

    fun createDebuggerStatement(): DebuggerStatement
    fun createVariableDeclaration(
        name: dynamic, /* string | BindingName */
        exclamationToken: ExclamationToken = definedExternally,
        type: TypeNode = definedExternally,
        initializer: Expression = definedExternally,
    ): VariableDeclaration

    fun updateVariableDeclaration(
        node: VariableDeclaration,
        name: BindingName,
        exclamationToken: ExclamationToken?,
        type: TypeNode?,
        initializer: Expression?,
    ): VariableDeclaration

    fun createVariableDeclarationList(
        declarations: ReadonlyArray<VariableDeclaration>,
        flags: NodeFlags = definedExternally,
    ): VariableDeclarationList

    fun updateVariableDeclarationList(
        node: VariableDeclarationList,
        declarations: ReadonlyArray<VariableDeclaration>,
    ): VariableDeclarationList

    fun createFunctionDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        asteriskToken: AsteriskToken?,
        name: dynamic, /* string | Identifier */
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): FunctionDeclaration

    fun updateFunctionDeclaration(
        node: FunctionDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        asteriskToken: AsteriskToken?,
        name: Identifier?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
        body: Block?,
    ): FunctionDeclaration

    fun createClassDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* string | Identifier */
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        heritageClauses: ReadonlyArray<HeritageClause>?,
        members: ReadonlyArray<ClassElement>,
    ): ClassDeclaration

    fun updateClassDeclaration(
        node: ClassDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: Identifier?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        heritageClauses: ReadonlyArray<HeritageClause>?,
        members: ReadonlyArray<ClassElement>,
    ): ClassDeclaration

    fun createInterfaceDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* string | Identifier */
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        heritageClauses: ReadonlyArray<HeritageClause>?,
        members: ReadonlyArray<TypeElement>,
    ): InterfaceDeclaration

    fun updateInterfaceDeclaration(
        node: InterfaceDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: Identifier,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        heritageClauses: ReadonlyArray<HeritageClause>?,
        members: ReadonlyArray<TypeElement>,
    ): InterfaceDeclaration

    fun createTypeAliasDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* string | Identifier */
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        type: TypeNode,
    ): TypeAliasDeclaration

    fun updateTypeAliasDeclaration(
        node: TypeAliasDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: Identifier,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>?,
        type: TypeNode,
    ): TypeAliasDeclaration

    fun createEnumDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: dynamic, /* string | Identifier */
        members: ReadonlyArray<EnumMember>,
    ): EnumDeclaration

    fun updateEnumDeclaration(
        node: EnumDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: Identifier,
        members: ReadonlyArray<EnumMember>,
    ): EnumDeclaration

    fun createModuleDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: ModuleName,
        body: ModuleBody?,
        flags: NodeFlags = definedExternally,
    ): ModuleDeclaration

    fun updateModuleDeclaration(
        node: ModuleDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        name: ModuleName,
        body: ModuleBody?,
    ): ModuleDeclaration

    fun createModuleBlock(statements: ReadonlyArray<Statement>): ModuleBlock
    fun updateModuleBlock(
        node: ModuleBlock,
        statements: ReadonlyArray<Statement>,
    ): ModuleBlock

    fun createCaseBlock(clauses: ReadonlyArray<CaseOrDefaultClause>): CaseBlock
    fun updateCaseBlock(
        node: CaseBlock,
        clauses: ReadonlyArray<CaseOrDefaultClause>,
    ): CaseBlock

    fun createNamespaceExportDeclaration(name: dynamic /* string | Identifier */): NamespaceExportDeclaration
    fun updateNamespaceExportDeclaration(
        node: NamespaceExportDeclaration,
        name: Identifier,
    ): NamespaceExportDeclaration

    fun createImportEqualsDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        isTypeOnly: Boolean,
        name: dynamic, /* string | Identifier */
        moduleReference: ModuleReference,
    ): ImportEqualsDeclaration

    fun updateImportEqualsDeclaration(
        node: ImportEqualsDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        isTypeOnly: Boolean,
        name: Identifier,
        moduleReference: ModuleReference,
    ): ImportEqualsDeclaration

    fun createImportDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        importClause: ImportClause?,
        moduleSpecifier: Expression,
        assertClause: AssertClause = definedExternally,
    ): ImportDeclaration

    fun updateImportDeclaration(
        node: ImportDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        importClause: ImportClause?,
        moduleSpecifier: Expression,
        assertClause: AssertClause?,
    ): ImportDeclaration

    fun createImportClause(
        isTypeOnly: Boolean,
        name: Identifier?,
        namedBindings: NamedImportBindings?,
    ): ImportClause

    fun updateImportClause(
        node: ImportClause,
        isTypeOnly: Boolean,
        name: Identifier?,
        namedBindings: NamedImportBindings?,
    ): ImportClause

    fun createAssertClause(
        elements: NodeArray<AssertEntry>,
        multiLine: Boolean = definedExternally,
    ): AssertClause

    fun updateAssertClause(
        node: AssertClause,
        elements: NodeArray<AssertEntry>,
        multiLine: Boolean = definedExternally,
    ): AssertClause

    fun createAssertEntry(
        name: AssertionKey,
        value: StringLiteral,
    ): AssertEntry

    fun updateAssertEntry(
        node: AssertEntry,
        name: AssertionKey,
        value: StringLiteral,
    ): AssertEntry

    fun createNamespaceImport(name: Identifier): NamespaceImport
    fun updateNamespaceImport(
        node: NamespaceImport,
        name: Identifier,
    ): NamespaceImport

    fun createNamespaceExport(name: Identifier): NamespaceExport
    fun updateNamespaceExport(
        node: NamespaceExport,
        name: Identifier,
    ): NamespaceExport

    fun createNamedImports(elements: ReadonlyArray<ImportSpecifier>): NamedImports
    fun updateNamedImports(
        node: NamedImports,
        elements: ReadonlyArray<ImportSpecifier>,
    ): NamedImports

    fun createImportSpecifier(
        isTypeOnly: Boolean,
        propertyName: Identifier?,
        name: Identifier,
    ): ImportSpecifier

    fun updateImportSpecifier(
        node: ImportSpecifier,
        isTypeOnly: Boolean,
        propertyName: Identifier?,
        name: Identifier,
    ): ImportSpecifier

    fun createExportAssignment(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        isExportEquals: Boolean?,
        expression: Expression,
    ): ExportAssignment

    fun updateExportAssignment(
        node: ExportAssignment,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        expression: Expression,
    ): ExportAssignment

    fun createExportDeclaration(
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        isTypeOnly: Boolean,
        exportClause: NamedExportBindings?,
        moduleSpecifier: Expression = definedExternally,
        assertClause: AssertClause = definedExternally,
    ): ExportDeclaration

    fun updateExportDeclaration(
        node: ExportDeclaration,
        decorators: ReadonlyArray<Decorator>?,
        modifiers: ReadonlyArray<Modifier>?,
        isTypeOnly: Boolean,
        exportClause: NamedExportBindings?,
        moduleSpecifier: Expression?,
        assertClause: AssertClause?,
    ): ExportDeclaration

    fun createNamedExports(elements: ReadonlyArray<ExportSpecifier>): NamedExports
    fun updateNamedExports(
        node: NamedExports,
        elements: ReadonlyArray<ExportSpecifier>,
    ): NamedExports

    fun createExportSpecifier(
        isTypeOnly: Boolean,
        propertyName: dynamic, /* string | Identifier */
        name: dynamic, /* string | Identifier */
    ): ExportSpecifier

    fun updateExportSpecifier(
        node: ExportSpecifier,
        isTypeOnly: Boolean,
        propertyName: Identifier?,
        name: Identifier,
    ): ExportSpecifier

    fun createExternalModuleReference(expression: Expression): ExternalModuleReference
    fun updateExternalModuleReference(
        node: ExternalModuleReference,
        expression: Expression,
    ): ExternalModuleReference

    fun createJSDocAllType(): JSDocAllType
    fun createJSDocUnknownType(): JSDocUnknownType
    fun createJSDocNonNullableType(type: TypeNode): JSDocNonNullableType
    fun updateJSDocNonNullableType(
        node: JSDocNonNullableType,
        type: TypeNode,
    ): JSDocNonNullableType

    fun createJSDocNullableType(type: TypeNode): JSDocNullableType
    fun updateJSDocNullableType(
        node: JSDocNullableType,
        type: TypeNode,
    ): JSDocNullableType

    fun createJSDocOptionalType(type: TypeNode): JSDocOptionalType
    fun updateJSDocOptionalType(
        node: JSDocOptionalType,
        type: TypeNode,
    ): JSDocOptionalType

    fun createJSDocFunctionType(
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): JSDocFunctionType

    fun updateJSDocFunctionType(
        node: JSDocFunctionType,
        parameters: ReadonlyArray<ParameterDeclaration>,
        type: TypeNode?,
    ): JSDocFunctionType

    fun createJSDocVariadicType(type: TypeNode): JSDocVariadicType
    fun updateJSDocVariadicType(
        node: JSDocVariadicType,
        type: TypeNode,
    ): JSDocVariadicType

    fun createJSDocNamepathType(type: TypeNode): JSDocNamepathType
    fun updateJSDocNamepathType(
        node: JSDocNamepathType,
        type: TypeNode,
    ): JSDocNamepathType

    fun createJSDocTypeExpression(type: TypeNode): JSDocTypeExpression
    fun updateJSDocTypeExpression(
        node: JSDocTypeExpression,
        type: TypeNode,
    ): JSDocTypeExpression

    fun createJSDocNameReference(name: dynamic /* EntityName | JSDocMemberName */): JSDocNameReference
    fun updateJSDocNameReference(
        node: JSDocNameReference,
        name: dynamic, /* EntityName | JSDocMemberName */
    ): JSDocNameReference

    fun createJSDocMemberName(
        left: dynamic, /* EntityName | JSDocMemberName */
        right: Identifier,
    ): JSDocMemberName

    fun updateJSDocMemberName(
        node: JSDocMemberName,
        left: dynamic, /* EntityName | JSDocMemberName */
        right: Identifier,
    ): JSDocMemberName

    fun createJSDocLink(
        name: dynamic, /* EntityName | JSDocMemberName */
        text: String,
    ): JSDocLink

    fun updateJSDocLink(
        node: JSDocLink,
        name: dynamic, /* EntityName | JSDocMemberName */
        text: String,
    ): JSDocLink

    fun createJSDocLinkCode(
        name: dynamic, /* EntityName | JSDocMemberName */
        text: String,
    ): JSDocLinkCode

    fun updateJSDocLinkCode(
        node: JSDocLinkCode,
        name: dynamic, /* EntityName | JSDocMemberName */
        text: String,
    ): JSDocLinkCode

    fun createJSDocLinkPlain(
        name: dynamic, /* EntityName | JSDocMemberName */
        text: String,
    ): JSDocLinkPlain

    fun updateJSDocLinkPlain(
        node: JSDocLinkPlain,
        name: dynamic, /* EntityName | JSDocMemberName */
        text: String,
    ): JSDocLinkPlain

    fun createJSDocTypeLiteral(
        jsDocPropertyTags: ReadonlyArray<JSDocPropertyLikeTag> = definedExternally,
        isArrayType: Boolean = definedExternally,
    ): JSDocTypeLiteral

    fun updateJSDocTypeLiteral(
        node: JSDocTypeLiteral,
        jsDocPropertyTags: ReadonlyArray<JSDocPropertyLikeTag>?,
        isArrayType: Boolean?,
    ): JSDocTypeLiteral

    fun createJSDocSignature(
        typeParameters: ReadonlyArray<JSDocTemplateTag>?,
        parameters: ReadonlyArray<JSDocParameterTag>,
        type: JSDocReturnTag = definedExternally,
    ): JSDocSignature

    fun updateJSDocSignature(
        node: JSDocSignature,
        typeParameters: ReadonlyArray<JSDocTemplateTag>?,
        parameters: ReadonlyArray<JSDocParameterTag>,
        type: JSDocReturnTag?,
    ): JSDocSignature

    fun createJSDocTemplateTag(
        tagName: Identifier?,
        constraint: JSDocTypeExpression?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocTemplateTag

    fun updateJSDocTemplateTag(
        node: JSDocTemplateTag,
        tagName: Identifier?,
        constraint: JSDocTypeExpression?,
        typeParameters: ReadonlyArray<TypeParameterDeclaration>,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocTemplateTag

    fun createJSDocTypedefTag(
        tagName: Identifier?,
        typeExpression: dynamic /* JSDocTypeExpression | JSDocTypeLiteral */ = definedExternally,
        fullName: dynamic /* Identifier | JSDocNamespaceDeclaration */ = definedExternally,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocTypedefTag

    fun updateJSDocTypedefTag(
        node: JSDocTypedefTag,
        tagName: Identifier?,
        typeExpression: dynamic, /* JSDocTypeExpression | JSDocTypeLiteral */
        fullName: dynamic, /* Identifier | JSDocNamespaceDeclaration */
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocTypedefTag

    fun createJSDocParameterTag(
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression = definedExternally,
        isNameFirst: Boolean = definedExternally,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocParameterTag

    fun updateJSDocParameterTag(
        node: JSDocParameterTag,
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression?,
        isNameFirst: Boolean,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocParameterTag

    fun createJSDocPropertyTag(
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression = definedExternally,
        isNameFirst: Boolean = definedExternally,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocPropertyTag

    fun updateJSDocPropertyTag(
        node: JSDocPropertyTag,
        tagName: Identifier?,
        name: EntityName,
        isBracketed: Boolean,
        typeExpression: JSDocTypeExpression?,
        isNameFirst: Boolean,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocPropertyTag

    fun createJSDocTypeTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocTypeTag

    fun updateJSDocTypeTag(
        node: JSDocTypeTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocTypeTag

    fun createJSDocSeeTag(
        tagName: Identifier?,
        nameExpression: JSDocNameReference?,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocSeeTag

    fun updateJSDocSeeTag(
        node: JSDocSeeTag,
        tagName: Identifier?,
        nameExpression: JSDocNameReference?,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocSeeTag

    fun createJSDocReturnTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression = definedExternally,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocReturnTag

    fun updateJSDocReturnTag(
        node: JSDocReturnTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocReturnTag

    fun createJSDocThisTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocThisTag

    fun updateJSDocThisTag(
        node: JSDocThisTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression?,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocThisTag

    fun createJSDocEnumTag(
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocEnumTag

    fun updateJSDocEnumTag(
        node: JSDocEnumTag,
        tagName: Identifier?,
        typeExpression: JSDocTypeExpression,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocEnumTag

    fun createJSDocCallbackTag(
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        fullName: dynamic /* Identifier | JSDocNamespaceDeclaration */ = definedExternally,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocCallbackTag

    fun updateJSDocCallbackTag(
        node: JSDocCallbackTag,
        tagName: Identifier?,
        typeExpression: JSDocSignature,
        fullName: dynamic, /* Identifier | JSDocNamespaceDeclaration */
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocCallbackTag

    fun createJSDocAugmentsTag(
        tagName: Identifier?,
        className: dynamic, /* JSDocAugmentsTag["class"] */
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocAugmentsTag

    fun updateJSDocAugmentsTag(
        node: JSDocAugmentsTag,
        tagName: Identifier?,
        className: dynamic, /* JSDocAugmentsTag["class"] */
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocAugmentsTag

    fun createJSDocImplementsTag(
        tagName: Identifier?,
        className: dynamic, /* JSDocImplementsTag["class"] */
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocImplementsTag

    fun updateJSDocImplementsTag(
        node: JSDocImplementsTag,
        tagName: Identifier?,
        className: dynamic, /* JSDocImplementsTag["class"] */
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocImplementsTag

    fun createJSDocAuthorTag(
        tagName: Identifier?,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocAuthorTag

    fun updateJSDocAuthorTag(
        node: JSDocAuthorTag,
        tagName: Identifier?,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocAuthorTag

    fun createJSDocClassTag(
        tagName: Identifier?,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocClassTag

    fun updateJSDocClassTag(
        node: JSDocClassTag,
        tagName: Identifier?,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocClassTag

    fun createJSDocPublicTag(
        tagName: Identifier?,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocPublicTag

    fun updateJSDocPublicTag(
        node: JSDocPublicTag,
        tagName: Identifier?,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocPublicTag

    fun createJSDocPrivateTag(
        tagName: Identifier?,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocPrivateTag

    fun updateJSDocPrivateTag(
        node: JSDocPrivateTag,
        tagName: Identifier?,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocPrivateTag

    fun createJSDocProtectedTag(
        tagName: Identifier?,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocProtectedTag

    fun updateJSDocProtectedTag(
        node: JSDocProtectedTag,
        tagName: Identifier?,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocProtectedTag

    fun createJSDocReadonlyTag(
        tagName: Identifier?,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocReadonlyTag

    fun updateJSDocReadonlyTag(
        node: JSDocReadonlyTag,
        tagName: Identifier?,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocReadonlyTag

    fun createJSDocUnknownTag(
        tagName: Identifier,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocUnknownTag

    fun updateJSDocUnknownTag(
        node: JSDocUnknownTag,
        tagName: Identifier,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
    ): JSDocUnknownTag

    fun createJSDocDeprecatedTag(
        tagName: Identifier,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocDeprecatedTag

    fun updateJSDocDeprecatedTag(
        node: JSDocDeprecatedTag,
        tagName: Identifier,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocDeprecatedTag

    fun createJSDocOverrideTag(
        tagName: Identifier,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocOverrideTag

    fun updateJSDocOverrideTag(
        node: JSDocOverrideTag,
        tagName: Identifier,
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
    ): JSDocOverrideTag

    fun createJSDocText(text: String): JSDocText
    fun updateJSDocText(
        node: JSDocText,
        text: String,
    ): JSDocText

    fun createJSDocComment(
        comment: dynamic /* string | NodeArray<JSDocComment> */ = definedExternally,
        tags: ReadonlyArray<JSDocTag>? = definedExternally,
    ): JSDoc

    fun updateJSDocComment(
        node: JSDoc,
        comment: dynamic, /* string | NodeArray<JSDocComment> */
        tags: ReadonlyArray<JSDocTag>?,
    ): JSDoc

    fun createJsxElement(
        openingElement: JsxOpeningElement,
        children: ReadonlyArray<JsxChild>,
        closingElement: JsxClosingElement,
    ): JsxElement

    fun updateJsxElement(
        node: JsxElement,
        openingElement: JsxOpeningElement,
        children: ReadonlyArray<JsxChild>,
        closingElement: JsxClosingElement,
    ): JsxElement

    fun createJsxSelfClosingElement(
        tagName: JsxTagNameExpression,
        typeArguments: ReadonlyArray<TypeNode>?,
        attributes: JsxAttributes,
    ): JsxSelfClosingElement

    fun updateJsxSelfClosingElement(
        node: JsxSelfClosingElement,
        tagName: JsxTagNameExpression,
        typeArguments: ReadonlyArray<TypeNode>?,
        attributes: JsxAttributes,
    ): JsxSelfClosingElement

    fun createJsxOpeningElement(
        tagName: JsxTagNameExpression,
        typeArguments: ReadonlyArray<TypeNode>?,
        attributes: JsxAttributes,
    ): JsxOpeningElement

    fun updateJsxOpeningElement(
        node: JsxOpeningElement,
        tagName: JsxTagNameExpression,
        typeArguments: ReadonlyArray<TypeNode>?,
        attributes: JsxAttributes,
    ): JsxOpeningElement

    fun createJsxClosingElement(tagName: JsxTagNameExpression): JsxClosingElement
    fun updateJsxClosingElement(
        node: JsxClosingElement,
        tagName: JsxTagNameExpression,
    ): JsxClosingElement

    fun createJsxFragment(
        openingFragment: JsxOpeningFragment,
        children: ReadonlyArray<JsxChild>,
        closingFragment: JsxClosingFragment,
    ): JsxFragment

    fun createJsxText(
        text: String,
        containsOnlyTriviaWhiteSpaces: Boolean = definedExternally,
    ): JsxText

    fun updateJsxText(
        node: JsxText,
        text: String,
        containsOnlyTriviaWhiteSpaces: Boolean = definedExternally,
    ): JsxText

    fun createJsxOpeningFragment(): JsxOpeningFragment
    fun createJsxJsxClosingFragment(): JsxClosingFragment
    fun updateJsxFragment(
        node: JsxFragment,
        openingFragment: JsxOpeningFragment,
        children: ReadonlyArray<JsxChild>,
        closingFragment: JsxClosingFragment,
    ): JsxFragment

    fun createJsxAttribute(
        name: Identifier,
        initializer: dynamic, /* StringLiteral | JsxExpression */
    ): JsxAttribute

    fun updateJsxAttribute(
        node: JsxAttribute,
        name: Identifier,
        initializer: dynamic, /* StringLiteral | JsxExpression */
    ): JsxAttribute

    fun createJsxAttributes(properties: ReadonlyArray<JsxAttributeLike>): JsxAttributes
    fun updateJsxAttributes(
        node: JsxAttributes,
        properties: ReadonlyArray<JsxAttributeLike>,
    ): JsxAttributes

    fun createJsxSpreadAttribute(expression: Expression): JsxSpreadAttribute
    fun updateJsxSpreadAttribute(
        node: JsxSpreadAttribute,
        expression: Expression,
    ): JsxSpreadAttribute

    fun createJsxExpression(
        dotDotDotToken: DotDotDotToken?,
        expression: Expression?,
    ): JsxExpression

    fun updateJsxExpression(
        node: JsxExpression,
        expression: Expression?,
    ): JsxExpression

    fun createCaseClause(
        expression: Expression,
        statements: ReadonlyArray<Statement>,
    ): CaseClause

    fun updateCaseClause(
        node: CaseClause,
        expression: Expression,
        statements: ReadonlyArray<Statement>,
    ): CaseClause

    fun createDefaultClause(statements: ReadonlyArray<Statement>): DefaultClause
    fun updateDefaultClause(
        node: DefaultClause,
        statements: ReadonlyArray<Statement>,
    ): DefaultClause

    fun createHeritageClause(
        token: dynamic, /* HeritageClause["token"] */
        types: ReadonlyArray<ExpressionWithTypeArguments>,
    ): HeritageClause

    fun updateHeritageClause(
        node: HeritageClause,
        types: ReadonlyArray<ExpressionWithTypeArguments>,
    ): HeritageClause

    fun createCatchClause(
        variableDeclaration: dynamic, /* string | BindingName | VariableDeclaration */
        block: Block,
    ): CatchClause

    fun updateCatchClause(
        node: CatchClause,
        variableDeclaration: VariableDeclaration?,
        block: Block,
    ): CatchClause

    fun createPropertyAssignment(
        name: dynamic, /* string | PropertyName */
        initializer: Expression,
    ): PropertyAssignment

    fun updatePropertyAssignment(
        node: PropertyAssignment,
        name: PropertyName,
        initializer: Expression,
    ): PropertyAssignment

    fun createShorthandPropertyAssignment(
        name: dynamic, /* string | Identifier */
        objectAssignmentInitializer: Expression = definedExternally,
    ): ShorthandPropertyAssignment

    fun updateShorthandPropertyAssignment(
        node: ShorthandPropertyAssignment,
        name: Identifier,
        objectAssignmentInitializer: Expression?,
    ): ShorthandPropertyAssignment

    fun createSpreadAssignment(expression: Expression): SpreadAssignment
    fun updateSpreadAssignment(
        node: SpreadAssignment,
        expression: Expression,
    ): SpreadAssignment

    fun createEnumMember(
        name: dynamic, /* string | PropertyName */
        initializer: Expression = definedExternally,
    ): EnumMember

    fun updateEnumMember(
        node: EnumMember,
        name: PropertyName,
        initializer: Expression?,
    ): EnumMember

    fun createSourceFile(
        statements: ReadonlyArray<Statement>,
        endOfFileToken: EndOfFileToken,
        flags: NodeFlags,
    ): SourceFile

    fun updateSourceFile(
        node: SourceFile,
        statements: ReadonlyArray<Statement>,
        isDeclarationFile: Boolean = definedExternally,
        referencedFiles: ReadonlyArray<FileReference> = definedExternally,
        typeReferences: ReadonlyArray<FileReference> = definedExternally,
        hasNoDefaultLib: Boolean = definedExternally,
        libReferences: ReadonlyArray<FileReference> = definedExternally,
    ): SourceFile

    fun createNotEmittedStatement(original: Node): NotEmittedStatement
    fun createPartiallyEmittedExpression(
        expression: Expression,
        original: Node = definedExternally,
    ): PartiallyEmittedExpression

    fun updatePartiallyEmittedExpression(
        node: PartiallyEmittedExpression,
        expression: Expression,
    ): PartiallyEmittedExpression

    fun createCommaListExpression(elements: ReadonlyArray<Expression>): CommaListExpression
    fun updateCommaListExpression(
        node: CommaListExpression,
        elements: ReadonlyArray<Expression>,
    ): CommaListExpression

    fun createBundle(
        sourceFiles: ReadonlyArray<SourceFile>,
        prepends: dynamic /* (UnparsedSource | InputFiles)[] */ = definedExternally,
    ): Bundle

    fun updateBundle(
        node: Bundle,
        sourceFiles: ReadonlyArray<SourceFile>,
        prepends: dynamic /* (UnparsedSource | InputFiles)[] */ = definedExternally,
    ): Bundle

    fun createComma(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createAssignment(
        left: dynamic, /* ObjectLiteralExpression | ArrayLiteralExpression */
        right: Expression,
    ): DestructuringAssignment

    fun createAssignment(
        left: Expression,
        right: Expression,
    ): AssignmentExpression<EqualsToken>

    fun createLogicalOr(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createLogicalAnd(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createBitwiseOr(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createBitwiseXor(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createBitwiseAnd(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createStrictEquality(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createStrictInequality(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createEquality(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createInequality(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createLessThan(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createLessThanEquals(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createGreaterThan(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createGreaterThanEquals(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createLeftShift(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createRightShift(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createUnsignedRightShift(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createAdd(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createSubtract(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createMultiply(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createDivide(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createModulo(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createExponent(
        left: Expression,
        right: Expression,
    ): BinaryExpression

    fun createPrefixPlus(operand: Expression): PrefixUnaryExpression
    fun createPrefixMinus(operand: Expression): PrefixUnaryExpression
    fun createPrefixIncrement(operand: Expression): PrefixUnaryExpression
    fun createPrefixDecrement(operand: Expression): PrefixUnaryExpression
    fun createBitwiseNot(operand: Expression): PrefixUnaryExpression
    fun createLogicalNot(operand: Expression): PrefixUnaryExpression
    fun createPostfixIncrement(operand: Expression): PostfixUnaryExpression
    fun createPostfixDecrement(operand: Expression): PostfixUnaryExpression
    fun createImmediatelyInvokedFunctionExpression(statements: ReadonlyArray<Statement>): CallExpression
    fun createImmediatelyInvokedFunctionExpression(
        statements: ReadonlyArray<Statement>,
        param: ParameterDeclaration,
        paramValue: Expression,
    ): CallExpression

    fun createImmediatelyInvokedArrowFunction(statements: ReadonlyArray<Statement>): CallExpression
    fun createImmediatelyInvokedArrowFunction(
        statements: ReadonlyArray<Statement>,
        param: ParameterDeclaration,
        paramValue: Expression,
    ): CallExpression

    fun createVoidZero(): VoidExpression
    fun createExportDefault(expression: Expression): ExportAssignment
    fun createExternalModuleExport(exportName: Identifier): ExportDeclaration
    fun restoreOuterExpressions(
        outerExpression: Expression?,
        innerExpression: Expression,
        kinds: OuterExpressionKinds = definedExternally,
    ): Expression
}
