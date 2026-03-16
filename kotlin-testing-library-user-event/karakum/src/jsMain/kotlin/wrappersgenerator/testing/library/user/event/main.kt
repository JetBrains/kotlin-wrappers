package wrappersgenerator.testing.library.user.event

import io.github.sgrishchenko.karakum.configuration.ConflictResolutionStrategy
import io.github.sgrishchenko.karakum.configuration.replace
import io.github.sgrishchenko.karakum.extension.plugins.configurable.PromiseMethodPlugin
import io.github.sgrishchenko.karakum.generate
import js.array.ReadonlyArray
import js.objects.unsafeJso
import wrappersgenerator.testing.library.user.event.nameResolvers.resolveDirectOptionsParameterName
import wrappersgenerator.testing.library.user.event.nameResolvers.resolveMouseButtonTypeName
import wrappersgenerator.testing.library.user.event.nameResolvers.resolveOptionsParameterName
import wrappersgenerator.testing.library.user.event.plugins.*

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = listOf(
            PromiseMethodPlugin(),

            convertMouseButtonConstants,
            convertSetupDirect,
            convertUserEventApiTypeAlias,
            convertUserEventMethod,
            convertUserEventMethodOptions,
            convertUtilityTypes,
        )

        nameResolvers = listOf(
            ::resolveDirectOptionsParameterName,
            ::resolveMouseButtonTypeName,
            ::resolveOptionsParameterName,
        )

        input = listOf(
            "dist/types/event/types.d.ts",
            "dist/types/options.d.ts",
            "dist/types/pointer/index.d.ts",
            "dist/types/setup/index.d.ts",
            "dist/types/setup/api.d.ts",
            "dist/types/setup/directApi.d.ts",
            "dist/types/setup/setup.d.ts",
            "dist/types/system/index.d.ts",
            "dist/types/system/keyboard.d.ts",
            "dist/types/system/pointer/index.d.ts",
            "dist/types/system/pointer/buttons.d.ts",
            "dist/types/system/pointer/shared.d.ts",
            "dist/types/utility/type.d.ts",
        )
        ignoreOutput = listOf(
            "**/event/types/EventType.kt",
            "**/event/types/EventTypeInit.kt",
            "**/event/types/FixedDocumentEventMap.kt",
            "**/event/types/SpecificEventInit.kt",

            "**/pointer/index/pointer.kt",

            "**/setup/directApi/clear.kt",
            "**/setup/directApi/click.kt",
            "**/setup/directApi/copy.kt",
            "**/setup/directApi/cut.kt",
            "**/setup/directApi/dblClick.kt",
            "**/setup/directApi/deselectOptions.kt",
            "**/setup/directApi/hover.kt",
            "**/setup/directApi/keyboard.kt",
            "**/setup/directApi/module.kt",
            "**/setup/directApi/paste.kt",
            "**/setup/directApi/pointer.kt",
            "**/setup/directApi/selectOptions.kt",
            "**/setup/directApi/tab.kt",
            "**/setup/directApi/tripleClick.kt",
            "**/setup/directApi/type.kt",
            "**/setup/directApi/unhover.kt",
            "**/setup/directApi/upload.kt",

            "**/setup/setup/createConfig.kt",
            "**/setup/setup/createInstance.kt",
            "**/setup/setup/CreateInstanceResult.kt",
            "**/setup/setup/setupDirect.kt",
            "**/setup/setup/SetupDirectResult.kt",
            "**/setup/setup/setupMain.kt",
            "**/setup/setup/setupSub.kt",
            "**/setup/setup/UserEvent.kt",
            "**/setup/setup/UserEventApi.kt",

            "**/system/pointer/buttons/Buttons.kt",
            "**/system/pointer/buttons/getMouseButtonId.kt",
            "**/system/pointer/buttons/getMouseEventButton.kt",
            "**/system/pointer/buttons/MouseButtonFlip.kt",

            "**/system/pointer/shared/isDifferentPointerPosition.kt",

            "**/utility/type/type.kt",

            "**/module.kt",
        )
        isolatedOutputPackage = true
        moduleNameMapper = mapOf(
            "dist/types/" to "dist/esm/",
            "(.+)" to "$1.js",
        )
        packageNameMapper = mapOf(
            "dist/types/" to "/",

            "event/types/PointerCoords.kt" to "PointerCoords.kt",

            "generated/DirectTabOptions.kt" to "DirectTabOptions.kt",
            "generated/DirectTypeOptions.kt" to "DirectTypeOptions.kt",
            "generated/TabOptions.kt" to "TabOptions.kt",

            "options/Options.kt" to "Options.kt",
            "options/PointerEventsCheckLevel.kt" to "PointerEventsCheckLevel.kt",

            "pointer/index/PointerAction.kt" to "PointerAction.kt",
            "pointer/index/PointerActionInput.kt" to "PointerActionInput.kt",
            "pointer/index/PointerActionPosition.kt" to "PointerActionPosition.kt",
            "pointer/index/PointerInput.kt" to "PointerInput.kt",
            "pointer/index/PointerMoveAction.kt" to "PointerMoveAction.kt",
            "pointer/index/PointerPressAction.kt" to "PointerPressAction.kt",

            "setup/api/UserEventApi.kt" to "UserEventApi.interface.kt",
            "setup/api/userEventApi.kt" to "userEventApi.kt",
            "setup/directApi/DirectOptions.kt" to "DirectOptions.kt",
            "setup/setup/Config.kt" to "Config.kt",
            "setup/setup/Instance.kt" to "Instance.kt",
            "setup/index/UserEvent.kt" to "UserEvent.interface.kt",
            "setup/index/userEvent.kt" to "userEvent.kt",

            "system/keyboard/DOM_KEY_LOCATION.kt" to "DOM_KEY_LOCATION.kt",
            "system/keyboard/KeyboardHost.kt" to "KeyboardHost.kt",
            "system/keyboard/KeyboardHostModifiers.kt" to "KeyboardHostModifiers.kt",
            "system/keyboard/keyboardKey.kt" to "keyboardKey.kt",

            "system/pointer/buttons/MouseButton.kt" to "MouseButton.kt",
            "system/pointer/buttons/MouseButtonType.kt" to "MouseButtonType.kt",
            "system/pointer/shared/CaretPosition.kt" to "CaretPosition.kt",
            "system/pointer/shared/pointerKey.kt" to "pointerKey.kt",
            "system/pointer/shared/PointerKeyPointerType.kt" to "PointerKeyPointerType.kt",
            "system/pointer/shared/PointerPosition.kt" to "PointerPosition.kt",
            "system/pointer/index/PointerHost.kt" to "PointerHost.kt",

            "system/index/System.kt" to "System.kt",

            "utility/type/typeOptions.kt" to "typeOptions.kt",
        )
        importInjector = mapOf(
            "Instance.kt" to listOf(
                "web.dom.Element",
                "web.events.Event",
            ),

            "UserEventApi.interface.kt" to listOf(
                "js.promise.Promise",
                "web.data.DataTransfer",
                "web.dom.Element",
                "web.html.HTMLElement",
            ),
        )
        conflictResolutionStrategy = mapOf(
            "DirectTabOptions.kt" to ConflictResolutionStrategy.replace,
            "DirectTypeOptions.kt" to ConflictResolutionStrategy.replace,
        )
        compilerOptions = unsafeJso {
            lib = arrayOf(
                "lib.esnext.d.ts",
                "lib.dom.d.ts",
            )
        }
    }
}
