package node.karakum

import io.github.sgrishchenko.karakum.configuration.*
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import io.github.sgrishchenko.karakum.util.ruleOf
import js.array.ReadonlyArray
import js.objects.recordOf
import node.karakum.annotations.*
import node.karakum.inheritanceModifiers.modifyClassInheritance
import node.karakum.inheritanceModifiers.modifyInterfaceInheritance
import node.karakum.inheritanceModifiers.modifyMethodInheritance
import node.karakum.inheritanceModifiers.modifyPropertyInheritance
import node.karakum.injections.*
import node.karakum.nameResolvers.*
import node.karakum.plugins.*

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            // __promisify__ functions are ignored,
            // and this plugin should be added before any other function plugin
            convertPromisifyFunctions,

            AmbiguousSignaturePlugin(),
            BufferPlugin(),
            ContractFunctionApiPlugin(),
            DiffieHellmanGroupPlugin(),
            EventEmitterPlugin(),
            GenerateKeyPairTypePlugin(),
            InspectorSessionMethodPlugin(),
            PromiseFunctionApiPlugin(),
            PromiseClassApiPlugin,
            PromiseInterfaceApiPlugin,
            ResourceRecordTypePlugin(),

            convertArgumentsTypeReferenceNode,
            convertAssertStrict,
            convertAssertStrictNames,
            convertBufferBlob,
            convertBufferReference,
            convertCallTrackerConflictingOverloads,
            convertCompareResultType,
            convertConflictingEntityNames,
            convertConflictingOverloads,
            convertDeprecated,
            convertDnsErrorCodes,
            convertDotTestReporterPayload,
            convertErrorTypeReferenceNode,
            convertEventEmitterListener,
            convertFunctionInheritance,
            convertGenericBuiltinModule,
            convertGetPeerCertificate,
            convertHttpTypeParameter,
            convertImplicitArrayBuffer,
            convertIncompatibleParameterName,
            convertInspectorQualifiedName,
            convertIterableIterator,
            convertKeyUnionReferences,
            convertKeyUnions,
            convertMock,
            convertMockTrackerGenerics,
            convertModuleQualifiedName,
            convertNodeJsQualifiedName,
            convertNumberParameter,
            convertNumbers,
            convertObjectParam,
            convertObjectTypeReferenceNode,
            convertOmittedTypeAlias,
            convertOverriddenFsOptionPropertySignature,
            convertOverriddenGcOptionPropertySignature,
            convertOverriddenMethodDeclaration,
            convertOverriddenPropertyDeclaration,
            convertOverriddenPropertySignature,
            convertParsedResults,
            convertPipelinePromise,
            convertPromiseResult,
            convertQuerystringAliases,
            convertReadableSymbol,
            convertReporterConstructorWrapperTypeParameter,
            convertSignalConstantsGenerics,
            convertSkippedGenerics,
            convertStatSyncFnHeritageClause,
            convertStreamDestroy,
            convertStreamOptionsTypeParameter,
            convertSymlinkType,
            convertTestContextHeritageClause,
            convertTestQualifiedName,
            convertTopLevelGlobals,
            convertToPrimitiveSymbolHolder,
            convertTypealiasParameterBounds,
            convertUndiciTypesReexport,
            convertURL,
            convertUtilityTypes,
            convertUtilTypeHelpers,
            convertWaitFor,
            convertWebCryptoQualifiedName,
            convertWebStreamsQualifiedName,
            convertWithImplicitCoercion,
        )
        injections = manyOf(
            DuplexMembersInjection(),
            EventInjection(),
            EventMapInjection(),
            FsStatsFsMembersInjection(),
            FsStatsMembersInjection(),
            ModuleInjection(),
            ReadableMembersInjection(),
            TracingChannelSubscribersInjection(),
            WritableMembersInjection(),

            injectAgentOptionsPort,
        )
        annotations = manyOf(
            ::annotateCompileFunctionResult,
            ::annotateConflictingEntityNames,
            ::annotateDefaultExports,
            ::annotateDuplex,
            ::annotateForceVarOverrides,
            ::annotateHttpsServer,
            ::annotateInterfaceWithSuperclass,
            ::annotateJsPlainObject,
            ::annotateUnusedTypealiasParameter,
        )
        nameResolvers = manyOf(
            ::resolveBufferConstantsName,
            ::resolveChildProcessOptionsName,
            ::resolveClassMethodParameterItemName,
            ::resolveClassPropertyItemName,
            ::resolveClassPropertyItemPropertyName,
            ::resolveFsOptionsName,
            ::resolveFunctionCallbackParameterName,
            ::resolveFunctionReturnTypeNullableUnionName,
            ::resolveFunctionReturnTypePromisePayloadName,
            ::resolveHttpStatusCodesName,
            ::resolveInterfaceMethodParameterItemName,
            ::resolveInterfaceMethodReturnTypePromisePayloadName,
            ::resolveInterfacePropertyIntersectionPropertyName,
            ::resolveInterfacePropertyItemName,
            ::resolveInterfacePropertyItemPropertyName,
            ::resolveInterfacePropertyNullableCallbackParameterName,
            ::resolveInterfacePropertyNullableUnionName,
            ::resolveInterfacePropertyNullableUnionNullableUnionName,
            ::resolveInterfacePropertyNullableUnionParameterItemName,
            ::resolveInterfacePropertyPropertyItemName,
            ::resolveInterfacePropertyPropertyItemPropertyItemName,
            ::resolveInterfacePropertyPropertyName,
            ::resolveMIMETypeInputName,
            ::resolveOsOptionsName,
            ::resolveMockTrackerMethodReturnTypeName,
            ::resolveParsedResultsPropertyName,
            ::resolvePerformanceObserverOptionsName,
            ::resolveV8OptionsName,
        )
        inheritanceModifiers = manyOf(
            ::modifyClassInheritance,
            ::modifyInterfaceInheritance,
            ::modifyMethodInheritance,
            ::modifyPropertyInheritance,
        )

        input = manyOf("**/*.d.ts")
        ignoreInput = manyOf(
            "**/ts*/**",
            "**/web-globals/**",
            "**/assert/strict.d.ts",
            "**/constants.d.ts",
            "**/compatibility/disposable.d.ts",
            "**/compatibility/indexable.d.ts",
            "**/compatibility/iterators.d.ts",
            "**/console.d.ts",
            "**/dom-events.d.ts",
            "**/domain.d.ts",
            "**/punycode.d.ts",
            "**/stream/web.d.ts",
            "**/string_decoder.d.ts",
            "**/timers.d.ts",
            "**/timers/promises.d.ts"
        )
        ignoreOutput = manyOf(
            "**/_Blob.kt",
            "**/_CloseEvent.kt",
            "**/_DOMException.kt",
            "**/_EventSource.kt",
            "**/_File.kt",
            "**/_FormData.kt",
            "**/_Headers.kt",
            "**/_MessageEvent.kt",
            "**/_Request.kt",
            "**/_RequestInit.kt",
            "**/_Response.kt",
            "**/_ResponseInit.kt",
            "**/_Storage.kt",
            "**/_WebSocket.kt",
            "**/ErrorConstructor.kt",
            "**/NodeDOMException.kt",
            "**/NodeDOMExceptionConstructor.kt",
            "**/Dict.kt",
            "**/ReadOnlyDict.kt",
            "**/PartialOptions.kt",
            "**/AbortController.kt",
            "**/AbortSignal.kt",
            "**/Array.kt",
            "**/ReadonlyArray.kt",
            "**/String.kt",
            "**/Iterator.kt",
            "**/AsyncIterator.kt",
            "**/structuredClone.kt",
            "**/ArrayBufferView.kt",
            "**/TypedArray.kt",
            "**/Uint8Array.kt",
            "**/Uint8ClampedArray.kt",
            "**/Uint16Array.kt",
            "**/Uint32Array.kt",
            "**/Int8Array.kt",
            "**/Int16Array.kt",
            "**/Int32Array.kt",
            "**/BigUint64Array.kt",
            "**/BigInt64Array.kt",
            "**/Float32Array.kt",
            "**/Float64Array.kt",
            "**/__promisify__.kt",
            "**/__promisify__*.kt",
            "**/CustomPromisifyLegacy.kt",
            "**/assert/Assert.kt",
            "**/assert/AssertStrict.kt",
            "**/assert/equal.kt",
            "**/assert/notEqual.kt",
            "**/assert/deepEqual.kt",
            "**/assert/notDeepEqual.kt",
            "**/assert/strict/CallTrackerReportInformation.kt",
            "**/assert/strict/CallTrackerCall.kt",
            "**/assert/strict/AssertPredicate.kt",
            "**/assert/strict/AssertionError.kt",
            "**/buffer/atob.kt",
            "**/buffer/btoa.kt",
            "**/buffer/__Blob.kt",
            "**/buffer/Blob.kt",
            "**/buffer/BlobOptions.kt",
            "**/buffer/BlobOptionsEndings.kt",
            "**/buffer/File.kt",
            "**/buffer/FileOptions.kt",
            "**/buffer/FileOptionsEndings.kt",
            // TS meta programming
            "**/buffer/WithImplicitCoercion.kt",
            "**/buffer/ImplicitArrayBuffer.kt",
            "**/childProcess/exec/**",
            "**/childProcess/execfile/**",
            "**/crypto/generatekeypair/**",
            "**/crypto/global/**",
            "**/crypto/webcrypto/**",
            "**/dns/lookupservice/**",
            "**/dns/resolve/**",
            "**/dns/Resolver.kt",
            "**/dns/getServersAsync.kt",
            "**/dns/getDefaultResultOrderAsync.kt",
            "**/dns/GetDefaultResultOrderResultAsync.kt",
            "**/dns/setDefaultResultOrderAsync.kt",
            "**/dns/SetDefaultResultOrderOrderAsync.kt",
            "**/dns/setServersAsync.kt",
            "**/events/global/**",
            "**/events/eventemitter/Abortable.kt",
            "**/events/_DOMEventTarget.kt",
            "**/events/_DOMEventTargetAddEventListenerOpts.kt",
            "**/events/_NodeEventTarget.kt",
            "**/events/AnyRest.kt",
            "**/events/Args.kt",
            "**/events/DefaultEventMap.kt",
            "**/events/EventMap.kt",
            "**/events/Key.kt",
            "**/events/Key2.kt",
            "**/events/Listener.kt",
            "**/events/Listener1.kt",
            "**/events/Listener2.kt",
            "**/globals/console.kt",
            "**/globals/global.kt",
            "**/globals/process.kt",
            "**/globals.typedarray/**",
            "**/http/WebSocket.kt",
            "**/http/CloseEvent.kt",
            "**/http/MessageEvent.kt",
            "**/module/NodeRequire.kt",
            "**/module/NodeModule.kt",
            "**/module/RequireResolve.legacy.kt",
            "**/module/Module.interface.kt",
            "**/module/__dirname.kt",
            "**/module/__filename.kt",
            "**/module/require.kt",
            "**/module/exports.kt",
            "**/module/module.val.kt",
            "**/path/namespace.kt",
            "**/path/PlatformPathDelimiter.kt",
            "**/path/PlatformPathSep.kt",
            "**/path/posix/**",
            "**/path/win32/**",
            "**/perfHooks/global/**",
            "**/process/global/namespace.kt",
            "**/querystring/decode.kt",
            "**/querystring/encode.kt",
            "**/readline/createInterface.kt",
            "**/stream/promises.kt",
            "**/stream/consumers/consumers.kt",
            "**/test/FunctionPropertyNames.kt",
            "**/url/global/**",
            "**/url/URL.kt",
            "**/url/URLSearchParams.kt",
            "**/url/URLSearchParamsIterator.kt",
            "**/util/global/**",
            "**/util/ApplyOptionalModifiers.kt",
            "**/util/ExtractOptionValue.kt",
            "**/util/IfDefaultsFalse.kt",
            "**/util/IfDefaultsTrue.kt",
            "**/util/ParsedOptionToken.kt",
            "**/util/ParsedPositionals.kt",
            "**/util/ParsedPositionalToken.kt",
            "**/util/ParsedValues.kt",
            "**/util/ParsedTokens.kt",
            "**/util/PreciseParsedResults.kt",
            "**/util/PreciseTokenForOptions.kt",
            "**/util/TokenForOptions.kt",
            "**/util/TextDecoder.kt",
            "**/util/TextDecoderDecodeOptions.kt",
            "**/util/TextDecoderOptions.kt",
            "**/util/TextEncoder.kt",
            "**/util/EncodeIntoResult.kt",
            "**/workerThreads/global/**",
            "**/workerThreads/BroadcastChannel.kt",
            "**/workerThreads/MessageChannel.kt",
            "**/workerThreads/MessagePort.kt"
        )
        isolatedOutputPackage = true
        moduleNameMapper = recordOf(
            "(.+)" to "node:$1",
            "node:node/" to "node:",
            "node:node:" to "node:",
            "node:assert(#assert)?" to "node:assert/strict",
            "node:globals" to "",
            "node:process#global" to "node:process",
            "events#EventEmitter" to "events",
            "module#Module" to "module",
        )
        packageNameMapper = recordOf(
            "promises/(.+)\\.kt" to "$1Async.kt",
            ".suspendAsync.kt" to ".suspend.kt",
            "AsyncOptionsAsync.kt" to "OptionsAsync.kt",

            "^assert/assert.kt" to "node/assert/assert.fun.kt",
            "^assert/assert/namespace.kt" to "node/assert/assert.fun.namespace.kt",
            "^assert/assert" to "node/assert",
            "^assert" to "node/assert",

            "^async_hooks/asyncwrapproviders" to "node/asyncHooks/asyncWrapProviders",
            "^async_hooks" to "node/asyncHooks",

            "^buffer/global/namespace.kt" to "node/buffer/global.namespace.kt",
            "^buffer/global/nodejs/namespace.kt" to "node/buffer/global.nodejs.namespace.kt",
            "^buffer/global/Buffer.kt" to "node/buffer/Buffer.class.kt",
            "^buffer/global/(.+)\\.kt" to "node/buffer/$1.kt",
            "^buffer" to "node/buffer",

            "^child_process/ChildProcess.kt" to "node/childProcess/ChildProcess.class.kt",
            "^child_process" to "node/childProcess",

            "^cluster/Cluster.kt" to "node/cluster/Cluster.interface.kt",
            "^cluster" to "node/cluster",

            "^crypto/hash.kt" to "node/crypto/hash.fun.kt",
            "^crypto/sign.kt" to "node/crypto/sign.fun.kt",
            "^crypto/verify.kt" to "node/crypto/verify.fun.kt",
            "^crypto/diffieHellman.kt" to "node/crypto/diffieHellman.fun.kt",
            "^crypto" to "node/crypto",

            "^dgram" to "node/dgram",

            "^diagnostics_channel/channel.kt" to "node/diagnosticsChannel/channel.fun.kt",
            "^diagnostics_channel/tracingChannel.kt" to "node/diagnosticsChannel/tracingChannel.fun.kt",
            "^diagnostics_channel" to "node/diagnosticsChannel",

            "^dns" to "node/dns",

            "^events/eventemitter/namespace.kt" to "node/events/EventEmitter.namespace.kt",
            "^events/eventemitter/EventEmitterAsyncResource.kt" to "node/events/EventEmitterAsyncResource.kt",
            "^events/eventemitter/EventEmitterAsyncResourceOptions.kt" to "node/events/EventEmitterAsyncResourceOptions.kt",
            "^events/eventemitter/EventEmitterReferencingAsyncResource.kt" to "node/events/EventEmitterReferencingAsyncResource.kt",
            "^events/eventemitter/NodeEventTarget.kt" to "node/events/NodeEventTarget.kt",
            "^events" to "node/events",

            "^fs/StatfsOptions.kt" to "node/fs/StatfsOptions.fun.kt",
            "^fs/symlink/Type.kt" to "node/fs/SymlinkType.kt",
            "^fs/symlink/SymlinkType.kt" to "node/fs/SymlinkType.kt",
            "^fs" to "node/fs",

            "^http" to "node/http",

            "^http2" to "node/http2",

            "^https" to "node/https",

            "^inspector/heapprofiler" to "node/inspector/heapProfiler",
            "^inspector/networkresources" to "node/inspector/networkResources",
            "^inspector/noderuntime" to "node/inspector/nodeRuntime",
            "^inspector/nodetracing" to "node/inspector/nodeTracing",
            "^inspector/nodeworker" to "node/inspector/nodeWorker",
            "^node/inspector.generated/module.kt" to "node/inspector/moduleGenerated.kt",
            "^inspector" to "node/inspector",

            "^module/global/nodejs/Require.kt" to "node/module/Require.interface.kt",
            "^module/global/nodejs/Module.kt" to "node/module/Module.interface.kt",
            "^module/global/nodejs/(.+)\\.kt" to "node/module/$1.kt",
            "^module/global/module.kt" to "node/module/module.val.kt",
            "^module/global/RequireResolve.kt" to "node/module/RequireResolve.legacy.kt",
            "^module/global/(.+)\\.kt" to "node/module/$1.kt",
            "^module/Module.kt" to "node/module/Module.class.kt",
            "^module/module/constants/compilecachestatus" to "node/module/constants/compileCacheStatus",
            "^module/module" to "node/module",
            "^module" to "node/module",

            "^net" to "node/net",

            "^os/userInfo.kt" to "node/os/userInfo.fun.kt",
            "^os" to "node/os",

            "^path/path" to "node/path",
            "^path" to "node/path",

            "^perf_hooks/performance.kt" to "node/perfHooks/performance.val.kt",
            "^perf_hooks" to "node/perfHooks",

            "^process/global/nodejs/Process.kt" to "node/process/Process.interface.kt",
            "^process/global/nodejs/(.+)\\.kt" to "node/process/$1.kt",
            "^process/global/(.+)\\.kt" to "node/process/$1.kt",
            "^process" to "node/process",

            "^querystring" to "node/querystring",

            "^readline/ReadLine.kt" to "node/readline/ReadLine.interface.kt",
            "^readline/ReadlineOptionsAsync.kt" to "node/readline/ReadlineConstructorOptionsAsync.interface.kt",
            "^readline" to "node/readline",

            "^repl/writer.kt" to "node/repl/writer.val.kt",
            "^repl" to "node/repl",

            "^stream/Stream.kt" to "node/stream/Stream.class.kt",
            "^stream/stream/namespace.kt" to "node/stream/Stream.namespace.kt",
            "^stream/stream" to "node/stream",
            "^stream" to "node/stream",

            "^node/test/test/namespace.kt" to "node/test/test.namespace.kt",
            "^node/test/test/(.+)\\.kt" to "node/test/$1.kt",
            "^node/test/eventdata" to "node/test/eventData",
            "^node/test/mock.kt" to "node/test/mock.val.kt",

            "^tls" to "node/tls",

            "^trace_events" to "node/traceEvents",

            "^tty" to "node/tty",

            "^url/Url.kt" to "node/url/Url.interface.kt",
            "^url" to "node/url",

            "^util/inspect/styles.kt" to "node/util/inspect/styles.val.kt",
            "^util" to "node/util",

            "^v8/promiseHooks.kt" to "node/v8/promiseHooks.val.kt",
            "^v8/startupsnapshot" to "node/v8/startupSnapshot",
            "^v8" to "node/v8",

            "^vm/Module.kt" to "node/vm/Module.class.kt",
            "^vm" to "node/vm",

            "^wasi/WASI.kt" to "node/wasi/WASI.class.kt",
            "^wasi" to "node/wasi",

            "^worker_threads/resourceLimits.kt" to "node/workerThreads/resourceLimits.val.kt",
            "^worker_threads" to "node/workerThreads",

            "^zlib/Zlib.kt" to "node/zlib/Zlib.interface.kt",
            "^zlib/brotliCompress.kt" to "node/zlib/brotliCompress.fun.kt",
            "^zlib/brotliDecompress.kt" to "node/zlib/brotliDecompress.fun.kt",
            "^zlib/zstdCompress.kt" to "node/zlib/zstdCompress.fun.kt",
            "^zlib/zstdDecompress.kt" to "node/zlib/zstdDecompress.fun.kt",
            "^zlib/gzip.kt" to "node/zlib/gzip.fun.kt",
            "^zlib/gunzip.kt" to "node/zlib/gunzip.fun.kt",
            "^zlib/deflate.kt" to "node/zlib/deflate.fun.kt",
            "^zlib/deflateRaw.kt" to "node/zlib/deflateRaw.fun.kt",
            "^zlib/inflate.kt" to "node/zlib/inflate.fun.kt",
            "^zlib/inflateRaw.kt" to "node/zlib/inflateRaw.fun.kt",
            "^zlib/unzip.kt" to "node/zlib/unzip.fun.kt",
            "^zlib" to "node/zlib",

            "^node/buffer.buffer/module.kt" to "node/buffer/buffer.buffer.kt",
            "^node/([^/]+)\\.kt" to "node/$1/$1.kt",
            "^node/stream/consumers.kt" to "node/stream/consumers/consumers.kt",
            "^node/globals/module.kt" to "node/globals.kt",
            "^node/globals/gc.kt" to "node/gc.kt",
            "^nodejs" to "node",
            "^global/nodejs" to "node",
        )
        importMapper = recordOf(
            "node:assert" to ruleOf("node.assert"),
            "node:async_hooks" to ruleOf("node.asyncHooks"),
            "(node:)?buffer" to ruleOf(
                "Blob" to "web.blob.Blob",
                "NonSharedBuffer" to "node.buffer.NonSharedBuffer",
            ),
            "node:child_process" to ruleOf(
                "\\*" to "",
                ".+" to "node.childProcess."
            ),
            "node:crypto" to ruleOf("node.crypto"),
            "node:dgram" to ruleOf(
                "\\*" to ""
            ),
            "node:dns$" to ruleOf(
                "\\*" to "",
                ".+" to "node.dns."
            ),
            "node:dns/promises" to ruleOf(
                "\\*" to ""
            ),
            "node:events" to ruleOf(
                "Abortable" to "web.abort.Abortable",
                ".+" to "node.events."
            ),
            "node:fs" to ruleOf(
                "WatchOptions" to "node.fs._WatchOptions",
                "\\*" to "",
                ".+" to "node.fs."
            ),
            "node:http" to ruleOf(
                "\\*" to "",
                ".+" to "node.http."
            ),
            "node:inspector$" to ruleOf(
                "Session" to "node.inspector._Session"
            ),
            "(node:)?inspector" to ruleOf(
                "Console" to "",
                "Debugger" to "",
                "HeapProfiler" to "",
                "IO" to "",
                "Network" to "",
                "NodeRuntime" to "",
                "NodeTracing" to "",
                "NodeWorker" to "",
                "Profiler" to "",
                "Runtime" to "",
                "Schema" to "",
                "Target" to "",
                ".+" to "node.inspector."
            ),
            "node:module" to ruleOf("node.module"),
            "node:net" to ruleOf(
                "\\*" to "",
                ".+" to "node.net."
            ),
            "node:os" to ruleOf("node.os"),
            "(node:)?perf_hooks" to ruleOf("node.perfHooks"),
            "node:querystring" to ruleOf("node.querystring"),
            "node:readline$" to ruleOf(
                "Interface" to "node.readline._Interface",
                "ReadLineOptions" to "node.readline._ReadLineOptions",
                "Completer" to "node.readline._Completer",
                ".+" to "node.readline."
            ),
            "node:readline/promises" to ruleOf(
                "\\*" to ""
            ),
            "(node:)?stream$" to ruleOf(
                "FinishedOptions" to "node.stream._FinishedOptions",
                "\\*" to "",
                ".+" to "node.stream."
            ),
            "node:stream/promises" to ruleOf(
                "\\*" to ""
            ),
            "node:stream/consumers" to ruleOf(
                "\\*" to ""
            ),
            "node:stream/web" to ruleOf(
                "\\*" to "",
                "ReadableStream" to "web.streams.ReadableStream",
                "WritableStream" to "web.streams.WritableStream",
                "TransformStream" to "web.streams.TransformStream"
            ),
            "node:test" to ruleOf("node.test"),
            "node:tls" to ruleOf(
                "\\*" to "",
                ".+" to "node.tls."
            ),
            "node:tty" to ruleOf(
                "\\*" to ""
            ),
            "(node:)?url" to ruleOf(
                "\\*" to "",
                "URL" to "web.url.URL",
                "URLSearchParams" to "web.url.URLSearchParams"
            ),
            "(node:)?util$" to ruleOf(
                "TextDecoder" to "",
                "TextEncoder" to "",
                ".+" to "node.util."
            ),
            "node:util/types" to ruleOf(
                "\\*" to ""
            ),
            "node:v8" to ruleOf("node.v8"),
            "node:vm" to ruleOf("node.vm"),
            "(node:)?worker_threads" to ruleOf(
                "BroadcastChannel" to "web.broadcast.BroadcastChannel",
                "MessageChannel" to "web.messaging.MessageChannel",
                "MessagePort" to "web.messaging.MessagePort",
                ".+" to "node.workerThreads."
            ),

            "undici-types" to ruleOf(
                ".+" to ""
            )
        )
        importInjector = recordOf(
            "Async.kt" to arrayOf(
                "js.promise.Promise"
            ),
            ".contract.kt" to arrayOf(
                "kotlin.contracts.contract"
            ),
            "ReadableStream.kt" to arrayOf(
                "js.typedarrays.Uint8Array",
                "node.events.EventEmitter"
            ),
            "WritableStream.kt" to arrayOf(
                "js.typedarrays.Uint8Array",
                "node.events.EventEmitter"
            ),
            "GCFunction.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "NonSharedArrayBufferView" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.buffer.ArrayBufferView",
            ),
            "NonSharedBigInt64Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.BigInt64Array",
            ),
            "NonSharedBigUint64Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.BigUint64Array",
            ),
            "NonSharedDataView" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.buffer.DataView",
            ),
            "NonSharedFloat16Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.Float16Array",
            ),
            "NonSharedFloat32Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.Float32Array",
            ),
            "NonSharedFloat64Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.Float64Array",
            ),
            "NonSharedInt8Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.Int8Array",
            ),
            "NonSharedInt16Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.Int16Array",
            ),
            "NonSharedInt32Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.Int32Array",
            ),
            "NonSharedTypedArray" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.TypedArray",
            ),
            "NonSharedUint8Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.Uint8Array",
            ),
            "NonSharedUint8ClampedArray" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.Uint8ClampedArray",
            ),
            "NonSharedUint16Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.Uint16Array",
            ),
            "NonSharedUint32Array" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.typedarrays.Uint32Array",
            ),
            "assert/doesNotMatch.kt" to arrayOf(
                "js.regexp.RegExp"
            ),
            "assert/doesNotReject.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "assert/doesNotReject.suspend.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "assert/match.kt" to arrayOf(
                "js.regexp.RegExp"
            ),
            "assert/rejects.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "assert/rejects.suspend.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "buffer/Buffer.class.kt" to arrayOf(
                "js.array.ArrayLike",
                "js.buffer.ArrayBuffer",
                "js.buffer.ArrayBufferLike",
                "js.buffer.SharedArrayBuffer",
                "js.typedarrays.Uint8Array"
            ),
            "buffer/AllowSharedBuffer.kt" to arrayOf(
                "js.buffer.ArrayBufferLike"
            ),
            "buffer/NonSharedBuffer.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "buffer/File.kt" to arrayOf(
                "web.blob.Blob"
            ),
            "buffer/isAscii.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "buffer/isUtf8.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "buffer/resolveObjectURL.kt" to arrayOf(
                "web.blob.Blob"
            ),
            "buffer/transcode.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "childProcess/ExecFileOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "childProcess/ExecOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "childProcess/PromiseWithChild.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "childProcess/execFile.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "childProcess/execFileSync.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "childProcess/fork.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "childProcess/spawn.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "childProcess/spawnSync.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "cluster/Cluster.interface.kt" to arrayOf(
                "node.events.EventEmitter"
            ),
            "cluster/Worker.kt" to arrayOf(
                "node.events.EventEmitter"
            ),
            "crypto/Cipheriv.kt" to arrayOf(
                "node.stream.TransformOptions"
            ),
            "crypto/Decipheriv.kt" to arrayOf(
                "node.stream.TransformOptions"
            ),
            "crypto/Hash.kt" to arrayOf(
                "node.stream.TransformOptions"
            ),
            "crypto/Hmac.kt" to arrayOf(
                "node.stream.TransformOptions"
            ),
            "crypto/Sign.kt" to arrayOf(
                "node.stream.WritableOptions"
            ),
            "crypto/Verify.kt" to arrayOf(
                "node.stream.WritableOptions"
            ),
            "crypto/createDiffieHellman.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "crypto/decapsulate.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "crypto/generatePrime.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "crypto/generatePrimeSync.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "crypto/hkdf.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "crypto/hkdfSync.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "crypto/X509Certificate.kt" to arrayOf(
                "js.date.Date"
            ),
            "dgram/Socket.kt" to arrayOf(
                "js.array.ReadonlyArray",
                "js.typedarrays.Uint8Array"
            ),
            "diagnosticsChannel/TracingChannel.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "dns/setServers.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "dns/TlsaRecord.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "events/EventEmitter.kt" to arrayOf(
                "js.array.Tuple",
                "js.array.Tuple1",
                "js.disposable.Disposable",
                "js.iterable.AsyncIterator",
                "js.promise.Promise",
                "web.abort.AbortSignal",
                "web.events.Event",
                "web.events.EventTarget"
            ),
            "events/EventEmitter.ext.kt" to arrayOf(
                "js.array.Tuple"
            ),
            "events/NodeEventTarget.kt" to arrayOf(
                "web.events.EventListenerOptions",
                "web.events.EventTarget",
            ),
            "events/StaticEventEmitterOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "fs/Dir.kt" to arrayOf(
                "js.iterable.AsyncIterable",
                "js.promise.Promise"
            ),
            "fs/DisposableTempDir.kt" to arrayOf(
                "js.disposable.AsyncDisposable",
                "js.promise.Promise"
            ),
            "fs/FileHandleAsync.kt" to arrayOf(
                "js.array.ReadonlyArray",
                "js.typedarrays.Uint8Array"
            ),
            "fs/FileHandleWriteResultPayloadAsync.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "fs/ReadStream.kt" to arrayOf(
                "node.stream.ReadableOptions"
            ),
            "fs/StatsBase.kt" to arrayOf(
                "js.date.Date"
            ),
            "fs/Stats.kt" to arrayOf(
                "js.date.Date"
            ),
            "fs/StreamOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "fs/WriteStream.kt" to arrayOf(
                "node.stream.WritableOptions"
            ),
            "fs/appendFile.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "fs/appendFileAsync.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "fs/appendFileSync.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "fs/appendFile.suspend.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "fs/cpAsync.kt" to arrayOf(
                "web.url.URL"
            ),
            "fs/cp.suspend.kt" to arrayOf(
                "web.url.URL"
            ),
            "fs/openAsBlob.kt" to arrayOf(
                "js.promise.Promise",
                "web.blob.Blob"
            ),
            "fs/openAsBlob.suspend.kt" to arrayOf(
                "web.blob.Blob"
            ),
            "fs/readFile.kt" to arrayOf(
                "node.buffer.NonSharedBuffer"
            ),
            "fs/readFileSync.kt" to arrayOf(
                "node.buffer.NonSharedBuffer"
            ),
            "fs/readv.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "fs/readvSync.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "fs/watchAsync.kt" to arrayOf(
                "js.iterable.AsyncIterable"
            ),
            "fs/writeFileAsync.kt" to arrayOf(
                "js.iterable.AsyncIterable"
            ),
            "fs/writeFile.suspend.kt" to arrayOf(
                "js.iterable.AsyncIterable"
            ),
            "fs/writev.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "fs/writevSync.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "http/ClientRequestArgs.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "http/OutgoingMessage.kt" to arrayOf(
                "js.array.ReadonlyArray",
                "web.http.Headers"
            ),
            "http2/ClientSessionRequestOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "http2/Http2ServerResponse.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "http2/Http2Session.kt" to arrayOf(
                "node.events.EventEmitter"
            ),
            "http2/getUnpackedSettings.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "https/RequestOptions.kt" to arrayOf(
                "node.tls.PeerCertificate"
            ),
            "https/Server.kt" to arrayOf(
                "node.http.IncomingMessage",
                "node.http.ServerResponse"
            ),
            "https/ServerOptions.kt" to arrayOf(
                "node.http.IncomingMessage",
                "node.http.ServerResponse"
            ),
            "https/createServer.kt" to arrayOf(
                "node.http.IncomingMessage",
                "node.http.ServerResponse"
            ),
            "inspector/Session.kt" to arrayOf(
                "node.events.EventEmitter"
            ),
            "inspector/SessionAsync.kt" to arrayOf(
                "node.events.EventEmitter"
            ),
            "inspector/open.kt" to arrayOf(
                "js.disposable.Disposable"
            ),
            "net/OnReadOpts.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "net/Socket.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "net/SocketConstructorOpts.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "module/Require.interface.kt" to arrayOf(
                "node.Dict"
            ),
            "module/RequireExtensions.kt" to arrayOf(
                "node.Dict"
            ),
            "os/constants/signals.kt" to arrayOf(
                "node.os.SignalConstants"
            ),
            "perfHooks/PerformanceObserverObserveTypesOptions.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "process/MultipleResolveListener.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "process/Process.interface.kt" to arrayOf(
                "js.array.ReadonlyArray",
                "js.collections.ReadonlySet",
                "js.promise.Promise",
                "web.url.URL",
                "node.module.Module",
                "node.events.EventEmitter"
            ),
            "process/ProcessEnv.kt" to arrayOf(
                "node.Dict"
            ),
            "process/ProcessVersions.kt" to arrayOf(
                "node.Dict"
            ),
            "process/RejectionHandledListener.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "process/Socket.kt" to arrayOf(
                "node.ReadWriteStream"
            ),
            "process/UnhandledRejectionListener.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "readline/Interface.kt" to arrayOf(
                "js.disposable.Disposable"
            ),
            "readline/ReadLineOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "repl/Recoverable.kt" to arrayOf(
                "js.errors.SyntaxError"
            ),
            "sea/getAsset.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "sea/getAssetAsBlob.kt" to arrayOf(
                "web.blob.Blob"
            ),
            "sea/getRawAsset.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "sqlite/DatabaseSync.kt" to arrayOf(
                "js.disposable.Disposable",
                "js.typedarrays.Uint8Array",
                "web.url.URL"
            ),
            "sqlite/SQLTagStore.kt" to arrayOf(
                "js.array.TemplateStringsArray",
            ),
            "sqlite/Session.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "sqlite/backup.kt" to arrayOf(
                "js.promise.Promise",
                "web.url.URL"
            ),
            "sqlite/backup.suspend.kt" to arrayOf(
                "web.url.URL"
            ),
            "stream/ArrayOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "stream/addAbortSignal.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "stream/Duplex.kt" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.iterable.AsyncIterable",
                "js.generator.AsyncGeneratorFunction",
                "js.promise.Promise"
            ),
            "stream/pipeline.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "stream/pipelineAsync.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "stream/PipelineDestinationIterableFunction.kt" to arrayOf(
                "js.iterable.AsyncIterable"
            ),
            "stream/PipelineDestinationPromiseFunction.kt" to arrayOf(
                "js.promise.Promise",
                "js.iterable.AsyncIterable"
            ),
            "stream/PipelineOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "stream/pipeline.suspend.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "stream/Readable.kt" to arrayOf(
                "js.typedarrays.Uint8Array",
                "js.iterable.AsyncIterable",
                "js.promise.Promise",
                "node.ReadableStreamPipeOptions",
                "node.WritableStream"
            ),
            "stream/StreamComposeOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "stream/Stream.class.kt" to arrayOf(
                "js.iterable.AsyncIterable"
            ),
            "stream/Writable.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "stream/consumers/arrayBuffer.kt" to arrayOf(
                "js.promise.Promise",
                "js.buffer.ArrayBuffer",
                "js.iterable.AsyncIterable"
            ),
            "stream/consumers/arrayBuffer.suspend.kt" to arrayOf(
                "js.buffer.ArrayBuffer",
                "js.iterable.AsyncIterable"
            ),
            "stream/consumers/blob.kt" to arrayOf(
                "js.promise.Promise",
                "js.iterable.AsyncIterable"
            ),
            "stream/consumers/blob.suspend.kt" to arrayOf(
                "js.iterable.AsyncIterable"
            ),
            "stream/consumers/buffer.kt" to arrayOf(
                "js.promise.Promise",
                "js.iterable.AsyncIterable"
            ),
            "stream/consumers/buffer.suspend.kt" to arrayOf(
                "js.iterable.AsyncIterable"
            ),
            "stream/consumers/json.kt" to arrayOf(
                "js.promise.Promise",
                "js.iterable.AsyncIterable"
            ),
            "stream/consumers/json.suspend.kt" to arrayOf(
                "js.iterable.AsyncIterable"
            ),
            "stream/consumers/text.kt" to arrayOf(
                "js.promise.Promise",
                "js.iterable.AsyncIterable"
            ),
            "stream/consumers/text.suspend.kt" to arrayOf(
                "js.iterable.AsyncIterable"
            ),
            "test/AssertSnapshotOptions.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "test/HookOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "test/MockTimersOptions.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "test/RunOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "test/SuiteContext.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "test/TestContext.kt" to arrayOf(
                "js.promise.Promise",
                "web.abort.AbortSignal"
            ),
            "test/TestContextTest.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "test/TestOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "test/describe.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "test/describe/only.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/describe/only.suspend.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/describe/skip.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/describe/skip.suspend.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/describe/todo.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/describe/todo.suspend.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/it.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "test/it/only.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.TestFn",
                "node.test.TestOptions"
            ),
            "test/it/only.suspend.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.TestFn",
                "node.test.TestOptions"
            ),
            "test/it/skip.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.TestFn",
                "node.test.TestOptions"
            ),
            "test/it/skip.suspend.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.TestFn",
                "node.test.TestOptions"
            ),
            "test/it/todo.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.TestFn",
                "node.test.TestOptions"
            ),
            "test/it/todo.suspend.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.TestFn",
                "node.test.TestOptions"
            ),
            "test/suite.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "test/suite/only.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/suite/only.suspend.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/suite/skip.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/suite/skip.suspend.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/suite/todo.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/suite/todo.suspend.kt" to arrayOf(
                "js.promise.Promise",
                "node.test.SuiteFn",
                "node.test.TestOptions"
            ),
            "test/only.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "test/skip.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "test/test.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "test/todo.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "test/reporters/TestEventGenerator.kt" to arrayOf(
                "js.generator.AsyncGenerator"
            ),
            "test/reporters/dot.kt" to arrayOf(
                "js.generator.AsyncGenerator"
            ),
            "test/reporters/junit.kt" to arrayOf(
                "js.generator.AsyncGenerator"
            ),
            "test/reporters/tap.kt" to arrayOf(
                "js.generator.AsyncGenerator"
            ),
            "test/snapshot/setDefaultSnapshotSerializers.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "tls/setDefaultCACertificates.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "url/fileURLToPath.kt" to arrayOf(
                "web.url.URL"
            ),
            "url/fileURLToPathBuffer.kt" to arrayOf(
                "web.url.URL"
            ),
            "url/format.kt" to arrayOf(
                "web.url.URL"
            ),
            "url/pathToFileURL.kt" to arrayOf(
                "web.url.URL"
            ),
            "url/urlToHttpOptions.kt" to arrayOf(
                "web.url.URL"
            ),
            "util/aborted.kt" to arrayOf(
                "js.promise.Promise",
                "web.abort.AbortSignal"
            ),
            "util/aborted.suspend.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "util/callbackify.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "util/promisify.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "util/transferableAbortController.kt" to arrayOf(
                "web.abort.AbortController"
            ),
            "util/transferableAbortSignal.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "util/isDate.contract.kt" to arrayOf(
                "js.date.Date"
            ),
            "util/isRegExp.contract.kt" to arrayOf(
                "js.regexp.RegExp"
            ),
            "util/types/isAnyArrayBuffer.contract.kt" to arrayOf(
                "js.buffer.ArrayBufferLike"
            ),
            "util/types/isArrayBuffer.contract.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "util/types/isBigInt64Array.contract.kt" to arrayOf(
                "js.typedarrays.BigInt64Array"
            ),
            "util/types/isBigIntObject.contract.kt" to arrayOf(
                "js.core.BigInt"
            ),
            "util/types/isBigUint64Array.contract.kt" to arrayOf(
                "js.typedarrays.BigUint64Array"
            ),
            "util/types/isDataView.contract.kt" to arrayOf(
                "js.buffer.DataView"
            ),
            "util/types/isDate.contract.kt" to arrayOf(
                "js.date.Date"
            ),
            "util/types/isFloat16Array.contract.kt" to arrayOf(
                "js.typedarrays.Float16Array"
            ),
            "util/types/isFloat32Array.contract.kt" to arrayOf(
                "js.typedarrays.Float32Array"
            ),
            "util/types/isFloat64Array.contract.kt" to arrayOf(
                "js.typedarrays.Float64Array"
            ),
            "util/types/isGeneratorFunction.contract.kt" to arrayOf(
                "js.generator.GeneratorFunction"
            ),
            "util/types/isGeneratorObject.contract.kt" to arrayOf(
                "js.generator.Generator"
            ),
            "util/types/isInt8Array.contract.kt" to arrayOf(
                "js.typedarrays.Int8Array"
            ),
            "util/types/isInt16Array.contract.kt" to arrayOf(
                "js.typedarrays.Int16Array"
            ),
            "util/types/isInt32Array.contract.kt" to arrayOf(
                "js.typedarrays.Int32Array"
            ),
            "util/types/isPromise.contract.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "util/types/isRegExp.contract.kt" to arrayOf(
                "js.regexp.RegExp"
            ),
            "util/types/isSharedArrayBuffer.contract.kt" to arrayOf(
                "js.buffer.SharedArrayBuffer"
            ),
            "util/types/isSymbolObject.contract.kt" to arrayOf(
                "js.symbol.Symbol"
            ),
            "util/types/isUint8Array.contract.kt" to arrayOf(
                "js.typedarrays.Uint8Array"
            ),
            "util/types/isUint8ClampedArray.contract.kt" to arrayOf(
                "js.typedarrays.Uint8ClampedArray"
            ),
            "util/types/isUint16Array.contract.kt" to arrayOf(
                "js.typedarrays.Uint16Array"
            ),
            "util/types/isUint32Array.contract.kt" to arrayOf(
                "js.typedarrays.Uint32Array"
            ),
            "v8/After.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "v8/Before.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "v8/CPUProfileHandle.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "v8/Deserializer.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "v8/HeapProfileHandle.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "v8/Init.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "v8/Serializer.kt" to arrayOf(
                "js.buffer.ArrayBuffer"
            ),
            "v8/Settled.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "v8/startupSnapshot/addDeserializeCallback.kt" to arrayOf(
                "node.v8.StartupSnapshotCallbackFn"
            ),
            "v8/startupSnapshot/addSerializeCallback.kt" to arrayOf(
                "node.v8.StartupSnapshotCallbackFn"
            ),
            "v8/startupSnapshot/setDeserializeMainFunction.kt" to arrayOf(
                "node.v8.StartupSnapshotCallbackFn"
            ),
            "vm/CompileFunctionResult.kt" to arrayOf(
                "js.buffer.ArrayBufferLike",
                "node.buffer.Buffer"
            ),
            "vm/Module.class.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "vm/SourceTextModuleOptions.kt" to arrayOf(
                "js.import.ImportMeta"
            ),
            "vm/compileFunction.kt" to arrayOf(
                "js.array.ReadonlyArray"
            ),
            "vm/measureMemory.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "workerThreads/LockManager.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "workerThreads/LockOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "workerThreads/Worker.kt" to arrayOf(
                "js.array.ReadonlyArray",
                "js.promise.Promise"
            ),
            "workerThreads/moveMessagePortToContext.kt" to arrayOf(
                "web.messaging.MessagePort"
            ),
            "workerThreads/parentPort.kt" to arrayOf(
                "web.messaging.MessagePort"
            ),
            "workerThreads/postMessageToThread.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "workerThreads/receiveMessageOnPort.kt" to arrayOf(
                "web.messaging.MessagePort"
            )
        )
        namespaceStrategy = recordOf(
            "NodeJS" to NamespaceStrategy.`package`,

            "assert.assert" to NamespaceStrategy.`package`,

            "async_hooks.asyncWrapProviders" to NamespaceStrategy.`package`,

            "buffer.global" to NamespaceStrategy.`package`,

            "crypto.constants" to NamespaceStrategy.`package`,
            "crypto.global" to NamespaceStrategy.`package`,
            "crypto.webcrypto" to NamespaceStrategy.`package`,

            "events.EventEmitter" to NamespaceStrategy.`package`,
            "events.global" to NamespaceStrategy.`package`,

            "fs.constants" to NamespaceStrategy.`package`,
            "fs.symlink" to NamespaceStrategy.`package`,

            "http2.constants" to NamespaceStrategy.`package`,

            "inspector\\..+" to NamespaceStrategy.`package`,

            "module.global" to NamespaceStrategy.`package`,
            "module.Module" to NamespaceStrategy.`package`,

            "os.constants" to NamespaceStrategy.`package`,

            "path.path" to NamespaceStrategy.`package`,

            "perf_hooks.constants" to NamespaceStrategy.`package`,
            "perf_hooks.global" to NamespaceStrategy.`package`,

            "process.global" to NamespaceStrategy.`package`,

            "stream.Stream" to NamespaceStrategy.`package`,

            "url.global" to NamespaceStrategy.`package`,

            "util.global" to NamespaceStrategy.`package`,

            "v8.startupSnapshot" to NamespaceStrategy.`package`,

            "vm.constants" to NamespaceStrategy.`package`,

            "worker_threads.global" to NamespaceStrategy.`package`,

            "zlib.constants" to NamespaceStrategy.`package`,

            "global" to NamespaceStrategy.`object`,

            "node:sqlite" to NamespaceStrategy.`package`,
            "node:test" to NamespaceStrategy.`package`,
            "node:sea" to NamespaceStrategy.`package`,
            "node:.+" to NamespaceStrategy.ignore,
        )
        conflictResolutionStrategy = recordOf(
            "ExecFileObjectEncodingOptions.kt" to ConflictResolutionStrategy.replace,
            "ExecStringOptions.kt" to ConflictResolutionStrategy.replace,
            "ReaddirOptionsAsync.kt" to ConflictResolutionStrategy.replace,
            "ClientHttp2StreamAddListenerListenerHeaders.kt" to ConflictResolutionStrategy.replace,
            "ClientHttp2StreamEmitHeaders.kt" to ConflictResolutionStrategy.replace,
            "ClientHttp2StreamOnListenerHeaders.kt" to ConflictResolutionStrategy.replace,
            "ClientHttp2StreamOnceListenerHeaders.kt" to ConflictResolutionStrategy.replace,
            "ClientHttp2StreamPrependListenerListenerHeaders.kt" to ConflictResolutionStrategy.replace,
            "ClientHttp2StreamPrependOnceListenerListenerHeaders.kt" to ConflictResolutionStrategy.replace,
            "WritableOptionsWritevChunksItem.kt" to ConflictResolutionStrategy.replace,
            "WritableWritevChunksItem.kt" to ConflictResolutionStrategy.replace,
            "FileHandleWriteResultPayloadAsync.kt" to ConflictResolutionStrategy.replace,
            "DiffieHellmanOptions.kt" to ConflictResolutionStrategy.replace,
        )
    }
}
