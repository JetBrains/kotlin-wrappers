plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinMuiMaterial)

        api(npm(jspkg.mui.xTreeView))
    }
}
