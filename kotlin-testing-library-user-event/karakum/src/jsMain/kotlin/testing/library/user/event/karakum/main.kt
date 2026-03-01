package testing.library.user.event.karakum

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf
import js.objects.unsafeJso
import testing.library.user.event.karakum.plugins.*

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            convertSetupDirect,
            convertUserEventApiTypeAlias,
            convertUtilityTypes,
        )

        input = manyOf(
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
        ignoreOutput = manyOf(
            "**/event/types/EventType.kt",
            "**/event/types/EventTypeInit.kt",
            "**/event/types/FixedDocumentEventMap.kt",
            "**/event/types/SpecificEventInit.kt",

            "**/pointer/pointer.kt",

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
        moduleNameMapper = recordOf(
            "dist/types/" to "dist/esm/",
        )
        packageNameMapper = recordOf(
            "dist/types/" to "/",

            "setup/api/UserEventApi.kt" to "setup/api/UserEventApi.interface.kt",
            "setup/index/UserEvent.kt" to "setup/index/UserEvent.interface.kt",

            "index/" to "/",
        )
        importInjector = recordOf(
            // TODO: fix names
            "Temp1.kt" to arrayOf(
                "testing.library.user.event.options.Options",
                "testing.library.user.event.system.System",
                "testing.library.user.event.utility.type.typeOptions",
            ),
            "Temp2.kt" to arrayOf(
                "testing.library.user.event.options.Options",
                "testing.library.user.event.system.System",
            ),

            "pointerKey.kt" to arrayOf(
                "testing.library.user.event.system.pointer.buttons.MouseButton",
            ),

            "KeyboardHost.kt" to arrayOf(
                "testing.library.user.event.setup.setup.Instance",
                "testing.library.user.event.system.System",
            ),
            "PointerHost.kt" to arrayOf(
                "testing.library.user.event.setup.setup.Instance",
                "testing.library.user.event.system.System",
                "testing.library.user.event.system.pointer.shared.pointerKey",
                "testing.library.user.event.system.pointer.shared.PointerPosition",
            ),

            "Config.kt" to arrayOf(
                "testing.library.user.event.options.Options",
            ),

            "DirectOptions.kt" to arrayOf(
                "testing.library.user.event.options.Options",
                "testing.library.user.event.system.System",
            ),

            "Instance.kt" to arrayOf(
                "web.dom.Element",
                "web.events.Event",
                "testing.library.user.event.setup.api.UserEventApi",
                "testing.library.user.event.system.System",
            ),

            "Options.kt" to arrayOf(
                "testing.library.user.event.system.keyboard.keyboardKey",
                "testing.library.user.event.system.pointer.shared.pointerKey",
            ),

            "PointerActionPosition.kt" to arrayOf(
                "testing.library.user.event.event.types.PointerCoords",
            ),

            "PointerPosition.kt" to arrayOf(
                "testing.library.user.event.event.types.PointerCoords",
            ),

            "PointerPressAction.kt" to arrayOf(
                "testing.library.user.event.system.pointer.shared.pointerKey",
            ),

            "System.kt" to arrayOf(
                "testing.library.user.event.system.keyboard.KeyboardHost",
                "testing.library.user.event.system.pointer.PointerHost",
            ),

            "UserEventApi.interface.kt" to arrayOf(
                "js.promise.Promise",
                "web.data.DataTransfer",
                "web.dom.Element",
                "web.html.HTMLElement",
                "testing.library.user.event.pointer.PointerInput",
                "testing.library.user.event.utility.type.typeOptions",
            ),

            "UserEvent.interface.kt" to arrayOf(
                "js.promise.Promise",
                "web.data.DataTransfer",
                "web.dom.Element",
                "web.html.HTMLElement",
                "testing.library.user.event.options.Options",
                "testing.library.user.event.pointer.PointerInput",
                "testing.library.user.event.setup.directApi.DirectOptions",
                "testing.library.user.event.system.System",
            )
        )
        compilerOptions = unsafeJso {
            lib = arrayOf(
                "lib.esnext.d.ts",
                "lib.dom.d.ts",
            )
        }
    }
}
